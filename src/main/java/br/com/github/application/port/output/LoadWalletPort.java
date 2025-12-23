package br.com.github.application.port.output;

import br.com.github.domain.model.Wallet;

import java.util.Optional;

public interface LoadWalletPort {

    Optional<Wallet> findByCpf(String cpf);
}
