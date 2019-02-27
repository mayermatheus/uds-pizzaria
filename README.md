# uds-pizzaria
Solução para o desafio proposto pela UDS tecnologia

### Utilização

```
$ {mysql_path}\mysql start
```

```
$ mvn spring-boot:run
```

### Features adicionadas
- ApiDoc (swagger2)
- Migrations (FlyWay)

### Dependências
- JDK 1.8+
- Maven 4+
- SpringBoot 2+
- MySQL 5.7+

#### Recursos
Para acessar os [Recursos](http://localhost:8080/swagger-ui.html) basta subir a aplicação.


### Possíveis Melhorias
- [ ] Criação de uma anotação para recuperar os dados através do id quando for deserializado o objeto e retirar a forma de fazer a serialização por meio do assembler
- [ ] Adicionar segurança na API com JWT
- [ ] Acrescentar o Elastic Search para melhorar o desempenho do banco devido ao grande acesso da API. (Demanda alta de pedidos)
- [ ] Utilizar o lombok para evitar classes com código verboso
- [ ] Adicionar publicação do coverage dos testes unitários no SONAR
- [ ] Deploy automatico
- [ ] ModelMapper para evitar exposição das entidades
