package sec06.ch04;

public class WhileMission2 {
	public static void main(String[] args) {
		int val;
		int sum = 0;
//		while(true) {
//			val=(int)(Math.random()*11) ;
//			if(val!=0)
//				sum+=val;
//			else
//				break;
//			System.out.println("val : "+val);
//		}
//		System.out.println("sum : "+sum);
		val = (int) (Math.random() * 11);
		
		while (val != 0) {
			val = (int) (Math.random() * 11);
			sum += val;
			System.out.println("val : " + val);
		}
		System.out.println("sum : " + sum);
	}
}
