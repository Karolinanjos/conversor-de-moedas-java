<h1 align="center">💱 Challenge Conversor de Moedas [alura](https://www.alura.com.br) 💰<br> <img stc="https://img.schields.io/badge/status-Concluído-green"></h1>

---

<h2 align="center">✅ Projeto concluído! ✅</h2>

Este projeto faz parte da formação **Back-End Java Orientado a Objetos GB - ONE** [alura](https://www.alura.com.br).
---

<h2 align="center">🌐 API Utilizada</h2>

Este projeto utiliza a [ExchangeRateAPI](https://www.exchangerate-api.com/), uma API gratuita e sem necessidade de autenticação, que fornece taxas de câmbio atualizadas em tempo real entre diversas moedas.

---

<h2 align="center">🖥️ Tecnologias e Conceitos Utilizados</h2>

- Java 17+
- API HTTP (`java.net.http.HttpClient`)
- Deserialização JSON com [Gson](https://github.com/google/gson)
- Manipulação de registros em Java (`record`)
- Tratamento de exceções personalizado

---

<h2 align="center">🛠️ Tecnologias e Ferramentas</h2>

- 💻 [Eclipse IDE](https://www.eclipse.org/): Ambiente de desenvolvimento integrado.

---

<h2 align="center">📦 Organização do Projeto</h2>

```plaintext
├── application
│   └── Main.java             # Interface principal via terminal
├── controller
│   └── MoedaController.java  # Lógica de controle das conversões
├── service
│   └── ConversorService.java # Comunicação com a API externa
├── models
│   ├── Moeda.java
│   └── MoedaExchangeRateAPI.java # Record para mapear o JSON da API
├── utils
│   └── GsonConfig.java       # Configuração global do Gson
├── exceptions
│   └── ErroDeConversaoDeMoedaException.java
└── README.md
```

---

<h2 align="center">🧮 Funcionalidades</h2>

- Consulta em tempo real das taxas de câmbio.
- Conversão entre:
  - Dólar (USD) e Peso Argentino (ARS)
  - Dólar (USD) e Real Brasileiro (BRL)
  - Dólar (USD) e Peso Colombiano (COP)
- Interface simples via terminal.

---

<h2 align="center">▶️ Como Executar</h2>

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/renancvitor/conversor-de-moedas
   ```
   ```bash
   cd conversor-de-moedas
   ```
3. **Compile e execute**:
   ```bash
   javac -d bin src/**/*.java
   java -cp bin application.Main
   ```
5. **Siga as instruções no terminal para realizar as conversões.**

---

<h2 align="center">📌 Exemplo de Uso</h2>

```scss
***************************************
Selecione uma opção
1) Dólar(USD) -> Peso argentino(ARS)
2) Peso argentino(ARS) -> Dólar(USD)
3) Dólar(USD) -> Real brasileiro(BRL)
4) Real brasileiro(BRL) -> Dólar(USD)
5) Dólar(USD) -> Peso colombiano(COP)
6) Peso colombiano(COP) -> Dólar(USD)
7) Sair
***************************************
Opção: 4

Digite o valor para converter:  590
Taxa utilizada: 0,1700
Valor de entrada: 590,00 BRL
Valor convertido: 100,30 USD
```
---

<h2 align="center">🔧 Requisitos</h2>

- JDK 17 ou superior
- Acesso à internet (para consultar a API de câmbio)

---

<h2 align="center">📢 Agradecimento</h2>

Agradeço à [alura](https://www.alura.com.br) por essa oportunidade de aprendizado contínuo e por incentivar o desenvolvimento de habilidades de programação de forma estruturada e desafiadora. 🚀

---

<h2 align="center">🤝 Contribuições</h2>

Se você quiser contribuir para o projeto, siga estas etapas:

1. Faça um fork deste repositório.
2. Crie uma nova branch (`git checkout -b feature/alguma-coisa`).
3. Faça suas mudanças.
4. Envie um pull request explicando as mudanças realizadas.

Obrigado pelo interesse em contribuir!

---

<h2 align="center">📫 Contato</h2>

Se tiver dúvidas ou sugestões, entre em contato:

- 📧 **E-mail**: [renan.vitor.cm@gmail.com](mailto:renan.vitor.cm@gmail.com)
- 🐦 **GitHub**: [renancvitor](https://github.com/renancvitor)
- 🟦 **LinkedIn**: [Renan Vitor](https://www.linkedin.com/in/renan-vitor-developer/)

---

<h2 align="center">📄 Licença</h2>

Este projeto é de livre uso para fins educacionais. Para fins comerciais, consulte a licença da API utilizada.
