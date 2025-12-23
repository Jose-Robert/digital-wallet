package br.com.github.application.usecase;

import br.com.github.application.exception.WalletNotFoundException;
import br.com.github.application.port.input.IFindWalletUseCase;
import br.com.github.application.port.input.model.WalletOutput;
import br.com.github.application.port.output.LoadWalletPort;
import br.com.github.infrastructure.annotation.UseCase;
import lombok.AllArgsConstructor;

import static br.com.github.application.mapper.WalletOutputMapper.fromDomain;

@UseCase
@AllArgsConstructor
public class FindWalletUseCaseImpl implements IFindWalletUseCase {

    private final LoadWalletPort port;

    @Override
    public WalletOutput execute(String cpf) {
        var wallet = port.findByCpf(cpf).orElseThrow(WalletNotFoundException::new);
        return fromDomain(wallet);
    }
}
