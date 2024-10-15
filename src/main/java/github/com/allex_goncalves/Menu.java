package github.com.allex_goncalves;

import java.util.Scanner;

public class Menu {

    private final DollarConverter dollarConverter = new DollarConverter();
    private final EuroConverter euroConverter = new EuroConverter();
    private final Scanner scanner = new Scanner(System.in);

    // Menu principal
    public void showMainMenu() {
        String option;
        do {
            System.out.println("*****************************************");
            System.out.println(" Seja bem vindo ao Conversor de Moedas");
            System.out.println("*****************************************\n");
            System.out.println("Menu de Opções");
            System.out.println("1) Dólar $");
            System.out.println("2) Euro €");
            System.out.println("3) Exit (Sai da aplicação)\n");
            System.out.println("*****************************************");
            System.out.println("Data: " + DateTimeUtils.getCurrentDateTime());
            System.out.println("*****************************************\n");
            System.out.println("Escolha uma opção do Menu!");
            option =  scanner.nextLine();
            switch (option) {
                case "1":
                    showDollarMenu();
                    break;
                case "2":
                    showEuroMenu();
                    break;
                case "3":
                    System.out.println("Saindo da Aplicação");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!option.equals("3"));
    }

    // Menu para operações com Dólar
    private void showDollarMenu() {
        String option;
        do {
            System.out.println("*****************************************");
            System.out.println(" Seja bem vindo ao Conversor de Moedas");
            System.out.println("*****************************************\n");
            System.out.println("1) Dólar $ =>> Real R$");
            System.out.println("2) Real R$ =>> Dólar $");
            System.out.println("3) Dólar $ =>> Peso Argentino");
            System.out.println("4) Peso Argentino =>> Dólar $");
            System.out.println("5) Dólar $ =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dólar $");
            System.out.println("7) Return (retorna para o menu principal)\n");
            System.out.println("*****************************************");
            System.out.println("Data: " + DateTimeUtils.getCurrentDateTime());
            System.out.println("*****************************************\n");
            System.out.println("Escolha uma opção do Menu!");
            option = scanner.nextLine();
            optionDollarConversion(option);
        } while (!option.equals("7"));
    }

    // Exibe o menu para operações com Euro
    private void showEuroMenu() {
        String option;
        do {
            System.out.println("*****************************************");
            System.out.println(" Seja bem vindo ao Conversor de Moedas");
            System.out.println("*****************************************\n");
            System.out.println("1) Euro € =>> Real R$");
            System.out.println("2) Real R$ =>> Euro €");
            System.out.println("3) Euro € =>> Peso Argentino");
            System.out.println("4) Peso Argentino =>> Euro €");
            System.out.println("5) Euro € =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Euro €");
            System.out.println("7) Return (retorna para o menu principal)\n");
            System.out.println("*****************************************");
            System.out.println("Data: " + DateTimeUtils.getCurrentDateTime());
            System.out.println("*****************************************\n");
            System.out.println("Escolha uma opção do Menu!");
            option = scanner.nextLine();
            optionEuroConversion(option);
        } while (!option.equals("7"));
    }

    // Lida com a conversão de moedas com base na opção selecionada no menu do Dólar
    private void optionDollarConversion(String option) {
        switch (option) {
            case "1":
                dollarConverter.convertDollarToReal();
                break;
            case "2":
                dollarConverter.convertRealToDollar();
                break;

            case "3":
                dollarConverter.convertDollarToPesoArgentino();
                break;

            case "4":
                dollarConverter.convertPesoArgentinoToDollar();
                break;

            case "5":
                dollarConverter.convertDollarToPesoColombiano();
                break;

            case "6":
                dollarConverter.convertPesoColombianoToDollar();
                break;

            case "7":
                System.out.println("Retornando ao menu principal...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    // Lida com a conversão de moedas com base na opção selecionada no menu do Euro
    private void optionEuroConversion(String option) {
        switch (option) {
            case "1":
                euroConverter.convertEuroToReal();
                break;
            case "2":
                euroConverter.convertRealToEuro();
                break;

            case "3":
                euroConverter.convertEuroToPesoArgentino();
                break;

            case "4":
                euroConverter.convertPesoArgentinoToEuro();
                break;

            case "5":
                euroConverter.convertEuroToPesoColombiano();
                break;

            case "6":
                euroConverter.convertPesoColombianoToEuro();
                break;

            case "7":
                System.out.println("Retornando ao menu principal...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
}

