package in.java_practice;
import java.util.*;
public class Number_Pattern {

	public static void main(String[] args) {
		Scannar sc =  new Scanner(System.in);
		System.out.printlin("Enter the n:");
		int n;
		n = sc.nextInt();
		for(int i=1;i<n;i++) {
			for(int j=1;j<n;j++) {
				System.out.print(i);
			}System.out.println();
		}

	}

}
