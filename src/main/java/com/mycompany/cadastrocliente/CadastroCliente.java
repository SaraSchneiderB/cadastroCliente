
/*
nextLong() pra quantidade mais longa de teclado
nextLine() para texto
nextInt() para números inteiros em menor quantidade
next().nextAt() para char
nextDouble() para números flutuantes
 */
package com.mycompany.cadastrocliente;

import java.util.Scanner;

public class CadastroCliente {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        /*
      string n(ome), e(ndereço) c(pf);
      int i(dade);
      char s(exo);
         */
        System.out.println("Digite seu nome, endereço, cpf, idade e sexo");

        String n = teclado.nextLine();
        String e = teclado.nextLine();
        String c = teclado.nextLine();
        int i = teclado2.nextInt();
        char s = teclado2.next().charAt(0);

        System.out.println(n);
        System.out.println(e);
        System.out.println(c);
        System.out.println(i);
        System.out.println(s);

        /*String n,e,c,i,s;
                
        n = teclado.nextLine();
        
        System.out.println(n);
        System.out.println(e);
        System.out.println(c);
        System.out.println(i);
        System.out.println(s);*/
        teclado.close();

    }
}
