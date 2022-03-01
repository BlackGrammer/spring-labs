package me.blgrm.validation.config;

import org.h2.tools.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;

@Configuration
public class H2Config {

    @Bean
    public Server runH2TCPServer() throws SQLException {
        return Server.createTcpServer().start();
    }
}
