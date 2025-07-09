package com.kevine.practice_github_pilot_group;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.kevine.repositories")
@ComponentScan({"com.kevine.practice_github_pilot_group", "com.kevine.repositories"})
public class PracticeGithubPilotGroupApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeGithubPilotGroupApplication.class, args);
	}

}
