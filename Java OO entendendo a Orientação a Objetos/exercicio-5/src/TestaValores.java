
public class TestaValores {
public static void main(String[] args) {
	
        Conta conta = new Conta(853, 84728384); 
        System.out.println(conta.getAgencia()); // resultado esperado é o número da agência
        System.out.println(conta.getNumero()); // resultado esperado é o número da conta
        System.out.println(Conta.getTotal()); // resultado esperado é o total
    
}
}
