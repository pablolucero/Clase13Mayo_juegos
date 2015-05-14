package presentacion;

import java.util.Scanner;

public class IOManager {

    public static void print(String s){
        System.out.println(s);
    }

    public static int leerEntero(String mensajeInicio, String mensajeError){
        IOManager.print(mensajeInicio);
        Scanner scan=new Scanner(System.in);
        while(!scan.hasNextInt()){
            IOManager.print(mensajeError);
            scan.next();
        }
        return scan.nextInt();
    }

    public static String leerLinea(String mensajeInicio){
        IOManager.print(mensajeInicio);
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextLine()) {
            scan.close();
            return scan.nextLine();
        } else {
            scan.close();
            return "";
        }
    }

}
