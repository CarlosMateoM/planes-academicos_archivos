/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planesacademicos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author javier
 */
public class Archivo {

    private File Archivo;
    private String NOMBRE_ARCHIVO = "asignatura.txt";

    public Archivo() {
        Archivo = new File(NOMBRE_ARCHIVO);
    }

    public String getNOMBRE_ARCHIVO() {
        return this.NOMBRE_ARCHIVO;
    }

    public void GuardarDatos(DatosAsignaturas asi) throws IOException {

        BufferedWriter guardar;

        if (Archivo.exists()) {

            guardar = new BufferedWriter(new FileWriter(Archivo, true));
            guardar.write(asi.getPrograma() + "\t");
            guardar.write(asi.getAsignatura() + "\t");
            guardar.write(asi.getCodigo() + "\t");
            guardar.write(asi.getSemestre() + "\t");
            guardar.write(asi.getCreditos() + "\t");
            guardar.newLine();

        } else {

            guardar = new BufferedWriter(new FileWriter(Archivo));
            guardar.write(asi.getPrograma() + "\t");
            guardar.write(asi.getAsignatura() + "\t");
            guardar.write(asi.getCodigo() + "\t");
            guardar.write(asi.getSemestre() + "\t");
            guardar.write(asi.getCreditos() + "\t");
            guardar.newLine();

        }

        guardar.close();
    }

    public void eliminar() {
        Archivo.delete();
        Archivo = new File(NOMBRE_ARCHIVO);
    }

    public boolean isFileEmpty() {
        return Archivo.length() == 0;
    }
}
