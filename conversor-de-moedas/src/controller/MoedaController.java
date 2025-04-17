package controller;

import exceptions.ErroDeConversaoDeMoedaException;
import service.ConversorService;

import java.io.IOException;

public class MoedaController {
    private final ConversorService service;

    public MoedaController(ConversorService service) {
        this.service = service;
    }

    public double getTaxaDeConversao(String moedaOrigem, String moedaDestino)
            throws IOException, InterruptedException, ErroDeConversaoDeMoedaException {
        return service.buscaMoeda(moedaOrigem, moedaDestino);
    }
}