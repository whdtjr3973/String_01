package com.biz.str;

public class String_02 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		int intNationLength = 0;
		
		// Length : ����, ũ��� ���õ� Keyword
		// �迭.length : �迭�� ��ü ���� : �������
		// ���ڿ�.length(); : ���ڿ��� ������ �˷��ִ� method �̴�
		intNationLength = strNation.length();
		System.out.println("Nation ���� : " + intNationLength);
		
		/*
		 * �迭�� ������ �˼��ִ� �迭.length�� ��� �����̰�
		 * ���ڿ��� ������ �˼��ִ� ���ڿ�.length()�� method�̴�
		 * ���� �迭�� ������ �˼��ִ� ��������� ���� �д� �� ���ٴ�
		 * ���ڿ��� ������ �˼��ִ� method�� �����ϴ½ð��� �� �����ɸ���.
		 */
	}

}
