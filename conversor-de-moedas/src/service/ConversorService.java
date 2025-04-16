package service;

import exceptions.ErroDeConversaoDeMoedaException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorService {
    private static final String API_KEY = "049f00ec892dac2697d0faa2";
    private static final String URL_BASE = "https://v6.exchangerate-api.com/v6/" +
            API_KEY + "/latest/";

    public String buscaMoeda(String moeda) throws IOException, InterruptedException {
        validarMoeda(moeda);

        String url = URL_BASE + moeda;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    private void validarMoeda(String moeda) {
        if (moeda == null || moeda.length() != 3 || !moeda.matches("[a-zA-Z]+")) {
            throw new ErroDeConversaoDeMoedaException("Código de moeda inválido.");
        }
    }
}
