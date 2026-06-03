# 🌎 GeoVigil - Plataforma de Alerta Climático Inteligente

## 📌 Sobre o Projeto

O **GeoVigil** é uma plataforma acadêmica desenvolvida para simular um sistema de monitoramento climático baseado em dados satelitais, sensores ambientais e histórico climático.

A proposta é demonstrar como tecnologias modernas podem auxiliar na previsão de eventos extremos, gerando alertas preventivos para regiões de risco.

> **Observação:** Todos os dados utilizados são fictícios e possuem finalidade exclusivamente acadêmica.

---

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot 3.3
- Spring Data JPA
- MySQL
- Swagger/OpenAPI
- Maven
- Postman
- Hibernate

---

## 🏗 Arquitetura do Projeto

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
MySQL
```

O projeto foi estruturado em camadas para garantir organização, reutilização de código e facilidade de manutenção.

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Herança
- Polimorfismo
- Abstração
- Interfaces
- Injeção de Dependência
- Tratamento de Exceções
- DTOs (Data Transfer Objects)
- API REST
- Persistência de Dados com JPA

---

## 🗄 Banco de Dados

Banco utilizado:

```sql
geovigil
```

Tabelas criadas automaticamente:

- alerta
- sensor
- satelite
- historico_climatico

---

## ⚙️ Como Executar

### 1. Criar o banco

```sql
CREATE DATABASE geovigil;
```

### 2. Configurar o arquivo `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/geovigil
spring.datasource.username=root
spring.datasource.password=SUA_SENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Executar o projeto

Pela IDE:

```text
GeoVigilApplication.java
```

Ou pelo terminal:

```bash
mvn spring-boot:run
```

---

## 📡 Endpoints

### Sensores

```http
GET /api/sensores
```

### Satélites

```http
GET /api/satelites
```

### Gerar Alerta

```http
POST /api/alertas/gerar/{sensorId}
```

Exemplo:

```http
POST /api/alertas/gerar/2
```

Resposta:

```json
{
  "cidade": "São Paulo",
  "cep": "04250-000",
  "nivelRisco": "ALTO",
  "previsaoHoras": 72
}
```

---

## 📖 Swagger

Após iniciar a aplicação:

```text
http://localhost:8080/swagger-ui/index.html
```

---

## 📸 Evidências de Execução

### Swagger

<img width="1895" height="986" alt="image" src="https://github.com/user-attachments/assets/e2cc33f0-e7d6-4ae6-92dd-76bcc3538fd2" />


### GET Sensores

<img width="1915" height="1018" alt="image" src="https://github.com/user-attachments/assets/f805f489-3249-43fe-a98f-54ce40bc0131" />


### GET Satélites

<img width="1911" height="1031" alt="image" src="https://github.com/user-attachments/assets/66b38302-37be-4394-a04e-c9c8af899595" />


### POST Alerta

<img width="1907" height="1030" alt="image" src="https://github.com/user-attachments/assets/c7cead91-36aa-4956-bac7-f712fd6b545d" />


### Banco MySQL

<img width="1444" height="762" alt="image" src="https://github.com/user-attachments/assets/36fe30ab-013f-4852-9df0-15bbf15acecb" />


---

## 👨‍💻 Integrantes

| Nome | RM |
|--------|--------|
| Fernando Gonzales Alexandre | RM555045 |
| Gabriel Guerreiro | RM554973 |
| Lucas Dias | RM555450 |
| Luiz Felipe Coelho | RM555074 |
| Vitor Musolino | RM555012 |

---

## ✅ Status

Projeto desenvolvido para fins acadêmicos, demonstrando conceitos de APIs REST, POO, integração com banco de dados e arquitetura em camadas.
