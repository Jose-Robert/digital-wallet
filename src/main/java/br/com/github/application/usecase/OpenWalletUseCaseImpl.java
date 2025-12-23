package br.com.github.application.usecase;

import br.com.github.application.port.input.IOpenWalletUseCase;
import br.com.github.application.port.input.model.WalletCommand;
import br.com.github.application.port.input.model.WalletOutput;
import br.com.github.application.port.output.OpenWalletPort;
import br.com.github.domain.enums.StatusType;
import br.com.github.domain.model.Wallet;
import br.com.github.infrastructure.annotation.UseCase;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

import static br.com.github.application.mapper.WalletOutputMapper.fromDomain;

@UseCase
@AllArgsConstructor
public class OpenWalletUseCaseImpl implements IOpenWalletUseCase {

    private OpenWalletPort port;

    @Transactional
    @Override
    public WalletOutput execute(WalletCommand command) {
        var wallet = Wallet.builder()
                .name(command.name())
                .email(command.email())
                .cpf(command.cpf())
                .balance(new BigDecimal("0.0"))
                .status(StatusType.ACTIVE)
                .build();
        return fromDomain(port.openWallet(wallet));
    }
}
