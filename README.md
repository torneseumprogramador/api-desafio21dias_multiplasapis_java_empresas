CREATE USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root';

GRANT ALL PRIVILEGES ON *.* TO 'root'@'localhost';

FLUSH PRIVILEGES;

SELECT user,authentication_string,plugin,host FROM mysql.user;


# limpa dependencias
mvn clean

# criar o pacote jar
mvn package

# starta a aplicação
mvn spring-boot:start

# criar o pacote jar
java -jar target/empresas-0.0.1.jar

