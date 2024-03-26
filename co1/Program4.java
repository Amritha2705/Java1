import java.util.Scanner;
class Matrix
{
private int rows;
private int coloumns;
private int mat[][];
public Matrix(int rows,int coloumns)
{
this.rows=rows;
this.coloumns=coloumns;
this.mat=new int[rows][coloumns];
}
public void read(Scanner sc)
{
System.out.println("enter the elements of the matrix");
for(int i=0;i<rows;i++){
for(int j=0;j<coloumns;j++)
mat[i][j]=sc.nextInt();
}
}
public void printMatrix()
{
System.out.println("Matrix:");
for(int i=0;i<rows;i++)
{
for(int j=0;j<coloumns;j++)
System.out.print(mat[i][j]+"");
System.out.println();
}}
public boolean isSymmetric()
{
if(rows!=coloumns)
return false;
for(int i=0;i<rows;i++)
{
for(int j=0;j<i;j++)
if(mat[i][j]!= mat[j][i])
return false;}
return true;
}
public Matrix transpose()
{
Matrix transMatrix=new Matrix(coloumns,rows);
for(int i=0;i<rows;i++)
{for(int j=0;j<coloumns;j++)
transMatrix.mat[j][i]=mat[i][j];
}
return transMatrix;
}
}
class Program4{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows:");
int rows=sc.nextInt();
System.out.println("Enter the number of coloumns:");
int coloumns=sc.nextInt();
Matrix mat=new Matrix(rows,coloumns);
mat.read(sc);
mat.printMatrix();
Matrix transMatrix=mat.transpose();
transMatrix.printMatrix();
if(mat.isSymmetric())
System.out.println("the matrix is symmetric.");
else
System.out.println("the matrix is not symmetric.");
}
}
