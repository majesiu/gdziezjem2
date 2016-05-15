package modelfactories;

import models.DinnerTypeModel;
import models.OwnerModel;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by root on 15.05.16.
 */
public class DinnerTypeFactoryTest {
    private DinnerTypeFactory factory;
    @Before
    public void setup() {
        factory = new DinnerTypeFactory();
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
        DinnerTypeModel model = factory.createModelFromJSONObject(mock_json);
        verify(mock_json).getString("name");
        verify(mock_json).getInt("id");
        assertNotNull(model);
    }
}