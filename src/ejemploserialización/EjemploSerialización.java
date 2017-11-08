package ejemploserialización;

import java.io.FileOutputStream;// funcion para obtener objeto como archivo
import java.io.IOException; //funcion para manejo de excepciones
import java.io.ObjectOutputStream;// funcion para obtener objeto
import java.io.Serializable; //funcion para serializar

//estos 4 imports se podrian reemplazar por un import java.io*;

/*
Autor: Marcelo Aranda
Fecha(límite de entrega): 15/09/2017
*/

public class EjemploSerialización {

    public static void main(String[] args) {


        Unit one = new Unit();
        
        one.race = "Protoss";
        one.name = "Zealot";
        one.role = "Frontline";
        one.damage = 16;
        one.effectiveHp = 150;
        
        try {
            FileOutputStream fileOut
                    = new FileOutputStream("unidad.ser");//Esta linea determina a donde iria el archivo .ser(Si solo se escribe el nombre del archivo con su extension, el archivo queda guardado en el directorio raiz)
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(one);
            out.close();
            fileOut.close();
            System.out.printf("Serialización exitosa; se creo el archivo unidad.ser");//linea de codigo que envia mensaje de serializacion exitosa
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
    
}
