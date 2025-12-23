package br.com.github.application.mapper;

import br.com.github.application.port.input.model.WalletOutput;
import br.com.github.domain.model.Wallet;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WalletOutputMapper {

    public static WalletOutput fromDomain(Wallet wallet) {
        return new WalletOutput(
                wallet.getId(),
                wallet.getName(),
                wallet.getEmail(),
                wallet.getCpf()
        );
    }
}
