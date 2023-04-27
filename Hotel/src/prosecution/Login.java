package prosecution;

public class Login {
	
	
	public String hacerlogin (String nombre, String password) {
		GeneralData userdata=new GeneralData();	
		String tipo = userdata.getUserType(nombre, password);
		return tipo;
		}
	

}
