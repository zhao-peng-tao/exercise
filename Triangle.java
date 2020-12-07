import java.util.Scanner;

public class Triangle {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("please input the row");
		int row = in.nextInt();
		for(int i =0; i<=row; i++){
			for(int j =row-i;j>0;j--){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}