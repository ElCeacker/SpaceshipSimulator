import java.util.Scanner;

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

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public float getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
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

    public void speedUp() {
        Scanner preguntasNave = new Scanner(System.in);
        System.out.println("¿Cuál quieres que sea la nueva velocidad?");
        float velocidad1 = preguntasNave.nextFloat();
        System.out.println("¿En qué posición quieres que aparezca la nave?");
        int posicion = preguntasNave.nextInt();
        velocidadX = velocidad1;
        coordenadaX = posicion;
    }

    @Override
    public String toString() {
        return "\n" +
                "                     _  _     ____________.--.\n" +
                "                  |\\|_|//_.-\"\" .'    \\   /|  |\n" +
                "                  |.-\"\"\"-.|   /       \\_/ |  |\n" +
                "                  \\  ||  /| __\\_____________ |\n" +
                "                  _\\_||_/_| .-\"\"            \"\"-.  __\n" +
                "                .' '.    \\//                    \".\\/\n" +
                "                ||   '. >()_                     |()<\n" +
                "                ||__.-' |/\\ \\                    |/\\\n" +
                "                   |   / \"|  \\__________________/.\"\"\n" +
                "                  /   //  | / \\ \"-.__________/  /\\\n" +
                "               ___|__/_|__|/___\\___\".______//__/__\\\n" +
                "              /|\\     [____________] \\__/         |\\\n" +
                "             //\\ \\     |  |=====| |   /\\\\         |\\\\\n" +
                "            // |\\ \\    |  |=====| |   | \\\\        | \\\\        ____...____....----\n" +
                "          .//__| \\ \\   |  |=====| |   | |\\\\       |--\\\\---\"\"\"\"     .            ..\n" +
                "_____....-//___|  \\_\\  |  |=====| |   |_|_\\\\      |___\\\\    .                 ...'\n" +
                " .      .//-.__|_______|__|_____|_|_____[__\\\\_____|__.-\\\\      .     .    ...::\n" +
                "        //        //        /          \\ `-_\\\\/         \\\\          .....:::\n" +
                "  -... //     .  / /       /____________\\    \\\\       .  \\ \\     .            .\n" +
                "      //   .. .-/_/-.                 .       \\\\        .-\\_\\-.                 .\n" +
                "     / /      '-----'           .             \\ \\      '._____.'         .\n" +
                "  .-/_/-.         .                          .-\\_\\-.                          ...\n" +
                " '._____.'                            .     '._____.'                       .....\n" +
                "        .                                                             ...... ..\n" +
                "    .            .                  .                        .\n" +
                "   ...                    .                      .                       .      .\n" +
                "        ....     .                       .                    ....\n" +
                "          ......           . ..                       ......'\n" +
                "             .......             '...              ....\n" +
                "                                   ''''''      .              .";
    }
}
