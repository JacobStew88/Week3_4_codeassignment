package Week3_4_coding;

public class Week3_4_coding_assignment {

	public static void main(String[] args) {
		int[] ages = {3,9,23,64,2,8,28,93};
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double [] newDoub1 = {4.54,23.4,78.5};
		double [] newDoub2 = {1.1,2.2,3.3};
		boolean isHotOutside = true;
		double moneyInPocket = 10.49;
		
		//Section 1
		int x = ages[0] - (ages[ages.length-1]);
		System.out.println("First element - Last element = " + x);
		
		double sum = 0;
		for (double average : ages) {
			sum+=average;
		}
		System.out.println("Average Age = " + sum/ages.length);
		
		//Section 2
		int[] results = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			results[i] = names[i].length();
		}
		double sumLetters = 0;
		for (double averageLetters : results) {
			sumLetters+=averageLetters;
		} 
		System.out.println("Average Letters = " + sumLetters/names.length);
		
		String combineNames = "";
		for (String name : names) {
			combineNames += name + " ";
		}
		System.out.println(combineNames);
		
		//access the last element of any array nameOfArray[nameOfArray.length-1];
		//access the first element of an array is nameOfArray[0] 
		//because 0 is always the first element in any array
		
		int[] nameLengths = new int [names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			System.out.println("Length of your " + names[i] + " = " + nameLengths[i]);
		}
		
		int sumNameLengths = 0;
		for (int lengthsName : nameLengths) {
			sumNameLengths += lengthsName;
		}
		System.out.println("Sum of name Lengths "+ sumNameLengths);
		
		//repeated string method
		System.out.println(stringRepeated("Hello" , 5));
		
		//fullname Method
		System.out.println(fullName("Scott","Nocks" ));
		
		//sumofints method
		System.out.println(sumOfInts(ages));
		
		//average of doubles
		System.out.println(gettingAverage(ages));
		
		//Average of 2 double arrays
		System.out.println(averageOfTwoArrays(newDoub1, newDoub2));
		
		//will buy drink method
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		//my own method that I am using from the labs. pallindrome
		System.out.println(isPallindrome("wow"));
	}
	
	//Method Section
	public static String stringRepeated(String string, int number) {
		 StringBuilder sb = new StringBuilder();
		 for (int i = 0; i < number; i++) {
			 sb.append(string);
		 }
	return sb.toString();
	
	}
	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	public static boolean sumOfInts(int[] array) {
		int sum = 0;
		for (int i : array)
			if(sum < 100) {
				sum += i;
			}
		return false; 
	}
	
	public static double gettingAverage(int[] arr) {
		double sum = 0;
		for (double number : arr) {
			sum+=number;	
		}
		return sum / arr.length;
	}
	
	
	public static boolean averageOfTwoArrays(double[] arr1, double[] arr2) {
		double sumArr1 = 0;
		double sumArr2 = 0; 
		for(double num1 : arr1) {
			sumArr1 += num1;
		}
		for(double num2 : arr2) {
			sumArr2 += num2;
		}
		if (sumArr1 > sumArr2)
			return true;
		else
			return false;
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket < 10.5) {
			return false;
	
		}else 
			return true;
	}
	
	public static boolean isPallindrome(String string) {
		for (int i = 0; i < string.length() /2; i++) {
			if(string.charAt(i) != string.charAt(string.length() - i - 1)){
			return false;
		}
		
	}
	return true;
	}
	
}
