package modelfactories;

import models.RestaurantModel;
import org.json.JSONException;
import org.json.JSONObject;
/**
 * Klasa tworząca obiekty typu RestaurantModel, korzystająca z wzorca projektowego fabryki.
 * @author Tomek
 * @see RestaurantModel
 * @see ModelFactory
 */
public class RestaurantFactory extends ModelFactory<RestaurantModel> {
	/**
	 * Tworzy obiekt typu RestaurantModel korzystając z obiektu typu JSONObject
	 * 
	 * @param o
	 * 			Obiekt JSON
	 * @return 
	 * 			Obiekt typu RestaurantModel
	 */
	@Override
	public RestaurantModel createModelFromJSONObject(JSONObject o) throws JSONException {
		int id = o.getInt("id");
		String name = o.getString("name");
		String address = o.getString("address");
		String openingHoursWorkDays = o.getString("openingHoursWorkDays");
		String openingHoursWeekend = o.getString("openingHoursWeekend");
		String description = o.getString("description");
		int ownerId = o.getInt("owner");
		
		RestaurantModel model = new RestaurantModel(id, name, address, openingHoursWorkDays, openingHoursWeekend, description, ownerId);
		return model;
	}

}
