import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import utils.StringUtils;
/**
 * Klasa pobieraj�ca dokument HTTP z podanego adresu.
 * @author Tomek
 *
 */
public class HttpsGetter {
	/**
	 * Pr�buje nawi�za� po��czenie ze stron� o podanym adresie URL, i pobra� jej zawarto��.
	 * @param urlStr
	 * 			Adres URL strony kt�r� chemy pobra�
	 * @return	Dokument HTTP znajduj�cy si� pod podanym adresem, je�eli po��czenie zosta�o poprawnie nawi�zane
	 * @throws IOException
	 * 			Wyj�tek wyrzucany je�eli podczas pr�by po��czenia ze stron� o padanym adresie otrzymamy kod zwrotny inyy ni� OK (po��czenie nie powiod�o si�) 
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
