package sec06.ch04;

public class IfMission2Another2 {
		public static void main(String[] args) {
			final int m_s=175, g_s=163;
			String g1="여자", displayGender="남자", displayresult="평균";
			int g1_h=166, s=m_s;
			
			
			if(g1.equals("남자")) {
				displayGender="남자";  
				s=m_s;		//여자 평큔키로 변경
				}
			
			if(g1_h>s)
				displayresult="평균 초과";
			else if(g1_h<s)
				displayresult="평균 미만";
			
			System.out.println(displayGender+" "+displayresult);	
			
//			String gender="여";				변수2개를 더해서 조건탈출후 out은 한번만 작성
//			int height =162;
//			final int man_stand=176;
//			final int woman_stand=176;
//			int stand =man_stand;
//			
//			if(gender.equals("여")) {
//				
//			}
				
			
		
		}	
}
