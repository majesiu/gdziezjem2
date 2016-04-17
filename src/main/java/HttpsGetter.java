import utils.StringUtils;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;

public class HttpsGetter {
	public static String HttpsGet(String urlStr) throws IOException{
		URL url = new URL(urlStr);
		HttpsURLConnection connection = (HttpsURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		
		if(connection.getResponseCode() != 200){
			throw new IOException(connection.getResponseMessage());
		}
		String responseData = StringUtils.getStringFromInputStream(connection.getInputStream());
		connection.disconnect();
		return responseData;
	}
}
