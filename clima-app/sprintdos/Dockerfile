FROM gradle:7.6.2-jdk17

# establecemos el directorio de trabajo
WORKDIR /app

# copiamos los archivos al directorio de trabajo
COPY . /app

# Dar permisos de ejecución al Gradle Wrapper
RUN chmod +x gradlew

# Compilar el proyecto y ejecutar las pruebas usando el Gradle Wrapper
RUN ./gradlew build

# Ejecutar el programa compilado
CMD ["java", "-cp", "build/classes/java/main", "org.example.Main"]