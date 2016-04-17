package modelfactories;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.util.ArrayList;
import java.util.List;

public abstract class ModelFactory<T> {
	public List<T> createFromJSON(String jsonString)throws JSONException{
		JSONArray json = new JSONArray(new JSONTokener(jsonString));
		List<T> models = new ArrayList<>();
		for(int i = 0; i < json.length(); i++){
			T model = createModelFromJSONObject(json.getJSONObject(i));
			models.add(model);
		}			
		return models;
	}
	
	public abstract T createModelFromJSONObject(JSONObject o) throws JSONException ;
}
