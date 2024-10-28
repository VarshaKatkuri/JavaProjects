package Week7;

public class TestCourse {
	  public static void main(String[] args) {
	    Course course1 = new Course("Data Structures");
	    Course course2 = new Course("Database Systems");
	    //add students for course 1
	    
	    course1.addStudent("Peter Jones");
	    course1.addStudent("Chandra Singh");
	    course1.addStudent("Anne Kennedy");
	    
	    //add students for course 2
	    course2.addStudent("Peter Jones");
	    course2.addStudent("Kim Wallace");
	    
	    //print the number of students
	    System.out.println("Number of students in course1: "
	      + course1.getNumberOfStudents());
	    
	    //print the names of the students enrolled in course 1
	    String[] students = course1.getStudents();
	    for (int i = 0; i < course1.getNumberOfStudents(); i++)
	      System.out.print(students[i] + ", ");
	    
	   //print new line
	    System.out.println();
	    System.out.println();
	    
	    //print the number of the students enrolled in course 2
	    System.out.println("Number of students in course2: "
	      + course2.getNumberOfStudents());
	    
	    //print the names of students enrolled in course2
	    String[] students2 = course2.getStudents();
	    for (int i = 0; i < course2.getNumberOfStudents(); i++)
	      System.out.print(students2[i] + ", ");
	    
	    //print new line
	    System.out.println();
	    System.out.println();
	    
	    //call the drop student method to delete a student's name from course 1
	    course1.dropStudent("Chandra Singh", course1.getStudents());
	    
	    //print the names of the students after deleting the students
	    System.out.println("Number of students in course1: "
	      + course1.getNumberOfStudents());
	    for (int i = 0; i < course1.getNumberOfStudents(); i++)
		      System.out.print(students[i] + ", ");
	    
	    //print new line
	    System.out.println();
	    System.out.println();
	    
	    course1.addStudent("John Smith");
	  //print the names of the students after deleting the students
	    System.out.println("Number of students in course1: "
	      + course1.getNumberOfStudents());
	    for (int i = 0; i < course1.getNumberOfStudents(); i++)
		      System.out.print(students[i] + ", ");
	    
	  }
	}