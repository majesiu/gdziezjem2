package modelfactories;

import org.json.JSONException;
import org.json.JSONObject;

import models.DinnerTypeModel;
import models.OwnerModel;
/**
 * Klasa tworząca obiekty typu OwnerModel, korzystająca z wzorca projektowego fabryki.
 * @author Tomek
 * @see OwnerModel
 * @see ModelFactory
 */
public class OwnerFactory extends ModelFactory<OwnerModel>{
	/**
	 * Tworzy obiekt typu OwnerModel korzystając z obiektu typu JSONObject
	 * 
	 * @param o
	 * 			Obiekt JSON
	 * @return 
	 * 			Obiekt typu OwnerModel
	 */
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
