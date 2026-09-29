package Java_IO;

import java.io.File;
import java.io.IOException;

public class Java_IO {
    public  static  void main(String[] args) {

        File direitorio = new File("c:\\Users\\User\\Documentss\\Java");
        System.out.println(direitorio.exists()? "Diretorio existe" : "Diretorio não existe");
        if(!direitorio.exists()){
            direitorio.mkdir();
            System.out.println("Criando diretorio");
        }

        try {
            File arquivo = new File(direitorio, "arquivo.txt");
            arquivo.createNewFile();
            System.out.println("Arquivo criado com sucesso");
        } catch (IOException e) {
            e.printStackTrace();
        }





    }
}
