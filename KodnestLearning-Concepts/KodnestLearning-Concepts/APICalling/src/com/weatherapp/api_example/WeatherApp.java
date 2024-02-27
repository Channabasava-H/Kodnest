package com.weatherapp.api_example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class WeatherApp {

    private static final String API_KEY = "f451a94dd4ed12073cd94ccb4b5d9a3b";
//"8304c4de0dd6e49529fc964274f3d3a6";
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather";

    public static void main(String[] args) {
        String city = null;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the City name : ");
        city=scanner.next();
        scanner.close();
        String apiUrl = String.format("%s?q=%s&units=metric&appid=%s", API_URL, city, API_KEY);
        
        

        try {
            String jsonResponse = getWeatherData(apiUrl);
            displayWeatherDetails(jsonResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getWeatherData(String apiUrl) throws IOException {
        
    	URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Set request method
        connection.setRequestMethod("GET");

        // Get response code
        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            // Read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return response.toString();
        } else {
            throw new IOException("Failed to retrieve weather data. Response Code: " + responseCode);
        }
        
    }

    private static void displayWeatherDetails(String jsonResponse) {
        // Parse JSON response and display relevant weather details
        // You can use a JSON parsing library like Jackson or Gson for this purpose
        // For simplicity, I'll just print the raw JSON response
    	JSONObject jsonObject = new JSONObject(jsonResponse);

        // Extract relevant information
    	//String weather=jsonObject.getJSONObject("weather").getString("main");
    	JSONArray weatherArray = jsonObject.getJSONArray("weather");
        if (weatherArray.length() > 0) {
            String weatherCondition = weatherArray.getJSONObject(0).getString("description");
            System.out.println("Weather Condition: " + weatherCondition);
        } else {
            System.out.println("Weather Condition information not available.");
        }
    	
        double temperature = jsonObject.getJSONObject("main").getDouble("temp");
        double feels_like = jsonObject.getJSONObject("main").getDouble("feels_like");
        double max_temp=jsonObject.getJSONObject("main").getDouble("temp_max");
        double min_temp=jsonObject.getJSONObject("main").getDouble("temp_min");
        double humidity = jsonObject.getJSONObject("main").getDouble("humidity");
        double pressure =jsonObject.getJSONObject("main").getDouble("pressure");
        // Display weather details
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Feels like:" + feels_like + "°C");
        System.out.println("Minimum Temperature:" + min_temp + "°C");
        System.out.println("Maximum Temperature:" + max_temp + "°C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Pressure: " + pressure+"hPa");
        
        }
}
