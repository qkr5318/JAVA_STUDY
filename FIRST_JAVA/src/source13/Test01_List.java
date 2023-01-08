package source13;

import java.util.Arrays;
import java.util.List;

public class Test01_List {
	public static void main(String[] args) {

	 String names [] = {"사슴", "호랑이", "바다표범", "곰"};
	 
	 List<String> list = Arrays.asList(names);
	 for (String string : list) {
		System.out.println(string + " ");
	}
  }
}


