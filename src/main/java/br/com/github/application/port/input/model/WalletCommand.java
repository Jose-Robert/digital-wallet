package br.com.github.application.port.input.model;

public record WalletCommand(
        String name,
        String email,
        String cpf) {}
