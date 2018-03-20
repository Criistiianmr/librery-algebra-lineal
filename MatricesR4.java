package com.cristian;

import java.util.Scanner;

public class MatricesR4 {

    Scanner scanner = new Scanner(System.in);

    public void Sumamat (){

        double matrizA[][] = new double[4][4];
        double matrizB[][] = new double[4][4];
        double matrizResultado[][] = new double[4][4];

        System.out.println("Ingrese la matriz A");
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizA[i][j] = scanner.nextDouble();
            }

        }
        System.out.println("Ingrese la matriz B");
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizB[i][j] = scanner.nextDouble();
            }
        }

        matrizResultado[0][0] = matrizA[0][0]+matrizB[0][0];   matrizResultado[0][1] = matrizA[0][1]+matrizB[0][1];
        matrizResultado[1][0] = matrizA[1][0]+matrizB[1][0];   matrizResultado[1][1] = matrizA[1][1]+matrizB[1][1];
        matrizResultado[2][0] = matrizA[2][0]+matrizB[2][0];   matrizResultado[2][1] = matrizA[2][1]+matrizB[2][1];
        matrizResultado[3][0] = matrizA[3][0]+matrizB[3][0];   matrizResultado[3][1] = matrizA[3][1]+matrizB[3][1];

        matrizResultado[0][2] = matrizA[0][2]+matrizB[0][2];   matrizResultado[0][3] = matrizA[0][3]+matrizB[0][3];
        matrizResultado[1][2] = matrizA[1][2]+matrizB[1][2];   matrizResultado[1][3] = matrizA[1][3]+matrizB[1][3];
        matrizResultado[2][2] = matrizA[2][2]+matrizB[2][2];   matrizResultado[2][3] = matrizA[2][3]+matrizB[2][3];
        matrizResultado[3][2] = matrizA[2][2]+matrizB[2][2];   matrizResultado[3][3] = matrizA[3][3]+matrizB[3][3];

        System.out.println("\t El resultado de la suma de matrices es: ");

        for (int x=0; x < 4; x++) {
            System.out.print("|");
            for (int y=0; y < 4; y++) {
                System.out.print (matrizResultado[x][y]);
                if (y!=4-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }


    public void Restamat (){

        double matrizA[][] = new double[4][4];
        double matrizB[][] = new double[4][4];
        double matrizResultado[][] = new double[4][4];

        System.out.println("Ingrese la matriz A");
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizA[i][j] = scanner.nextDouble();
            }

        }
        System.out.println("Ingrese la matriz B");
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizB[i][j] = scanner.nextDouble();
            }
        }

        matrizResultado[0][0] = matrizA[0][0]-matrizB[0][0];   matrizResultado[0][1] = matrizA[0][1]-matrizB[0][1];
        matrizResultado[1][0] = matrizA[1][0]-matrizB[1][0];   matrizResultado[1][1] = matrizA[1][1]-matrizB[1][1];
        matrizResultado[2][0] = matrizA[2][0]-matrizB[2][0];   matrizResultado[2][1] = matrizA[2][1]-matrizB[2][1];
        matrizResultado[3][0] = matrizA[3][0]-matrizB[3][0];   matrizResultado[3][1] = matrizA[3][1]-matrizB[3][1];

        matrizResultado[0][2] = matrizA[0][2]-matrizB[0][2];   matrizResultado[0][3] = matrizA[0][3]-matrizB[0][3];
        matrizResultado[1][2] = matrizA[1][2]-matrizB[1][2];   matrizResultado[1][3] = matrizA[1][3]-matrizB[1][3];
        matrizResultado[2][2] = matrizA[2][2]-matrizB[2][2];   matrizResultado[2][3] = matrizA[2][3]-matrizB[2][3];
        matrizResultado[3][2] = matrizA[2][2]-matrizB[2][2];   matrizResultado[3][3] = matrizA[3][3]-matrizB[3][3];

        System.out.println("\t El resultado de la resta de matrices es: ");

        for (int x=0; x < 4; x++) {
            System.out.print("|");
            for (int y=0; y < 4; y++) {
                System.out.print (matrizResultado[x][y]);
                if (y!=4-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }

    public void MultiEscalarXMatriz (){

        double Escalar = 0;
        double matrizA [][]= new double[4][4];
        double matrizresultado [][]= new double[4][4];

        System.out.println("\t\t\n\n Ingrese El Escalar");
        Escalar=scanner.nextDouble();

        System.out.println("\t\t\n\n Ingrese la Matriz A ");
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizA[i][j] = scanner.nextDouble();
            }
        }

        matrizresultado[0][0] = matrizA[0][0]*Escalar;    matrizresultado[0][1] = matrizA[0][1]*Escalar;
        matrizresultado[1][0] = matrizA[1][0]*Escalar;    matrizresultado[1][1] = matrizA[1][1]*Escalar;
        matrizresultado[2][0] = matrizA[2][0]*Escalar;    matrizresultado[2][1] = matrizA[2][1]*Escalar;
        matrizresultado[3][0] = matrizA[3][0]*Escalar;    matrizresultado[3][1] = matrizA[3][1]*Escalar;

        matrizresultado[0][2] = matrizA[0][2]*Escalar;    matrizresultado[0][3] = matrizA[0][3]*Escalar;
        matrizresultado[1][2] = matrizA[1][2]*Escalar;    matrizresultado[1][3] = matrizA[1][3]*Escalar;
        matrizresultado[2][2] = matrizA[2][2]*Escalar;    matrizresultado[2][3] = matrizA[2][3]*Escalar;
        matrizresultado[3][2] = matrizA[2][2]*Escalar;    matrizresultado[3][3] = matrizA[3][3]*Escalar;



        System.out.println("\t\t\n El resultado de la multiplicacion Entre escalar y Matriz  Es la matriz c: ");

        for (int x=0; x < 4; x++) {
            System.out.print("|");
            for (int y=0; y < 4; y++) {
                System.out.print (matrizresultado[x][y]);
                if (y!=3-1) System.out.print("\t");
            }
            System.out.println("|");
        }

    }


    public void MultiMatrizXMatriz (){

        double matrizA[][] = new double[4][4];
        double matrizB[][] = new double[4][4];
        double matrizResultado[][] = new double[4][4];

        System.out.println("Ingrese la matriz A");
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizA[i][j] = scanner.nextDouble();
            }

        }
        System.out.println("Ingrese la matriz B");
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizB[i][j] = scanner.nextDouble();
            }
        }


        System.out.println(" El resultado de la Multiplicacion de matrices ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int h = 0; h < 4; h++) {
                    matrizResultado[i][j] += matrizA[i][h] * matrizB[h][j];
                }
            }
        }
        for (int x=0; x < 4; x++) {
            System.out.print("|");
            for (int y=0; y < 4; y++) {
                System.out.print (matrizResultado[x][y]);
                if (y!=4-1) System.out.print("\t");
            }
            System.out.println("|");
        }

    }
    
}
