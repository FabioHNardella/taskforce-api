# TaskForce API

API RESTful para gerenciamento de tarefas com prioridades, prazos e status.  
Desenvolvido com foco em boas práticas, organização e escalabilidade.

---

## Funcionalidades

- Criação, listagem, atualização e exclusão de tarefas (CRUD)
- Filtro por status, prioridade e prazo (em breve)
- Envio automático de e-mail ao concluir uma tarefa (em breve)
- Validações aplicadas via JPA e Bean Validation

---

## Tecnologias Utilizadas

- Java 24 ![Java](https://img.shields.io/badge/Java-24-blue)
- Spring Boot 3.4.3 ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.3-brightgreen)
- Spring Data JPA
- MySQL
- Hibernate Validator
- Insomnia (testes de requisição)
- Maven

---

## Como Executar Localmente

1. Clone o projeto:
 
 git clone https://github.com/FabioHNardella/taskforce-api.git
 cd taskforce-api

2. Configure o banco de dados no application.properties:

 spring.datasource.url=jdbc:mysql://localhost:3306/taskforce
 spring.datasource.username=seu_usuario
 spring.datasource.password=sua_senha
 spring.jpa.hibernate.ddl-auto=update

3. Execute com o Maven Wrapper:

./mvnw spring-boot:run

## Principais Endpoints

| Método | Endpoint      | Descrição                     |
| ------ | ------------- | ----------------------------- |
| GET    | /tarefas      | Lista todas as tarefas        |
| POST   | /tarefas      | Cria uma nova tarefa          |
| PUT    | /tarefas/{id} | Atualiza uma tarefa existente |
| DELETE | /tarefas/{id} | Deleta uma tarefa pelo ID     |

## Status do Projeto
- Em desenvolvimento
- Próximo passo: Envio de e-mails ao concluir tarefa
- Otimizações de performance e limpeza de tarefas antigas pendentes

## Autor
Desenvolvido por Fábio Henrique Nardella

## 🔗 Links
[![github](https://img.shields.io/badge/GITHUB-000?style=for-the-badge)](https://github.com/FabioHNardella)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/fabiohenriquenardella/)

## Objetivo
- Este projeto foi desenvolvido como parte de uma jornada prática para demonstrar domínio técnico em desenvolvimento backend com Java e Spring Boot, com foco em boas práticas reais, não apenas em código funcional.
É uma vitrine para mostrar competência, disciplina e capacidade de entrega.
