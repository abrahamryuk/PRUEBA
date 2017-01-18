
package constructores;


public class coche {
    private int velocidad,aceleracion;
    private String nombre;

    //constructor de una clase y sus caracteristicas
    public coche(int velocidad,int aceleracion,String nombre){
        this.velocidad=velocidad;
        this.nombre=nombre;
        this.aceleracion=aceleracion;
    }
    
    



    //set ang get
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 ///////////////////////////////////////////////////////////////////
    
    //constructor pero con accion
    public void acelerar(int aceleracion){
        this.aceleracion=aceleracion;
        velocidad+= this.aceleracion;
    } 
    
    public void frenar(){
        velocidad=0;
    }

}
