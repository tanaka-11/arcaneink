````markdown
# Arcane Ink

## 1. Sobre o Projeto
**Nome do projeto:** Arcane Ink  

Arcane Ink é um sistema web desenvolvido em **Java 17 com Spring Boot**, voltado para gerenciamento de tatuadores e clientes.
O projeto possui duas entidades principais: **Usuários** (clientes e tatuadores) e **Agendamentos**, com relacionamento **1:N**.  

O sistema permite cadastro, login, listagem e agendamento de sessões, além de documentação da API via **Swagger UI** e **Postman**.  
O frontend utiliza **HTML, CSS, Thymeleaf e Bootstrap** para responsividade e estilo, com páginas de login, cadastro e artistas.

> ⚠️ Algumas funcionalidades previstas no projeto original não foram totalmente implementadas, como upload de imagens de tatuagens e filtros avançados de busca.

---

## 2. Tecnologias
- Java 17+, Spring Boot (Web, Data JPA, Security, Validation)  
- Thymeleaf para templates HTML  
- MySQL 8+, Maven  
- Springdoc OpenAPI (Swagger UI)  
- Bootstrap + CSS para frontend  
- Postman/Insomnia para testes da API  

---

## 3. Arquitetura
- Camadas: **Controller → Service → Repository**  
- Entidades: `Usuario`, `Agendamento`  
- Relacionamento: 1:N (um usuário pode ter vários agendamentos)  
- Frontend: páginas HTML estáticas, CSS, Bootstrap e template Thymeleaf  
- Documentação da API: Swagger UI + Postman  

---

## 4. Requisitos de Ambiente
- JDK 17+  
- Maven 3.8+  
- MySQL 8+  

---

## 5. Configuração do Banco

```sql
CREATE DATABASE arcaneink_db;
````

---

## 6. Configuração da Aplicação

Arquivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/arcaneink_db
spring.datasource.username=admin
spring.datasource.password=admin

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
server.error.include-message=always
server.error.include-binding-errors=always
spring.thymeleaf.cache=false
springdoc.api-docs.path=/v3/api-docs
```

---

## 7. Instalação e Execução

```bash
git clone https://github.com/tanaka-11/arcaneink.git
cd arcaneink
mvn spring-boot:run
```

Acesse:

* App: [http://localhost:8080](http://localhost:8080/)
* Swagger UI: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

---

## 8. Seeds de Usuários

Para testes, crie usuários iniciais via SQL:

* `admin@exemplo.com` – senha padrão: `admin123`
* `user@exemplo.com` – senha padrão: `user123`

> ⚠️ Recomendado alterar as senhas após a criação.

---

## 9. Segurança

* Rotas públicas: `/`, `/login`, `/css/**`, `/images/**`
* Rotas autenticadas: `/api/**`
* Login por formulário em `/login`

---

## 10. Rotas Web

* `/` → página inicial
* `/login` → login de usuários
* `/cadastro` → cadastro de usuários
* `/artistas` → página de listagem de tatuadores

> ⚠️ Algumas páginas previstas no projeto original (como perfil detalhado do tatuador) não foram implementadas.

---

## 11. API REST e Documentação

* Endpoints principais: `/api/usuario`, `/api/agendamentos`
* Operações: CRUD básico + filtros simples
* Swagger UI: `/swagger-ui/index.html`

Exemplo de requisições:

```bash
curl "http://localhost:8080/api/agendamentos"
curl "http://localhost:8080/api/usuario"
```

---

## 12. Funcionalidades Implementadas

* Cadastro e login de usuários
* CRUD de agendamentos
* Listagem de artistas
* Documentação da API via Swagger e Postman

## 13. Funcionalidades Não Implementadas

* Upload de imagens de tatuagens
* Filtros avançados por tatuador ou cliente
* Área restrita completa para administradores

---

## 14. Testes

```bash
mvn test
```

> ⚠️ Apenas testes básicos do backend foram implementados.

---

## 15. Links Relevantes

* Repositório GitHub: [https://github.com/tanaka-11/arcaneink](https://github.com/tanaka-11/arcaneink)
* Vídeo YouTube: [URL_DO_VIDEO]
* Coleção Postman: `docs/postman_collection.json`
* Figma: [Projeto no Figma](https://www.figma.com/site/SyYFVr9XBSSF5Jmp2aU510/PROJETO-DE-EXTENSAO-EM-CONSTRUCAO-DE-SISTEMAS-COMPUTACIONAIS---Arcane-Ink.?node-id=0-1&t=qome5GOsImL3Xl7J-1)

---

## 16. Autores

| Integrante       | RA         | Contribuições                                                          |
| ---------------- | ---------- | ---------------------------------------------------------------------- |
| Erick Oscar      | 3024202631 | Controllers, Backend, Banco de Dados, Testes, Entidade Agendamento     |
| Marina Tanaka    | 3024200441 | Frontend, Backend, API, Upload, Testes, Design Figma, Entidade Usuário |
| Anna Clara       | 3024203385 | Documentação, README, Design Figma                                     |
| Jhulia Napolioni | 3025200065 | Documentação, README, Design Figma                                     |
| Gustavo Tenório  | 3025104768 | Documentação, README, Design Figma                                     |

```
