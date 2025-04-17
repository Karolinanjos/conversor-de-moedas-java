package application;

import com.google.gson.Gson;
import controller.MoedaController;
import exceptions.ErroDeConversaoDeMoedaException;
import service.ConversorService;
import utils.GsonConfig;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gson gson = GsonConfig.getGsonInstance();
        MoedaController controller = new MoedaController(new ConversorService());

        System.out.println("\nSeja bem-vindo(a) ano Conversor de Moedas!");

        int opcao = 0;

        while (opcao != 7) {
            System.out.print("\n***************************************");
            System.out.println("\nSelecione uma opção");
            System.out.println("1) Dólar(USD) -> Peso argentino(ARS)");
            System.out.println("2) Peso argentino(ARS) -> Dólar(USD)");
            System.out.println("3) Dólar(USD) -> Real brasileiro(BRL)");
            System.out.println("4) Real brasileiro(BRL) -> Dólar(USD)");
            System.out.println("5) Dólar(USD) -> Peso colombiano(COP)");
            System.out.println("6) Peso colombiano(COP) -> Dólar(USD)");
            System.out.println("7) Sair");
            System.out.println("***************************************");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            String moedaOrigem = "";
            String moedaDestino = "";

            switch (opcao) {
                case 1 -> { moedaOrigem = "USD"; moedaDestino = "ARS"; }
                case 2 -> { moedaOrigem = "ARS"; moedaDestino = "USD"; }
                case 3 -> { moedaOrigem = "USD"; moedaDestino = "BRL"; }
                case 4 -> { moedaOrigem = "BRL"; moedaDestino = "USD"; }
                case 5 -> { moedaOrigem = "USD"; moedaDestino = "COP"; }
                case 6 -> { moedaOrigem = "COP"; moedaDestino = "USD"; }
                case 7 -> {
                    System.out.println("Encerrando sistema...");
                    continue;
                }
                default -> {
                    System.out.println("Opção inválida!");
                    continue;
                }
            }

            System.out.print("\nDigite o valor para converter:  ");
            double valorEntrada = scanner.nextDouble();

            try {
                double taxa = controller.getTaxaDeConversao(moedaOrigem, moedaDestino);

                double convertido = valorEntrada * taxa;

                System.out.printf("Taxa utilizada: %.4f%n", taxa);
                System.out.printf("Valor de entrada: %.2f %s%n", valorEntrada, moedaOrigem);
                System.out.printf("Valor convertido: %.2f %s%n", convertido, moedaDestino);
            } catch (ErroDeConversaoDeMoedaException e) {
                System.out.println("Erro ao converter moeda: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }
        scanner.close();
    }
}