<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>TP N°2 - ORM JDBC JPA Hibernate  Spring Data</title>
</head>
<body>
<h2>Introduction</h2>
<p>Le TP N°2 se concentre sur la mise en œuvre d'une application Java Spring qui utilise la technologie JPA (Java Persistence API) en conjonction avec Hibernate, Spring Data, et une base de données H2. ORM (Object-Relational Mapping) est une technique clé au cœur de cette tâche, permettant de relier les entités Java aux tables de la base de données. Spring Data facilite l'accès aux données en fournissant des méthodes de requête automatisées pour les opérations CRUD (Create, Read, Update, Delete).
  <br>
  L'objectif principal de ce TP est de créer une application de gestion des patients en utilisant Spring Boot. Les étapes clés comprennent la définition d'entités JPA pour représenter les données des patients, la configuration d'une unité de persistance, la création d'un repository Spring Data pour accéder aux données de manière efficace, et la réalisation de diverses opérations de gestion des patients, notamment l'ajout, la consultation, la recherche, la mise à jour et la suppression.
  <br>
  En outre, ce TP explore le concept de migration de H2 Database vers MySQL. H2 est une base de données en mémoire légère, tandis que MySQL est un système de gestion de base de données relationnelle robuste. Cette migration permet d'illustrer comment passer d'une base de données de développement à une base de données de production, tout en maintenant la cohérence des données.</p>
<h2>Énoncé</h2>
<ol>
  <li>Installer IntelliJ Ultimate</li>
  <li>Créer un projet Spring Initializer avec les dépendances JPA,H2,Spring Web et Lombock</li>
  <li>Créer l'entité JPA Patient ayant les attributs :</li>
  <ul>
    <li>id de type Long</li>
    <li>nom de type String</li>
    <li>date de naissance de type Date</li>
    <li>malade de type booléen</li>
    <li>score de type int</li>
  </ul>
  <li>Configurer l'unité de persistance dans le fichier application.properties</li>
  <li>Créer l'interface JPA Repository basée sur Spring Data</li>
  <li>Tester quelques opérations de gestion</li>
  <ul>
    <li>Ajouter des patients</li>
    <li>Consulter tous les patients</li>
    <li>Consulter un patient</li>
    <li>Chercher des patients</li>
    <li>Mettre à jour un patient</li>
    <li>supprimer un patient</li>
  </ul>
  <li>Migrer de h2 Database vers MySQL</li>
</ol>
<h2>Étapes du TP</h2>
<ol>
  <li>Installation d'IntelliJ Ultimate</li>
  <p>La première étape du TP consiste à installer IntelliJ IDEA Ultimate, un environnement de développement intégré (IDE) puissant, qui sera utilisé pour le développement de l'application.</p>
  <li>Création d'un Projet Spring Initializer</li>
  <p>J'ai crée un projet Spring Boot à l'aide de Spring Initializer.
    J'ai ajouté les dépendances suivantes :
  </p>
  <ul>
    <li>JPA</li>
    <li>v</li>
    <li>Spring Web (pour les contrôleurs web)</li>
    <li>Lombok (pour la génération automatique de code)</li>
  </ul>
<p>Lorsque je  consulte le fichier pom.xml, je trouve que les dépendances
  ont été bien ajouté<</p>
  <img src="captures/depen1.png" alt="dependencies">
 <img src="captures/depen2.png" alt="dependencies">
 <img src="captures/depen3.png" alt="dependencies">
 <img src="captures/depen4.png" alt="dependencies">
<p>Ensuite, on crée l'entité JPA Patient avec les attributs demandés</p>
<<<<<<< HEAD
<p>test testdd
</p>

</ol>
</body>
</html>
=======

</ol>
</body>
</html>
>>>>>>> 8c905c9 (first commit)