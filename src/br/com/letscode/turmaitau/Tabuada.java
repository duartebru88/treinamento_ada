package br.com.letscode.turmaitau;

public class Tabuada {
    public static void main(String[] args) {
        calcularTabuada(2);
    }

    public static void calcularTabuada(int numero){
        String tabuada = "";
        for(int i = 1; i <= 10; i++){
            int num = numero * i;
            tabuada = tabuada + num + ",";
        }
        System.out.println("A tabuada no numero: " +numero+" é " + tabuada);
    }
}
