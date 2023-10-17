package smartphone;

import funcionalidades.Internet;
import funcionalidades.Musica;
import funcionalidades.Telefone;

public class Iphone implements Internet, Musica, Telefone {

	@Override
	public void ligar() {
		System.out.println("Ligando...");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendido!");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
		
	}

	@Override
	public void tocarMusica() {
		System.out.println("Tocando música");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecione outra música");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausado!");
		
	}

	@Override
	public void navegar() {
		System.out.println("Navegando na internet");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo Nova Aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Recarregando a página");
		
	}
	
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.adicionarNovaAba();
		
		
	}
	
}
