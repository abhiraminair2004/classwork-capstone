package demo1;

public class AccessDemo {
	int age=36;
	public String name="demo";
	private float percentage=78.5f;
	protected char grade='b';
	
	public static void main(String[]args) {
		AccessDemo aa= new AccessDemo();
		System.out.println(aa.age);        
        System.out.println(aa.name);      
        System.out.println(aa.percentage); 
        System.out.println(aa.grade);
	}
}
