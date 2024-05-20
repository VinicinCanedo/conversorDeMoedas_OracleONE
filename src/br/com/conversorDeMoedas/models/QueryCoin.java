package br.com.conversorDeMoedas.models;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class QueryCoin {
    private static final String apiKey = "06c1e53b3617c42fe6a9a023";
    private static final String baseUrl = "https://v6.exchangerate-api.com/v6/";

    public double getConversionsRate (String fromCurrency, String toCurrency){
        try {
            URI coinUri = URI.create(baseUrl + apiKey + "/latest/" + fromCurrency);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(coinUri)
                    .build();


            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

            return
                    conversionRates.get(String.valueOf(toCurrency)).getAsDouble();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }




}
