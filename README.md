# Activit-Pratique-N-2---ORM-JPA-Hibernate

![image](https://github.com/user-attachments/assets/ee61e755-e972-4378-824c-54192f7ae21b)

#Mise en place d’un projet Spring Boot avec JPA et Lombok
Un projet Spring Boot a été créé via Spring Initializer en intégrant les dépendances JPA, H2, Spring Web et Lombok. Afin d’assurer la compatibilité avec les dernières versions de Java, la version 1.18.34 de Lombok a été ajoutée manuellement dans la section <dependencies> ainsi que dans la configuration des plugins du pom.xml. Une entité JPA nommée Product a été définie avec les attributs suivants : id, name, price, et quantity. Les paramètres de la base de données H2 ont été configurés dans le fichier application.properties. Un repository JPA a été créé pour gérer l’accès aux données. Plusieurs opérations CRUD ont été testées : ajout, consultation, recherche, mise à jour et suppression de produits. Enfin, une migration de la base de données H2 vers MySQL a été réalisée pour une utilisation en environnement réel.
