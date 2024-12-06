# **API de Rede Social**

## **Descrição do Projeto**

Este projeto é uma API desenvolvida para gerenciar uma rede social. O objetivo principal é fornecer endpoints para criar, gerenciar e interagir com perfis, postagens e conexões entre usuários.

A API foi desenvolvida utilizando o **Java** com o framework **Spring Boot** para a lógica de negócios e conexão com o banco de dados relacional **PostgreSQL**.  
Para testes e interação com a API, recomenda-se o uso da ferramenta **Postman**.

---

## **Funcionalidades**

- **Usuários**:
  - Cadastro, atualização, e remoção de perfis de usuários.
  - Listagem de todos os usuários registrados.

- **Postagens**:
  - Criação, edição, exclusão e listagem de postagens.
  - Filtragem por autor ou data.

- **Interações**:
  - Funcionalidades de "Curtir" e "Comentar" em postagens.
  - Conexões entre usuários ("seguir" ou "amigos").

---

## **Tecnologias Utilizadas**

- **Linguagem de Programação**: Java  
- **Framework**: Spring Boot  
- **Banco de Dados**: PostgreSQL  
- **Ferramenta para Testes**: Postman  

---

## **Pré-requisitos**

Antes de executar o projeto, certifique-se de ter instalado em sua máquina:  
1. **Java 17** ou superior.  
2. **Maven** ou **Gradle** para gerenciar dependências.  
3. **PostgreSQL** configurado e em execução.  
4. **Postman** (opcional, para testes da API).  

---

## **Configuração do Banco de Dados**

1. Crie um banco de dados PostgreSQL chamado `rede_social`.  
2. Configure o arquivo `application.properties` ou `application.yml` do Spring Boot com suas credenciais:  

```properties
# Configurações do Banco de Dados
spring.datasource.url=jdbc:postgresql://localhost:5432/rede_social
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

# Configuração do Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

## **Contribuição**
Sinta-se à vontade para abrir issues ou pull requests para melhorias e correções.
