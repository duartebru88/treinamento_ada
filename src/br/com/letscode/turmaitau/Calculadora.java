package br.com.letscode.turmaitau;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("soma = " + somar(10, 5));
        System.out.println("subtrair = " + subtrair(10, 5));
        System.out.println("multiplicar = " + multiplicar(10, 5));
        System.out.println("dividir = " + dividir(10, 5));
    }

    public static int somar(int a, int b){
          return a + b;
    }
    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static int dividir(int a, int b){
        if (a > 0) {
            return a / b;
        }
        else return 0;
    }
}
