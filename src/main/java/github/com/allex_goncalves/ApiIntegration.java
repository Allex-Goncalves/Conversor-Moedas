package github.com.allex_goncalves;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ApiIntegration {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/";

    public static double getExchangeRate(String fromCurrency, String toCurrency) {
        try {

            URL url = new URL(API_URL + fromCurrency + "/" + toCurrency);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("Erro na API: " + responseCode);
            } else {
                Scanner scanner = new Scanner(url.openStream());
                String inline = "";
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }
                scanner.close();

                JsonObject jsonObject = JsonParser.parseString(inline).getAsJsonObject();

                return jsonObject.get("conversion_rate").getAsDouble();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}

