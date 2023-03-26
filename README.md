# SpringBootSecurityRest
Demo project Spring Boot Security Rest
based on
https://www.tutorialspoint.com/spring_security/spring_security_with_jwt.htm
In Spring Security 5.7.0-M2 the WebSecurityConfigurerAdapter was deprecated, in the project:
	<artifactId>spring-boot-starter-parent</artifactId>
  <version>2.7.4</version>
in it 
<dependency>
      <groupId>org.springframework.security</groupId>
      <artifactId>spring-security-config</artifactId>
      <version>5.7.3</version>
      <scope>compile</scope>

and it deprecate WebSecurityConfigurerAdapter
need read https://spring.io/blog/2022/02/21/spring-security-without-the-websecurityconfigureradapter


