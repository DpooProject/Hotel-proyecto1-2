package model;


public class Service {
	String name;
	int rate;
	//constructor
	public Service(String name, int rate) {
		super();
		this.name = name;
		this.rate = rate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
}
  