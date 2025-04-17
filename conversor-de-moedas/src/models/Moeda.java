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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Resultado: ").append(result).append("\n");
        sb.append("Base Code: ").append(base_code).append("\n");
        sb.append("Taxas de conversão: \n");

        for (Map.Entry<String, Double> entry : conversion_rates.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }

        return sb.toString();
    }
}