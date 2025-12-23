package br.com.github.infrastructure.adapters.output.database.persistence;

import br.com.github.application.port.output.OpenWalletPort;
import br.com.github.domain.model.Wallet;
import br.com.github.infrastructure.adapters.output.database.repository.IWalletRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import static br.com.github.infrastructure.adapters.output.mapper.WalletMapper.toDomain;
import static br.com.github.infrastructure.adapters.output.mapper.WalletMapper.toEntity;

@Component
@AllArgsConstructor
public class WalletJpaAdapter implements OpenWalletPort {

    private final IWalletRepository repository;

    @Override
    public Wallet openWallet(Wallet wallet) {
        return toDomain(repository.save(toEntity(wallet)));
    }
}
