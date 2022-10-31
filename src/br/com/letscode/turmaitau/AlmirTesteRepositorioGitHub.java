package br.com.letscode.turmaitau;

import java.util.Scanner;

public class AlmirTesteRepositorioGitHub {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa mais TOP que você conhece no Banco: ");
        String pessoaToppers = scanner.next();

        System.out.printf("Se você acha %s Topper, isso é porque vc não conhece a Bru (Top, Top, Topper)", pessoaToppers);

    }
}

