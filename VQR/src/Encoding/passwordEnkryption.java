package Encoding;

import java.util.ArrayList;
import java.util.List;

public class passwordEnkryption {
	public static void main(String args[]){
		String hexPass = passwordGeneration.Generation();
		String unpadBin;
		String padBin;
		String in;
		String keyTemp;
		String out = "";
		List<String> partsBin = new ArrayList<String>(11);
		List<String> key = new ArrayList<String>(11);
		List<String> Encryption = new ArrayList<String>(11);
		key.add("10011010");
		key.add("10101010");
		key.add("01010101");
		key.add("11001100");
		key.add("10110100");
		key.add("01000111");
		key.add("01011100");
		key.add("11001101");
		key.add("11011011");
		key.add("11001111");
		key.add("01001001");
		for (int x = 0; x < 11; x++){
			unpadBin = Integer.toBinaryString(Integer.parseInt(hexPass.substring(2*x, 2*x + 2), 16));
			padBin = "00000000".substring(unpadBin.length()) + unpadBin;
			partsBin.add(padBin);
//			System.out.println(partsBin.get(x));
		}
//		System.out.println(hexPass);
		for (int y = 0; y < 11; y++){
			in = partsBin.get(y);
			keyTemp = key.get(y);
			out = "";
			for (int z = 0; z < 8; z++){
				if ((in.substring(z, z + 1).equals("0") && keyTemp.substring(z, z + 1).equals("1"))
				  ||(in.substring(z, z + 1).equals("1") && keyTemp.substring(z, z + 1).equals("0"))){
					out = out + "1";
				}
				else{
					out = out + "0";
				}
			}
			Encryption.add(out);
			System.out.println(partsBin.get(y) + "\n" + key.get(y) + "\n" + Encryption.get(y) + "\n");
		}
	}
}
