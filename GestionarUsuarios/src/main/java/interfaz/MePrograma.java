/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import java.util.List;
import modelo.Programa;

public interface MePrograma {
   public Programa list(int id);
   public List listadoPro();
   public boolean registrarpro(Programa pro);
   public boolean actualizarpro(Programa pro);
   public boolean eliminarpro(int id);
}
