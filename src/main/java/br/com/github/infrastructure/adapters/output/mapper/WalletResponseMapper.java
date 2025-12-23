package br.com.github.infrastructure.adapters.output.mapper;

import br.com.github.application.port.input.model.WalletOutput;
import br.com.github.infrastructure.adapters.input.api.response.WalletResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WalletResponseMapper {

    public static WalletResponse from(WalletOutput output) {
        return WalletResponse.builder()
                .id(output.id())
                .name(output.name())
                .email(output.email())
                .cpf(output.cpf())
                .build();
    }
}
