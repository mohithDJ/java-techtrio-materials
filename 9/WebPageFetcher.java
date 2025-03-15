import java.io.*;
import java.net.*;

public class WebPageFetcher {
    public static void main(String[] args) {
        try {
            // URL of the web page to fetch
            @SuppressWarnings("deprecation")
            URL url = new URL("https://open.spotify.com/user/qf04ur7nc6zg2sx6r5pxs9931");
            
            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            // Set the request method (GET by default)
            connection.setRequestMethod("GET");
            
            // Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            
            // Read and display the content of the web page
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            
            // Print the content of the web page
            System.out.println("Web Page Content: ");
            System.out.println(content.toString());
            
            // Close streams
            in.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
