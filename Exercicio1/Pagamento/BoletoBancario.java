package pagamento;

public class BoletoBancario implements Pagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado com Boleto Bancário.%n", valor);
    }
}
