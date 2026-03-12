# User Management API

REST API desenvolvida com Java e Spring Boot para gerenciamento de usuários.

## Tecnologias

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## Funcionalidades

- Criar usuário
- Listar usuários
- Buscar usuário por ID
- Atualizar usuário
- Deletar usuário

## Endpoints

GET /users

POST /users

GET /users/{id}

PUT /users/{id}

DELETE /users/{id}

## Exemplo JSON

{
 "nome": "Caio",
 "email": "caio@email.com",
 "idade": 19
}

## Como rodar o projeto

1. Configure o banco MySQL
2. Atualize o application.properties
3. Rode a aplicação
4. Teste os endpoints com Postman ou Insomnia
