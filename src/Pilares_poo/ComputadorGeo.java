package Pilares_poo;

public class ComputadorGeo {
    static void main() {
        MSNMessenger msnMessenger = new MSNMessenger();
        msnMessenger.enviarMensagem();
        msnMessenger.receberMensagem();


        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();

        FacebookMessenger facebookMessenger = new FacebookMessenger();
        facebookMessenger.enviarMensagem();
        facebookMessenger.receberMensagem();


    }
}
