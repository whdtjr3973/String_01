package com.biz.str;

public class String_06 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		int str1 = 0;
		str1 = strNation.length();
		String[] s1 = strNation.split("");

		// s1은 낱개 문자열을 담고있는 String배열이 된다.
		// 이 s1 문자열 배열에서
		// 영문자 o가 최초로 몇번쨰에 나타나는지
		// 찾아 봅시다

		for (int i = 0; i < s1.length; i++) {
			if (s1[i].equals("o")) {
				System.out.print("최초 o는 " + i + "번째입니다");
				break;
			}

		}

		/*
		 *  문자열은 == 을 사용하여 비교할 경우
		 *  문자열 변수에 저장된 값을 상대로 비교하지 않고
		 *  실제 문자열이 저장된 주소를 상대로 비교를 한다.
		 *  
		 *  따라서 문자열 변수에 저장된 값을 어떤 문자열과 비교하고자 할때는
		 *  ==대신에 equals() 메서드를 사용해야 한다.
		 */
	}

}
