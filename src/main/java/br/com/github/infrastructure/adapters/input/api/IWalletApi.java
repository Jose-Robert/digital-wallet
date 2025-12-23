package br.com.github.infrastructure.adapters.input.api;

import br.com.github.infrastructure.adapters.input.api.request.WalletRequest;
import br.com.github.infrastructure.adapters.input.api.response.WalletResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "/wallets", produces = MediaType.APPLICATION_JSON_VALUE)
public interface IWalletApi {

    @Operation(summary = "Create Wallet", description = "Creating a new wallet for a user.")
    @PostMapping
    ResponseEntity<WalletResponse> openWallet(@RequestBody WalletRequest walletRequest);
}
