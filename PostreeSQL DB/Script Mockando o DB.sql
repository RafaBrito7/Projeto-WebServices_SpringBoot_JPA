/* POPULANDO BANCO DO PROJETO WEBSERVICES */

/* USER => ID / EMAIL / NAME / PASSWORD / PHONE */

INSERT INTO TB_USER 
VALUES (6, 'azaelserralheiro@gmail.com', 'Azael Serralheiro', '123456', '54214565');
INSERT INTO TB_USER 
VALUES (7, 'tierrimourato@gmail.com', 'Tierri Mourato', '123456', '78451244');
INSERT INTO TB_USER 
VALUES (8, 'giovanicarrilho@gmail.com', 'Giovani Carrilho', '123456', '66554214');
INSERT INTO TB_USER 
VALUES (9, 'suryaatilano@gmail.com', 'Surya Atilano', '123456', '455421214');
INSERT INTO TB_USER 
VALUES (10, 'lorenzoigrejas@gmail.com', 'Lorenzo Igrejas', '123456', '145214575');


/* PRODUCT => ID / DESCRIPTION / IMG_URL / NAME / PRICE */

INSERT INTO TB_PRODUCT 
VALUES (1, 'SmarTV LG 42', 'http://teste.com', 'TV', '2500.00');
INSERT INTO TB_PRODUCT 
VALUES (2, 'SmarTV PANASONIC 55', 'http://teste.com', 'TV', '3500.00');
INSERT INTO TB_PRODUCT 
VALUES (3, 'Notebook ACER', 'http://teste.com', 'Notebook', '2500.00');
INSERT INTO TB_PRODUCT 
VALUES (4, 'Xiaomi Redmi Note 6 PRO', 'http://teste.com', 'SMARTPHONE', '1500.00');
INSERT INTO TB_PRODUCT 
VALUES (5, 'Livro as Cronicas de Narnia Parte 1', 'http://teste.com', 'As cronicas de Narnia 1', '25.00');
INSERT INTO TB_PRODUCT 
VALUES (6, 'Livro as Cronicas de Narnia Parte 2', 'http://teste.com', 'As cronicas de Narnia 2', '30.00');
INSERT INTO TB_PRODUCT 
VALUES (7, 'Livro as Cronicas de Narnia Parte 3', 'http://teste.com', 'As cronicas de Narnia 3', '35.00');
INSERT INTO TB_PRODUCT 
VALUES (8, 'Lorem ipsu dolor sit amet', 'http://teste.com', 'The Lord of The Rings', '90.00');
INSERT INTO TB_PRODUCT 
VALUES (9, 'Lorem ipsu dolor sit amet', 'http://teste.com', 'MacBookPro', '15050.00');
INSERT INTO TB_PRODUCT 
VALUES (10, 'Lorem ipsu dolor sit amet', 'http://teste.com', 'PC Gamer', '5500.00');
INSERT INTO TB_PRODUCT 
VALUES (11, 'Lorem ipsu dolor sit amet', 'http://teste.com', 'Rails of Dummies', '100.00');
INSERT INTO TB_PRODUCT 
VALUES (12, 'Lorem ipsu dolor sit amet', 'http://teste.com', 'Smartphone Xiaomi MI A2', '2500.00');
INSERT INTO TB_PRODUCT 
VALUES (13, 'Lorem ipsu dolor sit amet', 'http://teste.com', 'Iphone XR', '4500.00');
INSERT INTO TB_PRODUCT 
VALUES (14, 'Lorem ipsu dolor sit amet', 'http://teste.com', 'Geladeira', '2500.00');
INSERT INTO TB_PRODUCT 
VALUES (15, 'Lorem ipsu dolor sit amet', 'http://teste.com', 'Home Theather', '2500.00');


/* CATEGORY => ID / NAME */

INSERT INTO TB_CATEGORY
VALUES (1, 'Eletronics');
INSERT INTO TB_CATEGORY
VALUES (2, 'Books');
INSERT INTO TB_CATEGORY
VALUES (3, 'Computers');


/* ORDER => ID / MOMENT / ORDER_STATUS(INT) / CLIENT_ID */

