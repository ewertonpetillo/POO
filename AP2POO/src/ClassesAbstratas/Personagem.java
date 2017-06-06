package ClassesAbstratas;
import Interfaces.ComportamentoNormal;

public abstract class Personagem implements ComportamentoNormal{

	private String nome;

			
	public Personagem(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void andar() {
		// TODO Auto-generated method stub
		ComportamentoNormal.super.andar();
	}

	@Override
	public void guardaItem() {
		// TODO Auto-generated method stub
		ComportamentoNormal.super.guardaItem();
	}

	@Override
	public void usarItem() {
		// TODO Auto-generated method stub
		ComportamentoNormal.super.usarItem();
	}

	
}
