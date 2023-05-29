/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import java.util.List;
import model.Aprendiz;

/**
 *
 * @author APRENDIZ
 */
public interface MeAprendiz {
    
        public Aprendiz list(int id);
    public List listadoape();
    public boolean registrarape(Aprendiz ape);
    public boolean actualizarape(Aprendiz ape);
    public boolean eliminarape(int id);
}
