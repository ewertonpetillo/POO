package Classes;

import java.util.ArrayList;
import ClassesAbstratas.Personagem;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Questao 4 - Letra A
		ArrayList<Personagem> personagens = new ArrayList<Personagem>();
		Cavaleiro cav1 = new Cavaleiro("Andromeda");
		Cavaleiro cav2 = new Cavaleiro("Onix");
		Mago mago1 = new Mago("Turim");
		Mago mago2 = new Mago("Odin");
		Dragao dragao1 = new Dragao("Banguela");
		Dragao dragao2 = new Dragao("Jiuly");
		
		personagens.add(cav1);
		personagens.add(cav2);
		personagens.add(mago1);
		personagens.add(mago2);
		personagens.add(dragao1);
		personagens.add(dragao2);
		
		//Questao 4 - Letra B
		Jogo play = new Jogo();
		for(int i=0; i < personagens.size(); i++){
			play.executaAcoesComuns(personagens.get(i));
		}
		
		//Questao 4 - Letra C
		Personagem p = new Mago("Harry");
		if (p instanceof Mago){ //Casting tranformando personagem p em Mago
			Mago mago = (Mago) p;
			mago.invisibilidade();
		}
		
	}

}
