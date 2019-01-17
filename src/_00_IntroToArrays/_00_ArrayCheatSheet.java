package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		int smallest=500;
		int largest=0;
		//1. make an array of 5 Strings
String[] stringArray= {"a1", "a2", "a3", "a4", "a5"};
		//2. print the third element in the array
System.out.println(stringArray[2]);
		//3. set the third element to a different value
stringArray[2]="b3";
		//4. print the third element again
System.out.println(stringArray[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
for(int i=0; i<stringArray.length; i++) {
	stringArray[i]="yeet"+i;
	//6. use a for loop to print all the values in the array
	//   BE SURE TO USE THE ARRAY'S length VARIABLE
System.out.println(stringArray[i]);
}
		//7. make an array of 50 integers
int[] intArray=new int [50000000];
		//8. use a for loop to make every value of the integer array a random number
for(int i=0; i<intArray.length; i++) {
	Random random=new Random();
	intArray[i]=random.nextInt(50000000);
}
		//9. without printing the entire array, print only the smallest number on the array
for (int g=0; g<intArray.length; g++) {
	if(intArray[g]<smallest) {
		smallest=intArray[g];
	}
}
System.out.println(smallest);
		//10 print the entire array to see if step 8 was correct
for(int h=0; h<intArray.length; h++) {
System.out.println(intArray[h]);
}
System.out.println(smallest);
		//11. print the largest number in the array.
for (int g=0; g<intArray.length; g++) {
	if(intArray[g]>largest) {
		largest=intArray[g];
	}
}
System.out.println(largest);
		//12. print only the last element in the array
int r=intArray.length-1;
		System.out.println(intArray[r]);
	}

	private static char[] stringArray(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
