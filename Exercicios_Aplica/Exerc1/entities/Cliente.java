package entities;

public class Cliente {
	
		private String name;
		
		private double altura;
		
		private double peso;

		public Cliente(String name, double altura, double peso) {
			super();
			this.name = name;
			this.altura = altura;
			this.peso = peso;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}
		
		public String imc() {
			double imc = this.peso / (this.altura * this.altura);
			return String.format("%.2f", imc);
		}
	
					
		
	}
	
