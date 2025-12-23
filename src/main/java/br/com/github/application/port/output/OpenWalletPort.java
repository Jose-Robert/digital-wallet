package br.com.github.application.port.output;

import br.com.github.domain.model.Wallet;

public interface OpenWalletPort {

    Wallet openWallet(Wallet wallet);
}
