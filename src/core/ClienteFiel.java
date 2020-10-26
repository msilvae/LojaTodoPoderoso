package core;

public class ClienteFiel extends Cliente {

	protected double descontoCompra;
	
	public ClienteFiel(String nome, String email, double linhaCredito) {
		super(nome, email, linhaCredito);
		// TODO Auto-generated constructor stub
	}

	public ClienteFiel(String nome, String email, double linhaCredito, double descontoCompra) {
		super(nome, email, linhaCredito);
		this.descontoCompra = descontoCompra;
	}


	//Métodos
	@Override
	public boolean comprar(double valor) {

		valor = valor * (1-(descontoCompra / 100));
		return super.comprar(valor);

	}
		
	
}
