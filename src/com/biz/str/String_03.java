package com.biz.str;

public class String_03 {

	public static void main(String[] args) {

		String strNation = "Repurblic of Korea";
		
		int intNationLen = strNation.length();

		// ���ڿ��� 1���ھ� �и��ؼ�
		// ���ڷ� �ٲٴ� �ڵ�
		// �ٲ� ���ڸ� �ֿܼ� ǥ��
		
		// 1�� �ڵ�
		for(int i = 0;i < intNationLen; i++) {
			char c = strNation.charAt(i);
			System.out.print(c + "\t");
		}
		
		System.out.println();
		
		// 2���ڵ�
		for(int i = 0;i < strNation.length(); i++) { 
			char c = strNation.charAt(i);
			System.out.print(c + "\t");
		}
		
		/*
		 * 1�� �ڵ�� ���ڿ��� ���̸� ����Ͽ� ������ ��Ƶΰ�
		 * ���� ���� �о� for �ݺ����� ��ȸ�Ѵ�.
		 * 
		 * 2�� �ڵ�� ���ڿ��� ���̸� ����ϱ� ���Ͽ�
		 * ���ڿ��� ����(����)��ŭ ����ؼ� length() method�� ȣ���Ѵ�.
		 * 
		 * ���� 1�� �ڵ�� ������ �����ؾ��ϴ� ���ŷο��� ������
		 * 2���� ���ϸ� ����ӵ��� �� ������
		 */
		
	}

}
