import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import utils.StringUtils;
/**
 * Klasa pobieraj¹ca dokument HTTP z podanego adresu.
 * @author Tomek
 *
 */
public class HttpsGetter {
	/**
	 * Próbuje nawi¹zaæ po³¹czenie ze stron¹ o podanym adresie URL, i pobraæ jej zawartoœæ.
	 * @param urlStr
	 * 			Adres URL strony któr¹ chemy pobraæ
	 * @return	Dokument HTTP znajduj¹cy siê pod podanym adresem, je¿eli po³¹czenie zosta³o poprawnie nawi¹zane
	 * @throws IOException
	 * 			Wyj¹tek wyrzucany je¿eli podczas próby po³¹czenia ze stron¹ o padanym adresie otrzymamy kod zwrotny inyy ni¿ OK (po³¹czenie nie powiod³o siê) 
	 */
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
