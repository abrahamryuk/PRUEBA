
package constructores;


public class Constructores {

    
    public static void main(String[] args) {
        coche toyota=new coche(50,0,"Tsuru");
        
        
        System.out.println("Mi coche es un: "+toyota.getNombre()+" ,tiene una velocidad de: "+toyota.getVelocidad());
      //ACCION=
        toyota.frenar(); 
      ////Despues imrimimos la nueva velocidad  
        System.out.println("Si mi coche frena por completo mi velocidad sera:"+toyota.getVelocidad());
            
     //ACCION
     toyota.acelerar(20);
        System.out.println("Si aceleramos tendremos una velocidad de:"+toyota.getVelocidad());
    
        toyota.acelerar(40);
        System.out.println("Si volvemos a acelerar mas entonces, velocidad:"+toyota.getVelocidad());
    
    }
    
}
