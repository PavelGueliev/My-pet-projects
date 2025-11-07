Набор учебных и пет-проектов: интеграции с внешними API, бэкенды на Spring Boot, миграции БД и мини-магазин суши. Репозиторий сгруппирован по папкам. 
Основные языки: Java (основа большинства проектов), а также фронтовые артефакты (HTML/CSS/TS/JS) для сопутствующих частей. 

1) AutoStock (Станкин, «почти без JPA»)

Папка: autostock-master 

Кратко: учебный бэкенд учёта автозапчастей. REST-API, авторизация/аутентификация на Spring Security, акцент на нативные SQL-запросы (минимум/без JPA), миграции БД.
Основные возможности:

CRUD-эндпойнты по сущностям склада

Аутентификация и роли (JWT)

Миграции БД (Flyway), валидация
Стек: Java 17, Spring Boot (Web, Security, Validation, Data JDBC), MySQL, Flyway, Lombok, Maven, JWT, Mustache.

2) amoCrmTask — мини-интеграция с AmoCRM

Папка: amoCrmTask-master 
GitHub

Кратко: сервис, принимающий данные формы и отправляющий их в AmoCRM через REST. Используется шаблон проектирования для обработки данных и контейнеризация в Docker.
Основные возможности:

Интеграция с внешним API AmoCRM

Валидация входных данных, обработка ошибок

Docker-образ для быстрого развёртывания
Стек: Java 17, Spring Boot (Web, Validation, Security), Lombok, Maven, Docker.

3) Программа для гибдд (университетский проект)

Папка: stankin-gibdd-main 

Кратко: REST-сервис для управления услугами/заявками. Безопасность на Spring Security, миграции БД, документация API.
Основные возможности:

CRUD по услугам/заявкам

Авторизация/аутентификация

Документация API (Swagger/REST Docs), мониторинг (Actuator)
Стек: Java 17, Spring Boot (Web, Data JPA, Validation, Security, Actuator, DevTools), PostgreSQL, Liquibase, Swagger/OpenAPI, MapStruct, Lombok, Gradle.

4) Sushi Shop Backend

Папка: react-sushi-shop-main 
Кратко: бэкенд интернет-магазина суши с динамической подгрузкой товаров, фильтрацией, сортировкой и поиском.
Основные возможности:

REST-API для каталога (пагинация, фильтры, сортировка, поиск)

Схемы DTO и маппинг (MapStruct)

Документация API (Swagger/REST Docs)
Стек: Java 17, Spring Boot (Web, Data JPA, Validation), H2/PostgreSQL, MapStruct, Lombok, Gradle, Swagger/REST Docs.


Стек целиком

Backend: Java 17, Spring Boot (Web, Security, Validation, Data JPA/JDBC, Actuator, DevTools), MapStruct, Lombok

Базы данных: PostgreSQL, MySQL, H2

Миграции: Flyway, Liquibase

Безопасность: Spring Security, JWT

Документация: Swagger/OpenAPI, Spring REST Docs

Сборка: Maven, Gradle

Контейнеризация: Docker (для AmoCRM-сервиса)
