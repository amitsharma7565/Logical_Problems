// method overriding

class A{
    
    public String check(){
        return "A method check";
    }
}

class B extends A{
    public String check(){
        return "B method check";
    }
}



public class ExampleMethodOverriding
{
	public static void main(String[] args) {
		//A a = new A();
		//A a = new B();
	//	B a = new B();
	   B a = new A(); //note //A superclass object (new A()) cannot be assigned to a subclass reference (B a). This violates the type hierarchy rules.
	
		System.out.println(a.check());
	}
}