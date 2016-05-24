package Encoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class passwordGneration {
	
	public static void main(String args[]){
		Random rand = new Random();
		List<Integer> parts = new ArrayList<Integer>(12);
		int part;
		String pass = null;
		for (int x = 0; x < 12; x ++){
			part = rand.nextInt(256);
			parts.add(part);
			System.out.println(parts.get(x));
		}
	}
}
