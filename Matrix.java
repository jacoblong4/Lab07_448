import java.util.Scanner;
import java.io.*;
import static java.lang.Math.pow;


public class Matrix 
{
	private int maxM;
	int nums;
	double array[][] = new double [maxM][maxM];
	
	public Matrix(int y) 
	{
		maxM = y;
		nums = y;
	}//end main
	
	public void setMatX(double[][] arrr)
	{
		array = arrr;
	}//end setMat
	
	public double getMatX(int q, int w)
	{
		double answer = array[q][w];
		return answer;
	}//end getMat
	
	double determinant()
	{
		double determinant = 0.0;
		if(nums == 1)
		{
			determinant = array[0][0];
		}
		else if(nums == 2)
		{
			determinant = array[0][0] * array[1][1] - array[0][1] * array[1][0];
		}
		else
		{
			for(int i = 0; i < nums; i++)
			{
				determinant += pow(-1.0, (double)i) * array[0][1] * subMatrix(0, i).determinant();
			}
		}
		return determinant;
	}//end determinant
	
	public Matrix inverse()
	{
		Matrix inv = new Matrix(nums - 1);
		double det = determinant();
		
		for(int i = 0; i < nums; i++)
		{
			for(int j = 0; j < nums; j++)
			{
				inv.array[i][j] = pow(-1.0, (double)i + j) * subMatrix(j, i).determinant() / det;
			}
		}
		return inv;
	}//end inverse
	
	public Matrix subMatrix(int x, int y)
	{
		Matrix temp = new Matrix(nums - 1);
		
		int row = 0;
		for(int i = 0; i < nums; i++)
		{
			if(i == x) continue;		
			int col = 0;
			
			for(int j = 0; j < nums; j++)
			{
				if(j == y) continue;
				temp.array[row][col] = array[i][j];
				col++;
			}//end second for loop
			row++;
		}//end first for loop
		return temp;
	}//end subMatrix
	
	
	
}//end matrix
