package Arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Ryller Oliveira
 */

public class Arrays {
    public static void main(String[] args) {
        Integer [] numeros = { 5, 9, 12, 3, 4, 60, 1, 2, 8, 17, 15, 7};
        int maior = 0;
        int menor = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.addAll(java.util.Arrays.asList( 5, 9, 12, 3, 4, 60, 1, 2, 8, 17, 15, 7));

        System.out.println("MAIOR ARRAY LIST: " + Collections.max(arrayList));
        System.out.println("MENOR ARRAY LIST: " + Collections.min(arrayList));

        System.out.println(Collections.sort(arrayList));

        //informar um numero e soma-lo a todos os seus anteriores//
        //informar um numero e soma-lo a todos os seus anteriores sem repetição//
        //informar um numero e soma-lo a todos os seus anteriores com recursividade//

        //pegar menor valor do array//
        for (int i = 0; i < numeros.length; i++) {
            int aux = numeros[i];

            if (i==0) {
                maior = numeros[i];
                menor = numeros[i];
            }

            if (numeros[i]>maior) {
                maior = numeros[i];
            }

            if (numeros[i]<menor) {
                menor = numeros[i];
            }
        }

        //ordenar valores do array em ordem crescente//
        for (int i = 0; i < numeros.length; i++) {

        }


        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

    }
}
