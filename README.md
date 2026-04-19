# 💸 Rachai Pay — Java + Spring Boot + JPA

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![JPA](https://img.shields.io/badge/JPA-Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![Mysql](https://img.shields.io/badge/Mysql-316192?style=for-the-badge&logo=Mysql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![License](https://img.shields.io/badge/license-MIT-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/status-Em%20Desenvolvimento-yellow?style=for-the-badge)

Aplicação backend para divisão de despesas em grupo, inspirada no Splitwise, com integração de pagamentos via **AbacaPay**.

---

## 🧱 Tecnologias

- Java 17+
- Spring Boot
- Spring Data JPA / Hibernate
- PostgreSQL (ou outro banco relacional)
- AbacaPay (integração de pagamentos)

---

## 📐 Modelagem de Domínio

### `User`
Representa um usuário da plataforma.

### `Group`
Representa um grupo de pessoas para divisão de despesas.

### `GroupMember`
Representa a participação de um usuário em um grupo.  
Evita `@ManyToMany` direto pois possui dados próprios.

| Campo | Tipo | Descrição |
|-------|------|-----------|
| `userModel` | `@ManyToOne User` | Usuário participante |
| `group` | `@ManyToOne Group` | Grupo ao qual pertence |
| `balance` | `BigDecimal` | Saldo do membro no grupo |
| `role` | `Enum` | `OWNER` ou `MEMBER` |
| `status` | `Enum` | `ACTIVE` ou `LEFT` |

### `Despesa`
Despesa criada dentro de um grupo.

| Campo | Tipo | Descrição |
|-------|------|-----------|
| `group` | `@ManyToOne Group` | Grupo ao qual a despesa pertence |
| `valor` | `BigDecimal` | Valor total da despesa |
| `descricao` | `String` | Descrição da despesa |

### `Divisao`
Representa a parte de cada usuário em uma despesa.  
Evita `@ManyToMany` direto pois possui dados próprios.

| Campo | Tipo | Descrição |
|-------|------|-----------|
| `userModel` | `@ManyToOne User` | Usuário responsável pela parcela |
| `despesa` | `@ManyToOne Despesa` | Despesa relacionada |
| `valor` | `BigDecimal` | Valor da parcela do usuário |
| `abacaPayId` | `String` | ID do pagamento na AbacaPay |

---

## 🧠 Decisões de Arquitetura

- **Sem `@ManyToMany` com dados próprios** — quando a relação precisa carregar informações adicionais (como `balance`, `role`, `abacaPayId`), ela é promovida a uma entidade com `@ManyToOne` nos dois lados.
- **`@JoinColumn`** é usado para mapear chaves estrangeiras.
- **`@Column`** é usado para campos simples da entidade.
- **Pagamentos** são integrados via AbacaPay, com o ID da transação armazenado em `Divisao.abacaPayId`.

---

## 🗂️ Estrutura de Pacotes (sugestão)

```
src/main/java/com/seu-projeto/
├── userModel/
│   ├── User.java
│   └── UserRepository.java
├── group/
│   ├── Group.java
│   ├── GroupMember.java
│   └── GroupRepository.java
├── despesa/
│   ├── Despesa.java
│   ├── Divisao.java
│   └── DespesaRepository.java
└── pagamento/
    └── AbacaPayService.java
```

---

## 🚀 Como rodar

```bash
# Clonar o repositório
git clone https://github.com/seu-usuario/rachai-pay.git

# Configurar banco de dados em application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/splitwise
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

# Rodar a aplicação
./mvnw spring-boot:run
```

---

## 📌 Próximos passos

- [ ] Endpoints REST para criação de grupos e despesas
- [ ] Lógica de cálculo de saldo por membro
- [ ] Integração completa com AbacaPay (criação e confirmação de pagamentos)
- [ ] Autenticação com Spring Security / JWT
- [ ] Testes unitários e de integração