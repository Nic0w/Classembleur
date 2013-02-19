/**
 * 
 */
package fr.esiea.pair.classembleur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

/**
 * @author nic0w
 *
 */
public class Main implements Runnable {

	/**
	 * 
	 */
	public Main(String args[]) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Main(args).run();	
	}




	@Override
	public void run() {

		System.out.println("Quel fichier voulez vous analyser ?");
		Scanner sc = new Scanner(System.in);
		String fichier = sc.next();

		AfficheAssembleur  aa = new AfficheAssembleur(fichier);


		System.out.println("Hello world !");
		System.out.println(" Je t'aime Nicpl0w");

	}

}
