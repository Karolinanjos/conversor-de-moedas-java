<h1 align="center">💱 Challenge: Conversor de Moedas – <a href="https://www.alura.com.br">Alura</a> 💰</h1>

<p align="center">
  <img src="https://img.shields.io/badge/status-Concluído-brightgreen">
  <img src="https://img.shields.io/badge/feito%20com-Java-007396?logo=java">
</p>

<p align="center"><strong>💻✨ Karolina Anjos – Dev Java</strong></p>

---

<h2 align="center">✅ Projeto Finalizado</h2>

Este projeto foi desenvolvido como parte da formação **Back-End Java com Orientação a Objetos (GB/ONE)** pela [Alura](https://www.alura.com.br).
Aqui, criei um **conversor de moedas simples, funcional e 100% em Java**, com consumo de API real e estrutura de código bem organizada.

---

<h2 align="center">🎬 Demonstração</h2>

<p align="center">
  <em>⬇️ Aqui você pode incluir um vídeo ou GIF mostrando o projeto em funcionamento:</em><br><br>
  <strong>📽️ Exemplo:</strong><br>
  <img src="https://raw.githubusercontent.com/Karolinanjos/assets/main/demo-conversor.gif" alt="Demonstração Conversor de Moedas" width="600px">
</p>

---

<h2 align="center">🌐 API Utilizada</h2>

- [ExchangeRateAPI](https://www.exchangerate-api.com/): API gratuita para taxas de câmbio em tempo real
- ✅ Sem autenticação | Atualizações rápidas | Fácil integração

---

<h2 align="center">📚 Tecnologias e Conceitos Aplicados</h2>

- ☕ Java 17+
- 🌐 `HttpClient` para chamadas HTTP
- 🔄 `Gson` para trabalhar com JSON
- 📦 Uso de `record` para modelagem de dados
- 🚨 Exceções personalizadas
- 🧩 Organização por camadas (MVC)
- 🧼 Código limpo e modular

---

<h2 align="center">🧰 Ferramentas</h2>

- 💻 [Eclipse IDE](https://www.eclipse.org/): Ambiente de desenvolvimento

---

<h2 align="center">📦 Estrutura do Projeto</h2>

├── application
│   └── Main.java                     # Interface principal via terminal
├── controller
│   └── MoedaController.java          # Lógica de controle das conversões
├── service
│   └── ConversorService.java         # Comunicação com a API externa
├── models
│   ├── Moeda.java
│   └── MoedaExchangeRateAPI.java     # Record para mapear o JSON da API
├── utils
│   └── GsonConfig.java               # Configuração global do Gson
├── exceptions
│   └── ErroDeConversaoDeMoedaException.java
└── README.md

---

<h2 align="center">🧮 Funcionalidades</h2>
🔄 Conversão de moedas em tempo real

💬 Interface simples via terminal

💱 Conversões disponíveis:

USD ⇄ ARS (Peso Argentino)

USD ⇄ BRL (Real Brasileiro)

USD ⇄ COP (Peso Colombiano)

´´´

---

<h2 align="center">▶️ Como Executar</h2>

Clone o repositório:

git clone https://github.com/Karolinanjos/conversor-de-moedas
cd conversor-de-moedas

---

Compile e execute:

javac -d bin src/**/*.java
java -cp bin application.Main

---

Use o terminal para realizar as conversões.

---

<h2 align="center">📌 Exemplo no Terminal</h2>

---

Selecione uma opção

1) Dólar(USD) -> Peso argentino(ARS)
2) Peso argentino(ARS) -> Dólar(USD)
3) Dólar(USD) -> Real brasileiro(BRL)
4) Real brasileiro(BRL) -> Dólar(USD)
5) Dólar(USD) -> Peso colombiano(COP)
6) Peso colombiano(COP) -> Dólar(USD)
7) Sair

---

Opção: 4

Digite o valor para converter:  590
Taxa utilizada: 0,1700
Valor de entrada: 590,00 BRL
Valor convertido: 100,30 USD

<h2 align="center">🔧 Requisitos</h2>

☑️ JDK 17 ou superior
☑️ Acesso à internet (API externa)

---

<h2 align="center">📢 Agradecimento</h2>

Agradeço à Alura pela trilha de aprendizado, prática e inspiração para esse projeto.
E a todos que apoiam meu crescimento na programação! 💚

---

<h2 align="center">🤝 Contribuindo</h2>
Quer colaborar?

Faça um fork 🍴

Crie uma branch: git checkout -b minha-feature

Faça suas alterações

Envie um pull request explicando a melhoria

---

<h2 align="center">📫 Contato</h2>

🐙 GitHub: Karolinanjos
🧩 LinkedIn: Karolina Anjos

---

<h2 align="center">📄 Licença</h2>

Este projeto é de uso educacional e não comercial.
Para fins comerciais, consulte os termos da ExchangeRateAPI.
