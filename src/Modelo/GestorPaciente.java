/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Recursos.Conexion;
/**
 *
 * @author Edgar O
 */
public class GestorPaciente {
        private static LinkedList<Paciente> paciente;
    private static Connection conex;
    
    public GestorPaciente(){
        //pacientes = new LinkedList<>();
        conex = Recursos.Conexion.getConexion();
    }
    //1er metodo del CRUD -> Create paciente
    public void RegistrarPaciente (Paciente paciente){
        //pacientes.add(paciente);
        PreparedStatement pst;
        try{
            pst = conex.prepareStatement("insert into Paciente values(?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, paciente.getIdPaciente());
            pst.setString(2, paciente.getPrimerNombre());
            pst.setString(3, paciente.getSegundoNombre());
            pst.setString(4, paciente.getPrimerApellido());
            pst.setString(5, paciente.getSegundoApellido());
            pst.setString(6, paciente.getLugarNacimiento());
            pst.setDate(7, paciente.getFechaNacimiento());
            pst.setString(8, paciente.getDepartamentoNacimiento());
            pst.setString(9, paciente.getMunicipioNacimiento());
            pst.setString(10, paciente.getDireccionPaciente());
            pst.setString(11, paciente.getRegimen());
            pst.setString(12, paciente.getEps());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Paciente Registrado Exitosamente");
        }
        catch(SQLException ex){
            Logger.getLogger(GestorPaciente.class.getName()).log(Level.SEVERE, null, ex);
            if(ex.getErrorCode()==2627){
                JOptionPane.showMessageDialog(null, "Este número de documento ya existe, el registro no fue realizado");
            }
            
        }
    }
    
    
    public LinkedList<Paciente> getPacienteByParametro(int parametro, String valor){
        LinkedList<Paciente> resultado = new LinkedList<>();
        String instruccionSql="";
        switch(parametro)
        {
            case 1 -> {
                instruccionSql= "Select * from Paciente where IdPaciente ='" + valor+"' ";
                break;
            }
                      
            case 2 -> {
                valor = valor.toUpperCase();
                valor = valor.trim();
                String[] newStr = valor.split("\\s+");
                if(newStr.length >1 )
                {
                    instruccionSql = "Select * from Paciente where PrimerNombre='"+newStr[0]+"'";
                }
                else {
                    instruccionSql = "Select * from Paciente where PrimerNombre='"+valor+"' ";                      
                }
                break;
            }
             
            case 3 -> {
                valor = valor.trim();
                String[] newStr1 = valor.split("\\s+");
                if(newStr1.length >1 )
                {
                    instruccionSql = "Select * from Paciente where SegundoNombre='"+newStr1[0]+"' ";
                }
                else {
                    instruccionSql = "Select * from Paciente where SegundoNombre='"+valor+"'";
                }
                break;
            }   
             
            case 4 -> {
                valor = valor.trim();
                String[] newStr1 = valor.split("\\s+");
                if(newStr1.length >1 )
                {
                    instruccionSql = "Select * from Paciente where PrimerApellido='"+newStr1[0]+"' ";
                }
                else {
                    instruccionSql = "Select * from Paciente where PrimerApellido='"+valor+"'";
                }
                break;
            }  
                                   
            case 5 -> {
                valor = valor.trim();
                String[] newStr1 = valor.split("\\s+");
                if(newStr1.length >1 )
                {
                    instruccionSql = "Select * from Paciente where SegundoApellido='"+newStr1[0]+"' ";
                }
                else {
                    instruccionSql = "Select * from Paciente where SegundoApellido='"+valor+"'";
                }
                break;
            } 
                                   
            case 6 -> {
                valor = valor.trim();
                String[] newStr1 = valor.split("\\s+");
                if(newStr1.length >1 )
                {
                    instruccionSql = "Select * from Paciente where LugarNacimiento='"+newStr1[0]+"' ";
                }
                else {
                    instruccionSql = "Select * from Paciente where LugarNacimiento='"+valor+"'";
                }
                break;
            } 
                                   
              case 7: if(pac.getFechaNacimiento().equals(valor))
                      resultado.add(pac);
                      break;
                                   
            case 8 -> {
                valor = valor.trim();
                String[] newStr1 = valor.split("\\s+");
                if(newStr1.length >1 )
                {
                    instruccionSql = "Select * from Paciente where DepartamentoNacimiento='"+newStr1[0]+"' ";
                }
                else {
                    instruccionSql = "Select * from Paciente where DepartamentoNacimiento='"+valor+"'";
                }
                break;
            } 
                                   
              case 9 -> {
                valor = valor.trim();
                String[] newStr1 = valor.split("\\s+");
                if(newStr1.length >1 )
                {
                    instruccionSql = "Select * from Paciente where MunicipioNacimiento='"+newStr1[0]+"' ";
                }
                else {
                    instruccionSql = "Select * from Paciente where MunicipioNacimiento='"+valor+"'";
                }
                break;
            } 
                                   
            case 10 -> {
                valor = valor.trim();
                String[] newStr1 = valor.split("\\s+");
                if(newStr1.length >1 )
                {
                    instruccionSql = "Select * from Paciente where DireccionPaciente='"+newStr1[0]+"' ";
                }
                else {
                    instruccionSql = "Select * from Paciente where DireccionPaciente='"+valor+"'";
                }
                break;
            } 
                                   
            case 11 -> {
                valor = valor.trim();
                String[] newStr1 = valor.split("\\s+");
                if(newStr1.length >1 )
                {
                    instruccionSql = "Select * from Paciente where Regimen='"+newStr1[0]+"' ";
                }
                else {
                    instruccionSql = "Select * from Paciente where Regimen='"+valor+"'";
                }
                break;
            }
                                   
            case 12 -> {
                valor = valor.trim();
                String[] newStr1 = valor.split("\\s+");
                if(newStr1.length >1 )
                {
                    instruccionSql = "Select * from Paciente where Eps='"+newStr1[0]+"' ";
                }
                else {
                    instruccionSql = "Select * from Paciente where Eps='"+valor+"'";
                }
                break;
            }         
          }
        
        
        
        
        try{
            PreparedStatement st=conex.prepareStatement(instruccionSql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                resultado.add(new Paciente(rs.getString("IdPaciente"),
                        rs.getString("PrimerNombre"),
                        rs.getString("SegundoNombre"),
                        rs.getString("PrimerApellido"),
                        rs.getString("SegundoApellido"), 
                        rs.getString("LugarNacimiento"),
                        rs.getDate("Fechanacimiento"),
                        rs.getString("DepartamentoNacimiento"),
                        rs.getString("MunicipioNacimiento"),
                        rs.getString("DireccionPaciente"),
                        rs.getString("Regimen"),
                        rs.getString("Eps")));
                
            }
            st.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
            
        
        return resultado;
    }

    
        public void ActualizarPaciente (Paciente paciente)
    {
        String instruccionSql= "Update Paciente Set PrimerNombre="+paciente.getPrimerNombre()+
                                ", SegundoNombre= "+paciente.getSegundoNombre()+
                                ", PrimerApellido= "+paciente.getPrimerApellido()+
                                ", SegundoApellido= "+paciente.getSegundoApellido()+
                                ", LugarNacimiento= "+paciente.getLugarNacimiento()+
                                ", FechaNacimiento= "+paciente.getFechaNacimiento().toString()+
                                ", DepartamentoNacimient= "+paciente.getDepartamentoNacimiento()+
                                ", MunicipioNacimiento= "+paciente.getMunicipioNacimiento()+
                                ", DireccionPaciente= "+paciente.getDireccionPaciente()+
                                ", Regimen= "+paciente.getRegimen()+
                                ", Eps= "+paciente.getEps()+
                                ", where IdPaciente= "+paciente.getIdPaciente();
        try{
            PreparedStatement st=conex.prepareStatement(instruccionSql);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Paciente Modificao Exitosamente");  
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }   
}

   


    
