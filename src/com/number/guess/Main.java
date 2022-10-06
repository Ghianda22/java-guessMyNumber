package com.number.guess;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		boolean guessed = false;
		int numToGuess = r.nextInt(10);
		
		while(!guessed) {
			System.out.println("Indovina il numero che ho pensato!");
			int attempt = sc.nextInt();
			if(attempt != numToGuess) {
				if(attempt < numToGuess) {
					System.out.println("Sbagliato! Il tuo numero è troppo piccolo");
				}else {
					System.out.println("Sbagliato! Il tuo numero è troppo grande");
				}
			}else {
				guessed = true;
				System.out.println("Wow hai indovinato!!");
			}
		}
	}
}
