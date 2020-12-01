package ch02;

public class Parent {
	Parent(){
		System.out.println("Parent 생성자 호출");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child 생성자 호출");
	}
}

