sudo docker rmi -f helloworld
mvn clean package -DskipTests
sudo docker build -t helloworld
sudo docker run -d -p 8081:8081 hello-world
#sudo kubectl apply -f deployment.yml #can't install minikube
