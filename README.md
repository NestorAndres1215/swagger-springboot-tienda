# SpringBoot Tienda API

API REST para la gestión de productos de una tienda, desarrollada con **Spring Boot**, **MySQL** y documentada con **Swagger**. Permite crear, listar, actualizar y eliminar productos, con arquitectura limpia y buenas prácticas en Java y Spring.

## Características

- CRUD completo de productos (`Producto`) con atributos: `id`, `nombre`, `precio` y `stock`.
- Gestión de múltiples tablas y relaciones (si se agregan más modelos como `Categoria`, `Proveedor`).
- Documentación automática de la API con Swagger/OpenAPI.
- Configuración de base de datos con MySQL.
- Uso de Spring Data JPA para la persistencia.
- Estructura modular: `Controller`, `Service`, `Repository`, `Model`.

## Tecnologías

- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- MySQL 8+
- Swagger/OpenAPI 3
- Maven
