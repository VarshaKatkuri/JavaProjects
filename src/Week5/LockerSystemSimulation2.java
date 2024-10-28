/*
	Name: Varsha Katkuri
	Student Id: 8907663
	PROGRAM: PROG8580 Computer Programming
    	PROF: Srdjan Toholj 
    	Assignment 2: Locker System Simulation - Algorithm 2
 */

package Week5;

public class LockerSystemSimulation2 {

	public static void main(String[] args) {
		boolean[] lockerStatus = new boolean[100];
		
		//iterate through each locker and check if the locker number is a perfect square
		for(int locker = 1; locker<= lockerStatus.length; locker++ ) {
			if (Math.sqrt(locker)%1 == 0){
				//print that the locker at that locker index is open if the locker number is a perfect square
				System.out.println("Locker "+ locker + " is open.");
			}
		}
	}

}
