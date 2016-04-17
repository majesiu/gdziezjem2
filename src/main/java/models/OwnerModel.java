package models;
/**
 * Klasa przechowywuj¹ca dane o w³¹œcicielu lokalu.
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
	 * Has³o.
	 */
	private String password;
	/**
	 * Imiê.
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
	 * Konstruktor który tworzy obiekt bêd¹cy w³aœcicielem.
	 * @param id
	 * 			Numer identyfikacyjny
	 * @param login
	 * 			Login
	 * @param password
	 * 			Has³o
	 * @param name
	 * 			Imiê
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
	 * Zwraca aktulane has³o.
	 * @return Has³o
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * Ustawia has³o na podane.
	 * @param password
	 * 			Has³o
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * Zwraca aktualne imiê.
	 * @return Imiê
	 */
	public String getName() {
		return name;
	}
	/**
	 * Ustawia imiê na podane.
	 * @param name
	 * 			Imiê
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
