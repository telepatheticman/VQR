package Encoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class passwordGeneration {
	
	public static String Generation(){
		Random rand = new Random();
		List<String> partsBin = new ArrayList<String>(12);
		String hexPass = null;
		int part;
		String unpaddedBin = null;
		String unpaddedHex = null;
		String partStringBin = null;
		String partStringHex = null;
		for (int x = 0; x < 11; x ++){
			part = rand.nextInt(256);
			unpaddedBin = Integer.toBinaryString(part);
			unpaddedHex = Integer.toHexString(part);
			partStringBin = "00000000".substring(unpaddedBin.length()) + unpaddedBin;
			partStringHex = "00".substring(unpaddedHex.length()) + unpaddedHex;
			partsBin.add(partStringBin);
			hexPass = partStringHex + hexPass;
		//	System.out.println(x + 1 + ". " + partsBin.get(x));
		}
		hexPass = hexPass.substring(0, 22);
	//	System.out.println(hexPass);
		return hexPass;
	}
}
