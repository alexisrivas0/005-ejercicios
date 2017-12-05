package com.cice;

import java.util.Scanner;

public class Main4 {

    public static void main (String[] args){

        long x;

        long i=1;

        long resultado = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu numero: ");

        x = sc.nextInt();

        for(i=1; i<=x; i++){

            resultado *= i;


        }

        System.out.println(resultado);


        }


    }

