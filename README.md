# 📦 Delivery System API

Esta é uma API REST robusta projetada para gerenciar operações de logística e sistemas de entrega. O projeto demonstra a aplicação de padrões de arquitetura de software modernos e o uso do ecossistema Spring Boot para criar um sistema escalável e organizado.

## 🚀 Estrutura do Projeto (Arquitetura em Camadas)

O sistema foi desenvolvido utilizando a separação de responsabilidades para facilitar a manutenção e testes:

* **Models:** Entidades JPA que representam as tabelas do banco de dados (Cliente, Entregador, Funcionário e Produto).
* **Repositories:** Interfaces baseadas em `JpaRepository` para abstração da camada de dados e consultas personalizadas.
* **Services:** Camada de lógica de negócio onde são aplicadas as validações (ex: verificação de duplicidade de e-mail ou lote).
* **Controllers:** Endpoints REST que gerenciam a comunicação entre o cliente e o servidor.
* **Global Exception Handling:** Centralizador de erros que utiliza `@RestControllerAdvice` para retornar respostas HTTP padronizadas e amigáveis.

## 🛠️ Tecnologias e Ferramentas

* **Linguagem:** Java 17
* **Framework:** Spring Boot 3
* **Banco de Dados:** MySQL (Persistência Relacional)
* **Persistência:** Spring Data JPA / Hibernate
* **Validação:** Custom logic em Services e Exceptions customizadas.
* **Gerenciador de Dependências:** Maven

## 📋 Módulos da API

### 👤 Clientes
* Cadastro de perfis com endereço e forma de pagamento.
* Busca por e-mail e gestão completa (CRUD).

### 🚚 Entregadores
* Controle de veículos e placas.
* Gestão de dados de contato e localização.

### 👥 Funcionários
* Administração interna de RH (setor, salário, matrícula).
* Controle de dados pessoais e profissionais.

### 📦 Produtos (Inventário)
* Gestão de estoque por categorias.
* Controle de lotes e datas de validade para segurança logística.

### ⚠️ Tratamento de Erros
A API possui um sistema de tratamento de exceções global. Caso ocorra um erro (ex: tentar cadastrar um cliente com e-mail já existente), a API retornará:

Status HTTP 409 (Conflict): Para dados duplicados.

Status HTTP 400 (Bad Request): Para dados inválidos.
