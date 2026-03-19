# 🚀 User Management API

REST API desenvolvida com **Java e Spring Boot** para gerenciamento de usuários.

---

## 🛠 Tecnologias

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

---

## 📌 Funcionalidades

- Criar usuário
- Listar usuários
- Buscar usuário por ID
- Atualizar usuário
- Deletar usuário

---

## 🔗 Endpoints

| Método | Rota            | Descrição                |
|--------|----------------|------------------------|
| GET    | /users         | Lista todos usuários   |
| POST   | /users         | Cria um usuário        |
| GET    | /users/{id}    | Busca por ID           |
| PUT    | /users/{id}    | Atualiza usuário       |
| DELETE | /users/{id}    | Deleta usuário         |

---

## 📥 Exemplo de requisição

```json
{
  "nome": "Caio",
  "email": "caio@email.com",
  "idade": 19
}
⚙️ Como rodar o projeto
1. Clonar o repositório
git clone https://github.com/caioSilvaEv/user-management-api.git
cd user-management-api
2. Configurar o banco de dados

Edite o arquivo:

application.properties
3. Executar o projeto
./mvnw spring-boot:run
🧪 Testando a API

Você pode usar:

Postman

Insomnia

📚 Aprendizados

Criação de API REST

Arquitetura em camadas (Controller, Service, Repository)

Integração com banco de dados

Uso do Spring Boot
