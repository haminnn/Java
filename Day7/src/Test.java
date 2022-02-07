class Student implements Cloneable{
	private String sno;
	private String name;
	public Student(String sno,  String name) {
		this.sno = sno;
		this.name =name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		 if(obj instanceof Student) {
			 Student s = (Student)obj;
			 if(this.name.equals(s.name) && this.sno.equals(s.sno)) {
				 return true;
			 }
		 }
		 return false;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
	
	 
	public Student getStudent()   {
		Student cloned = null;
		 try {
		  cloned = (Student)(super.clone());
		 }catch(CloneNotSupportedException e) {
	        	
	     }
		 return cloned;
	}	
	
}

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student("a01","Kim");
		Student s2 = new Student("a01","Kim");
		System.out.println(s1==s2);
	    System.out.println(s1.hashCode() );
	    System.out.println(s2.hashCode());
	    System.out.println(s1.toString() );
	    System.out.println(s2);
	    System.out.println(s2.equals(s1));
	    Student s3 =s1.getStudent();
	    System.out.println(s1.hashCode() );
	    System.out.println(s3.hashCode() );
	    s1.setName("park");
	    System.out.println(s1.getName());
	    System.out.println(s3.getName());
	}

}