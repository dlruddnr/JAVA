package sec06.ch04;

public class ForMission5 {
	public static void main(String[] args) {
//		for(int i=2; i<10; i++) {
//			for(int j=1; j<10;j++) {
//				System.out.printf("%d * %d = %d\n",i,j,i*j);
//			}
//			System.out.println();
//		}
		int star=(int)(Math.random()*5)+3;
		System.out.println(star);
		for(int i=0;i<star;i++) {
			for(int j=0; j<star;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
