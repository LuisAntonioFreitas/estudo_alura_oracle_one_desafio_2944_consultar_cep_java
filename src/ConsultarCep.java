import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarCep {

    public Endereco Buscar(String cep) {
        String linkBase = "https://viacep.com.br/ws/";
        String linkComplemento = "/json/";
        URI link = URI.create(linkBase + cep + linkComplemento);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(link)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("Problema com a consulta do CEP, tente novamente.\n");
            return null;
        }
    }
}
