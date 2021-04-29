
public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		
		user.name = "Hakan";
		user.lastName ="Sarýkoca";
		
		Instructor ýnstructor = new Instructor();
		
		ýnstructor.name = "Engin";
		ýnstructor.lastName = "Demiroð";
		
		String[] courses ={"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)","Programlamaya Giriþ için Temel Kurs"};
		
		ýnstructor.course = courses;
		
		Student student = new Student();
		
		student.name = user.name;
		student.lastName = user.lastName;
		student.attendedCourse = courses[1];
		
		UserManager userManager = new UserManager();
		
		userManager.add(user);
	
		InstructorManager ýnstructorManager = new InstructorManager();
		

		
		StudentManager studentManager = new StudentManager();
		
		studentManager.registerStudent(user, student);
		
		ýnstructorManager.add(ýnstructor);
		
		ýnstructorManager.course(ýnstructor);
				
		
		
		
		

	}

}
