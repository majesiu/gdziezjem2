import java.io.IOException;
import java.util.List;

import org.json.JSONException;

import modelfactories.DinnerTypeFactory;
import modelfactories.OwnerFactory;
import modelfactories.RestaurantFactory;
import models.DinnerTypeModel;
import models.OwnerModel;
import models.RestaurantModel;
/**
 * Głowna klasa programu.
 * @author Tomek
 *
 */
public class Program {
	/**
	 * Główna funkcja programu, uruchamiana przy jego starcie. Próbuje pobrać dane na temat typów posiłków, lokali i ich właścicieli z serwera aplikacji,
	 * stworzyć kontenery w których może przechować obiekty przechowywujące wcześniej pobrane dane, a następnie wypisać informacje zgromadzone w kontenerach. 
	 * W razie niepowodzenia łapie wyjątki i wypisuje stos na konsolę. 
	 * @param args 
	 * 			Argumenty przekazywane przy starcie programu.
	 */
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
