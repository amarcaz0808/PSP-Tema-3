# PSP-Tema-3
## Ejemplos numerados
Estos ejemplos se corresponden con los apàrtados respectivos de los apuntes.

En la carpeta "Sockets_UDP" hay un proyecto de NetBeans para ejecutar la aplicación pasándole parámetros por la línea de argumentos. 
(este proyecto tiene establecido un mensaje a mandar por la línea de argumentos por defecto:)
http://javadhc.blogspot.com.es/2012/12/pasar-argumentos-al-programa-en-netbeans.html

En la carpeta "5 sockets UDP" tienes las clases EmisorUDP.java y ReceptorUDP.java para compilar desde la línea de comandos.

Es más cómodo compilar al modo tradicional desde la terminal de comandos con javac y ejecutar con java:

Por ejemplo primero compilas con:

~~~java
javac EmisorUDP.java
javac ReceptorUDP.java
~~~

Después para ejecutar el Receptor (y esperar los mensajes que le mande el emisor):

~~~java
java ReceptorUDP
~~~

Cada vez que queramos mandar un mensaje al receptor, por ejemplo:

~~~java
java EmisorUDP localhost "Hola que tal"
~~~
 
