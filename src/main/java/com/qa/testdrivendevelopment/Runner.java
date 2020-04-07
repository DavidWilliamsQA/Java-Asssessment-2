package com.qa.testdrivendevelopment;

public class Runner {
	public static void main(String[] args) {
		Questions quest = new Questions();
		quest.csvScan("yes");
		quest.factorial(4);
		quest.zipped("erfd", "weedsa");
		quest.wordFinder("woed", "wd");
		quest.getVowel("edsasd");
		quest.returnPosition("wdse", 'e');
		quest.isPrime(343);
		quest.greetingExample("ree");
		quest.listGen();
		quest.factorial(234);
		System.out.println(quest.iBeforeE("erf"));
		
	}
	
	

}
