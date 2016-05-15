package modelfactories;

import models.OwnerModel;
import models.RestaurantModel;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by root on 15.05.16.
 */
public class OwnerFactoryTest {
    private OwnerFactory factory;
    @Before
    public void setup() {
        factory = new OwnerFactory();
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
        OwnerModel model = factory.createModelFromJSONObject(mock_json);
        verify(mock_json).getString("login");
        verify(mock_json).getString("password");
        verify(mock_json).getString("name");
        verify(mock_json).getString("lastname");
        verify(mock_json).getString("phone");
        verify(mock_json).getInt("id");
        assertNotNull(model);
    }

}