
public class TestaValores {
public static void main(String[] args) {
	Conta conta = new Conta();
	conta.setNumero(1337); //a conta agora é 1337
	System.out.println(conta.getNumero());
	conta.deposita(100); // depositando 100 e ficando com 100 de saldo
	System.out.println(conta.getSaldo());
	conta.setAgencia(120); // a agência agora é 120
	System.out.println(conta.getAgencia());
	conta.setSaldo(300); // definindo um novo saldo como 300
	System.out.println(conta.getSaldo());
}
}
