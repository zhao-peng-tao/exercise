import java.util.Scanner;

public class Tower {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("please input the row");
		int row = in.nextInt();
		System.out.println("please input the line");
		int line = in.nextInt();
		for(int a =0; a<row; a++){
			for(int b =0;b<a;b++){
				System.out.print(" ");
			}
			for(int c =0;c<line-2*a;c++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}