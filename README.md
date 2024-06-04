Se generó una excepción en la llamada a la carpeta para la tarea previamente presentada.

Este código es una clase en Java que define una excepción personalizada llamada LibroException dentro de una aplicación Spring Boot.

![image](https://github.com/Rogeribar/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147789686/9e316b4e-1888-46ac-8a20-71fe14752030)

- @ResponseStatus(HttpStatus.NOT_FOUND): Esta anotación indica que, al lanzarse esta excepción, Spring responderá automáticamente con un estado HTTP 404 (No Encontrado). Es una forma de asociar una excepción específica con un código de estado HTTP.
- La clase pública LibroException extiende RuntimeException: Define la clase `LibroException`, que extiende `RuntimeException`. Esto significa que `LibroException` es una excepción no verificada, lo que implica que no es necesario manejarla o declararla explícitamente.
- public LibroException(String mensaje): Es el constructor de la clase, que recibe un mensaje de error como parámetro y lo pasa al constructor de la clase base (RuntimeException) para que pueda ser accesible a través de los métodos estándar de excepción.

Luego, se modifica la clase del controlador.
![Imagen de WhatsApp 2024-06-03 a las 19 44 37_c4830f54](https://github.com/Rogeribar/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147789686/74521d68-a940-4be3-941f-0964855bf8b5)


Si no se encuentra el libro, lanza una excepción LibroException con un mensaje de error y un mensaje personalizado que en este caso es "No se encontró el libro con el ID:".

Si no se encuentra el libro, lanza una excepción `LibroException` con un mensaje de error personalizado que en este caso es "No se encontró el libro con el ID:".
![Imagen de WhatsApp 2024-06-03 a las 19 45 20_88cc67a9](https://github.com/Rogeribar/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147789686/4ba65dcb-eb18-4c15-a00d-d2e7098a839c)

Al crear un libro:

Utiliza `libroService` para agregar un nuevo libro.

Devuelve una respuesta con un estado HTTP 201 (CREADO) y un mensaje de éxito.

![Imagen de WhatsApp 2024-06-03 a las 19 45 42_a6ad7309](https://github.com/Rogeribar/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147789686/7bd8d999-9dac-4abc-9e58-08296c67a41a)

![Imagen de WhatsApp 2024-06-03 a las 19 46 09_c9c999e9](https://github.com/Rogeribar/Web-API-de-Libro-con-control-de-excepciones-y-mejor-descripci-n-de-API/assets/147789686/422dc6a2-8af1-4cf8-b2bd-4c8876a7ccdb)


En Conclusión
La tarea fue enriquecida con una excepción personalizada LibroException que mejora la gestión de errores en la aplicación Spring Boot, proporcionando mensajes específicos y estados HTTP adecuados para las operaciones de búsqueda y creación de libros.
