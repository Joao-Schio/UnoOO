package cartas;

public class CartaEspecialSemCor extends CartaComAcao {

	private String acao;
	/**
	 * @author joao-schio
	 * guarda a acao da carta
	 */

	public CartaEspecialSemCor () {
	/**
	 * @author joao-schio
	 * cria o objeto
	 * 
	 */
	}
	public CartaEspecialSemCor (String ac){
		this.acao = ac;
	/**
	 * @author joao-schio
	 * Cria e define a acao
	 */
	}

	public void setAcao(String ac){
		this.acao = ac;
	/**
	 * @author joao-schio
	 * seta a acao da carta 
	 */
	}

	public String getAcao(){
		return this.acao;
	/**
	 * @author joao-schio
	 * devolve a acao da carta 
	 */
	}
	
	public final Cor getCor(){


	/**
	 * @author joao-schio
	 * CartaEspecialSemCor nao possui cor
	 * ainda eh preciso criar uma exception para esse caso 
	 */

	}
}
