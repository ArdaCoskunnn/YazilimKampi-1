
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(0, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", "Engin Demirog", 16);
		Course course2 = new Course(1, "Programlamaya Giriş için Temel Kurs", "Engin Demirog", 7);
		
		Course[] courses = {course1,course2};
		
		for(Course c: courses) {
			System.out.println("Kurs ==> " + "\n" + c.id + "\n" + c.name + "\n" + c.publisher + "\n" + c.remainingTime + "\n");
		}
		
	}

}
