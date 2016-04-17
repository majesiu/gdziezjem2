package models;
/**
 * Klasa przechowywująca dane o właścicielu lokalu.
 * @author Tomek
 */
public class OwnerModel {
	/**
	 * Numer identyfikacyjny.
	 */
	private int id;
	/**
	 * Login.
	 */
	private String login;
	/**
	 * Hasło.
	 */
	private String password;
	/**
	 * Imię.
	 */
	private String name;
	/**
	 * Nazwisko.
	 */
	private String lastName;
	/**
	 * Numer telefonu.
	 */
	private String phoneNumber;
	
	/**
	 * Konstruktor który tworzy obiekt będący właścicielem.
	 * @param id
	 * 			Numer identyfikacyjny
	 * @param login
	 * 			Login
	 * @param password
	 * 			Hasło
	 * @param name
	 * 			Imię
	 * @param lastName
	 * 			Nazwisko
	 * @param phoneNumber
	 * 			Numer telefonu
	 */
	public OwnerModel(int id, String login, String password, String name, String lastName, String phoneNumber){
		setId(id);
		setLogin(login);
		setPassword(password);
		setName(name);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
	}
	/**
	 * Zwraca aktualny numer identyfikacyjny.
	 * @return Numer identyfikacyjny
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
	 * Zwraca aktualny login. 
	 * @return Login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * Ustawia login na podany.
	 * @param login
	 * 			Login
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * Zwraca aktulane hasło.
	 * @return Hasło
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * Ustawia hasło na podane.
	 * @param password
	 * 			Hasło
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * Zwraca aktualne imię.
	 * @return Imię
	 */
	public String getName() {
		return name;
	}
	/**
	 * Ustawia imię na podane.
	 * @param name
	 * 			Imię
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Zwraca aktualne nazwisko.
	 * @return Nazwisko
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * Ustawia nazwisko na podane.
	 * @param lastName
	 * 			Nazwisko
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * Zwraca aktualny numer telefonu.
	 * @return Numer telefonu
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * Ustawia numer telefonu na podany.
	 * @param phoneNumber
	 * 			Numer telefonu
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
