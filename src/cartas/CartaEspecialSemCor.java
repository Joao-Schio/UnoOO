package cartas;

public class CartaEspecialSemCor extends CartaComAcao {

	private String acao;


	
	public CartaEspecialSemCor(){

	}
	public CartaEspecialSemCor (String ac){
		this.acao = ac;
	}
	public String getAcao(){
		return this.acao;
	}
	public void setAcao(string ac){
		this.acao = ac;
	}

	@Override
	public final Cor getCor() throws CartaSemCor{
		return "Essa carta nao possui cor";
	}
	
}
