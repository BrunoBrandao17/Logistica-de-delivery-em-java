# 📦 Logistics Management API

Este projeto é uma solução completa de backend para gestão de sistemas de entrega e logística. Desenvolvido com **Java** e **Spring Boot**, a API permite o controle de fluxos operacionais, desde a administração de pessoas internas até a entrega final ao cliente.

## 🚀 Camadas da Aplicação

O projeto segue rigorosamente os padrões de mercado, sendo dividido em:

* **Model/Entity:** Mapeamento objeto-relacional com JPA para Clientes, Entregadores, Funcionários e Produtos.
* **Repository:** Interfaces que estendem o `JpaRepository`, incluindo consultas customizadas (Query Methods) por e-mail e lote.
* **Service:** Concentra toda a lógica de negócio, garantindo que as regras (como não duplicar registros) sejam respeitadas.
* **Controller:** Endpoints REST que gerenciam as requisições HTTP e retornam respostas estruturadas.
* **Exception Handling:** Uso de `@RestControllerAdvice` para capturar erros globais e retornar mensagens claras ao usuário.

## 🛠️ Tecnologias Utilizadas

* **Java 17/21**
* **Spring Boot 3**
* **Spring Data JPA** (Persistência)
* **H2 Database / MySQL** (Configurável via application.properties)
* **Maven** (Gerenciador de dependências)

## 📋 Módulos do Sistema

1.  **Clientes:** Gestão de perfil, endereços e preferências de pagamento.
2.  **Entregadores:** Controle de frota (placa/veículo) e dados de contato.
3.  **Funcionários:** Administração de recursos humanos, setores e salários.
4.  **Produtos:** Controle de inventário, lotes e prazos de validade.
