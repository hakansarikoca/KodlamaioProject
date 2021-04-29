
public class StudentManager extends UserManager {

	public void registerStudent(User user,Student student) {
		
		System.out.println("Öğrenci " + user.name + " " + user.lastName +" nın Kaydı " + student.attendedCourse + " Kursuna Başarıyla Yapıldı.");
		
	}
	
	
}
