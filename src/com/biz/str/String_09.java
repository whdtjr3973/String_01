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
		
		// strKorea ���ڿ����� Ko��� ���ڿ��� ���ԵǾ� �ִ���
		bYes = strKor.contains("Ko");
		System.out.println(strKor + " contains Ko : " + bYes);
	}

}
