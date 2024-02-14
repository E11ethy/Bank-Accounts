package com.abcbank.bankaccounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankAccountsApplication {

	private static final Logger log = LoggerFactory.getLogger(BankAccountsApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BankAccountsApplication.class, args);
	}

	CommandLineRunner initDatabase (AccountRepository repository) {
		return arge -> {
			log.info("Preloading " + repository.save(new Account ("Abdallah", 100)));
			log.info("preloading " + repository.save(new Accoun ("Ellethy", 200)));
		}
	}

}
