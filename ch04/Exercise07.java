package sec06.ch04;
import java.util.*;
public class Exercise07 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean run=true;
		int menu;
		int money;
		int balance=0;
		while(run) {
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택");
			menu=sc.nextInt();
			switch(menu) {
			case 1:{
				System.out.print("예금 금액을 입력하시오");
				money=sc.nextInt();
				balance+=money;
				System.out.printf("잔고 : %d\n",balance);
				break;
			}
			case 2:{
				System.out.print("출금 금액을 입력하시오");
				money=sc.nextInt();
				if(money>balance) {
					System.out.println("잔고에 돈이 없다");
					break;}
				balance-=money;
				System.out.printf("잔고 : %d\n",balance);
				break;
			}
			case 3:{
				System.out.printf("남은 잔고 : %d\n",balance);
				break;
			}
			case 4:{
				run=false;
				System.out.println("잘가라!!");
				break;
			}
			default:
				System.out.println("1,2,3,4 중에 선택하시오");
			}
		}
	}
}
//ㅇ[ 춮 잔 종]