# Singleton
 
	  O Singleton é um padrão de projeto utilizado no desenvolvimento de um software orientado a objeto, que tem como objetivo 
	garantir que uma classe tenha uma única instanciação, evitando repetições através de um ponto de acesso global. Por se tratar
	de uma classe do tipo private(), não é possível o seu instanciamento através de outras classes, tendo que ser feito por ela mesma,
	através do getInstance(), que verifica a existência de uma instância da classe, e em caso negativo ele gera uma instância, mas em 
	caso positivo ele acaba por retornar a instância existente. 

	  O Singleton deve ser utilizado quando o software desenvolvido necessitar de apenas uma instância de uma determinada classe,
	fazendo com que ela seja compartilhada com vários clientes, mas sem perder o desempenho e trazendo um controle de acesso. 

﻿# Factory Method
 
 	    O Factory Method é um padrão de projeto criacional que tem como objetivo o encapsulamento durante a criação de objetos, 
	  definindo seus métodos, mas de maneira que as suas subclasses possam alterar os objetos criados. 
	  
	    O Factory Method deve ser utilizado quando não se sabe completamente os objetos a serem criados, aonde as subclasses podem
	  possuir lógicas distintas, estando presente na construção de diversas classes, e sendo utilizado conforme as necessidades 
	  do cliente através de interfaces ou classes abstratas.
