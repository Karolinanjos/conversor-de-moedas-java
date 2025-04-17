package service;

import com.google.gson.Gson;
import exceptions.ErroDeConversaoDeMoedaException;
import models.Moeda;
import models.MoedaExchangeRateAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorService {
    private static final String API_KEY = "049f00ec892dac2697d0faa2";
    private static final String URL_BASE = "https://v6.exchangerate-api.com/v6/" +
            API_KEY + "/latest/";

    public Double buscaMoeda(String moedaBase, String moedaDestino) throws IOException,
            InterruptedException {
        String url = URL_BASE + moedaBase;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String jsonResponse = response.body();

        // Verifique o status da resposta
        if (response.statusCode() != 200) {
            throw new ErroDeConversaoDeMoedaException("Falha na resposta da API: " +
                    response.statusCode() + " - " + response.body());
        }

        Gson gson = new Gson();
        MoedaExchangeRateAPI moedaExchangeRateAPI = gson.fromJson(jsonResponse, MoedaExchangeRateAPI.class);

        Moeda moeda = new Moeda(moedaExchangeRateAPI);

        Double taxaConversao = moeda.getTaxa(moedaDestino);

        if (taxaConversao == null) {
            throw new ErroDeConversaoDeMoedaException("Moeda de destino não encontrada.");
        }

        return taxaConversao;
    }
}