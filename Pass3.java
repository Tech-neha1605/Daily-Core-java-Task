package com.jbk;
import java.util.Scanner;
public class Pass3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Password : ");
		String password = sc.next();
		char[] array = password.toCharArray();
		int letters = 0 , numbers=0 , specialchar=0;
		
		for(char ch : array) {
			if (Character.isLetter(ch)) {
                letters++;  // increment by 1
            } else if (Character.isDigit(ch)) {
                numbers++;
            } else {
                specialchar++;
            }
		}
		
		 System.out.println("Letters = " + letters);
	     System.out.println("Numbers = " + numbers);
	     System.out.println("Special Characters = " + specialchar);
	}

}
