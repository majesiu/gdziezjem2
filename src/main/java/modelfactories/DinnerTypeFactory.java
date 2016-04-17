package modelfactories;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import models.DinnerTypeModel;
/**
 * Klasa tworząca obiekty typu DinnerTypeModel, korzystająca z wzorca projektowego fabryki
 * @author Tomek
 * @see DinnerTypeModel
 * @see ModelFactory
 */
public class DinnerTypeFactory extends ModelFactory<DinnerTypeModel> {
	
	/**
	 * Tworzy obiekt typu DinnerTypeModel korzystając z obiektu typu JSONObject
	 * 
	 * @param o
	 * 			Obiekt JSON
	 * @return 
	 * 			Obiekt typu DinnerTypeModel
	 */
	@Override
	public DinnerTypeModel createModelFromJSONObject(JSONObject o) throws JSONException {
		int id = o.getInt("id");
		String name = o.getString("name");
		DinnerTypeModel model = new DinnerTypeModel(id, name);
		return model;
	}
}
