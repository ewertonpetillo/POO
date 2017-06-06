package Classes;
import ClassesAbstratas.Personagem;
import Interfaces.ComportamentoMagico;

public class Mago extends Personagem implements ComportamentoMagico{

	public Mago(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void invisibilidade() {
		// TODO Auto-generated method stub
		ComportamentoMagico.super.invisibilidade();
		System.out.println("O mago " + this.getNome() + " está invisivel. \n");
	}

	@Override
	public void ultraRapidez() {
		// TODO Auto-generated method stub
		ComportamentoMagico.super.ultraRapidez();
		System.out.println("O mago " + this.getNome() + " está modo UltraRapido. \n");
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	@Override
	public void andar() {
		// TODO Auto-generated method stub
		super.andar();
		System.out.println("O mago " + this.getNome() + " está andando. \n");
	}

	@Override
	public void guardaItem() {
		// TODO Auto-generated method stub
		super.guardaItem();
		System.out.println("O mago " + this.getNome() + " está guardando seu item. \n");
	}
	

	@Override
	public void usarItem() {
		// TODO Auto-generated method stub
		super.usarItem();
		System.out.println("O mago " + this.getNome() + " está usando seu item. \n");
	}
		
}
