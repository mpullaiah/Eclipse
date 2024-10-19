package com.rishi.arrays;

public class Test5 {

	public static void main(String[] args) {
		String[] words = {"coffee", "water", "chai", "diet coke"};
        String minWord = words[0];
        int minIndex = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < minWord.length()) {
                minWord = words[i];
                minIndex = i;
            }
        }
        System.out.println("Value - " + minWord + " & Index - " + minIndex);
	}
}
