package com.qa.testdrivendevelopment;

import java.util.ArrayList;
import java.util.List;

public class Questions {
	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}


	/**
	 * Given a string and a char, returns the position in the String where the char first appears.
	 * Ensure the positions are numbered correctly, please refer to the examples for guidance. <br>
	 * Do not ignore case <br>
	 * Ignore whitespace <br>
	 * If the char does not occur, return the number -1. <br>
	 * <br>
	 * For Example: <br>
	 * returnPosition("This is a Sentence",'s') → 4 <br>
	 * returnPosition("This is a Sentence",'S') → 8 <br>
	 * returnPosition("Fridge for sale",'z') → -1
	 */
	public int returnPosition(String input, char letter) {
		char[] toArray = input.toCharArray();
		char match = letter;
		int numOfWhiteSpace = 0;
		
		for(int i = 0; i < toArray.length; i++) {
			if (toArray[i] == ' ') {
				numOfWhiteSpace++;
				continue;
			}
			
			if(toArray[i] == match) {
				return i - numOfWhiteSpace + 1;
			}
		}
				
		return -1;
	}

	/**
	 * Given two Strings of equal length, 'merge' them into one String.
	 * Do this by 'zipping' the Strings together. <br>
	 * Start with the first char of the first String. <br>
	 * Then add the first char from the second String. <br>
	 * Then add the second char from the first String. <br>
	 * And so on. <br>
	 * Maintain case. <br>
	 * You will not encounter whitespace. <br>
	 * <br>
	 * For Example: <br>
	 * zipped("String","Fridge") → "SFtrriidngge" <br>
	 * zipped("Dog","Cat") → "DCoagt"<br>
	 * zipped("True","Tree") → "TTrrueee" <br>
	 * zipped("return","letter") → "rleettutrenr" <br>
	 */
	public String zipped(String input1, String input2) {
		String empty = "";
		
		String[] convert1 = input1.split("");
		String[] convert2 = input2.split("");
			
			for(int i = 0; i < convert1.length; i++) {
				empty += convert1[i];
				for(int j = i; j < convert2.length;) {
					empty += convert2[j];
					break;
				}				
			}
				
		return empty;
	}

	
	/**
	 * Given an Array of Strings, remove any duplicate Strings that occur, then return the Array. <br>
	 * Do not ignore case. <br>
	 * <br>
	 * For Example: <br>
	 * removeDuplicates({"Dog"}) → {"Dog"} <br>
	 * removeDuplicates({"Dog","Cat"}) → {"Dog","Cat"} <br>
	 * removeDuplicates({"Dog","Dog","Cat"}) → {"Dog","Cat"} <br>
	 * removeDuplicates({"Dog","DoG","Cat"}) → {"Dog","DoG","Cat"} 
	 */
	public String[] removeDuplicates(String[] stringArray) {
		String[] newArray = stringArray;
		//int[] arrayIndex = {};
		
		
		
		if (stringArray.length > 1) {
			for (int i = 0; i < stringArray.length ; i++) {
				
				for(int j = i; j < stringArray.length - 1; j++) {
					
					
				}
			}
		}
		

		return newArray;
	}

	/**
	 * Given a large string that represents a csv (comma separated values), the structure of each record will be as follows:
	 * owner,nameOfFile,encrypted?,fileSize <br>
	 * <br>
	 * Example:
	 * "Bert,private.key,True,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445" <br>
	 * <br>
	 * Where a comma separates out the fields, and the \n represents a new line. <br>
	 * For each record, if it is not encrypted, return the names of the owners of the files in a String Array. <br>
	 * Do not include duplicate names. <br>
	 * <br>
	 * For Example: <br>
	 * csvScan("Jeff,private.key,False,1445") → {"Jeff"} <br>
	 * csvScan("Bert,private.key,True,1447\nBert,public.key,True,1318\nJeff,private.key,False,1445") → {"Jeff"} <br>
	 * csvScan("Bert,private.key,False,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445") → {"Bert","Jeff"} <br>
	 * csvScan("Bert,private.key,True,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445") → {"Bert","Jeff"}
	 */
	public String[] csvScan(String csvInput) {
		String[] splitUp = csvInput.split("\n");
		String[] test1 = splitUp.toString().split(",");
		
		System.out.println(splitUp);
		
		//System.out.println(test1);
		
		//for(String test2: test1) {
		//	System.out.println(test2);
		//}
		//for(String test : splitUp) {
		//	System.out.println(test);
		//}
		return null;
	}

	
	/**
	 * Write a function to randomly generate a list with 5 even numbers between 100 and 200 inclusive. <br>
	 *  <br>
	 * For Example:     <br>
	 * listGen() → {100,102,122,198,200}  <br>
	 * listGen() → {108,104,106,188,200}  <br>
	 * listGen() → {154,102,132,178,164}
	 */
	public int[] listGen() {
		
		int[] array = {0,0,0,0,0};
		boolean trace = true;
		
		
		for(int i = 0; i < array.length; i++) {
			double randNum = 0.0;
		while (trace) {
			randNum = Math.random();
			if(randNum > 0.11 && randNum <= 0.2) {
				trace = false;
			}
			
		}
			array[i] = (int)(randNum * 500) * 2;
			trace = true;
			
		}
		return array;
	}


	/**
	 * A prime number is one which is only divisible by one and itself.  <br>
	 * Write a function which returns the boolean True if a number is prime, and the boolean False if not. <br>
	 *  <br>
	 * For Example: <br>
	 * isPrime(3) → True <br>
	 * isPrime(8) → False
	 */
	public boolean isPrime(int num) {
		
		if(num % 2 == 0) {
			if(num == 2) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(num % 3 == 0) {
			if(num == 3) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(num % 5 == 0) {
			if(num == 5) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(num % 7 == 0) {
			if(num == 7) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return true;
		}
		
	}

	/**
	 * Wrtie a function which returns the number of vowels in a given string.  <br>
	 * You should ignore case. <br>
	 *  <br>
	 * For Example: <br>
	 * getVowel("Hello") → 2  <br>
	 * getVowel("hEelLoooO") → 6
	 */
	public int getVowel(String input) {
		String vowel = input.toLowerCase();
		int counter = 0;
		
		for(int i = 0; i < vowel.length(); i++) {
			if(vowel.subSequence(i, i + 1).equals("a") || vowel.subSequence(i, i + 1).equals("e") || vowel.subSequence(i, i + 1).equals("i") || vowel.subSequence(i, i + 1).equals("o") || vowel.subSequence(i, i + 1).equals("u")) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Given two string inputs, if one can be made from the other return the boolean True, if not return the boolean False.  <br>
	 *  <br>
	 * For Example:  <br>
	 * wordFinder("dog", "god") → True  <br>
	 * wordFinder("tiredest", "tree") → True  <br>
	 * wordFinder("dog", "cat") → False  <br>
	 * wordFinder("tripping", "gin") → True
	 */
	public boolean wordFinder(String initialWord, String madeString) {
		
		int counter = 0;
		
		for(int i = 0; i < initialWord.length() + 1 ; i++) {
			if(i ==0) {
				continue;
			}
			for(int j = 0; j < madeString.length() + 1; j++) {
				if(j == 0) {
					continue;
				}
				if ((madeString.substring(j - 1, j).equals(initialWord.substring(i - 1,  i)))) {
					counter++;
				}
			}
		}
		
		if(counter >= madeString.length()) {
			return true;
		}
		
		return false;
	}
	

	/**
	 * There is a well known mnemonic which goes "I before E, except after C", which is used to determine which order "ei" or "ie" should be in a word.  <br>
	 *  <br>
	 * Write a function which returns the boolean True if a string follows the mnemonic, and returns the boolean False if not.  <br>
	 *  <br>
	 * For Example:  <br>
	 * iBeforeE("ceiling") → True  <br>
	 * iBeforeE("believe") → True  <br>
	 * iBeforeE("glacier") → False  <br>
	 * iBeforeE("height") → False
	 */
	public boolean iBeforeE(String input) {
for(int i = 0; i < input.length() - 1 ; i++) {
			
			if(input.substring(i, i + 2).equalsIgnoreCase("ei")) {
				if (i == 0) {
					continue;
				}
				else if(input.substring(i - 1, i).equals("c")) {
					return true;
				}
				else {
					return false;
				}
			}
			
			if(input.substring(i, i + 2).equalsIgnoreCase("ie")) {
				if(i == 0) {
					continue;
				}
				if(input.substring(i - 1, i).equals("c")) {
					return false;
				}
				else {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 	A factorial is the product of itself and all previous numbers  <br>
	 * eg 3 factorial is 1 x 2 x 3 = 6  <br>
	 *  <br>
	 * Write a function which can compute the factorial of a given number between 1 and 10 inclusive.   <br>
	 *   <br>
	 * For Example:  <br>
	 * factorial(1) → 1  <br>
	 * factorial(4) → 24  <br>
	 * factorial(8) → 40320
	 */
	public int factorial(int number) {
		int factorialNumber = 1;
		for(int i = number; i > 0; i--) {
			factorialNumber *= i;
		}
		return factorialNumber;
	}

}
