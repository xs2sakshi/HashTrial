
public class OnlineClassImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OnlineClass obj=new OnlineClass();
		obj.setStudId(87);
		obj.setStudName("Rakesh");
		obj.setStudCourse("Spoken English");
		
		OnlineClass obj1=new OnlineClass();
		obj1.setStudId(87);
		obj1.setStudName("Reema");
		obj1.setStudCourse("Communications");
		System.out.println(obj==obj1);
		System.out.println(obj.equals(obj1));
		obj1.setStudId(87);
		
		
	}

}
