package com.enigma.ex1.oop;

import com.enigma.ex1.oop.model.ConiferTree;
import com.enigma.ex1.oop.model.DeciduousTree;
import com.enigma.ex1.oop.model.Trunk;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		var oak = new DeciduousTree(Trunk.ARROW, 10, 5000, 12345678921312L);
		var pine = new ConiferTree(Trunk.LOG, 15, 10000, 123112312312L);

		System.out.println(oak);
		System.out.println(pine);

		var oak2 = new DeciduousTree(Trunk.ARROW, 10, 5000, 12345678921312L);
		System.out.println(oak.equals(oak2));
	}
}
