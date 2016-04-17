package models;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/**
 * Klasa przechowywuj�ca dane o posi�ku.
 * @author Tomek
 */
public class DinnerTypeModel {
	/**
	 * Numer identyfikacyjny.
	 */
	private int id;
	/**
	 * Nazwa posi�ku.
	 */
	private String name;
	/**
	 * Konstruktor kt�ry tworzy obiekt b�d�cy posi�kiem.
	 * @param id
	 * 			Numer identyfikacyjny
	 * @param name
	 * 			Nazwa posi�ku
	 */
	public DinnerTypeModel(int id, String name){
		setId(id);
		setName(name);
	}
	/**
	 * @return Numer identyfikacyjny posi�ku
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
	 * @return Nazw� posi�ku
	 */
	public String getName() {
		return name;
	}
	/**
	 * Ustawia nazw� posi�ku na podan�.
	 * @param name
	 * 			Nazwa posi�ku
	 */
	public void setName(String name) {
		this.name = name;
	}
}
