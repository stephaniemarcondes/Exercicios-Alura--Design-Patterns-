class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	public Conta(int agencia, int numero){
		total++;
		this.agencia = agencia;
	    this.numero = numero;
	    this.saldo = 100; 
	    System.out.println("Estou criando uma conta");
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;

		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	
	
	public void setSaldo(double saldo) {

		this.saldo = saldo;
	}


	public int getAgencia() {
		return this.agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setAgencia(int agencia) { 
        if (agencia <= 0) { 
            System.out.println("nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;            
    }

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal(){
	    return Conta.total;
	}
}
