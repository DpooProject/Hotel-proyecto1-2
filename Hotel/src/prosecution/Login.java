package prosecution;

public class Login {
	
	
	public String hacerlogin (String nombre, String password, GeneralData Userdata) {
			String tipo = Userdata.getUserType(nombre, password);
		return tipo;
		}
	

}
