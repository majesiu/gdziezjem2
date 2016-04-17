package modelfactories;

import models.DinnerTypeModel;
import org.json.JSONException;
import org.json.JSONObject;

public class DinnerTypeFactory extends ModelFactory<DinnerTypeModel> {
	
	@Override
	public DinnerTypeModel createModelFromJSONObject(JSONObject o) throws JSONException {
		int id = o.getInt("id");
		String name = o.getString("name");
		DinnerTypeModel model = new DinnerTypeModel(id, name);
		return model;
	}
}
