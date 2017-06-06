package Classes;
import ClassesAbstratas.Personagem;
import Interfaces.ComportamentoHeroico;

public class Cavaleiro extends Personagem implements ComportamentoHeroico{

	public Cavaleiro(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		ComportamentoHeroico.super.atacar();
		System.out.println("O cavaleiro " + this.getNome() + " está atacando. \n");
	}

	@Override
	public void defender() {
		// TODO Auto-generated method stub
		ComportamentoHeroico.super.defender();
		System.out.println("O cavaleiro " + this.getNome() + " está se defendendo. \n");
	}

	@Override
	public void saltar() {
		// TODO Auto-generated method stub
		ComportamentoHeroico.super.saltar();
		System.out.println("O cavaleiro " + this.getNome() + " está saltando. \n");
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
		System.out.println("O cavaleiro " + this.getNome() + " está andando. \n");
	}

	@Override
	public void guardaItem() {
		// TODO Auto-generated method stub
		super.guardaItem();
		System.out.println("O cavaleiro " + this.getNome() + " está guardando sua espada. \n");
	}

	@Override
	public void usarItem() {
		// TODO Auto-generated method stub
		super.usarItem();
		System.out.println("O cavaleiro " + this.getNome() + " está usando sua espada. \n");
	}
	
}
