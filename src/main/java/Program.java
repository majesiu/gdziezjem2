import modelfactories.DinnerTypeFactory;
import modelfactories.OwnerFactory;
import modelfactories.RestaurantFactory;
import models.DinnerTypeModel;
import models.OwnerModel;
import models.RestaurantModel;
import org.json.JSONException;

import java.io.IOException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		try {
			String dinnerTypesJSON = HttpsGetter.HttpsGet("https://gdziezjem.herokuapp.com/api/gdziezjem/dinnerTypes?format=json");
			List<DinnerTypeModel> dinnerTypes = new DinnerTypeFactory().createFromJSON(dinnerTypesJSON);
			dinnerTypes.forEach(e -> System.out.println(e.getName()));
		
			System.out.println("\n\n");
			
			String ownersJSON = HttpsGetter.HttpsGet("https://gdziezjem.herokuapp.com/api/gdziezjem/owners?format=json");
			List<OwnerModel> owners = new OwnerFactory().createFromJSON(ownersJSON);
			owners.forEach(e -> System.out.println(e.getName()));
			
			System.out.println("\n\n");
			
			String restaurantsJSON = HttpsGetter.HttpsGet("https://gdziezjem.herokuapp.com/api/gdziezjem/restaurants?format=json");
			List<RestaurantModel> restaurants = new RestaurantFactory().createFromJSON(restaurantsJSON);
			restaurants.forEach(e -> System.out.println(e.getName()));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
