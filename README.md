# Programa-1-clubProgramacion-2020-A
  Realiza un programa que realice la siguiente serie. Solo debes tener un solo método que retorne un String con la serie solicitada y su parámetro sea un número entero positivo. Si el número no es positivo, solo retorna el número. Entrada: 22 Salida: 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1  Entrada: -22 Salida: -22 

TÍTULO DEL PROYECTO: Problema2 

PROPÓSITO DEL PROYECTO: Reforzar la lógica 

VERSIÓN o FECHA: 17/04/2020 

CÓMO INICIAR ESTE PROYECTO: se crea un objeto, se usa el método   CCollatz(), posterior a eso se usa el método String Serie(int numero) donde se introducirá el número y luego le aparecerá la serie.

AUTORES: PINEDA NIVÓN AIMÉE JAHDAÍ 19161382 


Explicación de cómo hice el programa:

Lo primero es identificar peculiaridades en la secuencia

       
   1) si el número es par, se lo divide por dos;
   2) si es impar, se le multiplica tres y se le suma uno;
   3) la sucesión termina al llegar a uno.
    
    jsjs esto lo supe cuando lo googlee xd :ccc 
    
 De ahí supe dos cosas má que da el problema
     4) sólo acepta números enteros positivos
     5) retorna un String con la serie (lo debemos aceptar en int y regresar en String y para evitar un error de compatibilidad(no sé si se diga así xd) debemos concatenar un espacio en blanco)
     6) Si el número no es positivo, solo retorna el número que se liga al punto número 3) porque si se ingresa el número uno se        
     rotarna 1.
     
 Ahora, lo anterior para mí  quiere decir que:
     a) necesito un if que sólo acepte números enteros positivos con su respectivo else xd que acepte todo aquel número entero que no cumpla con esa condición es decir que acepte todos os entero negativos y nuestro neutro 0
     b) ya se cuidó el bucle infinito con cero ahora se debe tener cuidado en no etrar en un bucle infinito con 1 es decir     la secuencia debe parar al llegar a 1  esto quiere decir que las instrucciones para que si es par o no.... sólo se van a  ejecutar mientras el numero que nos den se mayor a 1, lo cual suena  a se debe ocupar un while.
     c) en las instruciones con un buen if se separan  los casos
     d) y por último debemos recordar que para imprimir la serie debemos estar guardando los valores serie + numero en serie.
     
  Eso es todo :)
     
    