INSERT INTO TB_ORDER 
VALUES (1, '1990-05-20T08:25:33Z', 1, 6);
INSERT INTO TB_ORDER 
VALUES (2, '1990-05-20T08:25:33Z', 1, 2);
INSERT INTO TB_ORDER 
VALUES (3, '1990-05-20T08:25:33Z', 1, 1);
INSERT INTO TB_ORDER 
VALUES (4, '1990-05-20T08:25:33Z', 1, 8);
INSERT INTO TB_ORDER 
VALUES (5, '1990-05-20T08:25:33Z', 1, 9);
INSERT INTO TB_ORDER 
VALUES (6, '1990-05-20T08:25:33Z', 1, 4);
INSERT INTO TB_ORDER 
VALUES (7, '1990-05-20T08:25:33Z', 1, 10);


/* PRODUCT_CATEGORY => PRODUCT_ID / CATEGORY_ID */


INSERT INTO TB_PRODUCT_CATEGORY
VALUES (1, 1);
INSERT INTO TB_PRODUCT_CATEGORY
VALUES (2, 1);
INSERT INTO TB_PRODUCT_CATEGORY
VALUES (3, 3);
INSERT INTO TB_PRODUCT_CATEGORY
VALUES (4, 1);
INSERT INTO TB_PRODUCT_CATEGORY
VALUES (5, 2);
INSERT INTO TB_PRODUCT_CATEGORY
VALUES (6, 2);
INSERT INTO TB_PRODUCT_CATEGORY
VALUES (7, 2);
INSERT INTO TB_PRODUCT_CATEGORY
VALUES (8, 2);
INSERT INTO TB_PRODUCT_CATEGORY
VALUES (9, 3);
INSERT INTO TB_PRODUCT_CATEGORY
VALUES (10, 3);
INSERT INTO TB_PRODUCT_CATEGORY
VALUES (11, 2);
INSERT INTO TB_PRODUCT_CATEGORY
VALUES (12, 1);
INSERT INTO TB_PRODUCT_CATEGORY
VALUES (13, 1);
INSERT INTO TB_PRODUCT_CATEGORY
VALUES (14, 1);
INSERT INTO TB_PRODUCT_CATEGORY
VALUES (15, 1);

/* ORDER_ITEM => PRICE / QUANTITY / PRODUCT_ID / ORDER_ID */

INSERT INTO TB_ORDER_ITEM 
VALUES (15050.00, 2, 9, 5);
INSERT INTO TB_ORDER_ITEM 
VALUES (5500.00, 1, 10, 2);
INSERT INTO TB_ORDER_ITEM 
VALUES (25.00, 1, 5, 1);
INSERT INTO TB_ORDER_ITEM 
VALUES (30.00, 1, 6, 1);
INSERT INTO TB_ORDER_ITEM 
VALUES (35, 1, 7, 1);
INSERT INTO TB_ORDER_ITEM 
VALUES (1500.00, 2, 4, 7);
INSERT INTO TB_ORDER_ITEM 
VALUES (2500.00, 1, 3, 6);
INSERT INTO TB_ORDER_ITEM 
VALUES (90.00, 1, 8, 6);
INSERT INTO TB_ORDER_ITEM 
VALUES (4500.00, 5, 13, 3);
INSERT INTO TB_ORDER_ITEM 
VALUES (3500.00, 10, 2, 4);


/* PAYMENT => MOMENT / ORDER_ID */

INSERT INTO TB_PAYMENT
VALUES ('1990-05-20T08:25:33Z', 1);
INSERT INTO TB_PAYMENT
VALUES ('1990-05-20T08:25:33Z', 2);
INSERT INTO TB_PAYMENT
VALUES ('1990-05-20T08:25:33Z', 3);
INSERT INTO TB_PAYMENT
VALUES ('1990-05-20T08:25:33Z', 4);
INSERT INTO TB_PAYMENT
VALUES ('1990-05-20T08:25:33Z', 5);
INSERT INTO TB_PAYMENT
VALUES ('1990-05-20T08:25:33Z', 6);
INSERT INTO TB_PAYMENT
VALUES ('1990-05-20T08:25:33Z', 7);