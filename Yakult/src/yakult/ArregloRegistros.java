package yakult;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ArregloRegistros 
{
    private ArrayList<Registros> objRegistros;
    
    public ArregloRegistros()
    {
        objRegistros=new ArrayList<Registros>();
    }
    public void Agregar(Registros reg)
    {
        objRegistros.add(reg);
    }
    public void Borrar(Registros reg)
    {
        objRegistros.remove(reg);
    }
    public Registros Obtener(int pos)
    {
        return objRegistros.get(pos);
    }
    public Registros buscar(String nombreCli)
    {
        for(int i = 0;i<objRegistros.size();i++ )
        {
            if(nombreCli.equals(objRegistros.get(i).getNombreCli()))
            {
                return objRegistros.get(i);
            }
        }
        return null;
    }
    public int numElementos()
    {
        return objRegistros.size();
    }public void leerDatos()
    {
        cargar();
                
    }
    private void cargar()
    {
        try
        {
            File archivo= new File("Registros.txt");
            if(archivo.exists())
            {
                BufferedReader br= new BufferedReader(new FileReader("Registros.txt"));
                String linea;             
                
                while ((linea=br.readLine())!=null)
                {
                    StringTokenizer st = new StringTokenizer(linea,",");
                    String nombreCli = st.nextToken().trim();
                    String domicilioCli = st.nextToken().trim();
                    String hEntrega = st.nextToken().trim();
                    boolean visita =Boolean.parseBoolean(st.nextToken().trim());
                    boolean entregado=Boolean.parseBoolean(st.nextToken().trim());
                    int cantidadProd =Integer.parseInt(st.nextToken().trim());
                    String nombreProd = st.nextToken().trim();
                    String fecha = st.nextToken().trim();
                    String comentarios = st.nextToken().trim();
                    Registros reg= new Registros(nombreCli,domicilioCli,hEntrega,visita,entregado,cantidadProd,
                    nombreProd,fecha,comentarios);
                    Agregar(reg);
                }
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Se prdujo un error "+e);
        }
    }
    public void guardar ()
    {
        try
        {
            PrintWriter pw= new PrintWriter(new FileWriter("Registro.txt"));
             for(int i = 0;i<numElementos();i++)
             {
                 pw.println(Obtener(i).getNombreCli()+","+Obtener(i).getDomicilioCli()+","+Obtener(i).gethEntrega()+","+Obtener(i).getVisita()+","+Obtener(i).getEntregado()+","+
                        Obtener(i).getCantidadProd()+","+ Obtener(i).getNombreProd()+","+Obtener(i).getFecha()+","+Obtener(i).getComentarios());
                 pw.close();
             }
                
        }catch(Exception e)
                {
                  JOptionPane.showMessageDialog(null,"Se produjo un error "+e);  
                }
    }
}
