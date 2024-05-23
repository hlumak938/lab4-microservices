package com.hlumakov;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public List<ClientDTO> getAllClients() {
        return clientRepository.findAll();
    }

    public Optional<ClientDTO> getClientById(Long id) {
        return clientRepository.findById(id);
    }

    public ClientDTO addClient(ClientDTO client) {
        return clientRepository.save(client);
    }
}