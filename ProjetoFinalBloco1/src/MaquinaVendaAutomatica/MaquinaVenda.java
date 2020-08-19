package MaquinaVendaAutomatica;

public class MaquinaVenda {
		private String codigoDaMaquina;

		public MaquinaVenda(String cosigoDaMaquina) {
			super();
			this.codigoDaMaquina = cosigoDaMaquina;
		}

		public String getCosigoDaMaquina() {
			return codigoDaMaquina;
		}

		public void setCosigoDaMaquina(String cosigoDaMaquina) {
			this.codigoDaMaquina = cosigoDaMaquina;
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
