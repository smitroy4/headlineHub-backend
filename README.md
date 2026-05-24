# HeadlineHub — Full Stack AI-Powered News Platform - Backend

A production-ready Spring Boot backend powering the HeadlineHub news platform.

This backend acts as a secure API proxy layer between the React frontend and external news providers, solving frontend CORS limitations while maintaining secure API architecture.

---

# Tech Stack

* Java 21
* Spring Boot
* Spring Web
* Maven
* Docker
* REST APIs
* Render Deployment

---

# Features

* REST API architecture
* GNews API integration
* CORS handling
* Secure API key management
* Dockerized deployment
* Lightweight backend architecture
* Production-ready setup

---

# Architecture

```text
Frontend (React)
        ↓
Spring Boot Backend
        ↓
GNews API
```

---

# API Endpoint

## Fetch News

```http
GET /api/news?query=technology
```

---

# Sample Request

```http
http://localhost:8080/api/news?query=technology
```

---

# Sample Response

```json
{
  "articles": [
    {
      "title": "Technology News",
      "description": "Sample description"
    }
  ]
}
```

---

# Project Structure

```bash
src/main/java/
│
├── controller/
│   └── NewsController.java
│
└── HeadlineHubApplication.java
```

---

# Environment Variables

## application.properties

```properties
gnews.api.key=${GNEWS_API_KEY}
```

---

# Local Development

## Clone Repository

```bash
git clone https://github.com/smitroy4/headlineHub-backend
```

---

## Navigate Into Project

```bash
cd headlinehub-backend
```

---

## Run Spring Boot Application

```bash
mvn spring-boot:run
```

---

# Docker Setup

## Dockerfile

```dockerfile
# Step 1: Build stage
FROM maven:3.9.9-eclipse-temurin-21 AS builder

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

# Step 2: Run stage
FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY --from=builder /app/target/headlineHub-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
```

---

# Docker Commands

## Build Docker Image

```bash
docker build -t headlinehub-backend .
```

---

## Run Docker Container

```bash
docker run -p 8080:8080 headlinehub-backend
```

---

# Deployment

## Render Deployment

1. Push backend to GitHub
2. Create Render Web Service
3. Select Docker runtime
4. Configure environment variables
5. Deploy service

---

# CORS Configuration

```java
@CrossOrigin(origins = {
    "https://your-frontend-url.vercel.app"
})
```

---

# Why This Backend Exists

Modern news APIs often block direct frontend requests because of CORS restrictions and API security limitations.

This backend acts as a secure middleware layer that:

* protects API keys
* bypasses frontend CORS restrictions
* centralizes API communication
* creates scalable backend architecture
* enables future AI integrations

---

# Future Enhancements

* AI-powered summaries
* Spring Security
* JWT authentication
* Personalized recommendations
* News caching
* Scheduled news fetching
* Elasticsearch integration
* User analytics
* Admin APIs
* Rate limiting
* API monitoring

---

# Developer

## Smit Roy

Backend-focused software developer specializing in Java, Spring Boot and scalable application architectures.

GitHub:

```bash
https://github.com/smitroy4
```

LinkedIn:

```bash
https://www.linkedin.com/in/smitroy22/
```

---

# License

This project is licensed under the MIT License.
