package github.com.allex_goncalves;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DollarConverter extends CurrencyConverter {

    private final Scanner scanner = new Scanner(System.in);

    public void convertDollarToReal() {
        System.out.print("Digite o valor em Dólar $: ");
        double amount = scanner.nextDouble();
        double rate = fetchExchangeRate("USD", "BRL");
        double result = amount * rate;
        System.out.printf("Valor convertido: R$ %.2f\n", result);
        System.out.println();
    }

    public void convertRealToDollar() {
        System.out.print("Digite o valor em Real R$: ");
        double amount = scanner.nextDouble();
        double rate = fetchExchangeRate("BRL", "USD");
        double result = amount * rate;
        System.out.printf("Valor convertido: $ %.2f\n", result);
        System.out.println();
    }

    public void convertDollarToPesoArgentino() {
        System.out.print("Digite o valor em Dólar $: ");
        double amount = scanner.nextDouble();
        double rate = fetchExchangeRate("USD", "ARS");
        double result = amount * rate;
        System.out.printf("Valor convertido: ARS $ %.2f\n", result);
        System.out.println();
    }

    public void convertPesoArgentinoToDollar() {
        System.out.print("Digite o valor em Pesos Argentinos: ");
        double amount = scanner.nextDouble();
        double rate = fetchExchangeRate("ARS", "USD");
        double result = amount * rate;
        System.out.printf("Valor convertido: $ %.2f\n", result);
        System.out.println();
    }

    public void convertDollarToPesoColombiano() {
        System.out.print("Digite o valor em Dólar $: ");
        double amount = scanner.nextDouble();
        double rate = fetchExchangeRate("USD", "COP");
        double result = amount * rate;
        System.out.printf("Valor convertido: COP $ %.2f\n", result);
        System.out.println();
    }

    public void convertPesoColombianoToDollar() {
        System.out.print("Digite o valor em Pesos Colombianos: ");
        double amount = scanner.nextDouble();
        double rate = fetchExchangeRate("COP", "USD");
        double result = amount * rate;
        System.out.printf("Valor convertido: $ %.2f\n", result);
        System.out.println();
    }
}

