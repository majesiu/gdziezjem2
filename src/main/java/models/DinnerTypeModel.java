package models;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/**
 * Klasa przechowywuj¹ca dane o posi³ku.
 * @author Tomek
 */
public class DinnerTypeModel {
	/**
	 * Numer identyfikacyjny.
	 */
	private int id;
	/**
	 * Nazwa posi³ku.
	 */
	private String name;
	/**
	 * Konstruktor który tworzy obiekt bêd¹cy posi³kiem.
	 * @param id
	 * 			Numer identyfikacyjny
	 * @param name
	 * 			Nazwa posi³ku
	 */
	public DinnerTypeModel(int id, String name){
		setId(id);
		setName(name);
	}
	/**
	 * @return Numer identyfikacyjny posi³ku
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
	 * @return Nazwê posi³ku
	 */
	public String getName() {
		return name;
	}
	/**
	 * Ustawia nazwê posi³ku na podan¹.
	 * @param name
	 * 			Nazwa posi³ku
	 */
	public void setName(String name) {
		this.name = name;
	}
}
