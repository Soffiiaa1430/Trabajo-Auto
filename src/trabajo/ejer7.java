package trabajo;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class ejer7 {
   public static void main (String[] arg) {
	   Traduccion();
	   }
    
    public static void Traduccion() {
        HashMap<String, String> diccionarioIngles = new HashMap<String, String>();
        diccionarioIngles.put("hello","hola");
        diccionarioIngles.put("love","amor");
        diccionarioIngles.put("cat","gato");
        diccionarioIngles.put("dog","perro");

         String palabra = JOptionPane.showInputDialog("ingrese la palabra que desea buscara");
         
         if(diccionarioIngles.containsKey(palabra)) {
        	 System.out.println("si lo contiene");
        	 System.out.println(palabra+ ":" +diccionarioIngles.get(palabra));
         }
    
    }
}