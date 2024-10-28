package Week7;

public class Course {
	private String courseName;
	  private String[] students = new String[100];
	  private int numberOfStudents;
	    
	  public Course(String courseName) {
	    setCourseName(courseName);
	  }
	 
	
	  //set the name of the course and validate only if it contains letters and space
	  public void setCourseName(String courseName) {
		 if(courseName.matches("[a-zA-Z ]+")) {
			  this.courseName = courseName;
		}
	  }
	  
	  //set the name of the student and validate only if it contains letters and space
	  
	  public void setStudent(String student) {
		if(student.matches("[a-zA-Z ]+")) {
			  students[numberOfStudents] = student;
			  numberOfStudents++;
		 }
	  }
	  
	  //get students
	  public String[] getStudents() {
	    return students;
	  }
	  
	  //get number of students
	  public int getNumberOfStudents() {
	    return numberOfStudents;
	  }  
	  
	  //get the name of the course
	  public String getCourseName() {
	    return courseName;
	  }  
	  //adds the students 
	  public void addStudent(String student) {
		  setStudent(student);
	  }
	  
	  //deletes the students
	  public void dropStudent(String student, String[] students) {
		 int index = 0;
		 
		 //loop to find the index of the student in the Student Array
	     for(int i = 0; i<students.length; i++) {
	    	 if(students[i] == student) {
	    		 index = i;
	    	 }
	     }
	     //assign the rest of the students to 
	     for(int j = index +1; j< students.length; j++) {
	    	 students[j-1] = students[j];
	 
	     }
	     //decrement the index of the students of that course 
	     numberOfStudents--;
	     
	  }
}
