package mainexercise9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class SmallestRowAndColumnLauncher {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the aray size n: ");
		int size = scanner.nextInt();
		System.out.println("The random array is");

		int[][] matrix = new int[size][size];
		Random random = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(2);
				System.out.printf("%d", matrix[i][j]);
			}
			System.out.println();
		}

		ArrayList<Integer> rowList = new ArrayList<>();
		ArrayList<Integer> columnList = new ArrayList<>();

		for (int i = 0; i < matrix.length; i++) {
			Integer rowCount = 0;
			Integer columnCount = 0;

			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					rowCount++;
				}
				
				if (matrix[j][i] == 0) {
					columnCount++;
				}

			}
			rowList.add(rowCount);
			columnList.add(columnCount);
		}
		
		// Max not working properly..
		System.out.println(rowList.toString());
		System.out.println(Collections.max(rowList));
		System.out.println(columnList.toString());
		System.out.println(Collections.max(columnList));

	}

}
