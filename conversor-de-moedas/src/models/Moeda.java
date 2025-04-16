package models;

public class Moeda {
    private String result;
    private String base_code;

    public Moeda(MoedaExchangeRateAPI moedaExchangeRateAPI) {
        this.result = moedaExchangeRateAPI.result();
        this.base_code = moedaExchangeRateAPI.base_code();
    }

    @Override
    public String toString() {
        return "Moeda{" +
                "result='" + result + '\'' +
                ", base_code='" + base_code + '\'' +
                '}';
    }
}
