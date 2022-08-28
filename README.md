﻿# tecnologias_para_internet

	O Singleton é um padrão de projeto utilizado no desenvolvimento de um software orientado a objeto, que tem como objetivo garantir que uma classe tenha uma única instanciação, evitando repetições através de um ponto de acesso global. Por se tratar de uma classe do tipo private(), não é possível o seu instanciamento através de outras classes, tendo que ser feito por ela mesma, através do getInstance(), que verifica a existência de uma instância da classe, e em caso negativo ele gera uma instância, mas em caso positivo ele acaba por retornar a instância existente. 

	O Singleton deve ser utilizado quando o software desenvolvido necessitar de apenas uma instância de uma determinada classe, fazendo com que ela seja compartilhada com vários clientes, mas sem perder o desempenho e trazendo um controle de acesso. 
