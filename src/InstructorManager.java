
public class InstructorManager extends UserManager {

	public void add(Instructor �nstructor) {
		
		System.out.println("E�itmen : " + �nstructor.name + " " + �nstructor.lastName);
		
		
	}
	public void course(Instructor �nstructor) {
		
		System.out.println("E�itmenin Verdi�i Kurslar : ");
		
		for(String course : �nstructor.course ) {
			
			System.out.println(course);
			
		}
		
	}
	
	
	
}
