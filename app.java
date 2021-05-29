package PRINCIPAL;

import CLINICA.Mascotas;
import CLINICA.MascotasAptas;
import CLINICA.Veterinaria;

import java.util.List;

public class app {
    public static void main(String[] args) {
        Veterinaria marta = new Veterinaria();
        marta.revisarMascota("roco", "macho", 2, true);
        marta.revisarMascota("pochola", "hembra", 30, false);
        marta.revisarMascota("celeste", "hembra", 19, true);
        marta.revisarMascota("poncho", "macho", 20, false);
        marta.revisarMascota("fifu", "macho", 26, false);

        for (Mascotas mascotas : marta.getPaciente()) {
            System.out.printf(mascotas.getNombre());
        }
        List<MascotasAptas> animalitos = marta.getpacientesAOperar();
        for (MascotasAptas a : animalitos) {
            System.out.printf(a.getNombre());
        }
    }
}
