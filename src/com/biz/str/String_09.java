package com.biz.str;

public class String_09 {

	public static void main(String[] args) {

		String strKor = "Korea";

		boolean bYes = true;

		bYes = strKor.equals("KOREA");
		System.out.println(strKor + " eq KOREA : " + bYes);

		bYes = strKor.equalsIgnoreCase("KOREA");
		System.out.println(strKor + " eqig KOREA : " + bYes);

		bYes = strKor.matches("Korea");
		System.out.println(strKor + " ma KOREA : " + bYes);
		
		// strKorea 문자열내에 Ko라는 문자열이 포함되어 있느냐
		bYes = strKor.contains("Ko");
		System.out.println(strKor + " contains Ko : " + bYes);
	}

}
