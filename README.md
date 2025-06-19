
# Testes Automatizados com Selenide e Cucumber - DemoQA

Este projeto realiza testes automatizados de interface gráfica utilizando Java, Selenide e Cucumber, tendo como alvo o site de demonstração [DemoQA](https://demoqa.com/).

## 🧪 O que é testado

O projeto cobre diversos componentes da interface gráfica:

- Alerts
- Botões (Buttons)
- Checkboxes
- Drag and Drop
- Propriedades Dinâmicas
- Login
- Menus
- Seletores (Dropdowns)
- Tooltips

## 🔧 Tecnologias Utilizadas

- Java 11+
- Selenide
- Cucumber
- JUnit
- Maven

## 📁 Estrutura do Projeto

```
src
├── test
│   ├── java
│   │   ├── commons           # Configuração de browser e propriedades
│   │   ├── pageObjects       # Page Objects do site DemoQA
│   │   └── stepDefinitions   # Passos Gherkin definidos em Java
│   └── resources
│       ├── features          # Cenários de testes em Gherkin
│       └── config            # Configurações adicionais (se houver)
```

## 🚀 Como executar os testes

1. Clone este repositório:

```bash
git clone https://github.com/seu-usuario/testes-selenide-demoqa.git
cd testes-selenide-demoqa
```

2. Execute os testes com Maven:

```bash
mvn clean test
```

## 💡 Observações

- O projeto utiliza o padrão Page Object Model (POM) para garantir a manutenção e escalabilidade.
- Todos os cenários estão descritos em arquivos `.feature` seguindo a linguagem Gherkin.

## 👤 Autor

Antônio de Sousa – [LinkedIn](https://www.linkedin.com/in/seu-perfil)
