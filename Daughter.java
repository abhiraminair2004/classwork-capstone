package demo1;

public class Daughter extends Mom implements Brother,Sister {
	public void dance() {
		System.out.println("I learned dancing from brother");
	}
	public void sing() {
		System.out.println("I learned singing from sister");
	}
}
