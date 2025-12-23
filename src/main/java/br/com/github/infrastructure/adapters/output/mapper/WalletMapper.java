package br.com.github.infrastructure.adapters.output.mapper;

import br.com.github.domain.model.Wallet;
import br.com.github.infrastructure.adapters.output.database.entity.WalletEntity;
import br.com.github.infrastructure.utils.Utils;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import static br.com.github.infrastructure.utils.Utils.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WalletMapper {

    public static Wallet toDomain(WalletEntity entity) {
        return Wallet.builder()
                .id(entity.getId())
                .name(entity.getName())
                .email(entity.getEmail())
                .cpf(formatAndMaskCpf(entity.getCpf()))
                .balance(entity.getBalance())
                .status(entity.getStatus())
                .build();
    }

    public static WalletEntity toEntity(Wallet wallet) {
        return WalletEntity.builder()
                .name(wallet.getName())
                .email(isEmailValid(wallet.getEmail()))
                .cpf(cleanCPF(wallet.getCpf()))
                .balance(wallet.getBalance())
                .status(wallet.getStatus())
                .build();
    }
}
