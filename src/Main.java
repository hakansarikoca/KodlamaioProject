
public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		
		user.name = "Hakan";
		user.lastName ="Sarıkoca";
		
		Instructor ınstructor = new Instructor();
		
		ınstructor.name = "Engin";
		ınstructor.lastName = "Demiroğ";
		
		String[] courses ={"Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)","Programlamaya Giriş için Temel Kurs"};
		
		ınstructor.course = courses;
		
		Student student = new Student();
		
		student.name = user.name;
		student.lastName = user.lastName;
		student.attendedCourse = courses[1];
		
		UserManager userManager = new UserManager();
		
		userManager.add(user);
	
		InstructorManager ınstructorManager = new InstructorManager();
		

		
		StudentManager studentManager = new StudentManager();
		
		studentManager.registerStudent(user, student);
		
		ınstructorManager.add(ınstructor);
		
		ınstructorManager.course(ınstructor);
				
		
		
		
		

	}

}
