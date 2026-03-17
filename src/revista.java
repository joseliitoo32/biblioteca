public class revista {
    private int numero;
    private String periodicidad;

    public revista(int numero, String periodicidad) {
        this.numero = numero;
        this.periodicidad = periodicidad;
    }

    public String obtenerDescripcion() {
        return "revista numero: " + numero;
    }

}
