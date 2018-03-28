/**
 * Simon Cadieux
 * 333716231
 * February 27, 12,018
 */

package ICS4U;

import java.util.Scanner;

public class towerOfHanoi {
	
	/**
	 * @param N (number of disks)
	 * @param Src (Source)
	 * @param Aux (Auxiliary/Unused place)
	 * @param Dst (Destination)
	 */
	
	public static void Solve(int N, char Src, char Aux, char Dst) {	
		
		if (N==0) {
			return ;

		}
		else {
			Solve (N-1, Src, Dst, Aux);
			System.out.println("Move from " + Src + " to " + Dst);
			Solve (N-1, Aux, Src, Dst);	
			
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
