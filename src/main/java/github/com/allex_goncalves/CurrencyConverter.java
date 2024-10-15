package github.com.allex_goncalves;

public class CurrencyConverter {

    protected double fetchExchangeRate(String fromCurrency, String toCurrency) {

        double exchangeRate = ApiIntegration.getExchangeRate(fromCurrency, toCurrency);
        return exchangeRate;
    }
}

