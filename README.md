# Demo Project

A simple Java Maven project template.

## Project Structure

```
.
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── demo/
│   │   │               └── App.java
│   │   └── resources/
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── demo/
│       │               └── AppTest.java
│       └── resources/
└── README.md
```

## Getting Started

### Prerequisites

- Java 17 or higher
- Apache Maven 3.6 or higher
- Gemini API key (from Google AI Studio)

### Setup

1. **Set up your API key**:
   ```bash
   cp apikey.txt.example apikey.txt
   # Edit apikey.txt and add your actual Gemini API key
   ```

2. **Build the project**:
   ```bash
   mvn clean compile
   ```

### Running the Application

#### Option 1: Use the convenience script (Recommended)
```bash
./run.sh
```

#### Option 2: Set environment variables manually
```bash
export JAVA_HOME=/Users/hughes/.sdkman/candidates/java/current
export GEMINI_API_KEY=$(cat ./apikey.txt)
mvn exec:java
```

#### Option 3: Set environment variables inline
```bash
JAVA_HOME=/Users/hughes/.sdkman/candidates/java/current GEMINI_API_KEY=$(cat ./apikey.txt) mvn exec:java
```

### Creating a JAR

```bash
mvn clean package
```

The JAR file will be created in the `target/` directory.

### Running the JAR

```bash
java -jar target/demo-1.0.0.jar
```

## Dependencies

- **JUnit 5**: For unit testing

## License

This project is licensed under the MIT License.
