/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte{
    double promedioSueldos;
    ArrayList<Docente> lista;
    
    public ReporteDocente(String miCodigo, ArrayList<Docente> l) {
        super(miCodigo);
        lista = l;
    }
    
    public void establecerPromedioSueldos() {
        double suma = 0;
        for(int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getSueldo();
        }
        
        promedioSueldos = suma/lista.size();
    }
    
    public void establecerLista(ArrayList<Docente> l) {
        lista = l;
    }
    
    public double obtenerPromedioSueldos() {
        return promedioSueldos;
    }
    
    public ArrayList<Docente> obtenerLista() {
        return lista;
    }
    
    @Override
    public String toString() {
        String reporte = "REPORTE DOCENTE:";
        reporte = String.format("%s\nCódigo: %s\n",reporte,codigo);
        reporte = String.format("%sLISTA DOCENTES:\n",reporte);
        
        for(int i= 0; i < lista.size(); i++) {
            Docente d = obtenerLista().get(i);
            reporte = String.format("%sDocente(%d):\n    - Nombre: %s\n    - "
                    + "Sueldo: %.1f\n",reporte,i+1,d.getNombre(),
                    d.getSueldo());
        }
        
        reporte = String.format("%s\nEl promedio de sueldos es: %.3f",
                reporte,promedioSueldos);
        return reporte;
    }
    
}
