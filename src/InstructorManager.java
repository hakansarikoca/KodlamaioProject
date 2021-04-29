
public class InstructorManager extends UserManager {

	public void add(Instructor ýnstructor) {
		
		System.out.println("Eðitmen : " + ýnstructor.name + " " + ýnstructor.lastName);
		
		
	}
	public void course(Instructor ýnstructor) {
		
		System.out.println("Eðitmenin Verdiði Kurslar : ");
		
		for(String course : ýnstructor.course ) {
			
			System.out.println(course);
			
		}
		
	}
	
	
	
}
