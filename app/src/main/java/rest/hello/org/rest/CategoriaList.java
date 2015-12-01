package rest.hello.org.rest;

import java.util.ArrayList;
import java.util.List;

public class CategoriaList {
	private List<Categoria> categorias = new ArrayList<>();
	
	public List<Categoria> getCategorias(){
		return categorias;
	}
	
	public void setCategorias(List<Categoria> categorias){
		this.categorias = categorias;
	}
	
	//public String toString(){
		//return this.categorias.toString();
	//}

}
