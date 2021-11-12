package br.com.alura.loja;

import br.com.alura.loja.dao.CarrinhoDAO;
import br.com.alura.loja.modelo.Carrinho;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class Servidor {

    static Carrinho carrinho = new CarrinhoDAO().busca(1l);

    public static void main(String[] args) {
        ResourceConfig config = new ResourceConfig().packages("br.com.alura.loja");
        URI uri = URI.create("http://localhost:8085");
        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
        System.out.println("Servidor rodando");
        System.out.println(carrinho.toJson());
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        server.shutdownNow();

    }
}
