# examen5
# Parte teórica  

1. Responde brevemente a las siguientes cuestiones: 


2. ¿Por qué ItemBiblioteca se ha definido como clase abstracta? 

-Porque sirve para otras clase

3. Explica por qué la relación entre Libro y Autor es composición y no herencia. 

-Porque libro tiene autores

4. Indica dos ventajas de usar encapsulación en las clases del ejercicio. 

-Control de datos

5. ¿Por qué ConfiguracionSistema podría declararse como final? 

- Para evitar las modificaciones

6. ¿Qué ocurriría si el atributo contador de ContadorItems no fuera estático? 

- No contaria todo

7. En qué situaciones es más adecuado utilizar herencia en lugar de composición. 

- Cuando existe relación, por ejemplo "es un"

8. ¿Qué métodos importantes heredan todas las clases de Object? Menciona al menos 
tres. 

- toString()

9. Explica brevemente el polimorfismo y cómo aparece en este ejercicio. 



10. Observa el siguiente método: 
public static void modificarTitulo(String titulo) { 
titulo = "Nuevo título"; 
} 
y la llamada: 
String t = "Java"; 
modificarTitulo(t); 
System.out.println(t); 


1. ¿Qué se imprimirá? 

- Java

2. Explica por qué ocurre esto en Java. 

- Porque hace referencia a la llamada t y no a la original titulo
