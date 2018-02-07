import java.util.Scanner;

/**
 * 
 */


public class DoubleDice {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int Rounds = scan.nextInt();
		int AnP = 100;
		int DaP = 100;
		
		
		for(int i = 1; i<=Rounds;i++) {
			
			int temp1 = 0;
			int temp2 = 0;
			
			temp1 = (int)(Math.random()*6)+1;
			temp2 = (int)(Math.random()*6)+1;
			
			if(temp1>temp2) {
				DaP -= temp1;
			}
			else if(temp2>temp1) {
				AnP -= temp2;
			}
			else {
				
			}
			System.out.println(temp1+" "+temp2);
		}
		System.out.println(AnP);
		System.out.println(DaP);

	}

}
