package mainexercise7;

import java.util.ArrayList;
import java.util.Random;

public class ShuffleArrayListLauncher {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			Integer randomNumber = random.nextInt(25);
			list.add(randomNumber);
		}
		
		System.out.println(list.toString());
		shuffle(list);
		System.out.println(list.toString());

	}
	
	public static void shuffle(ArrayList<Integer> list) {
		int size = list.size();
		Random random = new Random();
		int randomIndex;
		Integer randomValue, originalValue;
		
		for (int i = 0; i < size; i++) {
			randomIndex = random.nextInt(size);
			originalValue = list.get(i);
			randomValue = list.get(randomIndex);
			
			list.set(i, randomValue);
			list.set(randomIndex, originalValue);
		}
	}

}
