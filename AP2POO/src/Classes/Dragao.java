package Classes;
import ClassesAbstratas.Personagem;

public class Dragao extends Personagem{

	public Dragao(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	public void atirarFogo(){
		System.out.println("O dragao " + this.getNome() + " está atirando fogo. \n");
	}
	
	public void voar(){
		System.out.println("O dragao " + this.getNome() + " está voando. \n");
	}
	
	public void morder(){
		System.out.println("O dragao " + this.getNome() + " está mordendo. \n");
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
		System.out.println("O dragao " + this.getNome() + " está andando. \n");
	}

	@Override
	public void guardaItem() {
		// TODO Auto-generated method stub
		super.guardaItem();
		System.out.println("O dragao " + this.getNome() + " está guardando seu item. \n");
	}

	@Override
	public void usarItem() {
		// TODO Auto-generated method stub
		super.usarItem();
		System.out.println("O dragao " + this.getNome() + " está usando seu item. \n");
	}

	
}
