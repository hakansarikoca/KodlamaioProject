
public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		
		user.name = "Hakan";
		user.lastName ="Sar�koca";
		
		Instructor �nstructor = new Instructor();
		
		�nstructor.name = "Engin";
		�nstructor.lastName = "Demiro�";
		
		String[] courses ={"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","Programlamaya Giri� i�in Temel Kurs"};
		
		�nstructor.course = courses;
		
		Student student = new Student();
		
		student.name = user.name;
		student.lastName = user.lastName;
		student.attendedCourse = courses[1];
		
		UserManager userManager = new UserManager();
		
		userManager.add(user);
	
		InstructorManager �nstructorManager = new InstructorManager();
		

		
		StudentManager studentManager = new StudentManager();
		
		studentManager.registerStudent(user, student);
		
		�nstructorManager.add(�nstructor);
		
		�nstructorManager.course(�nstructor);
				
		
		
		
		

	}

}
