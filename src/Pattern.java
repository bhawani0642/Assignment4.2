
public class Pattern {
	public  static void main(String[] args) {
		   int ascii='a';
		   for(int i=1;i<=3;i++){
		       for(int j=3;j>i;j--) 
		        System.out.print(" ");
		       for(int m=1;m<=i;m++) 
		      {
		      System.out.print((char)ascii);
		      ascii++;
		       }
		       ascii--;
		       
		       for(int k=1;k<i;k++){
		             ascii--;
		                   System.out.print((char)ascii );
		       
		       
		        } 
		       ascii='a';
		       System.out.println();
		    }
		     
		    for(int i=1;i<=2;i++) {
		   
		      for(int j=1;j<=i;j++)
		        System.out.print(" ");
		      for(int m=2;m>=i;m--)
		      {  
		          System.out.print((char)ascii);
		          ascii++;
		      
		      } 
		      ascii--;
		      for(int k=2;k>i;k--)  
		    {
		    ascii--;      System.out.print((char)ascii );
		     
		      }
		      
		      ascii='a';
		      System.out.println();
		    }   
		    }
}
