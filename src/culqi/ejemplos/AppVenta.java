package culqi.ejemplos;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;

import culqi.ejemplos.Venta;

import com.google.gson.Gson;

public class AppVenta {

	private static String TOKEN = "e4T8awueorasFvcRvwAyp4JxsuXPeQge";
	private static String CODIGO_COMERCIO = "u3XvS7xeC8eU";
	private static String LLAVE_SECRETA = "FntKssmSKBhJKTTPSYYoN8MCnwE57KjRnhX0vNUN7DI=";
	private static String URLModPago = "https://integ-pago.culqi.com/api/v1/cargos";
	
	public static void main(String[] args) throws Exception{
		Venta venta = nuevaVenta();
		AppVenta app = new AppVenta();
		app.start(venta);
	}
	
	private void start(Venta venta) throws Exception{
		
		Gson gson = new Gson();
		
		String json = gson.toJson(venta);
		
		System.out.println(json);
		
		String respuesta = excutePost(json);
	    
	    System.out.println(respuesta);
	}
	
	private static Venta nuevaVenta(){
		
		SecureRandom secureRandom = new SecureRandom();
	    String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	    char[] VALID_CHARS = abc.toCharArray();
		
	    char[] result = new char[9];

        for(int i = 0; i < 9; i++){
            result[i] = VALID_CHARS[secureRandom.nextInt(VALID_CHARS.length)];
        }

        String nroPedido = String.valueOf(result);
	    
		Venta venta = new Venta();
		venta.setApellidos("Gonzales");
		venta.setCiudad("Lima");
		venta.setCodigo_comercio(CODIGO_COMERCIO);
		venta.setCodigo_pais("PE");
		venta.setCorreo_electronico("lgonzales@me.com");
		venta.setDescripcion("Venta de prueba");
		venta.setDireccion("Av. Arequipa 1123");
		venta.setMoneda("PEN");
		venta.setMonto("1000");
		venta.setNombres("Luis");
		venta.setPedido(nroPedido);
		venta.setTelefono("987654321");
		venta.setToken(TOKEN);
		venta.setUsuario("U001");
		return venta;
	}
	
	private static String excutePost(String json){
		URL url;
		HttpURLConnection connection = null;
		try{
			url = new URL(URLModPago);
			connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setRequestProperty("Authorization", "Bearer " + LLAVE_SECRETA);
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
