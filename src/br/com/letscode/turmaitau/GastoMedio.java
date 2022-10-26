package br.com.letscode.turmaitau;

public class GastoMedio {
    public static final int mediaLitro = 12;

    public static void main(String[] args) {
        int tempo = 2;
        int velocidadeMedia = 60;
        int distancia =  calcularDistancia(tempo, velocidadeMedia);
        int qtde_litros = calcularLitrosGastos(distancia);

        System.out.println("velocidade media = " + velocidadeMedia);
        System.out.println("tempo gasto = " + tempo);
        System.out.println("distancia percorrida = " + distancia);
        System.out.println("quantidade de litros = " + qtde_litros);
    }
    public static int calcularDistancia(int tempo, int velocidadeMedia){
        return tempo * velocidadeMedia;
    }
    public static int calcularLitrosGastos(int distancia){
        return distancia/mediaLitro;
    }

}
