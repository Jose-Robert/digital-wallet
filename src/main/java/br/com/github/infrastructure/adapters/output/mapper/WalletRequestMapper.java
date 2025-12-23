package br.com.github.infrastructure.adapters.output.mapper;

import br.com.github.application.port.input.model.WalletCommand;
import br.com.github.infrastructure.adapters.input.api.request.WalletRequest;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WalletRequestMapper {

    public static WalletCommand toCommand(WalletRequest request) {
        return new WalletCommand(request.getName(), request.getEmail(), request.getCpf());
    }
}
