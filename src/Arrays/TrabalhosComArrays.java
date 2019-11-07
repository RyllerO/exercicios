package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Ryller Oliveira
 */

public class TrabalhosComArrays {
    public static void main(String[] args) {
        Integer[] numeros = {5, 9, 12, 3, 4, 60, 1, 2, 8, 17, 15, 7};
        int maior = 0;
        int menor = 0;
        int aux = 0;

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 9, 12, 3, 4, 60, 1, 2, 8, 17, 15, 7));

        System.out.println("MAIOR ARRAY LIST: " + Collections.max(arrayList));
        System.out.println("MENOR ARRAY LIST: " + Collections.min(arrayList));

//        arrayList.sort((x,y) -> (x>y) ? 1 : ((x == y) ? 1 : -1));
        Collections.sort(arrayList);
        System.out.println("Ordenação ASC" + arrayList);
        Collections.reverse(arrayList);
        System.out.println("Ordenação DESC" + arrayList);

        //informar um numero e soma-lo a todos os seus anteriores//
        //informar um numero e soma-lo a todos os seus anteriores sem repetição//
        //informar um numero e soma-lo a todos os seus anteriores com recursividade//

        //pegar menor valor do array//
        for (int i = 0; i < numeros.length; i++) {

            if (i == 0) {
                maior = numeros[i];
                menor = numeros[i];
            }

            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        //ordenar valores do array em ordem crescente//
        for (int i = 0; i < numeros.length; i++) {
            aux = numeros[i];
            if (aux > numeros[i+1]) {
                numeros[i] = numeros[i+1];
                numeros[i+1] = aux;
            }
        }


        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        System.out.println("Sort feito 'na mão': " + Arrays.toString(numeros));

    }
}
