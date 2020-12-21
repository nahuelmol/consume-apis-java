package restclient;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetClientGet {
    public static void main(String[] args) {
        try {
          int codeResp = 0;
          
          URL url = new URL("http://localhost:3002/RestWebserviceDemo/rest/json/product/dynamicData?size=5");//your url i.e fetch data from .
          HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            
          conn.setRequestMethod("GET");
          conn.setRequestProperty("Accept", "application/json");
          
          codeResp = conn.getResponseCode();
          
          if (codeResp != 200) {
            throw new RuntimeException("Failed:HTTP Error code: "
                        + codeResp;
          }
            
          InputStreamReader in = new InputStreamReader(conn.getInputStream());
          BufferedReader br = new BufferedReader(in);
            
          String output;
          while ((output = br.readLine()) != null) {
              System.out.println(output);
          }
          conn.disconnect();

        }catch (Exception e) {
          System.out.println("Exception in NetClientGet:- " + e);
        }
    }
}