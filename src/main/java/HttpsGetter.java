import utils.StringUtils;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;
/**
 * Klasa pobierająca dokument HTTP z podanego adresu.
 * @author Tomek
 *
 */
public class HttpsGetter {
	/**
	 * Próbuje nawiązać połączenie ze stroną o podanym adresie URL, i pobrać jej zawartość.
	 * @param urlStr
	 * 			Adres URL strony którą chemy pobrać
	 * @return	Dokument HTTP znajdujący się pod podanym adresem, jeżeli połączenie zostało poprawnie nawiązane
	 * @throws IOException
	 * 			Wyjątek wyrzucany jeżeli podczas próby połączenia ze stroną o padanym adresie otrzymamy kod zwrotny inny niż OK (połączenie nie powiodło się) 
	 */
	public static String HttpsGet(String urlStr) throws IOException {
		URL url = new URL(urlStr);
		HttpsURLConnection connection = (HttpsURLConnection)url.openConnection();
		return HttpsGet_inside(connection);
	}
	public static String HttpsGet_inside(HttpsURLConnection connection) throws IOException{ // do mocka
		connection.setRequestMethod("GET");
		if(connection.getResponseCode() != 200){
			throw new IOException(connection.getResponseMessage());
		}
		String responseData = StringUtils.getStringFromInputStream(connection.getInputStream());
		connection.disconnect();
		System.out.println("XX)");
		return responseData;
	}
}
