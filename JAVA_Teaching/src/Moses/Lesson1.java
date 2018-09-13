package Moses;

public class Lesson1 {

	// Logos
	public static void main(String args[])
	   {

	    first: for(int i=0;i<5;i++)        //Labelled this loop as 'first'
	           {
	     second: for(int j=0;j<5;j++)       //Labelled this loop as 'second'
	             {

	                 if(j>3)
	                   break second;   //This will break the inner loop if the condition specified in the 'if' statement is met, since we've specified to break the loop labelled with 'second'

	                System.out.print(j+" ");
	       }

	    System.out.println();
	    }

	   }
		 }
