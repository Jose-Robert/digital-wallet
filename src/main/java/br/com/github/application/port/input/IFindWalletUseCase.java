package br.com.github.application.port.input;

import br.com.github.application.port.input.model.WalletOutput;

public interface IFindWalletUseCase {

    WalletOutput execute(String cpf);
}
