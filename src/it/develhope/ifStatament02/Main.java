package it.develhope.ifStatament02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Surname: ");
		Scanner sc = new Scanner(System.in);
		String mySurname=sc.next();
		if(mySurname.length()==0){
			System.out.println("There is no surname");
		} else if (mySurname.contains("ni")) {
			System.out.println("Your surname contains the sequence of letters \"ni\"");
		}  else System.out.println("Your surname doesn't contain the sequence of letters \"ni\"");
	}
}