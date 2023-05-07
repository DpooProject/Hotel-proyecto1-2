package model;

import java.time.LocalDate;
import java.util.List;
import java.time.DayOfWeek;

public class Rate {
    private LocalDate startDate;
    private LocalDate endDate;
    private List<DayOfWeek> days;
    private double precio;
    //Constructor
	public Rate(LocalDate startDate, LocalDate endDate, List<DayOfWeek> days, double precio) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.days = days;
		this.precio = precio;
	}
    // Getters, setters y otros métodos útiles
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public List<DayOfWeek> getDays() {
		return days;
	}
	public void setDays(List<DayOfWeek> days) {
		this.days = days;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}




	
}
