public class SpaceShip {

    public String nombre;
    public int matriculaGalactica;
    public float aceleracion;
    public float velocidadX;
    public float velocidadY;
    public float coordenadaX;
    public float coordenadaY;
    public int direccionX;
    public int direccionY;

    public SpaceShip(String nombre, int matriculaGalactica, float aceleracion, float velocidadX, float velocidadY, float coordenadaX, float coordenadaY, int direccionX, int direccionY) {
        this.nombre = nombre;
        this.matriculaGalactica = matriculaGalactica;
        this.aceleracion = aceleracion;
        this.velocidadX = velocidadX;
        this.velocidadY = velocidadY;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.direccionX = direccionX;
        this.direccionY = direccionY;
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

    public float getVelocidadX() {
        return velocidadX;
    }

    public void setVelocidadX(float velocidadX) {
        this.velocidadX = velocidadX;
    }

    public float getVelocidadY() {
        return velocidadY;
    }

    public void setVelocidadY(float velocidadY) {
        this.velocidadY = velocidadY;
    }

    public float getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(float coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public float getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(float coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public int getDireccionX() {
        return direccionX;
    }

    public void setDireccionX(int direccionX) {
        this.direccionX = direccionX;
    }

    public int getDireccionY() {
        return direccionY;
    }

    public void setDireccionY(int direccionY) {
        this.direccionY = direccionY;
    }
}
