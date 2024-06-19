import java.util.*;
public class sam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();
		for(int i=0;i<s;i++) {
			for(int j=1;j<s-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=s-i;j<=s;j++) {
				System.out.print(j+" ");
			}
			for(int j=s-1;j>s-i-1;j--) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		for(int i=1;i<s;i++) {
			System.out.print(" ".repeat(i*2));
			for(int j=i+1;j<=s;j++) {
				//System.out.print(" ".repeat(i)+" ");
				System.out.print(j+" ");
			}
			for(int j=s-1;j>i;j--) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}
