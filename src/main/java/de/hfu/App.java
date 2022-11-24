package de.hfu;

/*Import Scanner*/
import java.util.Scanner; 

/**
 * Class according to sheet no. 5 task no. 2
 */
public class App 
{
    public static void main( String[] args )
    {
		/*Variablen Definition*/
		Scanner scanner = new Scanner(System.in);
		String eingabe, eingabeGross;
		
		/*Der Nutzer gibt einen beliebigen Text ein...*/
		System.out.print("Bitte geben Sie einen Text ein: ");
		eingabe = scanner.next();
		
		/*Covert to upper-case...*/
		eingabeGross = eingabe.toUpperCase();
		
		/*Nutzereingabe ausgeben...*/
		System.out.println("Ihre Eingabe: " + eingabe);
		System.out.println("Ihre Eingabe als Upper-Case: " + eingabeGross);
		
		/*Programm Ende*/
		System.out.println();
		System.out.println("=== Programm Ende ===");
		System.out.println();
    }
}
