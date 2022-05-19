import java.util.ArrayList;

public class Cliente {
    private String nombre;
    //private Alquiler[] salida;
    private ArrayList<Alquiler> alquileres = new ArrayList<>();
    private int posicion; //indica la cantidad de peliculas que ha alquilado <5
    
    
    public Cliente(String nombre) {
        this.nombre=nombre;
        //Máximo 5 alquileres
       // this.salida=new Alquiler[5];
       // this.posicion=0;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    public Alquiler[] getSalida() {
  //      return salida;
  //  }

//    public void setSalida(Alquiler[] salida) {
 //       this.salida = salida;
  //  }
/*
    public void generarTicket() {
        double precio=0;
        int contadorPuntos=0;
        double importeTotal=0;
        System.out.println(this.getNombre());
        
        for (int i = 0; i < this.posicion; i++) {
            //Según el tipo del DVD calculo el precio de alquiler
            contadorPuntos++;
            switch(this.getSalida()[i].getAlquilado().getTipo()) {
                case DVD.NORMAL:
                    precio=2*this.getSalida()[i].getTiempo();
                    break;
                case DVD.INFANTIL:
                    precio=1.5*this.getSalida()[i].getTiempo();
                    break;
                case DVD.NOVEDAD:
                    precio=3*this.getSalida()[i].getTiempo();
                    if(this.getSalida()[i].getTiempo()>1)
                        contadorPuntos++;
                    break;
            
            }
                System.out.println("\t"+this.getSalida()[i].getAlquilado()+" "+precio+"€");
                importeTotal=importeTotal+precio;
        }
        
        System.out.println("IMPORTE TOTAL: "+importeTotal+"€");
        System.out.println("Numero de puntos: "+contadorPuntos);
    }
    
    public void nuevoAlquiler(Alquiler a) {
        this.salida[posicion]=a;
        this.posicion++;
    }
 */   
  public void nuevoAlquiler2(Alquiler alquiler) {
        
        alquileres.add(alquiler);

    }
  
  public void generarTickets() {
       
      Cliente c = new Cliente("Juan Fernandez");
      System.out.println("Cliente :");
      System.out.println(c.getNombre());

          double importe1 =0 ,importe2 = 0,importe3 = 0; 
          String importeTotal= null;;
          int bonificacion =0;
      
        
          
      for (int i =0; i<alquileres.size(); i++) {
          
          bonificacion++;
          
          if (alquileres.get(i).getAlquilado().getTipo() == 1) {
              
          
              importe1 = importe1 + 3*alquileres.get(i).getTiempo();
              System.out.println(alquileres.get(i).getAlquilado().getTitulo()+"  "+importe1+"€");
              bonificacion++;
              
          }else if (alquileres.get(i).getAlquilado().getTipo() ==0) {
              
              importe2 = importe2 + 2*alquileres.get(i).getTiempo();
              System.out.println(alquileres.get(i).getAlquilado().getTitulo()+"  "+importe2+"€");
             
          }else if (alquileres.get(i).getAlquilado().getTipo() ==2) {
             
       
              importe3 = importe3 + 1.5*alquileres.get(i).getTiempo();
              System.out.println(alquileres.get(i).getAlquilado().getTitulo()+"  "+importe3+"€");
             
          }
          
          importeTotal = importe1+importe2+importe3+"€";    
   
        /*
          Alquiler a = new Alquiler();    
          DVD dvd =new DVD();
          
          dvd.setTitulo(alquileres.get(i).getAlquilado().getTitulo());
          dvd.setTipo(alquileres.get(i).getAlquilado().getTipo());
          DVD dvd2 = new DVD(dvd.getTitulo(),dvd.getTipo());
          tiempo = a.getTiempo();
          Alquiler alquiler = new Alquiler(dvd2,tiempo);
       
          
         System.out.println( alquileres.get(i).getAlquilado().getTitulo());
         System.out.println(alquileres.get(i).getAlquilado().getTipo());
         System.out.println( alquileres.get(i).getTiempo());
       */   
      }
      
      System.out.println("importe Total : "+importeTotal);
      System.out.println("Numero de puntos: "+bonificacion);
  }
    
    public static void main(String[] args) {
        DVD miDVD=new DVD("Shrek", DVD.INFANTIL);
        DVD miDVD2=new DVD("Emma",DVD.NOVEDAD);
        Alquiler a=new Alquiler(miDVD, 3);
        Alquiler a2=new Alquiler(miDVD2, 4);
        
        Cliente c=new Cliente("Juan Fernandez");
        c.nuevoAlquiler2(a);
        c.nuevoAlquiler2(a2);
        c.generarTickets();
        
        
    }
    
    
}