package CLINICA;

public class MascotasAptas extends Mascotas implements operable {

    public MascotasAptas(String nombre, String sexo, int edad, boolean esterilizado) {
        super(nombre, sexo, edad, esterilizado);
    }

    @Override
    public void operar() {
        this.setEsterilizado(true);
    }
}
