package misClases;

import java.util.*;

public class Main{
      public static void main (String[]args) {
        /* Author Nordevelop
        *Algoritmo de Ordenacion por el metodo Shellsort
        */
        int maxSize =10;
        ArrayShell arr;
        arr= new Arrayshell(maxSize);
        for (int j=0; j<maxSize; j++)
        {
          long n = (int) (java.lang.Math.random()*99);
          arr.incluir(n);
        }
        system.out.println("Array Desordenado");
        arr.mostrar();
        arr.shellsort();
        System.out.println("Array ordenado con ShellSort: ");
        arr.mostrar();            // mostrar en pantalla array ordenado.
      }
}
