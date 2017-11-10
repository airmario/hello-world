package mario;

public class Main {

	public static void main(String[] args) {
		Calc calc = new Calc();
		//int a=calc.Addbutton(1,3);
		System.out.println("값은 : "+ calc.Addbutton(1,3));
	
		String str1 = new String("Hello");
		
		System.out.println(str1.length());
		System.out.println(str1);
		str1 = str1.concat("World");
		System.out.println(str1);
		

	}
	
}
