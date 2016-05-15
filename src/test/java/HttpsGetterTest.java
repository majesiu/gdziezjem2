import org.junit.Before;
import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by root on 15.05.16.
 */
public class HttpsGetterTest {
    HttpsGetter getter;
    @Before
    public void setup() {
        HttpsGetter getter = new HttpsGetter();
    }
    @org.junit.Test(expected = IOException.class)
    public void httpsGet_unknowProtocol() throws Exception {
        getter.HttpsGet("terlnet://Wrong_rl");
    }
    @org.junit.Test
    public void httpsGet_insideValidUrl() throws IOException {
        ///HttpsURLConnection mock_connection = new mock(HttpsURLConnection.class); ///??
        String result = getter.HttpsGet("https://google.pl");
        assertNotNull(result);
    }
    @org.junit.Test(expected = MalformedURLException.class)
    public void httpsGet_malformed() throws IOException {
        getter.HttpsGet("google.pl");
    }

}