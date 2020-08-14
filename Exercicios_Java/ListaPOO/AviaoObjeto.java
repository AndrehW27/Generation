package ListaPOO;

public class AviaoObjeto {
	
	public static void main(String[] args) {
		
		Aviao airbus = new Aviao("Airbus A300","270","São Paulo","Nova York",0,0,100,12.0,0.0);
		
		airbus.imprimirInfo();
		
		System.out.println("\n\n...Após 4 horas de vôo...");
		airbus.setTempoDecorrido(4);
		airbus.setLocalAtual("Amazonas");
		airbus.setAlturalAtual(10000);
		airbus.setVelocidadelAtual(600);
		airbus.setCombustivelAtual(85);
		airbus.getinfosAtualizadas();
		
		System.out.println("\n\n...Após 2 horas de vôo...houve uma falha no motor e um pouso forçado deve ser feito...");
		airbus.setTempoDecorrido(2);
		airbus.setLocalAtual("México");
		airbus.setAlturalAtual(5000);
		airbus.setVelocidadelAtual(400);
		airbus.setCombustivelAtual(75);
		airbus.getinfosAtualizadas();
		
		System.out.println("\n\n...O pouso ocorreu com sucesso, agora os passageiros devem embarcar em outra aeronave...");
		airbus.setLocalAtual("México");
		airbus.setAlturalAtual(0);
		airbus.setVelocidadelAtual(0);
		airbus.setCombustivelAtual(70);
		airbus.getinfosAtualizadas();
	}

}
