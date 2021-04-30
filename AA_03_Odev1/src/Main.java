
public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();
		userManager.add(new StudentManager(), "0", "Arda", "Coskun", "No certificates");
		userManager.add(new StudentManager(), "1", "Ertug", "Kaymak", "No certificates");
		System.out.println();
		
		userManager.add(new InstructorManager(), "0", "Engin", "Demirog", "MCT, PMP, ITIL");
		System.out.println();
		
		SubjectManager subjectManager = new SubjectManager();
		subjectManager.AddSubject("0", "Java", "7/10", "Engin Demirog");
		subjectManager.AddSubject("1", "C#", "7/10", "Engin Demirog");
		subjectManager.AddSubject("2", "Python", "5/10", "Engin Demirog");
		subjectManager.AddSubject("3", "HTML5", "3/10", "Vedat Coskun");
	}

}
