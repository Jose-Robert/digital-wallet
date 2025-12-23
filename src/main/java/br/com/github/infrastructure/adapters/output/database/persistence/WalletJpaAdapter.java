package br.com.github.infrastructure.adapters.output.database.persistence;

import br.com.github.application.port.output.LoadWalletPort;
import br.com.github.application.port.output.OpenWalletPort;
import br.com.github.domain.model.Wallet;
import br.com.github.infrastructure.adapters.output.database.repository.IWalletRepository;
import br.com.github.infrastructure.adapters.output.mapper.WalletMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static br.com.github.infrastructure.adapters.output.mapper.WalletMapper.toDomain;
import static br.com.github.infrastructure.adapters.output.mapper.WalletMapper.toEntity;
import static br.com.github.infrastructure.utils.Utils.cleanCPF;

@Component
@AllArgsConstructor
public class WalletJpaAdapter implements OpenWalletPort, LoadWalletPort {

    private final IWalletRepository repository;

    @Override
    public Wallet openWallet(Wallet wallet) {
        return toDomain(repository.save(toEntity(wallet)));
    }

    @Override
    public Optional<Wallet> findByCpf(String cpf) {
        return repository.findByCpf(cleanCPF(cpf))
                .map(WalletMapper::toDomain);
    }
}
