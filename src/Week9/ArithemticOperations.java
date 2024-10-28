package Week9;

public class ArithemticOperations {
 public static void main(String[] args) {
	 try {
		     int x = Integer.parseInt(args[0]);
		     int y = Integer.parseInt(args[2]);
			 if (args[1]== "+") 
				 System.out.print(args+ " = " + (x + y));
			 else if (args[1] == "-") 
				 System.out.print(args+ " = " + (x - y));
		     else if (args[1] == "*") 
					 System.out.print(args+ " = " + (x * y));
			 else if (args[1] == "/") 
					 System.out.print(args+ " = " + (x/y));
	 }
	 catch (Exception ex){
		 System.out.print("Wrong Input: "+ ex);
		 System.exit(0);
	 }
 }
}

