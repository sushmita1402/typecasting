package first.java;

public class programExc1 {

	public static void main(String[] agrs) {
		  //byte->short->int->long->float->double
		  //char->int->long->float->double
		  //implicit conversion
		          System.out.println("Implicit Type Casting");
		          char a='A';
		          System.out.println("Value of a: "+a);
		          
		          int b=a;
		          System.out.println("value of b:" +b);
		          
		          float c=a;
		          System.out.println("Value of c:" +c);
		          
		          long d=a;
		          System.out.println("Value of d:" +d);
		          
		          double e=a;
		          System.out.println("Value of e:" +e);
		          
		          System.out.println("/n");
		          
		          System.out.println("Explicit Type Casting");
		          //explicit conversion
		          
		          double x=45.5;
		          int y=(int)x;//explicit typecasting
		          System.out.println("value of x:" +x);
		          System.out.println("Value of y:" +y);
		          
	    }

		          
	}

}
