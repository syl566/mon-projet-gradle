# Projet Welcome

## 📌 Description

Ce projet est une application Java réalisée avec Gradle.

L’objectif est de retourner un message de bienvenue en fonction du jour et de l’heure.

---

## ⚙️ Fonctionnalités

La classe `Welcome` permet de retourner :

* **Bonjour** → entre 9h et 13h (lundi à vendredi)
* **Bon après-midi** → entre 13h et 18h (lundi à vendredi)
* **Bonsoir** → entre 18h et 9h (lundi à jeudi)
* **Bon week-end** → du vendredi 18h au lundi 9h

---

## 🧪 Tests

Des tests unitaires ont été réalisés avec JUnit pour vérifier :

* Les différentes tranches horaires
* Les jours de la semaine
* Les cas limites (lundi 8h / lundi 9h)
* Le comportement du week-end

---

## 🛠️ Technologies utilisées

* Java 17
* Gradle
* JUnit

---

## ▶️ Lancer le projet

```bash
./gradlew run
```

---

## ✅ Lancer les tests

```bash
./gradlew test
```

---

## 📁 Structure du projet

* `app/src/main/java` → code source
* `app/src/test/java` → tests

---

## 🎯 Objectif pédagogique

* Comprendre les tests unitaires
* Apprendre l’injection de dépendance
* Utiliser Gradle
* Versionner un projet avec Git et GitHub

---

## 👤 Auteur

Projet réalisé dans le cadre d’une formation Java.
