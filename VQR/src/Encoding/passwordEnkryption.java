package Encoding;

import java.util.ArrayList;
import java.util.List;

public class passwordEnkryption {
	public static void main(String args[]){
		String hexPass = passwordGeneration.Generation();
		List<String> partsBin = new ArrayList<String>(12);
		List<String> key = new ArrayList<String>(12);
		for (int x = 0; x < 12; x++){
			
		}
		System.out.println(hexPass);
	}
}
