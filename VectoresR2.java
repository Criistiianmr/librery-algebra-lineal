package com.cristian;


import java.util.Scanner;

public class VectoresR2 {
    Scanner scanner = new Scanner(System.in);

    public void Sumavec() {

        double vec1[] = new double[2];
        double vec2[] = new double[2];
        double vectorResultado[] = new double[2];
        System.out.println("Ingrese el primer vector");

        for (int i = 0; i < 2; i++) {
            vec1[i] = scanner.nextDouble();
        }
        System.out.println("Ingrese el segundo vector");
        for (int j = 0; j < 2; j++) {
            vec2[j] = scanner.nextDouble();
        }

        vectorResultado[0] = vec1[0] + vec2[0];
        vectorResultado[1] = vec1[1] + vec2[1];
        System.out.println("");
        System.out.println("");
        System.out.println("el resultado de la suma entre el vector A ("+vec1[0]+","+vec1[1]+")"+"  Y  "+"  Vector B( "+vec2[0]+","+vec2[1]+")");
        System.out.println("\t\t\tEs el  Vector C: "+"("+vectorResultado[0]+","+vectorResultado[1]+")");

    }


    public void Restavec() {
        double vec1[] = new double[2];
        double vec2[] = new double[2];
        double vectorResultado[] = new double[2];
        System.out.println();
        System.out.println("Ingrese el vector A");

        for (int i = 0; i < 2; i++) {
            vec1[i] = scanner.nextDouble();
        }
        System.out.println("Ingrese el vector B");
        for (int j = 0; j < 2; j++) {
            vec2[j] = scanner.nextDouble();
        }

        vectorResultado[0] = vec1[0] - vec2[0];
        vectorResultado[1] = vec1[1] - vec2[1];
        System.out.println("");
        System.out.println("");
        System.out.println("el resultado de la resta entre el vector A ("+vec1[0]+","+vec1[1]+")"+"  Y  "+"  Vector B( "+vec2[0]+","+vec2[1]+")");
        System.out.println("\t\t\tEs el  Vector C: "+"("+vectorResultado[0]+","+vectorResultado[1]+")");
    }

    public void Multiplicacionvecxvec(){

        double vec1[] = new double[2];
        double vec2[] = new double[2];
        double resultadoVector;
        System.out.println();
        System.out.println("Ingrese el Vector A");

        for (int i = 0; i <2 ; i++) {
            vec1[i]= scanner.nextDouble();
        }
        System.out.println("Ingrese el Vector B");
        for (int i = 0; i <2 ; i++) {
            vec2[i]= scanner.nextDouble();
        }
        resultadoVector = vec1[0]*vec2[0]+vec1[1]*vec2[1];

        System.out.println(" El resultado de la multiplicacion entre el vector A  ("+vec1[0]+","+vec1[1]+")  Y   El vector B("+vec2[0]+","+vec2[1]+")");
        System.out.println("\t\t\t Es el escalar :"+resultadoVector);
    }
    public void Multiplicacionvecxescalar (){

        double vec1[] = new double[2];
        double vecresultado[] = new double[2];
        double Escalar = 0.0;

        System.out.println();
        System.out.println("Ingrese el Escalar");
        Escalar=scanner.nextDouble();

        System.out.println("Ingrese El Vector");
        for (int i = 0; i <2 ; i++) {
            vec1[i]=scanner.nextDouble();
        }

        vecresultado[0]=vec1[0]*Escalar;
        vecresultado[1]=vec1[1]*Escalar;

        System.out.println("El Resultado de la multiplicacion entre en Escalar :"+Escalar+ " Y el Vector ("+vec1[0]+","+vec1[1]+")");
        System.out.println(" \t\t\t Es el vector : ("+ vecresultado[0]+","+vecresultado[1]+")");
    }

    public void MultiplicacionvecXmatriz (){

        double vec1[] = new double[2];
        double matriz1[][] = new double[2][2];
        double vecrespuesta []= new double[2];


        System.out.println("Ingrese el Vector A");
        for (int i = 0; i <2 ; i++) {
            vec1[i]=scanner.nextDouble();
        }
        System.out.println("Ingrese la Matriz A de 2X2");
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.println("Fila "+(i+1)+"columna "+(j+1));
                matriz1[i][j]= scanner.nextDouble();
            }
        }
        vecrespuesta[0]=vec1[0]*matriz1[0][0]+vec1[1]*matriz1[1][0];
        vecrespuesta[1]=vec1[0]*matriz1[0][1]+vec1[1]*matriz1[1][1];

        System.out.println(" El Resultado de la Multiplicacion de vector por matriz es: ("+vecrespuesta[0]+","+vecrespuesta[1]+")");

    }
}