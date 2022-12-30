package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo4Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo4Application.class, args);
    }

}
/*
spring.datasource.url = jdbc:mysql://containers-us-west-187.railway.app:5957/railway
spring.datasource.username = root
spring.datasource.password =Yp9odUtpQ9rdAyv8i7cQ
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update
#spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
spring.servlet.multipart.max-file-size=500KB
spring.servlet.multipart.max-request-size=500KB
#mysql://${{ MYSQLUSER }}:${{ MYSQLPASSWORD }}@${{ MYSQLHOST }}:${{ MYSQLPORT }}/${{ MYSQLDATABASE }}
 */