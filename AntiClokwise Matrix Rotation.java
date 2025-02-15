public class Main
{
// Function to reverse the columns of the matrix
 public static void reverse_columns(int mat[][])
 {
 int k;
 for (int i = 0; i < mat.length; i++)
 {
 k = mat.length - 1;
 for (int j = 0; j < k; j++)
 {
 int temp = mat[j][i];
 mat[j][i] = mat[k][i];
 mat[k][i] = temp;
 k--;
 }}}
 
// Function to print the matrix
 public static void print_matrix(int mat[][])
 {
 int i,j;
 for(i=0;i<mat.length;i++)
 {
 for(j=0;j<mat.length;j++)
 {
 System.out.print(mat[i][j] + " ");
 }
 System.out.print("\n");
 }}

// Function to transpose the matrix
 public static void transpose_matrix(int mat[][])
 {
 int i,j;
 for(i=0;i<mat.length;i++)
 {
 for(j=i;j<mat.length;j++)
 {
 int temp = mat[i][j];
 mat[i][j] = mat[j][i];
 mat[j][i] = temp;
 }}}

// Main function
 public static void main(String[] args) 
 {
 int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
 System.out.println("The matrix before rotation ");
 print_matrix(mat);
 System.out.println("Transpose of the matrix ");
 transpose_matrix(mat);
 System.out.println("The matrix after rotation ");
 reverse_columns(mat);
 print_matrix(mat);
 }}