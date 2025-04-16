package controller;

import com.google.gson.Gson;
import exceptions.ErroDeConversaoDeMoedaException;
import models.Moeda;
import models.MoedaExchangeRateAPI;
import service.ConversorService;

import java.io.IOException;

public class MoedaController {
    private final ConversorService service;
    private final Gson gson;

    public MoedaController(ConversorService service, Gson gson) {
        this.service = service;
        this.gson = gson;
    }

    public Moeda buscaValorMoeda(String codigoMoeda) throws
            IOException, InterruptedException, ErroDeConversaoDeMoedaException {
        String json = service.buscaMoeda(codigoMoeda);
        MoedaExchangeRateAPI moedaExchangeRateAPI = gson.fromJson(json, MoedaExchangeRateAPI.class);
        return new Moeda(moedaExchangeRateAPI);
    }
}
