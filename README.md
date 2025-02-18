# API de Listas de Jogos em Spring Boot

Esta é uma API simples desenvolvida em Spring Boot que gerencia duas listas de jogos. A API utiliza PostgreSQL como banco de dados e foi implantada no Railway para o deploy.

## Tecnologias Utilizadas

- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **PostgreSQL**: Banco de dados relacional utilizado para armazenar as listas de jogos.
- **DTO (Data Transfer Object)**: Padrão de design utilizado para transferir dados entre as camadas da aplicação.
- 
## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **Controller**: Camada responsável por receber as requisições HTTP e retornar as respostas.
- **Service**: Camada de negócio onde a lógica da aplicação é implementada.
- **Repository**: Camada de acesso aos dados, responsável por interagir com o banco de dados.
- **DTO**: Objetos utilizados para transferir dados entre as camadas da aplicação.
- **Model**: Entidades que representam as tabelas do banco de dados.
