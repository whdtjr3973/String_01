package com.biz.str;

public class String_01 {

	public static void main(String[] args) {

		// 일반적인 변수를 만드는 방법으로
		// 문자열 변수를 생성
		// 문자열 변수 = 문자열 객체
		String strNation = "Republic of Korea";

		// new 키워드를 이용하여 문자열 변수(문자열 객체)를 생성
		// 비어있는(blank) 변수를 생성하는 방법
		String strName = new String();

		// String strHong = "홍길동";
		String strHong = new String("홍길동");

		// 문자열은 +연산을 통해 문자열을 연결 시킬수있다.
		System.out.println("Nation : " + strNation);

	}

}
