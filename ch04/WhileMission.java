package sec06.ch04;

public class WhileMission {
	public static void main(String[] args) {
		int total=0;
		
		int i=1;
		while(i<=100) {
			total=total+i;
			i++;
		}
		System.out.println(total);
	}
}
