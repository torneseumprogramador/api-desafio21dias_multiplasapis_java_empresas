export USER='root'
export PASSWORD='root'
export DATABASE_URL='mysql://localhost:3306/desafio21dias_multiplasapis_java_empresas?createDatabaseIfNotExist=true&useTimezone=true&serverTimezone=UTC'
mvn package
java -jar target/empresas-0.0.1.jar