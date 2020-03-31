import java.util.*;
public class Q2_NestedLoop {
	public static void main(String[] args) {
			// takes a digit (between 0 and 9) from the user and then prints the following shape 
			Scanner k=new Scanner(System.in);
		    int n;
		    System.out.println("Enter a number (between 0 and 9): ");
		    n=k.nextInt();
		    if (n<9 && n>0)
		    {	for(int i=1;i<=n;i++) { 
		    	for (int y =0; y<n+i; y++) // for spaces
		    	{ System.out.print(" ");}
		    	for (int j=1;j<=3;j++) //for numbers
		    	{System.out.print(""+i);}
		    	System.out.println(" "); 
		    	}
		    }
		    else {System.out.println("Number is not between 0 and 9.Please try again");}
		    }
	}

