import java.util.Scanner;

public class Reverse{
	Scanner scan = new Scanner(System.in);
	public static void numberreverse(){
		System.out.println("please enter a number");

		int num = scan.nextInt();
		int num1 [] = num;
		for(int i =0;i<num1.length;i++){
			System.out.println(num1[i]);
		}

	}


	public static void main(String [] args){
     Reverse rev = new Reverse();
     rev.numberreverse();
	}
}