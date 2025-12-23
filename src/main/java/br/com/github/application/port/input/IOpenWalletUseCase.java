package br.com.github.application.port.input;

import br.com.github.application.port.input.model.WalletCommand;
import br.com.github.application.port.input.model.WalletOutput;

public interface IOpenWalletUseCase {

    WalletOutput execute(WalletCommand command);
}
