package Encoding;


import java.util.Random;


public class passwordGeneration {
	
	public static String Generation(){
		Random rand = new Random();
		String hexPass = null;
		int part;
		String unpaddedHex = null;
		String partStringHex = null;
		for (int x = 0; x < 11; x ++){
			part = rand.nextInt(256);
			unpaddedHex = Integer.toHexString(part);
			partStringHex = "00".substring(unpaddedHex.length()) + unpaddedHex;
			hexPass = partStringHex + hexPass;
		//	System.out.println(x + 1 + ". " + partsBin.get(x));
		}
		hexPass = hexPass.substring(0, 22);
	//	System.out.println(hexPass);
		return hexPass;
	}
}
