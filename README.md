
<h1 align="center">
  <div style="width:100%;display:flex;flex-direction:column;align-items:center;margin-bottom:10px;">
    <div style="align-items:center;margin-bottom:15px;">
      <a href="https://github.com/luisantoniofreitas" target="_blank">
        <img src="https://avatars.githubusercontent.com/luisantoniofreitas" 
            alt="Avatar GitHub" 
            width="150px" height="auto" 
            style="border:5px;border-style:solid;border-color:white;border-radius:50%;"></a>
    </div>
    Consultar CEP
    <br>
  </div>
</h1>

<h4 align="center">

  **ORACLE ONE | Alura | Desafio**  
  <kbd>2944: Consultar CEP
</h4>

<p align="center">
  <a alt="Java">
    <img src="https://img.shields.io/badge/Java-%23FFAA4A.svg?logoColor=000&style=flat-square&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAABHNCSVQICAgIfAhkiAAAAAlwSFlzAAAOxAAADsQBlSsOGwAAAxxJREFUWIXF112IlGUUB/Dfrlumsju2gboRRRsZGJGkJGhYF0VEFBaBIAVFYRdB3ZVIdCOoXUiI6IUIgnhjhVIUEllREEUQUtGHBZLaF+ZX6brmTjtdnDPOu9OOOzPs6B9e3neeeZ/zP895zvmf52XyMLedSd2T6MAzk2irZQzgNLouB3kP3sOJy0E+FW+igu2XmnwOPk3yv3BD4b8S7sL0TpHfiV+SvIxlmIEX8AW+w6JOkT+Ms0n+L57Gffg1x3bo4MqX4p8C+UoswTmM4pVOEVfxfZJX8FKOVfNgR6fJSwXyD3LsCpEDFTzVjtFWlPBv/J7Pu/Jexpl8frQdB6a0+H63SLifsTfHqiV3Mz7E4XYcaRY9+ETUfSnHpqnlxu5OklfRj/14uTD2UDrwWavG2umGJ3AP7sCsHDuY99fbsNcQs/Cc0Ph9WJ2kVad7cFs+v4a1xnbDbqzA1/gWT4xH0qh9zhH7OjN/v4EtYvVnheh0iWbUjxsxlPOuxQg2iAoZwMcYFIeWarQuiquwUyhcpcmrjJ+wUfSFItbnO8uajUAV00WYF6b3R0RoR0QkTuGoaEyHcL6Bnfdxr9jC/RNw/g8rRHi3qSVdEV24Ho+IY1lP3f/3iy37qFXiKtalgUre/8SP+EFEpH6b3hFbCPNF3uzDNeMZb/YMNw8P4Hax2pJY6TkcF8r4jWhMX6UjC0WrfltNNdvGoFDArWqrk04M4jFsEns8KRjA3UJwevGqsdl+XCRg2djwj4hcqEfTp+XZ4oQ7miQbxOpKeFHs5WFR38M4JkRmD1bh1gZ23xWaMSHWqK1mTbNeXwRXiuiVRVQnxC34TS3j9wo5XoSrm5g/VSTscmwW54chPFt4p684Yby9KeWE5aKMig3rjAj7aVEBRCL2poP9aXMEX4oK2I4/0rlVQuIvNK2JkqMkSm8urhO1PFOEdkoSDeOkmiIeEHkxnDZm43E8j7fyfgH1qlWPISE8fbnygyIJTzV4v1d8oDyIBaKSFggVfNI4atjKx+QAFguBuUlEo09EaUZeoyISR0QUPhfHtKONjP4HxJ7K18iRRpEAAAAASUVORK5CYII=" />
  </a>
</p>

<p align="center">
  <a href="#recursos">Recursos</a> •
  <a href="#funcionamento">Funcionamento</a> •
  <a href="#desafio">Desafio</a> •
  <!-- <a href="#download">Download</a> • -->
  <a href="#creditos">Créditos</a> •
  <a href="#licenca">Licença</a>
</p>

<!--
<h4 align="center">

