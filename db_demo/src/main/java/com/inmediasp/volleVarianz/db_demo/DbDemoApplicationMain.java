package com.inmediasp.volleVarianz.db_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbDemoApplicationMain implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DbDemoApplicationMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String filepath = "C:\\\\Users\\\\bjohannes\\\\Desktop\\\\address.xls";
		Importer.setInputStream(filepath);
		Importer.getInput();
		
	}
}
