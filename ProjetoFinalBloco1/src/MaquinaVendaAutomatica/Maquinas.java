package MaquinaVendaAutomatica;

public class Maquinas {
		private String codigoDaMaquina;
		private String fabricante;
		
		public Maquinas(String codigoDaMaquina, String fabricante) {
			this.codigoDaMaquina = codigoDaMaquina;
			this.fabricante = fabricante;
		}

		public String getCodigoDaMaquina() {
			return codigoDaMaquina;
		}

		public void setCodigoDaMaquina(String codigoDaMaquina) {
			this.codigoDaMaquina = codigoDaMaquina;
		}

		public String getFabricante() {
			return fabricante;
		}

		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}
		
		public void LigarMaquina(String som)
		{
			System.out.println("\n...A máquina foi ligada..."+som+"\n");
		}
		
		public void DesligarMaquina(String som)
		{
			System.out.println("\n...A máquina foi desligada..."+som+"\n");
		}

}
