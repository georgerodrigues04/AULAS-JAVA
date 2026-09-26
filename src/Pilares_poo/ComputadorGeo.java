package Pilares_poo;
import java.util.Scanner;

public class ComputadorGeo {
    static void main() {

        Scanner input = new Scanner(System.in);

        SistemaMensagem smi = null;


        System.out.print("Escolha o aplicativo de mensagem (MSN, Facebook, Telegram): ");
        String appEscolhido = input.nextLine();

        if (appEscolhido.equals("MSN")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("Facebook")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("Telegram")) {
            smi = new Telegram();
        } else {
            System.out.println("Aplicativo de mensagem não reconhecido.");
            return;
        }

        smi.enviarMensagem();
        smi.receberMensagem();


    }
}
