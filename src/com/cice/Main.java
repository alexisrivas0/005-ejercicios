package com.cice;

//Determinar si un numero es par o no

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        int x = 0;
        int resultado;
        Scanner sc = new Scanner(System.in);

        System.out.print("introduce tu numero a comprobar: ");

        x=sc.nextInt();
        resultado = x%2;


        if(resultado == 0){

            System.out.println("su numero " + x + " es par");
        } else {

            System.out.println("su numero " + x + " es impar ");
        }



    }
}
