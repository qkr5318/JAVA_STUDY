package source11.chapter11.java_api_class;

import java.util.StringTokenizer;

public class Test07_StringTokenizer {
	public static void main(String[] args) {

		String str = "of the people, by the people, for the people";
		
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println(stn.countTokens());
		
		while (stn.hasMoreTokens()) {
			System.out.print("[" + stn.nextToken().trim() + "]");
		}
		System.out.println("\n====================================");
		String [] tokens = str.split(",");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i].trim());
		}
	}
}
