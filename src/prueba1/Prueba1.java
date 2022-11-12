package prueba1;

import java.util.Scanner;

public class Prueba1 {

    public static void main(String[] args) {

        int n1;
        int n2;
        int resultado = 0;

        Scanner consola = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        n1 = Integer.parseInt(consola.nextLine());
        System.out.println("Digite otro numero: ");
        n2 = Integer.parseInt(consola.nextLine());
        System.out.println("Que Operacion deseas Realizar: ");
        String respuesta = consola.nextLine();
        
        if("+".equals(respuesta)){
            resultado = (n1 + n2);
            
        }
        else if("-".equals(respuesta)){
            resultado = (n1 - n2);
        }
           else if("*".equals(respuesta)){
            resultado = (n1 * n2);
        }
           else if("/".equals(respuesta)){
            resultado = (n1 / n2);
        }
        System.out.println("respuesta = " + String.valueOf(resultado));

    } 

}
