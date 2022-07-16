import java.io.*;
import java.util.*;
class diagonalsofmatrix
    {
        public void main()
        {
            int i , j;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows");
            int m = sc.nextInt();
            System.out.println("Enter the number of coloums");
            int n = sc.nextInt();
            int a[][] = new int [m][n];
            for( i =0 ; i<m ; i++)
            {
                for( j = 0; j<n ;j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            //right diaogal elemnets are
            System.out.println("The right diagonal elements are");
            for(i = 0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(i==j)
                    {
                        System.out.println(a[i][j]);
                    }
                }
            }
            //left diagonal element
            System.out.println("the left diagonal elements are");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(i+j == n-1)
                {
                    System.out.println(a[i][j]);
        }}
    }
}
}