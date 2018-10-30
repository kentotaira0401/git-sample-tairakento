package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitSampleTairaApplication {

	public static void main(String[] args) {
		System.out.println("デプロイとサーバ起動を行います");
		SpringApplication.run(GitSampleTairaApplication.class, args);
	}
}
