# Parcial Especialización Backend II - Carrera Certified Tech Developer


## Indice

- [Escenario](#escenario)
- [Requerimientos](#requerimientos)


## Escenario

La empresa de venta de electrodomésticos “El Aparato” cuenta actualmente con un sistema desarrollado en Java que permite administrar sus productos y sus ventas mediante una serie de endpoints que permiten operaciones CRUD sobre una base de datos.

Este proyecto está desarrollado teniendo en cuenta las siguientes tecnologías:
- JDK 17
- SpringBoot 3.0.6
- MySQL 8 (como SGBD)

Actualmente la empresa cuenta con una base de datos implementada con una serie de productos y ventas realizadas durante el año 2023. Para replicar la misma base de datos y poder realizar nuestras pruebas, el técnico IT de la empresa nos brindó el siguiente archivo sql y nos recomendó ejecutar las consultas por partes y luego de haber creado la base de datos, la cual se llama “elaparato” y de haber ejecutado la aplicación base (dado que ésta crea las tablas correspondientes).
También nos recomienda revisar el archivo application properties para asegurarnos que los datos de usuarios, contraseñas, etc coincidan según cómo configuremos nuestra base de datos relacional de forma local para replicar el ambiente.
También nos indica que, en caso que notemos la necesidad de llevar a cabo adaptaciones o modificaciones para mejorar el sistema, que sintamos total libertad de hacerlo.

A partir de esta aplicación base con la que contamos, el equipo IT de la empresa desea implementar un IAM para la gestión de roles, permisos, autenticación, etc.
En este caso particular, han elegido Keycloak como herramienta, por lo que necesita de nuestra ayuda como especialistas para llevar a cabo la implementación.
A continuación, se detalla cada una de las especificaciones necesarias para llevar a cabo la implementación.



## Requerimientos

Se necesita implementar _Keycloak_ como _IAM_ para la aplicación base que posee la empresa “El aparato”. Para ello:

- **Crear** de un nuevo _reino_ llamado “el-aparato”
- **Crear** la cantidad de clientes que sean necesarios para llevar a cabo las configuraciones que se especificarán en mayor detalle al final de esta lista.
- Existirán 3 tipos de **roles** establecidos:
   - **Rol de Vendedor:** Podrá llevar a cabo operaciones CRUD de las ventas a través de los endpoints destinados a las ventas.
   - **Rol de Repositor:** Podrá llevar a cabo operaciones CRUD de los productos a través de los endpoints destinados a las ventas.
   - **Rol de Administrador:** Podrá llevar a cabo tanto las operaciones del rol de vendedor como de las de repositor en los endpoints de ambos casos.
  
      - **Crear** cada uno de estos roles tanto a _nivel reino_ como a _nivel cliente_.
      - **Realizar** en la aplicación las configuraciones necesarias para permitir el acceso a cada endpoint en base a los roles que pueda poseer cada usuario.

- **Crear** un usuario de tipo _vendedor_, otro de tipo _repositor_ y otro de tipo _administrador_. Asignar a cada uno los correspondientes roles necesarios.

- _Configurar_ que sea obligatorio que un _usuario se autentique_ mediante la pantalla de login de _Keycloak_ antes de poder acceder a los correspondientes end-points
- **Configurar** la posibilidad de que un usuario pueda registrarse mediante la opción “New user? Register” del Login de _Keycloak_.
- **Desarrollar** los endpoints necesarios para la administración de usuarios de Keycloak a través de la app de Spring Boot.
   - El **único rol** que podrá tener acceso a estos endpoints será el de _Administrador_ y los usuarios que lo tengan asignado.

    