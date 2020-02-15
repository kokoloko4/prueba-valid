# Prueba Valid
Se hizo uso de las tecnologías de Springboot + Java 8 + H2 In memory database

## Arquitectura
Para la aplicación web se utilizó la arquitectura Modelo-Vista-Controlador, de esta manera se tienen separados las diferentes responsabilidades.

* **Modelo:** Dentro de este paquete se encuentra la clase Person, la cual contiene la información utilizada por la aplicación.
* **Controladores:** En este paquete se encarga de exponer los servicios del backend y llama a los diferentes servicios según sea necesario.
  * Servicios: Contiene la lógica de cada uno de los servicios y hace uso de una clase DAO para acceder a los datos de la base de datos.
  * Data access object: Se comunica con la base de datos haciendo uso de jdbc. Realiza las diferentes consultas según sea llamado algún método.
* **Vista:** Muestra la información y permite la interacción con el sistema. Las diferentes vistas se encuentran ubicadas en `src/main/resources/templates`. Cabe resaltar que se hizo uso de Thymeleaf como motor de plantillas HTML para facilitar el desarrollo de la arquitectura.
## Patrones de diseño
* Fachada: Con el objetivo de mantener independencia entre los diferentes módulos del proyecto cada paquete ofrece una interfaz con los métodos que brindan.
* Singleton: Con la utilización de la anotación `@AutoWired` que brinda spring se tiene una única instancia del objeto durante la ejecución de la aplicación.
* Repository: A través de la anotación `@Repository` se indica a la clase que será el intermediario entre la base de datos y aquellas clases que quieran realizar operaciones sobre ella.
* Principios SOLID: Para mantener las buenas prácticas de programación se siguen estos principios.
## Endpoints

|Endpoint	|Verbo HTTP|	Descripción|
|---------|----------|-------------|
|/|	GET|	Lleva a la página principal de la aplicación, es decir, registro de una nueva persona.|
|/list|	GET|	Muestra todos los registros de la base de datos.|
|/new	|POST	|Crea una nueva persona en la base de datos.|
|/process|	GET	|Cambia el atributo procesado de la persona o personas seleccionadas a `true.`|
