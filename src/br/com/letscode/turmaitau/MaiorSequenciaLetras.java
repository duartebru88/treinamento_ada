package br.com.letscode.turmaitau;

import java.util.ArrayList;

public class MaiorSequenciaLetras {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<String>();
        palavras.add("acbda");
        palavras.add("fasdlkh");
        palavras.add("poiwqd");
        palavras.add("zxcqwtop");
        palavras.add("qfgophl");

        //     Collections.sort(palavras);
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'w', 'y', 'z'};

        ArrayList<String> novasPalavras = new ArrayList<String>();

        //percorrer as palavras
        for (int i = 0; i < palavras.size(); i++) {
            int contadorAtual = 0;
            int contadorAnterior = 0;
            String sequencia = "";
            boolean zerou = false;

            //percorrer as letras de cada palavra
            for (int j = 0; j < palavras.get(i).length(); j++) {
                char letra = palavras.get(i).charAt(j);
                //percorrer o alfabeto
                for( int z = 0; z < alfabeto.length; z++){
                     if (alfabeto[z] == letra) {
                          contadorAtual = z;
                          break;
                      }
                 }
                if ((contadorAtual > contadorAnterior) ||  zerou || j == 0) {
                    sequencia = sequencia + letra;
                    contadorAnterior = contadorAtual;
                    zerou = false;
                    if (j == palavras.get(i).length() - 1)
                        novasPalavras.add(sequencia);
                }else{
                    novasPalavras.add(sequencia);
                    zerou = true;
                    contadorAnterior = 0;
                    contadorAtual = 0;
                    sequencia="";
                    j--;
                }
            }
        }
        int maior = 0;
        for (int i = 1; i < novasPalavras.size(); i++){
             if (novasPalavras.get(i).length() > novasPalavras.get(maior).length()) {
                maior = i;
            }
        }
        System.out.println("a maior sequencia é: " + novasPalavras.get(maior));


    }
}

