package differences;

import java.util.Scanner;

public class NewVsNewInstance {

	public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		str = "differences.Student";
		/*Student s = new Student();
		Class<?> c = s.getClass();
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());*/
		
//		Class c = Class.forName(str);
//		System.out.println(c.getName());
//		Object o = c.newInstance();
		
		
		Class c = Class.forName("differences.Employee");
		Employee emp = (Employee)c.newInstance();
	}
}
class Stud{

	public Stud() {
		super();
		
	}
	
	public void student()
	{
		System.out.println("its is student object");
	}

	
}