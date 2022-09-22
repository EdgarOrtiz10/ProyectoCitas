/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Edgar O
 */
public class Paciente {
    private String idPaciente;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String lugarNacimiento;
    private Date fechaNacimiento;
    private String departamentoNacimiento;
    private String municipioNacimiento;
    private String direccionPaciente;
    private String regimen;
    private String eps;
    
    public Paciente(String idPaciente, 
        String primerNombre,
        String segundoNombre,
        String primerApellido,
        String segundoApellido,
        String lugarNacimiento,
        Date fechaNacimiento,
        String departamentoNacimiento,
        String municipioNacimiento,
        String direccionPaciente,
        String regimen,
        String eps){
        
        this.setIdPaciente(idPaciente);
        this.setPrimerNombre(primerNombre.toUpperCase());
        this.setSegundoNombre(segundoNombre.toUpperCase());
        this.setPrimerApellido(primerApellido.toUpperCase());
        this.setSegundoApellido(segundoApellido.toUpperCase());
        this.setLugarNacimiento(lugarNacimiento.toUpperCase());
        this.setFechaNacimiento(fechaNacimiento);
        this.setDepartamentoNacimiento(departamentoNacimiento.toUpperCase());
        this.setMunicipioNacimiento(municipioNacimiento.toUpperCase());
        this.setDireccionPaciente(direccionPaciente.toUpperCase());
        this.setRegimen(regimen.toUpperCase());
        this.setEps(eps.toUpperCase());
    }

    /**
     * @return the idPaciente
     */
    public String getIdPaciente() {
        return idPaciente;
    }

    /**
     * @param idPaciente the idPaciente to set
     */
    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    /**
     * @return the primerNombre
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * @param primerNombre the primerNombre to set
     */
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    /**
     * @return the segundoNombre
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * @param segundoNombre the segundoNombre to set
     */
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    /**
     * @return the primerApellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * @param primerApellido the primerApellido to set
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * @return the segundoApellido
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * @param segundoApellido the segundoApellido to set
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    /**
     * @return the lugarNacimiento
     */
    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    /**
     * @param lugarNacimiento the lugarNacimiento to set
     */
    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the departamentoNacimiento
     */
    public String getDepartamentoNacimiento() {
        return departamentoNacimiento;
    }

    /**
     * @param departamentoNacimiento the departamentoNacimiento to set
     */
    public void setDepartamentoNacimiento(String departamentoNacimiento) {
        this.departamentoNacimiento = departamentoNacimiento;
    }

    /**
     * @return the municipioNacimiento
     */
    public String getMunicipioNacimiento() {
        return municipioNacimiento;
    }

    /**
     * @param municipioNacimiento the municipioNacimiento to set
     */
    public void setMunicipioNacimiento(String municipioNacimiento) {
        this.municipioNacimiento = municipioNacimiento;
    }

    /**
     * @return the direccionPaciente
     */
    public String getDireccionPaciente() {
        return direccionPaciente;
    }

    /**
     * @param direccionPaciente the direccionPaciente to set
     */
    public void setDireccionPaciente(String direccionPaciente) {
        this.direccionPaciente = direccionPaciente;
    }

    /**
     * @return the regime
     */
    public String getRegimen() {
        return regimen;
    }

    /**
     * @param regime the regime to set
     */
    public void setRegimen(String regime) {
        this.regimen = regimen;
    }

    /**
     * @return the eps
     */
    public String getEps() {
        return eps;
    }

    /**
     * @param eps the eps to set
     */
    public void setEps(String eps) {
        this.eps = eps;
    }
    
}
