/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
 
/**
 *
 * @author Edgar O
 */
public class PacienteController implements ActionListener {
    Vista.PacienteVista pacienteVista;
    Modelo.Paciente pacienteModelo;
    Modelo.GestorPaciente gestorpacienteModelo;
    
    public PacienteController(Vista.PacienteVista pacienteVista){
        this.pacienteVista=pacienteVista;
        gestorpacienteModelo=new Modelo.GestorPaciente();
    }
 
    @Override
    public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(pacienteVista.GuardarPaciente)){
        String idPaciente=pacienteVista.txtIdPaciente.getText();
        String primerNombre=pacienteVista.txtPrimerNombre.getText();
        String segundoNombre=pacienteVista.txtSegundoNombre.getText();
        String primerApellido=pacienteVista.txtPrimerApellido.getText();
        String segundoApellido=pacienteVista.txtSegundoApellido.getText();
        String lugarNacimiento=pacienteVista.txtLugarNacimiento.getText();
        SimpleDateFormat formato=new SimpleDateFormat(“dd/MM/yyyy”);
        String fechaNacimiento=formato.format(pacienteVista.txtFechaNacimiento.getDate());
        String departamentoNacimiento=pacienteVista.txtDepartamentoNacimiento.getText();
        String municipioNacimiento=pacienteVista.txtMunicipioNacimiento.getText();
        String direccionPaciente=pacienteVista.txtDireccionNacimiento.getText();
        String regimen=pacienteVista.txtRegimen.getText();
        String eps=pacienteVista.txtEps.getText();
        
        
        /*
        String genero=””;
        if(pacienteVista.rdb_masculino.isSelected()){
             genero=”M”;
        }
        if(pacienteVista.rdb_femenino.isSelected()){
             genero=”M”;
        }*/
        
 pacienteModelo = new Modelo.Paciente(idPaciente,primerNombre,segundoNombre,primerApellido,segundoApellido,lugarNacimiento,fechaNacimiento,departamentoNacimiento,municipioNacimiento,direccionPaciente, regimen, eps);
        gestorpacienteModelo.RegistrarPacientes(pacienteModelo);
    }
    if(e.getSource().equals(pacienteVista.jButton2)){
        pacienteVista.txtIdPaciente.setText(“”);
        pacienteVista.txtPrimerNombre.setText(“”);
        pacienteVista.txtSegundoNombre.setText(“”);
        pacienteVista.txtPrimerApellido.setText(“”);
        pacienteVista.txtSegundoApellido.setText(“”);
        pacienteVista.txtLugarNacimiento.setText(“”);
        pacienteVista.txtFechaNacimiento.setDate(null);
        pacienteVista.txtDepartamentoNacimiento.setText(“”);
        pacienteVista.txtMunicipioNacimiento.setText(“”);
        pacienteVista.txtDireccionNacimiento.setText(“”);
        pacienteVista.txtRegimen.setText(“”);
        pacienteVista.txtEps.setText(“”);
        pacienteVista.txtIdPaciente.requestFocus();
    }
    }
}