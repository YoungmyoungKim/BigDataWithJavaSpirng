package ch05;

public class Outter {
	String field= "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field="Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.field);  //¾ÈÂÊ ¸â¹ö this.ÇÊµå
			this.method();  ////¾ÈÂÊ ¸â¹ö this.¸â¹ö
			
			//¹Ù±ùÂÊ ¸â¹ö ÂüÁ¶: ¹Ù±ùÂÊ.this.¸â¹ö
			System.out.println(Outter.this.field);  //¾ÈÂÊ ¸â¹ö this.ÇÊµå
			Outter.this.method(); 
		}
	}

}
