import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.net.*;
import java.io.*;
import java.util.Map;


public class MarsWeatherRequest {
    String apiKey = "THeo7ij3hRu2icANJbAjorTTTbJ6BDF6LWPqe9Ms";
    String MarsInsightURL = "https://api.nasa.gov/insight_weather/";
    String InsightEnding = "&feedtype=json&ver=1.0";


    public void getMarsWeather() {
        try {
            URL url = new URL(MarsInsightURL + apiKey + InsightEnding);
            JSONParser parser = new JSONParser();
            BufferedReader data = new BufferedReader(
                    new InputStreamReader(url.openStream()));
            JSONObject simpleJSONObject = (JSONObject) parser.parse(data);

            JSONArray solKeys = (JSONArray) simpleJSONObject.get("sol_keys");
            String key = (String) solKeys.get(0);
            Map sol = (Map) simpleJSONObject.get(key);

            Map pressure = (Map) sol.get("PRE");
            Double averagePressure = (Double) pressure.get("av");

            System.out.println(averagePressure);
        } catch (Exception e) {
            System.out.println("Bruh");
        }
    }
}






