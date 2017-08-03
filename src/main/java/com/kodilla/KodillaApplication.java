package com.kodilla;

import com.kodilla.codewars.Sum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KodillaApplication.class, args);
		int suma = Sum.getSum(0,-1);

	}
}
