
public class StudentManager extends UserManager {

	public void registerStudent(User user,Student student) {
		
		System.out.println("��renci " + user.name + " " + user.lastName +" n�n Kayd� " + student.attendedCourse + " Kursuna Ba�ar�yla Yap�ld�.");
		
	}
	
	
}
