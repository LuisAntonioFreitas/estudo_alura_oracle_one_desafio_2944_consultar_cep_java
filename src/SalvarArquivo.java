import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class SalvarArquivo {

    public void FormatoJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String arquivo = endereco.cep() + ".json";
        FileWriter escrever = new FileWriter(arquivo);
        escrever.write(gson.toJson(endereco));
        escrever.close();
    }
}
