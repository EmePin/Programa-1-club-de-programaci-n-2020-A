
/**
 * Description of class SerieCollatz here.
 * Realiza un programa que realice la siguiente serie. 
 * Solo debes tener un solo método que retorne un String con la serie solicitada y 
 * su parámetro sea un número entero positivo. 
 * Si el número no es positivo, solo retorna el número. 
 * Entrada: 22 Salida: 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
 * Entrada: -22 Salida: -22
 * @author (Aimée Jahdaí Pineda Nivón 19161382:) 
 * @version (17/04/2020)
 */
public class CCollatz 
{// inicio de la clase
   
    /**
     * Campos de clase
       */

    private int numero;// variable global tipo entero que guardará el valor que el usuario ingrese y los que se generen en el proceso hasta llegar a 1 (si es que siempre ) 
    private String serie;// variable global tipo String( esto con el fin de que el resultado final de la serie sea tipo String) que guardará los valores a imprimir en serie
    /**
     * Constuctor para la clase CCollatz 
       */
    public CCollatz ()
    {// inicio del método constructor CerieCollatz 
        numero = 0;// inicializamos número con valor 0
        serie = " ";// inicializamos serie con valor de un espacio en blanco jsjs
    
    }//fin del método constructor CCollatz 
    /**
     
     * @param numero El parametro numero define el numero que va a acceder el usuario
      *@return devuelve la serie que se formó con  los números ahora en tipo String
       */
    public String Serie(int numero)
    {//inicio del método Serie con el parámetro tipo entero número
        
        serie = numero + " ";// inicializamos la variable serie con el valor del número que se va a ingresar y le concatenamos un espacio vacío para que no dé un error de sintaxis por recibir un int cuando lo declaramos y lo pide el programa como String
        if(numero > 0){// inicio del if con condición que acepta  enteros positivos
            while(numero > 1){//se repite  mientras el numero que ingrese sea mayor a 1; la sentencia while cuya condición evita que se continúe la serie al llegar a uno se evalúa antes de cada vuelta del bucle
                
                if(numero % 2 == 0)// inicio del if con la condición que compara que al dividir el numero ingresado entre dos su residuo sea 0 es decir sea  par 
                    
                    numero = numero / 2;// fin del if con instrucción que de ser cierto  el if que la genera entonces se ejecutará
                
                    else// inicio del else
                    numero = numero * 3 + 1; // fin del else con la instrucción que de ser cierto el que no sea cierto xd el segundo if entonces
                
                    serie += numero + " ";//instrucción que concatena a la serie el valor de número es decir que ahora el valor de serie es el/los valor/es de antes + numero
          
                    
            
            }//fin del while
        }// fin del if
        else// inicio del else
            serie = numero + " ";//fin del else con la  instrucción que le asigna a serie los valores del numero que no cumpla con el primer if 
        return serie;// devuelve/imprime la serie que se formó con  los números ahora en tipo String
    }// fin del método serie
} // fin de la clase

