package com.cristian;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MatricesR2 {
    Scanner scanner = new Scanner(System.in);

    public void SumaMat(){

        double matrizA[][] = new double[2][2];
        double matrizB[][] = new double[2][2];
        double matrizResultado[][] = new double[2][2];

        System.out.println("Ingrese la matriz A");
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizA[i][j] = scanner.nextDouble();
            }

        }
        System.out.println("Ingrese la matriz B");
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizB[i][j] = scanner.nextDouble();
            }
        }

        matrizResultado[0][0] = matrizA[0][0]+matrizB[0][0];
        matrizResultado[0][1] = matrizA[0][1]+matrizB[0][1];
        matrizResultado[1][0] = matrizA[1][0]+matrizB[1][0];
        matrizResultado[1][1] = matrizA[1][1]+matrizB[1][1];

        System.out.println("\t El resultado de la suma de matrices es: ");

        for (int x=0; x < 2; x++) {
            System.out.print("|");
            for (int y=0; y < 2; y++) {
                System.out.print (matrizResultado[x][y]);
                if (y!=2-1) System.out.print("\t");
            }
            System.out.println("|");
        }

    }

    public void RestaMat(){

        double matrizA[][] = new double[2][2];
        double matrizB[][] = new double[2][2];
        double matrizResultado[][] = new double[2][2];

        System.out.println("Ingrese la matriz A");
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizA[i][j] = scanner.nextDouble();
            }

        }
        System.out.println("Ingrese la matriz B");
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizB[i][j] = scanner.nextDouble();
            }
        }

        matrizResultado[0][0] = matrizA[0][0]-matrizB[0][0];
        matrizResultado[0][1] = matrizA[0][1]-matrizB[0][1];
        matrizResultado[1][0] = matrizA[1][0]-matrizB[1][0];
        matrizResultado[1][1] = matrizA[1][1]-matrizB[1][1];

        System.out.println("\t El resultado de la resta de matrices es: ");

        for (int x=0; x < 2; x++) {
            System.out.print("|");
            for (int y=0; y < 2; y++) {
                System.out.print (matrizResultado[x][y]);
                if (y!=2-1) System.out.print("\t");
            }
            System.out.println("|");
        }

    }
    public void MultiEscalarXMatriz (){

        double Escalar = 0;
        double matrizA [][]= new double[2][2];
        double matrizresultado [][]= new double[2][2];

        System.out.println("\t\t\n\n Ingrese El Escalar");
        Escalar=scanner.nextDouble();

        System.out.println("\t\t\n\n Ingrese la Matriz A ");
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizA[i][j] = scanner.nextDouble();
            }
        }
        matrizresultado[0][0]=Escalar*matrizA[0][0];
        matrizresultado[0][1]=Escalar*matrizA[0][1];
        matrizresultado[1][0]=Escalar*matrizA[1][0];
        matrizresultado[1][1]=Escalar*matrizA[1][1];


        System.out.println("\t\t\n El resultado de la multiplicacion Entre escalar y Matriz Es: ");

        for (int x=0; x < 2; x++) {
            System.out.print("|");
            for (int y=0; y < 2; y++) {
                System.out.print (matrizresultado[x][y]);
                if (y!=2-1) System.out.print("\t");
            }
            System.out.println("|");
        }

    }

    public void MultiMatrizXMatriz (){

        double matrizA[][] = new double[2][2];
        double matrizB[][] = new double[2][2];
        double matrizResultado[][] = new double[2][2];

        System.out.println("Ingrese la matriz A");
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizA[i][j] = scanner.nextDouble();
            }

        }
        System.out.println("Ingrese la matriz B");
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                matrizB[i][j] = scanner.nextDouble();
            }
        }


        System.out.println(" El resultado de la Multiplicacion de matrices ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int h = 0; h < 2; h++) {
                    matrizResultado[i][j] += matrizA[i][h] * matrizB[h][j];
                }
            }
        }
        for (int x=0; x < 2; x++) {
            System.out.print("|");
            for (int y=0; y < 2; y++) {
                System.out.print (matrizResultado[x][y]);
                if (y!=2-1) System.out.print("\t");
            }
            System.out.println("|");
        }

    }
    public void Determinante (){

        double MatrizA[][]= new double[2][2];
        double Determinante = 0;
        double partea;
        double parteb;

        System.out.println("Ingrese la matriz A para sacar su determinante ");
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.println("Fila"+(i+1)+"Columna"+(j+1));
                MatrizA[i][j] = scanner.nextDouble();
            }
        }
        partea=MatrizA[0][0]*MatrizA[1][1];
        parteb= -MatrizA[1][0]*MatrizA[0][1];
        Determinante= partea+parteb;

        System.out.println("\t\t\n\n Su resultado es:"+"\n\tDET(A) ="+Determinante);


    }
}
