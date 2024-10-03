import java.io.File;

public class Main {
    public static void main(String[] args) {

       String path = ".";
       if (args.length > 0) {
           path = args[0];

           //Creación de la ubicación del archivo
           File f = new File(path);
           new File("resources" + File.separator + "archivo.txt");
           File[] archivos = f.listFiles();

           //.EXISTS()
           if(f.exists()){
               System.out.println("Archivo existente");
           }else System.out.println("Archivo no encontrado");

           //.IS A DIRECTORY o .IS FILE
           if(f.isDirectory()){
               System.out.println("Es un directorio");
           } else if(f.isFile()) {
               System.out.println("Es un archivo");
           }

           //.LENGTH
           int longitudArchivo = (int)f.length();
           System.out.println("El tamaño del archivo es de " + longitudArchivo + " bytes");

           //OBTENER EL DIRECTORIO PADRE ()
           String directorioPadre = f.getParent();
           System.out.println(directorioPadre);

           String directorioAbsolutoPadre = f.getParentFile().getAbsolutePath();
           System.out.println(directorioAbsolutoPadre);

           //LISTAR CONTENIDO DE UN DIRECTORIO

           /* String listarContenido = f.listFiles().toString();
           System.out.println(listarContenido);  */

           //CREAR ARCHIVOS










       }


        }
    }
