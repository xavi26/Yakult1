package yakult;
public class Registros 
{
    private String nombreCli;
    private String domicilioCli;
    private String hEntrega;
    private boolean visita;
    private boolean entregado;
    private int   cantidadProd;
    private String nombreProd;
    private String fecha;
    private String comentarios;
 public Registros (String nombreCli,String domicilioCli,String hEntrega,boolean visita,
         boolean entregado,int cantidadProd,String nombreProd,String fecha,String comentarios)
    {
        this.nombreCli = nombreCli;
        this.domicilioCli = domicilioCli;
        this.hEntrega = hEntrega;
        this.visita = visita;
        this.entregado = entregado;
        this.cantidadProd = cantidadProd;
        this.nombreProd = nombreProd;
        this.fecha = fecha;
        this.comentarios = comentarios;
    
    }
 //MÉTODOS SET
 public void setNombreCli(String nombreCli)
 {
     this.nombreCli=nombreCli;
 }
 public void setDomicilioCli(String domicilioCli)
 {
     this.domicilioCli = domicilioCli;
 }
 public void sethEntrega(String hEntrega)
 {
     this.hEntrega = hEntrega;
 }
 public void setVisita(boolean visita)
 {
     this.visita = visita;
 }
 public void setEntregado(boolean entregado)
 {
     this.entregado = entregado;
 }
 public void setCantidadProd(int cantidadProd)
 {
     this.cantidadProd = cantidadProd;
 }
 public void setNombreProd(String nombreProd)
 {
     this.nombreProd= nombreProd;
 }
 public void setFecha(String fecha)
 {
     this.fecha= fecha;
 }
 public void setComentarios(String comentarios)
 {
     this.comentarios = comentarios;
 }
 //MÉTODOS GET
 public String getNombreCli()
 {
     return nombreCli;
 }
 public String getDomicilioCli()
 {
     return domicilioCli;
 }
 public String gethEntrega()
 {
     return hEntrega;
 }
 public boolean getEntregado()
 {
       return entregado;
     
 }
 public boolean getVisita()
 {
    return visita;
     
 }
 public int getCantidadProd()
 {
     return cantidadProd;
 }
 public String getNombreProd()
 {
     return nombreProd;
 }
 public String getFecha()
 {
     return fecha;
 }
 public String getComentarios()
 {
     return comentarios;
 }
}
