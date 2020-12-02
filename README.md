# Eureka Actuator Spring Cloud Example 

Actuator endpoint : http://localhost:9001/actuator/health  
  
curl GET http://localhost:9000/service-instances/a-bootiful-client

### Spring Eureka  
Eureka Service endpoint   : http://localhost:8761/  

![eureka_dashboard](https://github.com/rashjz/eureka-actuator-sc/blob/master/bin/Screenshot.png?raw=true)


### Spring Boot Admin    

Boot Admin Service Endpoint  : http://localhost:8080/  

![eureka_dashboard](https://github.com/rashjz/eureka-actuator-sc/blob/master/bin/Screenshot2.png?raw=true)


### spring cloud config endpoint 
curl GET http://localhost:9122/a-bootiful-client/default 

To be sure cloud config properly loaded to application service  
make curl GET http://localhost:9000/config/message 
which should return you message : 'Hello from cloud config' 
