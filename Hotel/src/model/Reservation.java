package model;

public class Reservation {
    //Atributes
    private String id;
    private String nombre;
    private int cantidad;
    private int dias;
    private int dia;
    private int mes;
    private int ano;
    private boolean llegada;
    private boolean salida;
    

    public Reservation(String theid, String thenombre, int thecantidad, int thedias, int thedia, int themes, 
                        int theano, boolean thellegada, boolean thesalida){
        this.id=theid;
        this.nombre=thenombre;
        this.cantidad=thecantidad;
        this.dias=thedias;
        this.dia=thedia;
        this.mes=themes;
        this.ano=theano;
        this.llegada=thellegada;
        this.salida=thesalida;

    }
    //Getters

    public String getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public int getCantidad(){
        return cantidad;
    }

    public int getDias(){
        return dias;
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    public boolean getLlegada(){
    return llegada;
    }

    public boolean getSalida(){
        return salida;
        }

    //Setters

    public void setId(String id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public void setDias(int dias){
        this.dias = dias;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }

    public void setLlegada(Boolean llegada){
        this.llegada = llegada;
    }

    public void setSalida(Boolean salida){
        this.salida = salida;
    }

}

