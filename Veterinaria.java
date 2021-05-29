package CLINICA;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private String nombre;
    private List<Mascotas> paciente = new ArrayList<>();


    public Mascotas revisarMascota(String nombre, String sexo, int edad, boolean esterilizado) {
        if (sexo == "macho") {
            if (edad > 12 && esterilizado == false) {
                Mascotas mascotas1 = new MascotasAptas(nombre, sexo, edad, esterilizado);
                this.paciente.add(mascotas1);
                return mascotas1;
            }
            else if (esterilizado == true){
                Mascotas mascotas1= new MascotasEsterilizadas(nombre, sexo, edad, esterilizado);
                this.paciente.add(mascotas1);
                return mascotas1;

            }
        }
        else if (sexo == "hembra"){
            if (edad > 18 && esterilizado == false) {
                Mascotas mascotas1 = new MascotasAptas(nombre, sexo, edad, esterilizado);
                this.paciente.add(mascotas1);
                return mascotas1;
            }
            else if (esterilizado == true){
                Mascotas mascotas1= new MascotasEsterilizadas(nombre, sexo, edad, esterilizado);
                this.paciente.add(mascotas1);
                return mascotas1;

            }
        }
        return null;
    }

    public void operar(){
        for (Mascotas mascotas:this.paciente){
            if (mascotas instanceof MascotasAptas) ((MascotasAptas) mascotas).operar();
        }
    }
    public List<MascotasAptas> getpacientesAOperar() {
        List<MascotasAptas> mascotasAptasList = new ArrayList<>();
        for (Mascotas mascotas : this.paciente) {
            if (mascotas instanceof MascotasAptas) {
                mascotasAptasList.add((MascotasAptas) mascotas);
            }
        }
        return mascotasAptasList;
    }

    public List<Mascotas> getPaciente() {
        return paciente;
    }
}
