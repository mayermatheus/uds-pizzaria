# uds-pizzaria
Solução para o desafio proposto pela UDS tecnologia

# desafio-despesas [![Build Status](https://travis-ci.org/jarddel/desafio-despesas.svg?branch=master)](https://travis-ci.org/jarddel/desafio-despesas)
### Utilização

```
$ {mysql_path}\mysql start
```

```
$ mvn spring-boot:run
```

### Features adicionadas
- OAuth2 com JWT (via profile)
- BasicAuth (via profile)
- ApiDoc (swagger2)
- Migrations (FlyWay)
- Mecanismo de cache (EhCache)
- Pool de conexões (Hikari)

### Dependências
- JDK 1.8+
- Maven 3+
- Spring 4+
- MySQL 5.7+

### Escopo

#### Recursos
![Recursos](https://i.imgur.com/OYYy7QP.jpg)


### Possíveis Melhorias
- [ ] Criação de uma anotação para recuperar os dados através do id quando for deserializado o objeto e retirar a forma de fazer a serialização por meio do assembler
- [ ] Adicionar segurança na API com JWT
- [ ] Acrescentar o Elastic Search para melhorar o desempenho do banco devido ao grande acesso da API. (Demanda alta de pedidos)
- [ ] Utilizar o lombok para evitar classes com código verboso
- [ ] Adicionar publicação do coverage dos testes unitários no SONAR
- [ ] Deploy automatico
- [ ] ModelMapper para evitar exposição das entidades
