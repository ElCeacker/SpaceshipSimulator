public class SpaceShip {

    public String nombre;
    public int matriculaGalactica;
    public float aceleracion;
    public float velocidadX = 0;
    public float velocidadY = 0;
    public int coordenadaX = 0;
    public int coordenadaY = 0;
    public int direccionX = 0;
    public int direccionY = 0;

    public SpaceShip(String nombre, int matriculaGalactica, float aceleracion) {
        this.nombre = nombre;
        this.matriculaGalactica = matriculaGalactica;
        this.aceleracion = aceleracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatriculaGalactica() {
        return matriculaGalactica;
    }

    public void setMatriculaGalactica(int matriculaGalactica) {
        this.matriculaGalactica = matriculaGalactica;
    }

    public float getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(float aceleracion) {
        this.aceleracion = aceleracion;
    }
}
