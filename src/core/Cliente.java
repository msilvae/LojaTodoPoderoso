package core;

public class Cliente {

		protected String nome;
		protected String email;
		protected double linhaCredito;
		protected double valorFatura;
		
		public Cliente(String nome, String email, double linhaCredito) {
			this.nome = nome;
			this.email = email;
			this.linhaCredito = linhaCredito;
		}

		
		//Getters & Setters
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public double getLinhaCredito() {
			return linhaCredito;
		}

		public void setLinhaCredito(double linhaCredito) {
			this.linhaCredito = linhaCredito;
		}

		public double getValorFatura() {
			return valorFatura;
		}

		public void setValorFatura(double valorFatura) {
			this.valorFatura = valorFatura;
		}
		
		
		//Métodos
		public boolean comprar(double valor) {
			
			if((this.valorFatura + valor) <= this.linhaCredito) {
				this.valorFatura += valor;
				return true;
			}else {
				return false;				
			}

		}

		
		public String exibirFatura() {
			return  "Limite disponível = R$ " + (this.linhaCredito - this.valorFatura) + "\n" +
					"Total da fatura a pagar: R$ " + this.valorFatura;
		}
		
		
		public void pagarFatura(double valor) {
						
			this.valorFatura -= valor;
			 
		}
		
}
