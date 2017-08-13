package ecercise;

import differences.Student;

public class CopyingObjects {
	
	public static void main(String args[]){
		Student st = new Student();
		st.sname = "revanth";
		st.sno = 1;
		//shallow copy
		//only one object is created.Both references are pointing to same object
		Student st1 = st;
		
		
		//deep copy
		//it increases code length
		Student st2 = new Student();
		st2.sname = st.sname;
		st2.sno = st.sno;
		
		
		//combination of both shallow and deep is clone
	}

}
