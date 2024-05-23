package com.hlumakov;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;
    private final RestTemplate restTemplate;

    @Value("${microservices.catalogHost}")
    private String catalogHost;

    @Value("${microservices.catalogPort}")
    private int catalogPort;

    @GetMapping
    public List<ClientDTO> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public ClientDTO getClientById(@PathVariable Long id) {
        Optional<ClientDTO> clientOptional = clientService.getClientById(id);
        return clientOptional.orElse(null);
    }

    @PostMapping
    public ClientDTO addClient(@RequestBody ClientDTO client) {
        return clientService.addClient(client);
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        String catalogUrl = "https://" + catalogHost + ":" + catalogPort + "/books";
        System.out.println("URL: ");
        System.out.println(catalogUrl);
        return restTemplate.getForObject(catalogUrl, List.class);
    }

}