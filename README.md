                                                 notification_service

1)About the project.

This project is a microservice that receives messages using Spring Cloud Stream and also uses the Spring Eureka client.

2)Start the project locally.

2.1 Required to install the project.

Java 11

2.2 How to run project.

You should create environmental variables that are defined in the resources package like:

application.properties.

2.2.1 For application.properties you should set the value like:

* spring.application.name=${Value}
* eureka.instance.instance-id=${Value}
* spring.cloud.loadbalancer.ribbon.enabled=${Value}
* server.port=${Value}
* spring.cloud.stream.bindings.notificationEventSupplier-in-0.destination=${Value}
