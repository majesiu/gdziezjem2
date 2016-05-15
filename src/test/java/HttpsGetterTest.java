import org.junit.Before;
import org.mockito.InOrder;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
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
        String result = getter.HttpsGet("https://google.pl");
        assertNotNull(result);
    }
    @org.junit.Test(expected = MalformedURLException.class)
    public void httpsGet_malformed() throws IOException {
        getter.HttpsGet("google.pl");
    }
    @org.junit.Test
    public void HttpsGet_insideTest() throws IOException {
        HttpsURLConnection mock_connection = mock(HttpsURLConnection.class);
        when(mock_connection.getResponseCode()).thenReturn(200);
        when(mock_connection.getInputStream()).thenReturn(new StringBufferInputStream("xx"));
        getter.HttpsGet_inside(mock_connection);
        InOrder inOrder = inOrder(mock_connection);
        inOrder.verify(mock_connection).setRequestMethod(anyString());
        inOrder.verify(mock_connection).getResponseCode();
        inOrder.verify(mock_connection).getInputStream();
        inOrder.verify(mock_connection).disconnect();
    }
}