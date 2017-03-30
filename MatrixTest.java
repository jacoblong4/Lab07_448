import static org.junit.Assert.*;
import org.junit.Test;

public class MatrixTest {

	@Test
	public void testMatrix() 
	{
//			Matrix testMATRIX1 = new Matrix(0);
//			Matrix testMATRIX2 = new Matrix(1);
		
			Matrix testMATRIX = new Matrix(5);
			assertEquals(testMATRIX.nums == 5, true);
	}

	
	@Test
	public void testSetMatX() 
	{
			Matrix testMATRIX2 = new Matrix(5);
			double[][] testARRAY = new double[5][5];
			
			for(int i = 0; i < 5; i++)
			{
					for(int j = 0; j< 5; j++)
					{
						testARRAY[i][j] = i;
					}//end second for
				
			}//end first for
			testMATRIX2.setMatX(testARRAY);
			assertEquals(testMATRIX2.array, testARRAY);
	}

	
	@Test
	public void testGetMatX() 
	{
			Matrix testMATRIX3 = new Matrix(5);
			double[][] testARRAY = new double[5][5];
			
			for(int i = 0; i < 5; i++)
			{
					for(int j = 0; j< 5; j++)
					{
						testARRAY[i][j] = i;
					}//end second for
				
			}//end first for
			testMATRIX3.setMatX(testARRAY);
//			assertEquals(testMATRIX3.getMatX(0,1) == 1 && testMATRIX3.getMatX(4, 3) == 4, true);
			
			assertEquals(testMATRIX3.getMatX(0,0) == 0 && testMATRIX3.getMatX(4, 4) == 4, true);
	}

	
	@Test
	public void testDeterminant() 
	{
			Matrix newMATRIX = new Matrix(5);
			double[][] testARRAY = new double[5][5];
			
			testARRAY[0][0] = 5;
			testARRAY[0][1] = 4;
			testARRAY[0][2] = 3;
			
			testARRAY[1][0] = 6;
			testARRAY[1][1] = 9;
			testARRAY[1][2] = 1;
			
			testARRAY[2][0] = 2;
			testARRAY[2][1] = 5;
			testARRAY[2][2] = 3;
			
			newMATRIX.setMatX(testARRAY);
			assertEquals(82.0, newMATRIX.determinant(), 0.001);
	}

	
	@Test
	public void testInverse() 
	{
			Matrix testMATRIX4 = new Matrix(5);
			double[][] testARRAY = new double[5][5];
			
			for(int i = 0; i < 5; i++)
			{
					for(int j = 0; j< 5; j++)
					{
						testARRAY[i][j] = i;
					}//end second for
				
			}//end first for
			testMATRIX4.setMatX(testARRAY);
			Matrix INVERSEmat = testMATRIX4.inverse();
			assertEquals(INVERSEmat.getMatX(0,0), testMATRIX4.getMatX(5,5));
	}

	
	@Test
	public void testSubMatrix() 
	{
			Matrix testMATRIX5 = new Matrix(5);
			double[][] testARRAY = new double[5][5];
			
			for(int i = 0; i < 5; i++)
			{
					for(int j = 0; j< 5; j++)
					{
						testARRAY[i][j] = i;
					}//end second for
				
			}//end first for
			testMATRIX5.setMatX(testARRAY);
			Matrix test = testMATRIX5.subMatrix(4,4);	
			assertEquals(test.getMatX(4,4), testMATRIX5.getMatX(4,4));
	}
	

}//end Test
