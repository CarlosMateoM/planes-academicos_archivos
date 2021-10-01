/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planesacademicos;


/**
 *
 * @author javier
 */
public class DatosAsignaturas {
   
    private String Programa;
    private String Asignatura;
    private String Codigo;
    private String Semestre;
    private String Creditos;
   
    
    public  DatosAsignaturas (){
       
        this.Programa = "";
        this.Asignatura = "";
        this.Codigo = "";
        this.Semestre = "";
        this.Creditos = "";
        
    }
    
    public void setPrograma (String pro){
        this.Programa = pro;
    }
    
    public void setAsignature (String asi){
        this.Asignatura = asi;
    }
    
    public void setCodigo (String cod){
        this.Codigo = cod;
    }
    
    public void setSemestre (String sem){
        this.Semestre = sem;
    }
    
    public void setCreditos (String cre){
        this.Creditos = cre;
    }
    
    
    public String getPrograma (){
        return this.Programa;
    }
    
    public String getAsignatura (){
        return this.Asignatura;
    }
    
    public String getCodigo (){
        return this.Codigo;
    }
    
    public String getSemestre (){
        return this.Semestre;
    }
    
    public String getCreditos (){
        return this.Creditos;
    }
   
}