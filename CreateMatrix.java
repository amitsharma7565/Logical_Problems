
import java.util.*;
class CreateMatrix {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter row :");
      int r= sc.nextInt();
      System.out.println("Enter column: ");
      int c= sc.nextInt();
      
      int[][] matrix = new int[r][c];
      System.out.println("Enter the element of the matrix");
      
      for(int i=0; i< r; i++){
          for(int j=0; j<c ; j++){
             matrix[i][j]= sc.nextInt();
          }
      }
      System.out.println("The wave order traversal of the input matrix is: ");  

      for(int k=0; k<matrix.length; k++){
          for(int l=0; l<matrix.length; l++){
              System.out.print(matrix[k][l]+ " ");
          }
          System.out.println();
      }
    }
}