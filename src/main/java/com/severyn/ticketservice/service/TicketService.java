package com.severyn.ticketservice.service;

import com.severyn.ticketservice.model.Ticket;
import com.severyn.ticketservice.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    private final TicketRepository repository;

    public TicketService(TicketRepository repository) {
        this.repository = repository;
    }

    public List<Ticket> findAll() {
        return repository.findAll();
    }

    public Optional<Ticket> findById(Long id) {
        return repository.findById(id);
    }

    public Ticket save(Ticket ticket) {
        return repository.save(ticket);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
