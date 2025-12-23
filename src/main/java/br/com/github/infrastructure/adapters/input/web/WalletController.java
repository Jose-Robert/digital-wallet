package br.com.github.infrastructure.adapters.input.web;

import br.com.github.application.port.input.IOpenWalletUseCase;
import br.com.github.infrastructure.adapters.input.api.IWalletApi;
import br.com.github.infrastructure.adapters.input.api.request.WalletRequest;
import br.com.github.infrastructure.adapters.input.api.response.WalletResponse;
import br.com.github.infrastructure.adapters.output.mapper.WalletResponseMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import static br.com.github.infrastructure.adapters.output.mapper.WalletRequestMapper.toCommand;

@RestController
@AllArgsConstructor
public class WalletController implements IWalletApi {

    private final IOpenWalletUseCase openWalletUseCase;

    @Override
    public ResponseEntity<WalletResponse> openWallet(WalletRequest walletRequest) {
        var output = openWalletUseCase.execute(toCommand(walletRequest));
        return ResponseEntity.status(HttpStatus.CREATED).body(WalletResponseMapper.from(output));
    }
}
