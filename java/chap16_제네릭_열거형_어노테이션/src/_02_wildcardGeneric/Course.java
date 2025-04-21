package _02_wildcardGeneric;

public class Course {
	// 모든사람이 등록 가능
	static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "가 Course1를 등록하였습니다.");
	}
	
	// 학생만 등록 가능
	static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "가 Course2를 등록히였습니다.");
	}
	
	// 직장인 및 일반인 등록 가능
	static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+ "가 Course3을 등록하였습니다");
	}

	


}


