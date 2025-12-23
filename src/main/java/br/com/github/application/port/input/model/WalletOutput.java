package br.com.github.application.port.input.model;

import java.util.UUID;

public record WalletOutput(UUID id, String name, String email, String cpf) {}
