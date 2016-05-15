package modelfactories;

import models.RestaurantModel;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

/**
 * Created by root on 15.05.16.
 */
public class RestaurantFactoryTest {
    private RestaurantFactory factory;
    @Before
    public void setup() {
        factory = new RestaurantFactory();
    }
    @Test(expected = NullPointerException.class)
    public void createModelFromJSONObject() throws Exception {
        factory.createModelFromJSONObject(null);
    }
    @Test(expected = JSONException.class)
    public void createModelFromJSONObject2() {
        factory.createModelFromJSONObject(new JSONObject());
    }
    @Test
    public void createModelFromJSONObject3() {
        JSONObject mock_json = mock(JSONObject.class);
        when(mock_json.getString(anyString())).thenReturn("xx");
        when(mock_json.getInt(anyString())).thenReturn(1);
        RestaurantModel model = factory.createModelFromJSONObject(mock_json);
        verify(mock_json, times(5)).getString(anyString());
        verify(mock_json, times(2)).getInt(anyString());
        assertNotNull(model);
    }

}