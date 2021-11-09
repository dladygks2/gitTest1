package practice211028;

public class Day06_Ch06_Student {
	
	public int studentId;
	public String studentName;
	
	// 우리가 설계한 클래스를 참조 타입으로 사용한다.
	Day06_Ch06_Subject korea;
	private Day06_Ch06_Subject math;
	
	// 생성자
	public Day06_Ch06_Student(int id, String name) {
		studentId = id;
		studentName = name;
		// 참조 타입은 생성을 해야 사용할 수 있다.
		// 메모리에 존재하게 만들어야한다.
		
		korea = new Day06_Ch06_Subject();
		math = new Day06_Ch06_Subject();
	}
	// 정보를 입력 받는 메서드 생성(국어 과목에 대한 정보 셋팅)
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	// 정보를 입력 받는 메서드 생성(수학 과목에 대한 정보 셋팅)
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	// 학생에 총점을 화면에 출력하는 기능 만들기
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName +"의 총점은 "+ total + " 점 입니다.");
	}
	
}
