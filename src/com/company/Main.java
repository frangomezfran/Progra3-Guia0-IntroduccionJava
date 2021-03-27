package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato1 = new DecimalFormat("#.00"); //Objeto instanciado para disminuir decimales
        int ej ;

        do {
            System.out.println("  - Seleccionar Ejercicio - \n\n 01 - 02 - 03 - 04 - 05 - 06\n 07 - 08 - 09 - 10 - 11 - 12\n 13 - 14 - 15 - 16 - 17 - 18");
            ej = scanner.nextInt();
        }while(ej<0 || ej>18);

        System.out.println("Ejercicio "+ej+"\n");

        switch (ej) {

            case(1):
                int nEj1 = 10;
                double aEj1 = 5.5;
                char cEj1 = 'F';
                System.out.println("n = " + nEj1 + " | a = " + aEj1 + " | c = " + cEj1);
                System.out.println("n + a = " + (nEj1 + aEj1) + "\na - n = " + (aEj1 - nEj1) + "\nc = " + (int) cEj1);
                break;

            case (2):
                int xEj2 = 36 , yEj2= 20 ;
                double nEj2 = 15.2 , mEj2 = 50.5 ;
                System.out.println("X + Y = "+(xEj2+yEj2)+" | X + N = "+(xEj2+nEj2)+" | X + M = "+(xEj2+mEj2));
                System.out.println("X * Y = "+formato1.format((xEj2*yEj2))+" | X * N = "+formato1.format((xEj2*nEj2))+" | X * M = "+formato1.format((xEj2*mEj2)));
                System.out.println("X / Y = "+(xEj2/yEj2)+" | X / N = "+formato1.format((xEj2/nEj2))+" | X / M = "+formato1.format((xEj2/mEj2)));
                break;

            case (3):
                int nEj3 ;
                System.out.println("Ingrese un entero para N");
                nEj3 = scanner.nextInt();
                System.out.println("N = "+nEj3);
                if(nEj3 < 77){
                    while(nEj3 != 77) {  nEj3++;  }
                } else {
                    while(nEj3 != 77) {  nEj3--;  }
                }
                System.out.println("N = "+nEj3);
                while (nEj3 != 3) { nEj3--; }
                System.out.println("N = "+nEj3);
                nEj3 = nEj3*2;
                System.out.println("N = "+nEj3);
                break;

            case (4):
                int a = 10 , b = 20 , c = 30 , d = 40 ;
                int aux=b ;
                System.out.println("A = "+a+" | B = "+b+" | C = "+c+" | D = "+d);
                b = c ; // b = 30
                c = a ; // C = 10
                a = d ; // a = 40
                d = aux ; // d = 20
                System.out.println("A = "+a+" | B = "+b+" | C = "+c+" | D = "+d);
                break;

            case (5):
                System.out.print("Seleccione un numero para A : ");
                int aEj5 = scanner.nextInt();
                System.out.print(" A = "+aEj5+" es ");
                if(aEj5%2==0){
                    System.out.print("par");
                }else{
                    System.out.print("impar");
                }
                break;

            case (6):
                System.out.print("Seleccione un numero para B : ");
                int bEj6  = scanner.nextInt();
                System.out.print(" B = "+bEj6+" es ");
                if(bEj6 > 0 || bEj6 == 0) {
                    System.out.print("positivo");
                }else {
                    System.out.print("negativo");
                }
                break;

            case (7):
                System.out.print("Seleccione un numero para C : ");
                int cEj7 = scanner.nextInt();
                System.out.print("El numero "+cEj7+" es ");

                String signo ="tivo" ; //qseyo estaba inspirado
                if ( cEj7 > 0 || cEj7 == 0 )
                    signo = "Posi"+signo;
                else
                    signo = "Nega"+signo;

                String par ="ar";
                if( cEj7 % 2 == 0 )
                    par = "P"+par ;
                else
                    par = "Imp"+par;

                String mult = "Multiplo de -> 0 " ;
                if( cEj7 % 5 == 0 )
                    mult = mult+"- 5 ";


                if( cEj7 % 10 == 0 )
                    mult = mult+"- 10 ";


                String que100 = "que 100";
                if( cEj7 == 100 )
                    que100="Igual "+que100;
                else if( cEj7 < 100 )
                    que100="Menor "+que100;
                else
                    que100="Mayor "+que100;

                System.out.println(""+signo+", "+par+", "+que100+" y "+mult);

                break;

            case (8):
                System.out.println("Introduzca su nombre porfa : ");
                String nombre = scanner.nextLine();
                System.out.println("Buenos dias, "+nombre);
                break;

            case (9):
                System.out.print("Seleccione un numero para A: ");
                int aEj9 = scanner.nextInt();
                System.out.println("El doble de "+aEj9+" es "+(aEj9*2));
                System.out.print("El triple de "+aEj9+" es "+(aEj9*3));
                break;

            case (10):
                System.out.print("Introduzca grados Fahrenheit : ");
                double faren = scanner.nextDouble() ;
                double celsius = ((faren - 32)*5)/9;
                System.out.println(""+faren+"° Fahrenheit = "+celsius+"° Celsius ");
                break;

            case (11):
                System.out.print("Ingrese el radio de la circunferencia : ");
                double radio = scanner.nextDouble();
                double longitud = Math.PI * 2 * radio ;
                double area = (Math.PI) * ( Math.pow(radio,2) );
                System.out.println("Radio = "+formato1.format(radio)+"\nLongitud = "+formato1.format(longitud)+"\nArea = "+formato1.format(area));
                break;

            case (12):
                System.out.print("Ingrese una velocidad a Km/h : ");
                double kmh = scanner.nextDouble();
                double msPasaje = kmh / (3.6) ;
                System.out.println(kmh+" Km/h = "+formato1.format(msPasaje)+" M/seg");
                break;

            case (13):
                System.out.print("Ingrese cateto adyacente : ");
                double catAd = scanner.nextDouble();
                System.out.print("Ingrese cateto opuesto : ");
                double catOp = scanner.nextDouble();
                double hipotenusa = Math.sqrt(Math.pow(catAd,2)+Math.pow(catOp,2));
                System.out.println("Hipotenusa  = "+formato1.format(hipotenusa));
                break;

            case (14):
                System.out.print("Ingrese radio de la esfera : ");
                double radioEsf = scanner.nextDouble();
                double volumenEsf = ( 4 * Math.PI * Math.pow(radioEsf,3) ) / 3 ;
                System.out.print("El volumen de la esfera es : "+volumenEsf);
                break;

            case (15):
                System.out.println("Ingrese los lados del triangulo : ");
                System.out.print("Lado 1 : ");
                double l1 = scanner.nextDouble();
                System.out.print("Lado 2 : ");
                double l2 = scanner.nextDouble();
                System.out.print("Lado 3 : ");
                double l3 = scanner.nextDouble();
                double areaTriangulo = Math.sqrt(((l1+l2+l3)*(-l1+l2+l3)*(l1-l2+l3)*(l1+l2-l3))/16);
                System.out.println("Area del triangulo = "+formato1.format(areaTriangulo));
                break;

            case (16):
                int num ;
                do {
                    System.out.println("Ingrese un numero de 3 cifras : ");
                    num = scanner.nextInt();
                }while(num > 999 || num < 100);
                int cifra1 = (num / 100) ;
                int cifra2 = (num / 10) - (cifra1 * 10);
                int cifra3 = num - ( (cifra1 * 100) + (cifra2 * 10) ) ;
                System.out.println("Cifra 1 = "+cifra1+"\nCifra 2 = "+cifra2+"\nCifra 3 = "+cifra3);
                break;

            case (17):
                int numero ;
                do {
                    System.out.println("Ingrese un numero de 5 cifras : ");
                    numero = scanner.nextInt();
                }while(numero > 99999 || numero < 10000);
                int digito1 = ( numero / 10000 ) ;
                int digito2 = ( numero - (digito1 * 10000) ) / 1000 ;
                int digito3 = ( numero - ((digito1 * 10000) + (digito2 * 1000)) ) / 100 ;
                int digito4 = ( numero - ((digito1 * 10000) + (digito2 * 1000) + (digito3 * 100)) ) / 10 ;
                int digito5 =   numero - ((digito1 * 10000) + (digito2 * 1000) + (digito3 * 100) + (digito4 * 10)) ;
                System.out.println("Numero : "+numero);
                System.out.print("Mostrando solo numeros en posiciones impares -> ");
                System.out.print(digito1+"-"+digito3+"-"+digito5);
                break;

            case (18):
                int h , m , s ;

                System.out.println("- Alarma AM -");

                do {
                    System.out.print("Ingrese Hora : ");
                    h = scanner.nextInt();
                }while(h<0 || h>23);

                do {
                    System.out.print("Ingrese Minutos : ");
                    m = scanner.nextInt();
                }while(m<0 || m>59);

                do {
                    System.out.print("Ingrese Segundos : ");
                    s = scanner.nextInt();
                }while(s<0 || s>59);

                System.out.println("Horario Seleccionado -> "+h+" : "+m+" : "+s+" <-");

                break;
        }
    }
}