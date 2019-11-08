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
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }



        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        System.out.println("Sort feito 'na mão': " + Arrays.toString(numeros));

        System.out.println("Soma de numeros anteriores na mão: " + somaNumerosAnteriores(7));

        System.out.println("Soma de numeros anteriores recursivo na mão: " + somaNumerosAnterioresRecursivo(5));

    }

    //informar um numero e soma-lo a todos os seus anteriores//
    private static int somaNumerosAnteriores(int valor) {
        int soma = 0;
        for (int i = valor; i > 0; i--) {
            soma += i;
        }
        return soma;
    }

    private static int somaNumerosAnterioresRecursivo(int valor) {
        return somaNumerosAnterioresRecursivo(valor - 1) + valor;
    }
}
