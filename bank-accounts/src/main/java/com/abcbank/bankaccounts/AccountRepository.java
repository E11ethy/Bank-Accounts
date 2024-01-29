package com.abcbank.bankaccounts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account , Long>{
	
	

}
