package demo1;

public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grandfather g= new Grandfather();
		g.read();
		Father f= new Father();
		f.write();
		f.read();
		
		//son
		System.out.println("SON");
		Son s=new Son();
		s.read();
		s.write();

	}

}
