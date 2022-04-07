public class SpaceShip {

    public String nombre;
    public int matriculaGalactica;
    public float aceleracion;
    public float velocidadX;
    public float velocidadY;
    public int coordenadaX;
    public int coordenadaY;
    public int direccionX;
    public int direccionY;

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
