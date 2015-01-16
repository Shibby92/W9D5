import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Set {
	public static int hash(int num) {
		return num / 10;
	}

	public static void main(String[] args) {
		HashMap<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
		Random rand = new Random();
		for (int i = 0; i < 100; i++) {
			int value = rand.nextInt(100);
		}
		java.util.Set<Integer> keys = map.keySet();
		Iterator<Integer> keyIterator = keys.iterator();
		while (keyIterator.hasNext()) {
			int key = keyIterator.next();
			Iterator<Integer> valueIterator = map.get(key).iterator();
			System.out.println("Key: " + key);
			while (valueIterator.hasNext()) {
				System.out.println("Value: " + valueIterator.next());
			}
			System.out.println();
		}
	}
}