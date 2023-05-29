/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeldao;

import config.Conexion;
import interfaz.MePrograma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Programa;

/**
 *
 * @author APRENDIZ
 */
public class ProgramaDao implements MePrograma{
    
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet res;

    @Override
    public Programa list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listadoPro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean registrarpro(Programa pro) {
        String registro="insert into programa(codprograma,nombrepro)values('"+pro.getCodprograma()+"','"+pro.getnombrepro()+"')";
        try{
        con=cn.getConnection();
        ps=con.prepareStatement(registro);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null,"Programa registrado");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Pograma ya resgistrado");
        }
        return false;
    }

    @Override
    public boolean actualizarpro(Programa pro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarpro(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
