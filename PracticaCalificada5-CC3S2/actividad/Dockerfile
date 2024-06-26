FROM gradle:7.6.2-jdk17

# establecemos el directorio de trabajo
WORKDIR /usr/src/myapp

# copiamos los archivos al directorio de trabajo
COPY . /usr/src/myapp

# Dar permisos de ejecución al Gradle Wrapper
RUN chmod +x gradlew

# Compilar el proyecto y ejecutar las pruebas usando el Gradle Wrapper
RUN ./gradlew build

#CMD [ "/bin/bash" ]
# Ejecutar el programa compilado si las pruebas pasan
CMD ["sh", "-c", "./gradlew test && java -cp build/classes/java/main org.example.TowerDefenseGame"]