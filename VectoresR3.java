package com.cristian;

import java.util.Scanner;

public class VectoresR3 {

    Scanner scanner = new Scanner(System.in);

    public void SumaVec() {

        double vec1[] = new double[3];
        double vec2[] = new double[3];
        double vectorResultado[] = new double[3];
        System.out.println("Ingrese el primer vector");

        for (int i = 0; i < 3; i++) {
            vec1[i] = scanner.nextDouble();
        }
        System.out.println("Ingrese el segundo vector");
        for (int j = 0; j < 3; j++) {
            vec2[j] = scanner.nextDouble();
        }

        vectorResultado[0] = vec1[0] + vec2[0];
        vectorResultado[1] = vec1[1] + vec2[1];
        vectorResultado[2] = vec1[2] + vec2[2];

        System.out.println("");
        System.out.println("");
        System.out.println("el resultado de la suma entre el vector A (" + vec1[0] + "," + vec1[1] + "," + vec1[2] + ")" + "  Y  " + "  Vector B( " + vec2[0] + "," + vec2[1] + "," + vec2[2] + ")");
        System.out.println("\t\t\tEs el  Vector C: " + "(" + vectorResultado[0] + "," + vectorResultado[1] + "," + vectorResultado[2] + ")");
    }


    public void RestaVec() {

        double vec1[] = new double[3];
        double vec2[] = new double[3];
        double vectorResultado[] = new double[3];
        System.out.println("Ingrese el primer vector");

        for (int i = 0; i < 3; i++) {
            vec1[i] = scanner.nextDouble();
        }
        System.out.println("Ingrese el segundo vector");
        for (int j = 0; j < 3; j++) {
            vec2[j] = scanner.nextDouble();
        }

        vectorResultado[0] = vec1[0] - vec2[0];
        vectorResultado[1] = vec1[1] - vec2[1];
        vectorResultado[2] = vec1[2] - vec2[2];

        System.out.println("");
        System.out.println("");
        System.out.println("el resultado de la resta entre el vector A (" + vec1[0] + "," + vec1[1] + "," + vec1[2] + ")" + "  Y  " + "  Vector B( " + vec2[0] + "," + vec2[1] + "," + vec2[2] + ")");
        System.out.println("\t\t\tEs el  Vector C: " + "(" + vectorResultado[0] + "," + vectorResultado[1] + "," + vectorResultado[2] + ")");
    }

    public void Multiplicacionvecxvec() {

        double vec1[] = new double[3];
        double vec2[] = new double[3];
        double resultadoVector, partea, parteb, partec;
        System.out.println();
        System.out.println("Ingrese el Vector A");

        for (int i = 0; i < 3; i++) {
            vec1[i] = scanner.nextDouble();
        }
        System.out.println("Ingrese el Vector B");
        for (int i = 0; i < 3; i++) {
            vec2[i] = scanner.nextDouble();
        }
        partea = vec1[0] * vec2[0];
        parteb = vec1[1] * vec2[1];
        partec = vec1[2] * vec2[2];
        resultadoVector = partea + parteb + partec;

        System.out.println(" El resultado de la multiplicacion entre el vector A  (" + vec1[0] + "," + vec1[1] + "," + vec1[2] + ")  Y   El vector B(" + vec2[0] + "," + vec2[1] + "," + vec2[2] + ")");
        System.out.println("\t\t Es: " + "  i " + partea + "  j " + parteb + "  k " + partec + " \t\t y El escalar es: " + resultadoVector);

    }

    public void Multiplicacionvecxescalar() {

        double vec1[] = new double[3];
        double vecresultado[] = new double[3];
        double Escalar = 0.0;

        System.out.println();
        System.out.println("Ingrese el Escalar");
        Escalar = scanner.nextDouble();

        System.out.println("Ingrese El Vector");
        for (int i = 0; i < 3; i++) {
            vec1[i] = scanner.nextDouble();
        }

        vecresultado[0] = vec1[0] * Escalar;
        vecresultado[1] = vec1[1] * Escalar;
        vecresultado[2] = vec1[2] * Escalar;

        System.out.println("El Resultado de la multiplicacion entre en Escalar :" + Escalar + "   Y el Vector (" + vec1[0] + "," + vec1[1] + "," + vec1[2] + ")");
        System.out.println(" \t\t\t\n Es el vector : (" + vecresultado[0] + "," + vecresultado[1] + "," + vecresultado[2] + ")");
    }

    public void MultiplicacionvecXmatriz() {

        double vec1[] = new double[3];
        double matriz1[][] = new double[3][3];
        double vecrespuesta[] = new double[3];

        System.out.println("Ingrese el Vector A");
        for (int i = 0; i < 3; i++) {
            vec1[i] = scanner.nextDouble();
        }
        System.out.println("Ingrese la Matriz A de 3X3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Fila " + (i + 1) + "columna " + (j + 1));
                matriz1[i][j] = scanner.nextDouble();
            }
        }
        vecrespuesta[0] = vec1[0] * matriz1[0][0] + vec1[1] * matriz1[1][0] + vec1[2] * matriz1[2][0];
        vecrespuesta[1] = vec1[0] * matriz1[0][1] + vec1[1] * matriz1[1][1] + vec1[2] * matriz1[2][1];
        vecrespuesta[2] = vec1[0] * matriz1[0][2] + vec1[1] * matriz1[1][2] + vec1[2] * matriz1[2][2];


        System.out.println(" El Resultado de la Multiplicacion de vector por matriz es: (" +
                vecrespuesta[0] + "," + vecrespuesta[1] + "," + vecrespuesta[2] + ")");

    }
}
