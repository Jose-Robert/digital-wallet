package br.com.github.infrastructure.adapters.output.mapper;

import br.com.github.domain.model.Wallet;
import br.com.github.infrastructure.adapters.output.database.entity.WalletEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WalletMapper {

    public static Wallet toDomain(WalletEntity entity) {
        return Wallet.builder()
                .id(entity.getId())
                .name(entity.getName())
                .email(entity.getEmail())
                .cpf(entity.getCpf())
                .balance(entity.getBalance())
                .status(entity.getStatus())
                .build();
    }

    public static WalletEntity toEntity(Wallet wallet) {
        return WalletEntity.builder()
                .name(wallet.getName())
                .email(wallet.getEmail())
                .cpf(wallet.getCpf())
                .balance(wallet.getBalance())
                .status(wallet.getStatus())
                .build();
    }
}
