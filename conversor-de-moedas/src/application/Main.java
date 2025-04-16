package application;

import com.google.gson.Gson;
import controller.MoedaController;
import service.ConversorService;
import utils.GsonConfig;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moeda = "";

        Gson gson = GsonConfig.getGsonInstance();
        MoedaController controller = new MoedaController(new ConversorService(), gson);

        scanner.close();
    }
}
