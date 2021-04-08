package sec06.ch03;

public class CompareOperatorExam {
	public static void main(String[] args) {
		int num1=10;
		int num2=10;
		
		boolean result1=(num1==num2);
		boolean result2=(num1!=num2);
		boolean result3=(num1<=num2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		char ch1='A';
		char ch2='B';
		boolean result5=ch1<ch2;
		System.out.println("result5="+result5);
		//> < >= <= == != 원시형 숫자타입에만 사용, 원시형 타입과 참조형 타입
		String st1="A";
		String st2="A";
		System.out.println(st1.equals(st2));
	}
}
