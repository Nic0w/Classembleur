package fr.esiea.pair.classembleur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Map.Entry;

public class AfficheAssembleur {


	public AfficheAssembleur(String fichier) {

		ProcessBuilder pb = new ProcessBuilder("/usr/bin/objdump", "-x","-D", fichier);


		//afficherEnvironnement(pb.environment()); 

		affichierAssembleur(pb);

	}


	private void affichierAssembleur(ProcessBuilder pb) {

		try {
			Process process = pb.start();


			InputStream input = process.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(input));


			String line;
			String lastLine = null;
			while ((line = br.readLine()) != null) {
				if (line != null) {
					lastLine = line;
					System.out.println(lastLine);
				} } 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private static void afficherEnvironnement(Map<String,String> map)
	{
		System.out.print("########");

		for (Entry<String,String> entry : map.entrySet())
			System.out.printf("\n %s\n %s\n",entry.getKey(),entry.getValue());

		System.out.println("########");
	}



}
