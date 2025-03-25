import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class WeatherApp {

    public static void main(String[] args) {
        // Replace with a public API key (e.g., from OpenWeatherMap)
        String apiKey = "your_api_key";
        String city = "London"; // Change to desired city
        String url = String.format("https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric", city, apiKey);

        try {
            // Create an HTTP client
            HttpClient client = HttpClient.newHttpClient();

            // Build the HTTP request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            // Send the request and get the response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Parse the JSON response
            JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();

            // Extract and display structured data
            System.out.println("Weather Data for " + city);
            System.out.println("--------------------------");
            System.out.println("Temperature: " + jsonResponse.getAsJsonObject("main").get("temp").getAsDouble() + "°C");
            System.out.println("Humidity: " + jsonResponse.getAsJsonObject("main").get("humidity").getAsInt() + "%");
            System.out.println("Weather: " + jsonResponse.getAsJsonArray("weather").get(0).getAsJsonObject().get("description").getAsString());
        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
