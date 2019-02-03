package _03_More_Array_Fun;

import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class MoreArrayFun {
	static String [] yee={"yee", "hi", "yo"};
	//1. Create a main method to test the other methods you write.
	public static void main(String[]args) {
	printStringArray(yee);
	printStringArrayInReverse(yee);
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
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	
}
