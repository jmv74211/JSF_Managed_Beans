# JSF-Managed Beans básico en Java
## Autor: Jonathan Martín Valera
### Repositorio creado para la asignatura de *Desarrollo de software basado en componentes y servicios* en el máster de ingeniería informática en Granada
#### Fecha de realización: Noviembre 2018

---

# Tabla de contenidos

<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->

- [Descripción](#Descripción)
- [Herramientas utilizadas](#herramientas-utilizadas)
- [Desarrollo e implementación](#desarrollo-e-implementaci%C3%B3n)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

---

# Descripción

Programación de un componente utilizando el framework JSF· Para ello, se ha utilizado el patrón Demointerceptor
que será utilizado para el manejo de eventos asíncronos.

El objetivo de esta aplicación es calcular la velocidad inicial del automóvil simulado a
 partir de un dato de entrada, que se captura con un formulario html,
 para luego instalar un controlador de eventos que reacciona cuando el
 usuario pulsa uno de los botones programados: Encender, Acelerar, Frenar y Apagar

Los estados del panel de control de vehículo son los siguientes:

**Estado apagado**

![img](https://raw.githubusercontent.com/jmv74211/JSF_Managed_Beans/master/images/estado_apagado.png)

**Estado encendido**

![img](https://raw.githubusercontent.com/jmv74211/JSF_Managed_Beans/master/images/estado_encendido.png)

**Estado acelerando**

![img](https://raw.githubusercontent.com/jmv74211/JSF_Managed_Beans/master/images/estado_acelerando.png)

Para más información acerca de su funcionamiento, se puede consultar **[enlace a vídeo youtube](https://youtu.be/NpkT6tJV5Zg)**.

Consideraciones:

 - Para empezar a acelerar el vehículo, el motor debe de estar encendido.
 - Para poder frenar el vehículo, el motor debe de estar acelerando
 - Para poder apagar el motor del vehículo, el motor debe de estar frenado o parado.

  En caso contrario, se mostrará un mensaje de error como el siguiente:

  ![img](https://raw.githubusercontent.com/jmv74211/JSF_Managed_Beans/master/images/error.png)
---

# Herramientas utilizadas

- IDE: Eclipse Java EE IDE for Web Developers. Version: Neon.3 Release (4.6.3)
- Java: 1.8.
- Server: Apache Tomcat 9.0

---

# Desarrollo e implementación

Para documentar esta práctica, he decidido grabar un vídeo y subirlo a youtube donde
muestro como he diseñado la práctica y cuál es el resultado de su implementación.

Enlace a vídeo donde se explica el desarrollo de la práctica 1: https://youtu.be/NpkT6tJV5Zg

En primer lugar se debe de importar el proyecto en eclipse. Tras importarlo, podemos ejecutar
la aplicación de dos formas diferentes:

- La primera de ellas es ejecutando el proyecto en el servidor (run as server, y elegimos
tomcat). Automáticamente se desplegará una nueva ventana en eclipse donde se
ejecutará la aplicación.

- La segunda de ellas es ejecutando el main construido en la clase Demointerceptor,
ubicada en el paquete interceptor que contiene las clases con las que se ha construido
el patrón interceptor. Tras ejecutar este main, se nos ejecutarán una serie de filtros,
que en este caso es una impresión por pantalla de una distancia y una velocidad.
Posteriormente se nos abrirá un navegador web donde se ejecutará la aplicación.
