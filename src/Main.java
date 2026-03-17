public class Main {
    public static void main (String[] args) {
        autor autor1= new autor("Raul Bueno", "Española");

        libro libro1= new libro("Programa con Raul", 256);

        revista revista1= new revista(150, "Semanal");

        System.out.println(autor1);
        System.out.println(libro1);
        System.out.println(revista1);
    }
}