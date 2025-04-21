package _02_uesrException;
// 사용자 정의 예외 클래스는 반드시 Exception 상속 받아 사용
public class UesrException extends Exception {
	UesrException () {   }
	UesrException (String message) {   
		super(message);
	}
}
