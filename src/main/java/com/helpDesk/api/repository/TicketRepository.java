package com.helpDesk.api.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.helpDesk.api.entity.Ticket;

public interface TicketRepository extends MongoRepository<Ticket,String>{
	
	Page<Ticket> findByUserIdOrderByDateDesc(Pageable pages,String userid);
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityOrderByDateDesc(
			String title, String status, String Priority, Pageable pages);

	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndUserIdOrderByDateDesc(
			String title, String status, String Priority, Pageable pages);
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndAssignedUserIdOrderByDateDesc(
			String title, String status, String Priority, Pageable pages);

	Page<Ticket> findByNumber(Integer number, Pageable pages);
}
