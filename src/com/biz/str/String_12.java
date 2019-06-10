package com.biz.str;

public class String_12 {

	/*
	 * ����ȭ����(Regular Expression)
	 * ���ԽĹ���
	 *  --(��������) ���ǿ� �´� ���ڿ��� �ִ��� �˻��ϴ� Ư���� ���� --���α׷��� ��
	 * ������� --��κ��� ���� ����ϴ� ��Ģ
	 */
	public static void main(String[] args) {

		String strNation = "Republic of Korea";

		// �빮�� R�� �����ϰ� �ڿ� 1���ڰ� �ִ� ���ǿ� �´���?
		boolean bYes = strNation.matches("\bR./"); // true

		// R�� �����ϰ� �ڿ� 3����(...)�� �ִ� ���ǿ� �´���?
		bYes = strNation.matches("R..."); // true

		// ������ ���ڿ�(0���� 9����)�� ���ԵǾ� �ִ���?
		bYes = strNation.matches("[0-9]"); // false
		
		String strEmail = "whdtjr3973@naver.com";
		
		// ���尣���� email �ּҰ� �ùٸ��� �ԷµǾ����� �˻��ϴ� �ڵ�
		bYes = strEmail.matches("[A-Za-z0-9]+@[A-Za-z]+\\.[A-Za-z]+");
		System.out.println(bYes);
	}

}
