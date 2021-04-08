package sec06.ch04;

public class IfMission3 {
		public static void main(String[] args) {
			final int SCORE=(int)(Math.random()*20)+60;
			String Grade="A";
			System.out.println("score: "+SCORE);
			int abs=SCORE/10;

			if(abs==8) 
				Grade="B";
			else if(abs==7)
				Grade="C";
			if(SCORE>abs*10+6 ||SCORE==100)
				Grade+="+";
			else if(SCORE<abs*10+4) 
				Grade+="-";
			if(SCORE<=70)
				Grade="D";
			System.out.println(Grade);

			
			
//			if(SCORE>97)
//				Grade="A+";
//			else if(SCORE>=94)
//				Grade="A";
//			else if(SCORE>=91)
//				Grade="A-";
//			else if(SCORE>=87)
//				Grade="B+";
//			else if(SCORE>=84)
//				Grade="B";
//			else if(SCORE>=81)
//				Grade="B-";
//			System.out.println(Grade);
		
		
		}
}
