package com.cristian;

import java.util.Scanner;

public class Menuprincipal {

    public void menu (){
        int respuesta=0;
        do{
                Scanner scanner = new Scanner(System.in);

                System.out.println("\t\t\t\n\n\n\n\n Bienvenido a la libreria de operaciones de algebra lineal. ");
                System.out.println("");
                System.out.println("");
                System.out.println("En que dimencion deseas realizar las operaciones");
                System.out.println("\t\t1 -   R2");
                System.out.println("\t\t2 -   R3");
                System.out.println("\t\t3 -   R4");
                System.out.println("\t\t4 -   salir de el programa");

                respuesta = scanner.nextInt();

                switch (respuesta) {
                    case 1: {
                        System.out.println("\n\n\t\t\t Que tipo de operacion desea realizar en R2");
                        System.out.println("\t 1 -   Vectores");
                        System.out.println("\t 2 -   Matrices");
                        int respuestar2 = scanner.nextInt();

                        switch (respuestar2) {
                            case 1: {
                                System.out.println("\n\n\t\t\t Excelente Para vectores en R2 estan disponibles las siguientes operaciones ");
                                System.out.println("\n\t\tCual deseas realizar: ");
                                System.out.println("\t1 -   Suma de vectores");
                                System.out.println("\t2 -   Resta de vectores");
                                System.out.println("\t3 -   Multiplicacion de vector por vector");
                                System.out.println("\t4 -   Multiplicacion vector por escarlar");
                                System.out.println("\t5 -   Multiplicacion vector con matriz");

                                int respuestar21 = scanner.nextInt();
                                switch (respuestar21) {
                                    case 1: {
                                        VectoresR2 vectoresR2 = new VectoresR2();
                                        vectoresR2.Sumavec();
                                        break;
                                    }
                                    case 2: {
                                        VectoresR2 vectoresR2 = new VectoresR2();
                                        vectoresR2.Restavec();
                                        break;
                                    }
                                    case 3: {
                                        VectoresR2 vectoresR2 = new VectoresR2();
                                        vectoresR2.Multiplicacionvecxvec();
                                        break;
                                    }
                                    case 4: {
                                        VectoresR2 vectoresR2 = new VectoresR2();
                                        vectoresR2.Multiplicacionvecxescalar();
                                        break;
                                    }
                                    case 5:{
                                        VectoresR2 vectoresR2 = new VectoresR2();
                                        vectoresR2.MultiplicacionvecXmatriz();
                                    break;
                                    }
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("\n\n\t\t\t Excelente para matrices en R2 estan disponibles las siguientes operaciones");
                                System.out.println("\n\t\tCual deseas realizar: ");
                                System.out.println("\t1 -   Suma de matrices");
                                System.out.println("\t2 -   Resta de matrices");
                                System.out.println("\t3 -   Multiplicacion de matriz por escalar");
                                System.out.println("\t4 -   Producto Matriz X Matriz");
                                System.out.println("\t5 -   Determiante de una matrz");

                                int respuestar22 = scanner.nextInt();
                                switch (respuestar22) {
                                    case 1: {
                                        MatricesR2 matricesR2 = new MatricesR2();
                                        matricesR2.SumaMat();
                                        break;
                                    }
                                    case 2: {
                                        MatricesR2 matricesR2 = new MatricesR2();
                                        matricesR2.RestaMat();
                                        break;
                                    }
                                    case 3: {
                                        MatricesR2 matricesR2 = new MatricesR2();
                                        matricesR2.MultiEscalarXMatriz();
                                        break;
                                    }
                                    case 4: {
                                        MatricesR2 matricesR2 = new MatricesR2();
                                        matricesR2.MultiMatrizXMatriz();
                                        break;
                                    }
                                    case 5:{
                                        MatricesR2 matricesR2 = new MatricesR2();
                                        matricesR2.Determinante();
                                        break;
                                    }

                                }
                                break;
                            }
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("\n\n\t\t\t Que tipo de operacion desea realizar en R3");
                        System.out.println("\t 1 -   Vectores");
                        System.out.println("\t 2 -   Matrices");
                        int respuestar2 = scanner.nextInt();

                        switch (respuestar2) {
                            case 1: {
                                System.out.println("\n\n\t\t\t\t Excelente Para vectores en R3 estan disponibles las siguientes operaciones ");
                                System.out.println("\n\t\tCual deseas realizar: ");
                                System.out.println("\t1 -   Suma de vectores");
                                System.out.println("\t2 -   Resta de vectores");
                                System.out.println("\t3 -   Multiplicacion de vector por vector");
                                System.out.println("\t4 -   Multiplicacion vector por escarlar");
                                System.out.println("\t5 -   Multiplicacion vector con matriz");

                                int respuestar21 = scanner.nextInt();
                                switch (respuestar21) {
                                    case 1: {
                                        VectoresR3 vectoresR3 = new VectoresR3();
                                        vectoresR3.SumaVec();
                                        break;
                                    }
                                    case 2: {
                                        VectoresR3 vectoresR3 = new VectoresR3();
                                        vectoresR3.RestaVec();
                                        break;
                                    }
                                    case 3: {
                                        VectoresR3 vectoresR3 = new VectoresR3();
                                        vectoresR3.Multiplicacionvecxvec();
                                        break;
                                    }
                                    case 4: {
                                        VectoresR3 vectoresR3 = new VectoresR3();
                                        vectoresR3.Multiplicacionvecxescalar();
                                        break;
                                    }
                                    case 5: {
                                        VectoresR3 vectoresR3 = new VectoresR3();
                                        vectoresR3.MultiplicacionvecXmatriz();
                                        break;
                                    }
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("\n\n\t\t\t Excelente para matrices en R3 estan disponibles las siguientes operaciones");
                                System.out.println("\n\t\tCual deseas realizar: ");
                                System.out.println("\t1 -   Suma de matrices");
                                System.out.println("\t2 -   Resta de matrices");
                                System.out.println("\t3 -   Multiplicacion de matriz por escalar");
                                System.out.println("\t4 -   Producto Matriz X Matriz");
                                System.out.println("\t5 -   Determiante de una matrz");

                                int respuestar22 = scanner.nextInt();
                                switch (respuestar22) {
                                    case 1: {
                                        MatricesR3 matricesR3 = new MatricesR3();
                                        matricesR3.Sumamat();
                                        break;
                                    }
                                    case 2: {
                                        MatricesR3 matricesR3 = new MatricesR3();
                                        matricesR3.Restamat();
                                        break;
                                    }
                                    case 3: {
                                        MatricesR3 matricesR3 = new MatricesR3();
                                        matricesR3.MultiEscalarXMatriz();
                                        break;
                                    }
                                    case 4: {
                                        MatricesR3 matricesR3 = new MatricesR3();
                                        matricesR3.MultiMatrizXMatriz();
                                        break;
                                    }
                                    case 5: {
                                        MatricesR3 matricesR3 = new MatricesR3();
                                        matricesR3.Determianante();
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("\n\n\t\t\t Que tipo de operacion desea realizar en R4");
                        System.out.println("\t 1 -   Vectores");
                        System.out.println("\t 2 -   Matrices");
                        int respuestar2 = scanner.nextInt();

                        switch (respuestar2) {
                            case 1: {
                                System.out.println("\n\n\t\t\t Excelente Para vectores en R4 estan disponibles las siguientes operaciones ");
                                System.out.println("\n\t\tCual deseas realizar: ");
                                System.out.println("\t1 -   Suma de vectores");
                                System.out.println("\t2 -   Resta de vectores");
                                System.out.println("\t3 -   Multiplicacion de vector por vector");
                                System.out.println("\t4 -   Multiplicacion vector por escarlar");
                                System.out.println("\t5 -   Multiplicacion vector con matriz");

                                int respuestar21 = scanner.nextInt();
                                switch (respuestar21) {
                                    case 1: {

                                        break;
                                    }
                                    case 2: {

                                        break;
                                    }
                                    case 3: {

                                        break;
                                    }
                                    case 4: {

                                        break;
                                    }
                                    case 5: {

                                        break;
                                    }
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("\n\n\t\t\t Excelente para matrices en R4 estan disponibles las siguientes operaciones");
                                System.out.println("\n\t\tCual deseas realizar: ");
                                System.out.println("\t1 -   Suma de matrices");
                                System.out.println("\t2 -   Resta de matrices");
                                System.out.println("\t3 -   Multiplicacion de matriz por escalar");
                                System.out.println("\t4 -   Producto Matriz X Matriz");
                                System.out.println("\t5 -   Determiante de una matrz");

                                int respuestar22 = scanner.nextInt();
                                switch (respuestar22) {
                                    case 1: {

                                        break;
                                    }
                                    case 2: {

                                        break;
                                    }
                                    case 3: {

                                        break;
                                    }
                                    case 4: {

                                        break;
                                    }
                                    case 5: {

                                        break;
                                    }
                                }
                                break;
                            }
                        }
                        break;
                    }
                    case 4: {
                        System.out.println("\n\n\n\tGracias por su visita.."+"\n\t que vuelva pronto :v");
                    break;
                    }
                }
        }while(respuesta<3);
    }
}