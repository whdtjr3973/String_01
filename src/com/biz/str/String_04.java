package com.biz.str;

public class String_04 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		char[] c = strNation.toCharArray();
		// strNation ������ ��� ���ڿ��� ��� �ҹ��ڷ� ��ȯ
		String str1 = strNation.toLowerCase();
		// strNation ������ ��� ���ڿ��� ��� �빮�ڷ� ��ȯ
		String str2 = strNation.toUpperCase();
		
		System.out.println("�ҹ��� : " + str1);
		System.out.println("�빮�� : " + str2);
		System.out.println(c);
		
		
	}

}
