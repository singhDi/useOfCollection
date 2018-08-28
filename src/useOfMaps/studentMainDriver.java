package useOfMaps;

public class studentMainDriver {

	public static void main(String[] args) {
		StudentInfo courseList = new StudentInfo(); 
		 
		// like adding student
		 courseList.addsubject("Pam", "IS 122"); 
		 courseList.addsubject("Sam", "IS 120"); 
		 courseList.addsubject("Ant", "IS 020");
		 courseList.addsubject("Cat", "IS 120");
		 courseList.addsubject("Cat", "IS 120");
		 
		 courseList.addsubject("Cat", "IS 220");
		 courseList.addsubject("Cat", "IS 420");
		 courseList.addsubject("Ant", "IS 320");
		 courseList.addsubject("Pam", "IS 420");
		 
		 System.out.println("The subjects taken by Cat: " + courseList.printSubjects("Cat"));
		 
		 System.out.println("# of Courses taken by Pam: " + courseList.numOfSubjectstaken("Pam"));
		 System.out.println("Does Cat take IS120? " + (courseList.hasSubject("Cat", "IS 120")? "Yes":"NO"));
		 
		 System.out.println("# of people taking IS 120 :" + courseList.numEnrolled("IS 120"));
		 
		 courseList.dropStudentsubject("Cat", "IS 120"); //like deleting the student
		 
		 System.out.println("Does Cat take IS120? " + (courseList.hasSubject("Cat", "IS 120")? "Yes":"NO"));
		 System.out.println("The numbers of people taking IS 120 :" + courseList.numEnrolled("IS 120"));
		 
		 
		 
	}

}
