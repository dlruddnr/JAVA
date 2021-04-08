package sec06.ch04;
import java.util.*;
public class ForExam4 {
	public static void main(String[] args) {
		String[] strArr= {"A","B","C","D"};
		int limit=strArr.length/2;
		
		for(int i=0;i<limit;i++) {
			int abs=Math.abs(-i+(strArr.length)/2+1);
			String temp=strArr[i];
			strArr[i]=strArr[abs];
			strArr[abs]=temp;
		}
		for(String str:strArr) {
			System.out.println(str);
		}
		for(int i=strArr.length; i>0; i--) {
			System.out.println(strArr[i-1]);
		}
		
	}
}
