package rest.hello.org.rest;

public class Categoria {
	private int idCategoria;
	private String nomeCategoria;
	private boolean origem;
	
	public Categoria(){}
	
	public Categoria(int idCategoria, String nomeCategoria, boolean origem){
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
		this.origem = origem;

	}
	
	public int getIdCategoria(){
		return idCategoria;
	}
	
	public void setIdCategoria(int idCategoria){
		this.idCategoria = idCategoria;
	}
	
	public String getNomeCategoria(){
		return nomeCategoria;
	}
	
	public void setNomeCategoria(String nomeCategoria){
		this.nomeCategoria = nomeCategoria;
	}
	
	public boolean isOrigem(){
		return origem;
	}
	
	public void setOrigem(boolean origem){
		this.origem = origem;
	}
}
