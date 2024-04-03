package assignment1;

	

	class Class1 {
	    public void one() {
	        System.out.println("Class1");
	    }
	}

	class Class2 {
	    public void two() {
	        System.out.println("Class2");
	    }
	}

	public class MultipleClass {
	    public static void main(String[] args) {
	        Class1 class1 = new Class1();
	        Class2 class2 = new Class2();

	        class1.one();
	        class2.two();
	    }
	}



