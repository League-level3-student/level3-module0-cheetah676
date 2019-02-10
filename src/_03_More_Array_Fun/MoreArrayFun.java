package _03_More_Array_Fun;

import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class MoreArrayFun {
	static String [] yee={"1", "2", "3", "4"};
	//1. Create a main method to test the other methods you write.
	public static void main(String[]args) {
	printStringArray(yee);
	printStringArrayInReverse(yee);
	printEveryOtherString(yee);
	printStringsRandomly(yee);
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void printStringArray(String[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void printStringArrayInReverse(String[] array) {
		for (int i = array.length-1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void printEveryOtherString(String[] array) {
		for(int i=0; i<array.length; i+=2) {
			System.out.println(array[i]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void printStringsRandomly(String[]array) {
		for(int i=0; i<array.length; i++) {
			int size=4;
			boolean[]seen=new boolean[4];
			int count=0;
			while(count<size) {
				Random random=new Random();
				int randomInt=random.nextInt(array.length);
				if(seen[randomInt]==false) {
					System.out.println(randomInt);
					seen[randomInt]=true;
				}
			}
		}
	}
	
}
