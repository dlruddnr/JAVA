package sec06.ch04;

public class ForMission9 {
	public static void main(String[] args) {
		int star = (int) (Math.random() * 5) + 3;
		System.out.println(star);

//		for(int i=star;i>0;i--) {
//			for(int j=1;j<i;j++) {
//				System.out.print("_");
//			}
//			for(int k=i;k<=star;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		for (int i = star; i > 0; i--) {
			for (int j = 1; j <= star; j++) {
				if (j >= i) {
					System.out.print("*");
				} else {
					System.out.print("_");
				}
			}
			System.out.println();
		}

	}
}
//star=5일때
//겉 for문 i=5		i=4
//		j=1 -> _	j=1 -> _
//		j=2 -> _	j=2 -> _
//		j=3 -> _	j=3 -> _
//		j=4 -> _	j=4 -> * 	따라서 j>=i 떄 * 또는 j<i 떄 _
//		j=5 -> *	j=5 -> *