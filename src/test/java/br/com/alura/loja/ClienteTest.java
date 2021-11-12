package br.com.alura.loja;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;

import org.junit.Assert;
import org.junit.Test;


/*import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;*/

public class ClienteTest {

    @Test
    public void testaConexaoServidor(){

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://alefrazao-apirest.herokuapp.com");
        String conteudo = target.path("/api/produtos").request().get(String.class);
        Assert.assertTrue(conteudo.contains("Celular Xiaomi 8 Pro"));




    }
}
