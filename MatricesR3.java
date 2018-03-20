package com.cristian;

import java.util.Scanner;

public class MatricesR3 {
    Scanner scanner = new Scanner(System.in);

    public void Sumamat (){

        double matrizA[][] = new double[3][3];
        double matrizB[][] = new double[3][3];
        double matrizResultado[][] = new double[3][3];

        System.out.println("Ingrese la matriz A");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizA[i][j] = scanner.nextDouble();
            }

        }
        System.out.println("Ingrese la matriz B");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizB[i][j] = scanner.nextDouble();
            }
        }

        matrizResultado[0][0] = matrizA[0][0]+matrizB[0][0]; matrizResultado[0][1] = matrizA[0][1]+matrizB[0][1]; matrizResultado[0][2] = matrizA[0][2]+matrizB[0][2];
        matrizResultado[1][0] = matrizA[1][0]+matrizB[1][0]; matrizResultado[1][1] = matrizA[1][1]+matrizB[1][1]; matrizResultado[1][2] = matrizA[1][2]+matrizB[1][2];
        matrizResultado[2][0] = matrizA[2][0]+matrizB[2][0]; matrizResultado[2][1] = matrizA[2][1]+matrizB[2][1]; matrizResultado[2][2] = matrizA[2][2]+matrizB[2][2];

        System.out.println("\t El resultado de la suma de matrices es: ");

        for (int x=0; x < 3; x++) {
            System.out.print("|");
            for (int y=0; y < 3; y++) {
                System.out.print (matrizResultado[x][y]);
                if (y!=3-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }

    public void Restamat (){

        double matrizA[][] = new double[3][3];
        double matrizB[][] = new double[3][3];
        double matrizResultado[][] = new double[3][3];

        System.out.println("Ingrese la matriz A");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizA[i][j] = scanner.nextDouble();
            }

        }
        System.out.println("Ingrese la matriz B");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizB[i][j] = scanner.nextDouble();
            }
        }

        matrizResultado[0][0] = matrizA[0][0]-matrizB[0][0]; matrizResultado[0][1] = matrizA[0][1]-matrizB[0][1]; matrizResultado[0][2] = matrizA[0][2]-matrizB[0][2];
        matrizResultado[1][0] = matrizA[1][0]-matrizB[1][0]; matrizResultado[1][1] = matrizA[1][1]-matrizB[1][1]; matrizResultado[1][2] = matrizA[1][2]-matrizB[1][2];
        matrizResultado[2][0] = matrizA[2][0]-matrizB[2][0]; matrizResultado[2][1] = matrizA[2][1]-matrizB[2][1]; matrizResultado[2][2] = matrizA[2][2]-matrizB[2][2];

        System.out.println("\t El resultado de la resta de matrices es: ");

        for (int x=0; x < 3; x++) {
            System.out.print("|");
            for (int y=0; y < 3; y++) {
                System.out.print (matrizResultado[x][y]);
                if (y!=3-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }


    public void MultiEscalarXMatriz (){

        double Escalar = 0;
        double matrizA [][]= new double[3][3];
        double matrizresultado [][]= new double[3][3];

        System.out.println("\t\t\n\n Ingrese El Escalar");
        Escalar=scanner.nextDouble();

        System.out.println("\t\t\n\n Ingrese la Matriz A ");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizA[i][j] = scanner.nextDouble();
            }
        }
        matrizresultado[0][0]=Escalar*matrizA[0][0]; matrizresultado[0][1]=Escalar*matrizA[0][1]; matrizresultado[0][2]=Escalar*matrizA[0][2];
        matrizresultado[1][0]=Escalar*matrizA[1][0]; matrizresultado[1][1]=Escalar*matrizA[1][1]; matrizresultado[1][2]=Escalar*matrizA[1][2];
        matrizresultado[2][0]=Escalar*matrizA[2][0]; matrizresultado[2][1]=Escalar*matrizA[2][1]; matrizresultado[2][2]=Escalar*matrizA[2][2];


        System.out.println("\t\t\n El resultado de la multiplicacion Entre escalar y Matriz Es la matriz c: ");

        for (int x=0; x < 3; x++) {
            System.out.print("|");
            for (int y=0; y < 3; y++) {
                System.out.print (matrizresultado[x][y]);
                if (y!=3-1) System.out.print("\t");
            }
            System.out.println("|");
        }

    }

    public void MultiMatrizXMatriz (){

        double matrizA[][] = new double[3][3];
        double matrizB[][] = new double[3][3];
        double matrizResultado[][] = new double[3][3];

        System.out.println("Ingrese la matriz A");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizA[i][j] = scanner.nextDouble();
            }

        }
        System.out.println("Ingrese la matriz B");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizB[i][j] = scanner.nextDouble();
            }
        }


        System.out.println(" El resultado de la Multiplicacion de matrices ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int h = 0; h < 3; h++) {
                    matrizResultado[i][j] += matrizA[i][h] * matrizB[h][j];
                }
            }
        }
        for (int x=0; x < 3; x++) {
            System.out.print("|");
            for (int y=0; y < 3; y++) {
                System.out.print (matrizResultado[x][y]);
                if (y!=3-1) System.out.print("\t");
            }
            System.out.println("|");
        }

    }

    public void Determianante (){


        double MatrizA [][] = new double[3][3];
        double determinante, parte1, parte2, parte3, parte4, parte5, parte6 ;

        System.out.println("Ingrese la matriz A");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                MatrizA[i][j] = scanner.nextDouble();
            }
        }

        parte1=MatrizA[0][0]* MatrizA[1][1]*MatrizA[2][2]; parte2=MatrizA[0][1]* MatrizA[1][2]*MatrizA[2][0];
        parte3= MatrizA[0][2]* MatrizA[1][0]*MatrizA[2][1];parte4=MatrizA[2][0]* MatrizA[1][1]*MatrizA[0][2];
        parte5=MatrizA[2][1]* MatrizA[1][2]*MatrizA[0][0];parte6=MatrizA[2][2]* MatrizA[1][0]*MatrizA[0][1];
        determinante = parte1+parte2+parte3-parte4-parte5-parte6;


        System.out.println("\t\t\n\n Su resultado es:"+"\n\tDET(A) ="+ determinante);


    }




}
