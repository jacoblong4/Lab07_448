import java.util.Scanner;
import java.io.*;

public class main 
{
	public static void main(String args[])
	{
		if(args.length < 3)
		{
			System.out.println("Error - Expected usage: ./main input.txt output.txt");
			return;
		}
		
		try
		{
		
			Scanner myScan = new Scanner(new File(args[1])); //scanner takes input file
			OutputStream outFile = new FileOutputStream(args[2]);
			PrintStream printOut = new PrintStream(outFile);
			
			int x = myScan.nextInt();
			double [][] array = new double[x][x];
			
			while(myScan.hasNextInt() && (x > 0))
			{
				array = new double [x][x];
				printOut.println("M = ");
				
				for(int i = 0; i < x; i++)
				{
						for(int j = 0; j < x; j++)
						{
								array[i][j] = myScan.nextInt();
								printOut.println((int)array[i][j] + " ");
							
						}//end second for
					
				}//end first for
				
				Matrix ex = new Matrix(x);
				ex.setMatX(array);
				double determ = ex.determinant();
				
				if(determ != 0)
				{
					Matrix inv = ex.inverse();
					printOut.println("Inverse: " + inv);
					
					for(int i = 0; i < x; i++)
					{
						for(int j = 0; j < x; j++)
						{
								printOut.println(inv.getMatX(i,j) + " ");
							
						}//end second for
						printOut.println();
						
					}//end first for
				}//end if
				
			}//end of while
		
		}//end of try
		catch(Exception e)
		{
			
		}//end of catch
		return;
		
		
	}//end main
	
}//end class main
