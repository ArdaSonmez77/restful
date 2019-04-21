import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import com.google.gson.Gson;



public class frontend {

	public static void main(String[] args){
		try {
String bck="http://localhost:8080/UserManagement/rest/UserService/users";
			URL url = new URL(bck);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));
			

			String output;
	
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			break;
			}
			ArrayList<Data> prd= new ArrayList<Data>();

			Gson g = new Gson(); 
			Data p = g.fromJson(output, Data.class);
			
//outputu kurtardým þimdi   onu array olarak çýkar þuan type json olaraak duruyor
			
			
			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
	}
	
}
