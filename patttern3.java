package workingjava;

public class pattern3
{
	public static void main(String args[])
	{
		System.out.println("Hello World");
		/*  
		    
      *            
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
 * * * * * * 
  * * * * * 
   * * * * 
    * * * 
     * * 
      * 
 */
		
		int p=6;
		for(int j=1;j<7;j++)
		{
			for(int i=0;i<p;i++)
			{
				System.out.print(" ");
			}
			
			
			for(int i = 0;i<j;i++)
			{
				System.out.print("* ");
			}
			
		p--;
		
		System.out.println();
		}
		
		
		int t=1;
		for(int j=6;j>0;j--)
		{
			
			for(int i = 0;i<t;i++)
			{
				System.out.print(" ");
			}
			
			
			
			
			
			
			for(int i=0;i<j;i++)
			{
				System.out.print("* ");
			}
		System.out.println();
		t++;
		}
	
		
	}
}
