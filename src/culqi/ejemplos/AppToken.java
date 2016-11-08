package culqi.ejemplos;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class AppToken {

	private static String URLModPago = "https://integ-pago.culqi.com/api/v1/tokens";
	private static String CODIGO_COMERCIO = "u3XvS7xeC8eU";
	
	public static void main(String[] args) throws Exception {
		Token token = nuevoToken();
		AppToken appToken = new AppToken();
		appToken.start(token);
	}
	
	private void start(Token token) throws Exception{
		
		Gson gson = new Gson();
		
		String json = gson.toJson(token);
		
		System.out.println(json);
		
	    String respuesta = excutePost(json);
	    
	    System.out.println(respuesta);
	}
	
	private static Token nuevoToken(){
	    
		Token token = new Token();
		token.setCorreo_electronico("lgonzales@me.com");
		token.setNombre("Luis");
		token.setApellido("Gonzales");
		token.setNumero("4111111111111111");
		token.setCvv("123");
		token.setM_exp("9");
		token.setA_exp("2019");
		token.setGuardar(true);
		
		return token;
	}
	
	private static String excutePost(String json){
		URL url;
		HttpURLConnection connection = null;
		try{
			url = new URL(URLModPago);
			connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setRequestProperty("Authorization", "Bearer " + CODIGO_COMERCIO);
			connection.setDoInput(true);
			connection.setDoOutput(true);
			
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.writeBytes(json);
			wr.flush();
			wr.close();
			
			InputStream is = connection.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			
			String line;
		      StringBuffer response = new StringBuffer(); 
		      while((line = rd.readLine()) != null) {
		        response.append(line);
		        response.append('\r');
		      }
		    rd.close();
		    return response.toString();
		} catch(Exception e){
			e.printStackTrace();
			return null;
		} finally {
			if(connection != null) {
		        connection.disconnect();
		    }
		}
	}
}
