package com.lagou;

import com.lagou.netty.NettyWebSocketProtoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NettySpringbootApplication implements CommandLineRunner {

    @Autowired
    NettyWebSocketProtoServer nettyWebSocketProtoServer;

    public static void main(String[] args) {
        SpringApplication.run(NettySpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        new Thread(nettyWebSocketProtoServer).start();
    }
}
