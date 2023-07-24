package com.azure.ANNTrader;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.azure.ANNTrader.model.Product;;

@SpringBootApplication
public class ANNTraderApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ANNTraderApplication.class, args);
	}
	
}
