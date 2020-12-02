package ch04;

public interface MyInterface {
	void action();
}

class B implements MyInterface{
	@Override
	public void action() {
		System.out.println("Override in class B");
	}
}
class C implements MyInterface{
	@Override
	public void action() {
		System.out.println("Override in class C");
	}
}
class D extends B{}
class E extends C{}