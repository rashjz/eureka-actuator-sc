### Eureka Actuator Spring Cloud Example 

Actuator endpoint : http://localhost:9001/actuator/health  
  
curl GET http://localhost:9000/service-instances/a-bootiful-client

#### Spring Eureka  
Eureka Service endpoint   : http://localhost:8761/  

<img src="https://github.com/rashjz/eureka-actuator-sc/blob/master/bin/Screenshot.png?raw=true" width="60%">


#### Spring Boot Admin    

Boot Admin Service Endpoint  : http://localhost:8080/  

<img src="https://github.com/rashjz/eureka-actuator-sc/blob/master/bin/Screenshot2.png?raw=true" width="60%">



#### Spring Cloud Config  
curl GET http://localhost:9122/a-bootiful-client/default 

To be sure cloud config properly loaded to application service  
make curl GET http://localhost:9000/config/message 
which should return you message : 'Hello from cloud config' 

#### To Push Docker Image to docker hub
1. cd into service directory (cd config-server) 
2. Make sure you have login docker 
3. Run mvn dockerfile:build
4. Run mvn dockerfile:push 

#### To run kubernetes deployment locally
Make sure you have setup kubectl, minikube, docker, virtual Box 
on your machine after setting up environment : 
 
1. cd deploy 
2. kubectl apply -f kubernetes-deployment.yaml 
3. minikube service boot-app-service --url 

As soon as services are ready you can check click on urls
and browse for services 

Enjoy :)  