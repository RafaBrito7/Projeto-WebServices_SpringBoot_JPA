# Projeto-WebServices_SpringBoot_JPA
"Primeiro projeto utilizando WebServices com Java, utilizando SpringBoot e Hibernate."

**Objetivo:** 

  - *O projeto tem como objetivo criar um CRUD de uma loja simples de um ecommerce, onde teríamos o Cliente (User), o Pedido (Order), o Pagamento (Payment) e o Produto(Product). E todas as relações que já entre eles, tais como Categoria do Produto, o pedido individual para um produto (com quantidade e subtotal), já para o Cliente traria o pagamento total que ele realizaria na loja e também datas e status do pedido (Pago, em entrega, entregue e etc).*
  - *Importante frizar que esse projeto, é o de conclusão da Cadeira de SpringBoot com Hibernate, do Curso Java Completo do Prof. Nélio Alves.*

<h2> PROJETO FINALIZADO em 09/07/2020 </h2>

<h3>Projeto de Back-End em Java, Ferramentas utilizadas:</h3>

- Spring Boot
- JPA com Hibernate
- Maven
- PostgreeSQL
- REST 
- Deploy no Heroku
- Banco H2 para testes
- Tratamento de Exceções HTTP
- CRUD completo
- Utilização do Postman para Interações e Requisições http
- Tratamento de Exceções utilizando Códigos de Requisições http (404, 201, etc)
- Estruturado em Camadas Lógicas: 
  - Resource, Service e Repository
 
  
<h3>Baseado no Modelo de Domínio</h3>
  
  <img src = "PostreeSQL DB/1.png" height = "600" width = "1200">
  
<h3>Exemplo de Aplicação de Instâncias de Domínio</h3>

  <img src = "PostreeSQL DB/2.png" height = "600" width = "1200">
  
<h3>Lógica do Desenvolvimento das Camadas</h3>

<img src = "PostreeSQL DB/3.png" height = "600" width = "1200">

<h2> Como testar a Aplicação(Passo a Passo): </h2>

  1. Postman (<a href = "https://www.postman.com/downloads/"> Download Postman </a>)
  2. Instalar o Postman
  3. Na aba New, escolha *REQUEST*
  4. Escolha o *GET*
  5. Observe o Deploy no Heroku: https://course-java-webservices.herokuapp.com
  6. (Populei todo o banco com Scripts escrito a mão no SQL <a href = "PostreeSQL DB/Script Mockando o DB.sql"> -> Script SQL <- </a> )
  7. **Visualizando os USUÁRIOS cadastrados no Banco:**
  8. Insira no Postman essa url https://course-java-webservices.herokuapp.com/users
  9. O resultado será um JSON com todas as informações de todos os usuário no Banco
  10. Buscando um usuário por ID:
  11. https://course-java-webservices.herokuapp.com/users/5  (Há cadastrado usuários cujo ID vai do 1 ao 10)
  12. Caso seja inserido um ID que não existe (por exemplo 11), é retornado um código http 404 (Not Found), com a mensagem "Resource not found ID = 11", informando qual a ID que não existe
  13. **Visualizando os PRODUTOS cadastrados no Banco:**
  14. Insira no Postman essa url https://course-java-webservices.herokuapp.com/products (Há cadastrado ID do 1 ao 15)
  15. **Visualizando as CATEGORIAS cadastradas no Banco:**
  16. Insira no Postman essa url https://course-java-webservices.herokuapp.com/categorys (Há cadastrado ID do 1 ao 3)
  17. **Visualizando os PEDIDOS cadastradas no Banco:**
  18. Insira no Postman essa url https://course-java-webservices.herokuapp.com/orders (Há cadastrado ID do 1 ao 7)
  19. No caso do ORDER ele retornará um JSON contendo o seguinte Aninhamento:
  20. ORDER -> USER -> ORDER ITEM -> PRODUCTS -> SUBTOTAL -> PAYMENT
  21. Ou seja o Pedido em questão, o Cliente que está relacionado aquele pedido, O item do Pedido (Com quantidade e valores), o Produto em questão, o Subtotal (Quantidade * Valor do Produto) e por fim o Pagamento final com o Total Geral.
  
