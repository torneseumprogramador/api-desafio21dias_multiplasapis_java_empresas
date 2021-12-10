docker stop desafio_multiplasapis_java_empresas
docker rm desafio_multiplasapis_java_empresas

export USER='root'
export PASSWORD='root'
export DATABASE_URL='mysql://localhost:3306/desafio21dias_multiplasapis_java_empresas?createDatabaseIfNotExist=true&useTimezone=true&serverTimezone=UTC'

mvn clean
mvn package

docker build -t didox/desafio_multiplasapis_java_empresas -f Dockerfile .

docker run -d -e USER -e PASSWORD -e DATABASE_URL -p 8080:8080 --name desafio_multiplasapis_java_empresas didox/desafio_multiplasapis_java_empresas

docker logs desafio_multiplasapis_java_empresas -f --tail 100
