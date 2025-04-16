package models;

import java.util.Map;

public class Moeda {
    private String result;
    private String base_code;
    private Map<String, Double> conversion_rates;

    public Moeda(MoedaExchangeRateAPI moedaExchangeRateAPI) {
        this.result = moedaExchangeRateAPI.result();
        this.base_code = moedaExchangeRateAPI.base_code();
        this.conversion_rates = moedaExchangeRateAPI.conversion_rates();
    }

    public Double getTaxa(String codigoMoedaDestino) {
        return conversion_rates.get(codigoMoedaDestino);
    }
}