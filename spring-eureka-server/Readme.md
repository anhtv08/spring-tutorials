##  How to create a eureka server using spring boot

### Run following command to build and create a docker image

1. Build docker image
```jshelllanguage
 mvn package
```

2. Run Eureka server using docker

```jshelllanguage
 docker run anhtrang/eureka-server:0.0.1-SNAHPSHOT
```

3. Application logs as below:

```text
2018-10-23 08:58:30.910  INFO 1 --- [      Thread-11] o.s.c.n.e.server.EurekaServerBootstrap   : Setting the eureka configuration..
2018-10-23 08:58:30.911  INFO 1 --- [      Thread-11] o.s.c.n.e.server.EurekaServerBootstrap   : Eureka data center value eureka.datacenter is not set, defaulting to default
2018-10-23 08:58:30.919  INFO 1 --- [      Thread-11] o.s.c.n.e.server.EurekaServerBootstrap   : Eureka environment value eureka.environment is not set, defaulting to test
2018-10-23 08:58:31.000  INFO 1 --- [      Thread-11] o.s.c.n.e.server.EurekaServerBootstrap   : isAws returned false
2018-10-23 08:58:31.001  INFO 1 --- [      Thread-11] o.s.c.n.e.server.EurekaServerBootstrap   : Initialized server context
2018-10-23 08:58:31.069  INFO 1 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8761 (http)
2018-10-23 08:58:31.071  INFO 1 --- [           main] .s.c.n.e.s.EurekaAutoServiceRegistration : Updating port to 8761
2018-10-23 08:58:31.082  INFO 1 --- [           main] com.anhtv08.demo.DemoApplication         : Started DemoApplication in 15.945 seconds (JVM running for 17.047)

```