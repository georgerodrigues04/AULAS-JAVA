package Pilares_poo;

public class SistemaMensagem {

    public void enviarMensagem() {
        if (validarConexao()) {
            System.out.println("Enviando mensagem");
        }else{
            System.out.println("Falha na conexão. Não foi possível enviar a mensagem.");
        }


    }

    public void receberMensagem() {

        System.out.println("Recebendo mensagem");
    }

    private boolean validarConexao() {
        //System.out.println("Validando conexão com o servidor...");
        return true;
    }

}
