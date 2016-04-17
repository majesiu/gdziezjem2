package modelfactories;

import models.OwnerModel;
import org.json.JSONException;
import org.json.JSONObject;

public class OwnerFactory extends ModelFactory<OwnerModel> {

	@Override
	public OwnerModel createModelFromJSONObject(JSONObject o) throws JSONException {
		int id = o.getInt("id");
		String login = o.getString("login");
		String password = o.getString("password");
		String name = o.getString("name");
		String lastName = o.getString("lastname");
		String phoneNumber = o.getString("phone");
		
		OwnerModel model = new OwnerModel(id, login, password, name, lastName, phoneNumber);
		return model;
	}
	
}
