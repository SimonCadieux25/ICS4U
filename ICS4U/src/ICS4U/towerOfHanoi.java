package ICS4U;

import java.util.Scanner;

public class towerOfHanoi {
	
	public static void Solve(int N, char Src, char Aux, char Dst) {
		
		if(N==0) {
			return ;
		}
		else {
			Solve(N-1, Src, Dst, Aux);
			System.out.println("Move from "+Src+" to "+Dst);
			Solve(N-1, Aux, Src, Dst);
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How Many Disks?");
		int N = scan.nextInt();
		Solve( N, 'A', 'B', 'C');
		N = (int) (Math.pow(2, N) - 1);
		System.out.println("Number of Moves " + N);
	}
    
}
