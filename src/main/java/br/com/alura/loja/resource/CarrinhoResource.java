package br.com.alura.loja.resource;

import br.com.alura.loja.dao.CarrinhoDAO;
import br.com.alura.loja.modelo.Carrinho;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/v1/carrinhos")
public class CarrinhoResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String busca(){
      Carrinho carrinho = new CarrinhoDAO().busca(1L);
    return carrinho.toJson();
    }
}
