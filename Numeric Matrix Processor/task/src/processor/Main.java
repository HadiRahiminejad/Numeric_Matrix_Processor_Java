package processor;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;



public class Main {

     void  addMatrices() {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter size of first matrix:");
         int rowA = sc.nextInt();
         int columnA = sc.nextInt();
         System.out.println("Enter first matrix: ");
         double[][] matrixA = new double[rowA][columnA];
         for (int i = 0; i < matrixA.length; i++) {
             for (int j = 0; j < matrixA[i].length; j++) {
                 matrixA[i][j] = sc.nextDouble();
             }
         }
         System.out.print("Enter size of second matrix:");
         int rowB = sc.nextInt();
         int columnB = sc.nextInt();
         System.out.println("Enter second matrix: ");
         double[][] matrixB = new double[rowB][columnB];
         for (int i = 0; i < matrixB.length; i++) {
             for (int j = 0; j < matrixB[i].length; j++) {
                 matrixB[i][j] = sc.nextDouble();
             }

         }
         System.out.println("The adding result is: ");
         for (int i = 0; i < matrixB.length; i++) {
             for (int j = 0; j < matrixB[i].length; j++) {
                 System.out.print(matrixA[i][j] + matrixB[i][j] + " ");
             }
             System.out.println();
         }
     }
     void multiplyMatrixToAConstant() {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter size of matrix:");
         int rowA = sc.nextInt();
         int columnA = sc.nextInt();
         double[][] matrixA = new double[rowA][columnA];
         System.out.println("Enter the matrix: ");
         for (int i = 0; i < matrixA.length; i++) {
             for (int j = 0; j < matrixA[i].length; j++) {
                 matrixA[i][j] = sc.nextDouble();
             }
         }
         System.out.println("Enter a constant: ");
         double c = sc.nextDouble();

         System.out.println("The multiplication result is: ");
         for (int i = 0; i < matrixA.length; i++) {
             for (int j = 0; j < matrixA[i].length; j++){
                     matrixA[i][j] *= c;
                     System.out.print((matrixA[i][j]) + " ");
             }
             System.out.println();
         }
    }
    void multiplyMatrices() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first matrix: ");
        int rowA = sc.nextInt();
        int columnA = sc.nextInt();
        System.out.println("Enter first matrix: ");
        double[][] matrixA = new double[rowA][columnA];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] = sc.nextDouble();
            }
        }
        System.out.print("Enter size of second matrix:");
        int rowB = sc.nextInt();
        int columnB = sc.nextInt();
        System.out.println("Enter second matrix: ");
        double[][] matrixB = new double[rowB][columnB];
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                matrixB[i][j] = sc.nextDouble();
            }
        }
        double[][] result = new double[rowA][columnB];
        double temp = 0;

        for (int i = 0; i < rowA; i++) {
            for (int a = 0; a < columnB; a++) {

            for (int b = 0; b < rowB; b++) {

                  //  if (b <= columnB -1) {
                        temp += matrixA[i][b] * matrixB[b][a];
                  // } else {
                result[i][a] = temp;
                    }
               // }

                temp = 0;
            }

        }

            System.out.println("The multiplication result is: ");
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j] + " ");

                }
                System.out.println();
            }

    }
    public static void main(String[] args) {
         boolean exit = true;
         while (exit) {
             System.out.println("1. Add matrices");
             System.out.println("2. Multiply matrix to a constant");
             System.out.println("3. Multiply matrices");
             System.out.println("4. Transpose matrix");
             System.out.println("5. Calculate a determinant");
             System.out.println("6. Inverse matrix");
             System.out.println("0. Exit");
             System.out.print("Your choice:");
             Main m = new Main();
             Scanner sc = new Scanner(System.in);
             int fun = sc.nextInt();
             switch (fun) {
                 case 1:
                     m.addMatrices();
                     break;

                 case 2:
                     m.multiplyMatrixToAConstant();
                     break;

                 case 3:
                     m.multiplyMatrices();
                     break;
                 case 4:
                     System.out.println("1. Main diagonal");
                     System.out.println("2. Side diagonal");
                     System.out.println("3. Vertical line");
                     System.out.println("4. Horizontal line");
                     System.out.print("Your choice:");

                     int number = sc.nextInt();
                     m.transposeMatrix(number);
                     break;

                 case 5:

                     System.out.print("Enter size of matrix:");
                     int rowA = sc.nextInt();
                     int columnA = sc.nextInt();
                     double[][] matrixA = new double[rowA][columnA];
                     System.out.println("Enter the matrix: ");
                     for (int i = 0; i < matrixA.length; i++) {
                         for (int j = 0; j < matrixA[i].length; j++) {
                             matrixA[i][j] = sc.nextDouble();
                         }
                     }

                     double determinant = m.calculateDeterminant(matrixA);
                     System.out.println("The result is:");
                     System.out.println (determinant);
                     break;

                 case 6:
                     m.inverseMatrix();
                     break;

                 case 0:
                     exit = false;
                     break;
             }
         }
    }

    private void inverseMatrix() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix:");

        //double[][] temporary;
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        double[][] sourcearr = new double[rows][columns];
        double[][] destinationarr = new double[rows - 1][columns - 1];
        double[][] matrix = new double[rows][columns];
        System.out.println("Enter the matrix: ");
        for (int i = 0; i < sourcearr.length; i++) {
            for (int j = 0; j < sourcearr[i].length; j++) {
                sourcearr[i][j] = sc.nextDouble();
            }
        }
        for (int removeRow = 0; removeRow < rows; removeRow++) {
            for (int removeColumn = 0; removeColumn < columns; removeColumn++) {
                int p = 0;
                for (int i = 0; i < rows; ++i) {
                    if (i == removeRow) {
                        continue;
                    }
                    int q = 0;
                    for (int j = 0; j < columns; ++j) {
                        if (j == removeColumn) {
                            continue;
                        }
                        destinationarr[p][q] = sourcearr[i][j];
                        ++q;
                    }
                    ++p;
                }
                //if (destinationarr.length == 2) {

                matrix[removeColumn][removeRow] = Math.pow(-1, (removeColumn + removeRow)) * calculateDeterminant(destinationarr);

                // }

            }
        }
        System.out.println("The result is:");
        double det = calculateDeterminant(sourcearr);
        //System.out.println(det);
        String[][] matrix1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= (1 / det) ;
                //if(matrix[i][j].)
            }
        }
        matrix1 = alingMatrix(matrix);
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix1[i][j]  + " ");
            }
            System.out.println();
        }

     }

    private String[][] alingMatrix(double[][] matrix) {
        String[][] matrix1 = new String[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix1[i][j] = String.valueOf(matrix[i][j]);
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {

               matrix1[i][j] = matrix1[i][j].substring(0, 5);

               }
            }
        return matrix1;
    }




    private double calculateDeterminant(double[][] matrix) {

        double[][] temporary;
        double result = 0;

        if (matrix.length == 1) {
            result = matrix[0][0];
            return (result);
        }

        if (matrix.length == 2) {
            result = ((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]));
            return (result);
        }

        for (int i = 0; i < matrix[0].length; i++) {
            temporary = new double[matrix.length - 1][matrix[0].length - 1];

            for (int j = 1; j < matrix.length; j++) {
                for (int k = 0; k < matrix[0].length; k++) {
                    if (k < i) {
                        temporary[j - 1][k] = matrix[j][k];
                    } else if (k > i) {
                        temporary[j - 1][k - 1] = matrix[j][k];
                    }
                }
            }

            result += matrix[0][i] * Math.pow (-1, (double) i) * calculateDeterminant(temporary);
        }
        return result;
    }




    private void transposeMatrix(int number) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of matrix:");
        int rowA = sc.nextInt();
        int columnA = sc.nextInt();
        double[][] matrixA = new double[rowA][columnA];
        System.out.println("Enter the matrix: ");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] = sc.nextDouble();
            }
        }
        switch (number) {
            case 1:
                System.out.println("The result is:");
                for (int i = 0; i < matrixA.length; i++) {
                    for (int j = 0; j < matrixA[i].length; j++) {
                        System.out.print(matrixA[j][i] + " ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("The result is:");
                for (int i = matrixA.length - 1; i > -1; i--) {
                    for (int j = matrixA[i].length - 1; j > -1 ; j--) {
                        System.out.print(matrixA[j][i] + " ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("The result is:");
                for (int i = 0; i < matrixA.length; i++) {
                    for (int j = matrixA[i].length - 1; j > -1 ; j--) {
                        System.out.print(matrixA[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("The result is:");
                for (int i = matrixA.length - 1; i > -1; i--) {
                    for (int j = 0; j < matrixA[i].length; j++) {
                        System.out.print(matrixA[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
        }
    }
}
