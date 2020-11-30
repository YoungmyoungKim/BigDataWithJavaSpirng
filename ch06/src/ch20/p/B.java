package ch20.p;

public class B {
	public int n;
	public void g() {
		n=5;
	}
}

class C{
	public void k() {
		B b=new B();
		b.n=7;
		b.g();
	}
}
