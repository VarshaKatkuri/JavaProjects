/*
	Name: Varsha Katkuri
	Student Id: 8907663
	PROGRAM: PROG8580 Computer Programming
    	PROF: Srdjan Toholj 
    	Assignment 2: Locker System Simulation
 */

package Week5;

public class LockerSystem {

	public static void main(String[] args) {
		
		// Declare a array of length 100 indicating the locker status of boolean datatype
		boolean[] lockerStatus = new boolean[100];
		
		//Call the function to change the Locker Status based on the student entering the school
		changeLockerStatus(lockerStatus);
		
		//Call the function to print the status of each locker. 
		printLockerStatus(lockerStatus);
	}
	
	public static void changeLockerStatus(boolean[] lockerStatus) {
		for(int student = 1; student <= lockerStatus.length; student++)
		{
			//Iterate from the index that represents the number of the student 
			for(int lockerindex = student-1; lockerindex < lockerStatus.length; lockerindex+=student) {
				lockerStatus[lockerindex] = !lockerStatus[lockerindex];
			}
		}
	}
	public static void printLockerStatus(boolean[] lockerStatus) {
		for(int lockerIndex = 0; lockerIndex <lockerStatus.length; lockerIndex++) {
			//iterate through each locker and check if the locker at that locker index is true
			if(lockerStatus[lockerIndex]) {
				//if the lockerStatus is true, print that the locker is open.
				System.out.println("Locker "+ (lockerIndex+1) + " is Open");
			}
		}
	}

}
