package com.biz.str;

public class String_01 {

	public static void main(String[] args) {

		// �Ϲ����� ������ ����� �������
		// ���ڿ� ������ ����
		// ���ڿ� ���� = ���ڿ� ��ü
		String strNation = "Republic of Korea";

		// new Ű���带 �̿��Ͽ� ���ڿ� ����(���ڿ� ��ü)�� ����
		// ����ִ�(blank) ������ �����ϴ� ���
		String strName = new String();

		// String strHong = "ȫ�浿";
		String strHong = new String("ȫ�浿");

		// ���ڿ��� +������ ���� ���ڿ��� ���� ��ų���ִ�.
		System.out.println("Nation : " + strNation);

	}

}
