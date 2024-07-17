import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		ArrayList<String> letters = new ArrayList<>();
		String[] words = {
			"apple", "banana", "cat", "dog", "elephant", "fish", "grape", 
			"hat", "igloo", "jacket", "kite", "lemon", "monkey", "notebook", 
			"orange", "pencil", "quilt", "rabbit", "sun", "tree", "umbrella", 
			"vase", "window", "xylophone", "yarn", "zebra", "airplane", "bicycle", 
			"cloud", "drum", "eagle", "flower", "guitar", "house", "island", 
			"jungle", "kangaroo", "ladder", "mountain", "nest", "ocean", "piano", 
			"queen", "robot", "snake", "tiger", "unicorn", "violin", "whale", "x-ray", 
			"yacht", "zeppelin", "anchor", "balloon", "candle", "dolphin", "engine", 
			"feather", "garden", "helicopter", "ice", "jewel", "kettle", "lamp", "mirror", 
			"needle", "octopus", "pumpkin", "quiver", "rocket", "sailboat", "tent", "utensil", 
			"vulture", "waterfall", "xenon", "yo-yo", "zipper", "ant", "book", "camera", "duck", 
			"engineer", "forest", "glove", "hammer", "ink", "jigsaw", "leaf", 
			"map", "nut", "orchid", "peacock", "quill", "rain", "scooter", 
			"tulip", "uniform", "vacuum", "wheel", "yolk", "zinc", "arch", "beach", "cup", 
			"dawn", "fog", "goose", "horse", "iron", "jelly", 
			"kitchen", "mango", "net", "owl", "penguin", "quarry", "ribbon", 
			"shell", "throne", "vest", "worm", "yoga", "zoo", "arrow", 
			"barn", "carrot", "desert", "echo", "fountain", "glue", "iguana", "jacket", "kiwi", 
			"laptop", "motor", "noodle", "peacock", "quilt", "rose", 
			"star", "tractor", "urchin", "water", "yo-yo", "zipper", 
			"alligator", "ball", "clown", "door", "egg", "fence", 
			"goldfish", "hamburger", "iceberg", "jellyfish", "knot", "moon", "necklace", 
			"oasis", "pizza", "quasar", "sunflower", "train", "antler", "basket", "clock", 
			"dragon", "eel", "fern", "sword", "thunder", "ultra", 
			"glacier", "hose", "juice", "lizard", "marble", "note", "puzzle", "rainbow",
			"van", "wheelbarrow", "xerox", "alarm", "broom", "castle", "easel", "fire", "giraffe", "helmet", "inch", 
			"kangaroo", "magnet", "robot", "ship", "tower", 
			"violin", "yogurt", "zombie", "whistle", "lamp", "nest", "mountain", "island", "glove", "jungle", "candle", 
			"starfish", "seahorse", "parrot", "cloud", "drum", 
			"trombone", "piano", "vulture", "iguana", "lemonade", "quicksand", 
			"tundra", "asteroid", "blizzard", "canyon", "delta", "echo", "fjord", "geyser", "harbor", "iceberg", 
			"jungle", "lagoon", "mesa", "oasis", "pinnacle", 
			"quagmire", "reef", "savannah", 
			"taiga", "updraft", "volcano", "waterfall", "xanadu", "yard", 
			"zenith", "bamboo", "cliff", "dome", "erupt", "fissure", "glacier", 
			"hill", "isthmus", "jungle", "knoll", "loch", "mesa", "nor'easter", 
			"plateau", "quasar", "rapids", "steppe", "trough", "updraft", 
			"valley", "wavelength", "xenolith", "yardang", "zephyr"

		};
		String word = words[random.nextInt(words.length)];
		for (int l = 0; l < word.length();l++) {
			letters.add("_");
		}
		// String[] letters = new String[word.length()];
		while (true) {
			try {
				System.out.print("Your try: ");
				String trie = input.nextLine().toLowerCase();
				for (int i = 0; i < word.length();i++) {
					if (trie.equals(word)) {
						System.out.println("--------------------------");
						System.out.println();
						System.out.println("Correct!");
						System.out.println("The word was "+word);
						System.out.println();
						System.out.println("--------------------------");
						input.close();
						break;
					} else if (!letters.contains("_")) {
						System.out.println("--------------------------");
						System.out.println();
						System.out.println("Word guessed "+word.toUpperCase());
						System.out.println();
						System.out.println("--------------------------");
						input.close();
						break;
					} else if (trie.equals(String.valueOf(word.charAt(i)))) {
						letters.set(i, trie);
					} 
				}
				System.out.println(letters);
			} catch (Exception ex ) {
				System.out.println("Game off");
				break;
			}
		}
	}
}