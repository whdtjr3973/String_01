package com.biz.str;

public class String_11 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		String s1 = "";
		
		// strNation �� ��� ���ڿ��� 12��° ���� (0���� ����)
		// �߶� s1 �� ��ƶ�
		s1 = strNation.substring(12);
		System.out.println(s1);
		
		// 12��° ���� 15��° �ձ��� �߶�
		// s1�� ��ƶ�
		s1 = strNation.substring(12,15);
		System.out.println(s1);
		
		//12��° ���ڿ��� �����Ͽ� ���ڷ� ��ȯ���Ѷ�
		char c = strNation.charAt(12);
		
	}

}
