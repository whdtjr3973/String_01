package com.biz.str;

public class String_08 {

	public static void main(String[] args) {

		String userId = "Korea";
		String password = "!aa1234";
		
		/*
		 * ���ڿ��� �� �����Ҷ���
		 * equals() �޼ҵ带 ����Ѵ�.
		 * ��, ��ҹ��� ���о��� ���ϰ��� �Ҷ�����
		 * equalsIgnoreCase()�� ����ϸ� �ȴ�.
		 */
		if(userId.equalsIgnoreCase("KOREA") == false) {
			System.out.println("����� ID�� �߸� �Ǿ����ϴ�.");
		} else if(password.equals("!aa1234") == false) {
			System.out.println("��й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
		} else {
			System.out.println("�α��� �Ǿ����ϴ�.");
		}
			
		
	}

}
