export USER='root'
export PASSWORD='root'
export DATABASE_URL='mysql://localhost:3306/desafio21dias_multiplasapis_java_empresas?createDatabaseIfNotExist=true&useTimezone=true&serverTimezone=UTC'

mvn clean
mvn package

docker build -t didox/desafio_multiplasapis_java_empresas -f Dockerfile .

docker tag didox/desafio_multiplasapis_java_empresas hub.docker.com/r/didox/desafio_multiplasapis_java_empresas
docker push didox/desafio_multiplasapis_java_empresas