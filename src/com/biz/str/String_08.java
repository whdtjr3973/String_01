package com.biz.str;

public class String_08 {

	public static void main(String[] args) {

		String userId = "Korea";
		String password = "!aa1234";
		
		/*
		 * 문자열을 비교 연산할때는
		 * equals() 메소드를 사용한다.
		 * 단, 대소문자 구분없이 비교하고자 할때에는
		 * equalsIgnoreCase()를 사용하면 된다.
		 */
		if(userId.equalsIgnoreCase("KOREA") == false) {
			System.out.println("사용자 ID가 잘못 되었습니다.");
		} else if(password.equals("!aa1234") == false) {
			System.out.println("비밀번호가 올바르지 않습니다.");
		} else {
			System.out.println("로그인 되었습니다.");
		}
			
		
	}

}
