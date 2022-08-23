import java.util.List;

public class Discord {

	private List<Pessoa> pessoas;
	private String conteudo;
	private ResultadoEnum resultado;
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public ResultadoEnum getResultado() {
		return resultado;
	}
	public void setResultado(ResultadoEnum resultado) {
		this.resultado = resultado;
	}
	
	
}
