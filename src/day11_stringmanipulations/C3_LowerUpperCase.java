package day11_stringmanipulations;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		// str.toLowerCase() verilen String'in tamamini kucuk harfe cevirir
		// str.toUpperCase() verilen String'in tamamini buyuk harfe cevirir
		
		String str = "Techproeducation";
		
		// buyuk harfle yazdirmak istersek
		System.out.println(str.toUpperCase());//TECHPROEDUCAT�ON
		
		// str'i buyuk harfe cevirmek istersek
		
		str=str.toUpperCase(); // bu satirdan sonra kalici olarak str BUYUK harlerden olusan bir String oldu
		
		System.out.println(str);//TECHPROEDUCAT�ON
		System.out.println(str.toLowerCase());//techproeducation
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));//techproeducation
		
	
		

	}

}
