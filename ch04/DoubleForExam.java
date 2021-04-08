package sec06.ch04;

public class DoubleForExam {
	public static void main(String[] args) {
		
		OUTER:
			for(int i=0;i<3;i++) {
				for(int j=0;j<4;j++) {
					System.out.println(j);
					if(j==2) {
						i=5;
						break;
					}
				}
			}
	}
}
