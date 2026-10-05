package Expressoes;

public class ExpressoesSimples {
    public static void main(String[] args) {
        String nome = "João";
        String sobrenome = "Silva";

        Integer matricula = 12345;
        Double salario = 2500.50;

        String texto =  String.format("Meu nome é %s e meu sobrenome é %s, minha matrícula é %d e meu salário é R$ %,.2f", nome, sobrenome, matricula, salario);
        System.out.println(texto);
    }
}
