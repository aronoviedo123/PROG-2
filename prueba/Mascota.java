
package Implementaciones;

public class Mascota {
    private String nombreMascota, sexoMascota, razaMascota;
    private int edadMascota;

    public Mascota(String nombreMascota, String sexoMascota, String razaMascota, int edadMascota) {
        this.nombreMascota = nombreMascota;
        this.sexoMascota = sexoMascota;
        this.razaMascota = razaMascota;
        this.edadMascota = edadMascota;
    }
    
    void mostrar(){
        System.out.println("\n--- Datos de la mascota: "+nombreMascota+" ---");
        System.out.println("\tSexo: "+sexoMascota);
        System.out.println("\tRaza: "+razaMascota);
        System.out.println("\tEdad: "+edadMascota);
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getSexoMascota() {
        return sexoMascota;
    }

    public void setSexoMascota(String sexoMascota) {
        this.sexoMascota = sexoMascota;
    }

    public String getRazaMascota() {
        return razaMascota;
    }

    public void setRazaMascota(String razaMascota) {
        this.razaMascota = razaMascota;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }
}