*Demonstração*  
[GitHub Pages](https://luisantoniofreitas.github.io/estudo_alura_oracle_one_desafio_2944_consultar_cep_java/)
</h4>
-->

<!--
![screenshot](https://raw.githubusercontent.com/LuisAntonioFreitas/estudo_alura_oracle_one_desafio_2944_consultar_cep_java/main/assets/readme/screens.png)
-->

<p align="center">
  <img src="https://raw.githubusercontent.com/LuisAntonioFreitas/estudo_alura_oracle_one_desafio_2944_consultar_cep_java/main/assets/readme/screens.png">
</p>

## 📋 Recursos<a id="recursos"></a>

* Consultar CEP consumindo a API ViaCEP.

> **Nota**
>
> * Só são aceitos números.
> * Consumo dos dados da API (ViaCEP) para obter dados de CEPs.

---

## 🧭 Funcionamento<a id="funcionamento"></a>

* Oferece um menu interativo com opção de consulta de CEP, basta digitar a opção desejada e depois informar o CEP para receber dados detalhados sobre o mesmo. 

<!-- ```bash
# Clone this repository
$ git clone https://github.com/LuisAntonioFreitas/repository

# Go into the repository
$ cd repository

# Install dependencies
$ npm install

# Run the app
$ npm start
```

> **Nota**
> É possível acompanhar esse passo-a-passo, [neste guia](https://www/) ou usar o `node` via prompt de comando. -->

---

## 🏅 Desafio<a id="desafio"></a>

* Criar uma classe que representa um endereço (cep, uf, cidade, bairro, logradouro e complemento);
* Criar uma classe que consulta a API ViaCEP para buscar um endereço a partir de um cep;
* Criar uma classe que cria um arquivo json contendo os dados de um objeto Endereco;
* Criar uma classe com método main que deve solicitar ao usuário que informe um CEP e na sequencia utilizar as classes para consultar a API ViaCEP e salvar os dados do endereço em um arquivo json.
* **Observações**  
  * Utilize a biblioteca GSon para converter o JSON devolvido pela API ViaCEP em um objeto Endereco;
  * Utilize a biblioteca GSon para salvar um objeto Endereco em um arquivo .json;
  * O arquivo deve ter como nome o cep informado;


<!--

## 🔽 Download<a id="download"></a>
Faça [download](https://codeload.github.com/LuisAntonioFreitas/estudo_alura_oracle_one_desafio_2944_consultar_cep_java/zip/refs/heads/main) dos arquivos do repositório.  
O arquivo [figma](https://raw.githubusercontent.com/LuisAntonioFreitas/estudo_alura_oracle_one_desafio_2944_consultar_cep_java/main/alura_desafio_3257_tabela_fipe_java_spring.fig) e também o guia em [PDF](https://raw.githubusercontent.com/LuisAntonioFreitas/estudo_alura_oracle_one_desafio_2944_consultar_cep_java/main/alura_desafio_3257_tabela_fipe_java_spring_vfinal_1.pdf) do desafio estão disponíveis.

-->
---

## ⭐ Créditos<a id="creditos"></a>

* [Oracle One](https://www.oracle.com/br/education/oracle-next-education/)
* [Alura](https://www.alura.com.br/)
* [ViaCEP](https://viacep.com.br/)

---

## ©️ Licença<a id="licenca"></a>

MIT

---

<p align="center" style="margin-top:15px;">
  <a href="https://www.linkedin.com/in/luisantoniofreitas"
    target="_blank" alt="LinkedIn">
    <img src="https://img.shields.io/badge/LinkedIn-0A66C2?logo=linkedin&logoColor=fff&style=flat-square"
    target="_blank" 
    style="border:1px solid #000000;" /></a>
  <a href="https://github.com/luisantoniofreitas"
    target="_blank" alt="LinkedIn">
    <img src="https://img.shields.io/badge/GitHub-181717?logo=github&logoColor=fff&style=flat-square" 
    target="_blank" 
    style="border:1px solid #4f4f4f;" /></a>
</p>
