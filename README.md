# Java Design Patterns



## Getting Started

### Prerequisites

- **Java Development Kit (JDK)** - Version 11 or higher


#### Check if Java is installed:
```bash
java -version
javac -version
```

#### Install Java (if needed):

**On macOS (using Homebrew):**
```bash
brew install openjdk@17
```

**On Linux (Ubuntu/Debian):**
```bash
sudo apt update
sudo apt install openjdk-17-jdk
```

## Running

### Option 1: Run patterns (via App.java)

The main `App.java` file can be configured to run any pattern demo. Currently, it runs the Observer pattern demo.

1. **Compile the project:**
   ```bash
   cd /path/to/java-design-patterns
   javac -d bin -sourcepath src src/App.java
   ```

2. **Run the application:**
   ```bash
   java -cp bin App
   ```

### Option 2: Run individual patterns

Each pattern has its own demo class. Here's how to run them individually:

```bash
javac -d bin -sourcepath src src/creational/abstractfactory/AbstractFactoryDemo.java
java -cp bin creational.abstractfactory.AbstractFactoryDemo
```
