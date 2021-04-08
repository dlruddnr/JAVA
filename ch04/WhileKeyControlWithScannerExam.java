package sec06.ch04;

import java.util.*;
public class WhileKeyControlWithScannerExam {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int speed=0;
		System.out.println("-------------------------");
		System.out.println("1.증속 | 2.감속 | 3.중지");
		System.out.println("-------------------------");
		
		
		while(true) {
			System.out.print("선택: ");
			int inputVal=sc.nextInt();
			if(inputVal==1) {
				speed++;
			}
			else if(inputVal==2) {
				speed--;
			}
			else if(inputVal==3) {
				break;
			}
			else {
				System.out.println("1,2,3 중에 입력하시오");
				continue;
			}
			System.out.println("현재속도: "+speed);
			
		}
		//sc.close(); 닫으면 system.in도 닫혀서 에러 발생
		System.out.println("-------------------------");
		System.out.println("1.증속 | 2.감속 | 3.풀가속 | 4.중지");
		System.out.println("-------------------------");
		sc=new Scanner(System.in);
		while(true) {
			System.out.println("선택: ");
			int val=sc.nextInt();
			if(val==1) {speed++;}
			else if(val==2) {speed--;}
			else if(val==3) {speed=20;}
			else if(val==4) {break;}
			System.out.println("현재속도: "+speed);
		}
		System.out.println("끝");
		sc.close();
	}
}
