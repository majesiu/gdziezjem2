package models;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/**
 * Klasa przechowywująca dane o posiłku.
 * @author Tomek
 */
public class DinnerTypeModel {
	/**
	 * Numer identyfikacyjny.
	 */
	private int id;
	/**
	 * Nazwa posiłku.
	 */
	private String name;
	/**
	 * Konstruktor który tworzy obiekt będący posiłkiem.
	 * @param id
	 * 			Numer identyfikacyjny
	 * @param name
	 * 			Nazwa posiłku
	 */
	public DinnerTypeModel(int id, String name){
		setId(id);
		setName(name);
	}
	/**
	 * @return Numer identyfikacyjny posiłku
	 */
	public int getId() {
		return id;
	}
	/**
	 * Ustawia numer identyfikacyjny na podany.
	 * @param id
	 * 			Numer identyfikacyjny
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return Nazwę posiłku
	 */
	public String getName() {
		return name;
	}
	/**
	 * Ustawia nazwę posiłku na podaną.
	 * @param name
	 * 			Nazwa posiłku
	 */
	public void setName(String name) {
		this.name = name;
	}
}
