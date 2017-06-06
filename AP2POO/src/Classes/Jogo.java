package Classes;
import ClassesAbstratas.Personagem;;

public class Jogo {
	
	public void executaAcoesComuns(Personagem persona){
		if (persona instanceof Cavaleiro){
			persona.andar();
			persona.guardaItem();
			persona.usarItem();
			((Cavaleiro) persona).saltar();
			((Cavaleiro) persona).atacar();
			((Cavaleiro) persona).defender();
		}else if (persona instanceof Mago){
			persona.andar();
			persona.guardaItem();
			persona.usarItem();
			((Mago) persona).invisibilidade();
			((Mago) persona).ultraRapidez();
		}else if (persona instanceof Dragao){
			persona.andar();
			persona.guardaItem();
			persona.usarItem();
			((Dragao) persona).atirarFogo();
			((Dragao) persona).voar();
			((Dragao) persona).morder();
		}
	}
	
}
