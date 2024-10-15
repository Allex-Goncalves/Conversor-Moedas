package github.com.allex_goncalves;

import java.util.Scanner;

public class EuroConverter extends CurrencyConverter {

    private final Scanner scanner = new Scanner(System.in);

    public void convertEuroToReal() {
        System.out.print("Digite o valor em Euro €: ");
        double amount = scanner.nextDouble();
        double rate = fetchExchangeRate("EUR", "BRL");
        double result = amount * rate;
        System.out.printf("Valor convertido: R$ %.2f\n", result);
        System.out.println();
    }

    public void convertRealToEuro() {
        System.out.print("Digite o valor em Real R$: ");
        double amount = scanner.nextDouble();
        double rate = fetchExchangeRate("BRL", "EUR");
        double result = amount * rate;
        System.out.printf("Valor convertido: € %.2f\n", result);
        System.out.println();
    }

    public void convertEuroToPesoArgentino() {
        System.out.print("Digite o valor em Euro €: ");
        double amount = scanner.nextDouble();
        double rate = fetchExchangeRate("EUR", "ARS");
        double result = amount * rate;
        System.out.printf("Valor convertido: ARS $ %.2f\n", result);
        System.out.println();
    }

    public void convertPesoArgentinoToEuro() {
        System.out.print("Digite o valor em Pesos Argentinos: ");
        double amount = scanner.nextDouble();
        double rate = fetchExchangeRate("ARS", "EUR");
        double result = amount * rate;
        System.out.printf("Valor convertido: € %.2f\n", result);
        System.out.println();
    }

    public void convertEuroToPesoColombiano() {
        System.out.print("Digite o valor em Euro €: ");
        double amount = scanner.nextDouble();
        double rate = fetchExchangeRate("EUR", "COP");
        double result = amount * rate;
        System.out.printf("Valor convertido: COP $ %.2f\n", result);
        System.out.println();
    }

    public void convertPesoColombianoToEuro() {
        System.out.print("Digite o valor em Pesos Colombianos: ");
        double amount = scanner.nextDouble();
        double rate = fetchExchangeRate("COP", "EUR");
        double result = amount * rate;
        System.out.printf("Valor convertido: € %.2f\n", result);
        System.out.println();
    }
}

