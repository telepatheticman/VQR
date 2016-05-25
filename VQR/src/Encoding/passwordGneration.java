package Encoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class passwordGneration {
	
	public static void main(String args[]){
		Random rand = new Random();
		List<String> partsBin = new ArrayList<String>(12);
		int part;
		int listTemp = 0;
		String unpadded = null;
		String partString = null;
		String partStringtemp = null;
		String pass = null;
		for (int x = 0; x < 12; x ++){
			part = rand.nextInt(256);
			unpadded = Integer.toBinaryString(part);
			partString = "00000000".substring(unpadded.length()) + unpadded;
			partsBin.add(partString);
			System.out.println(x + 1 + ". " + partsBin.get(x));
		}
	}
}
