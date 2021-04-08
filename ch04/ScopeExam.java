package sec06.ch04;

public class ScopeExam {
//스코프 변수&상수가 살아있는 범위
// {}안에서 변수 선언시 그 범위에서만 살아있다
	public static void main(String[] args) {
		int k=0;
		for (int i = 0; i < 5; i++) {

		}
		for (int i = 0; i < 5; i++) {

		}
	}
}
