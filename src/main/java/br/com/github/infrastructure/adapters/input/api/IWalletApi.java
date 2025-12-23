package br.com.github.infrastructure.adapters.input.api;

import br.com.github.infrastructure.adapters.input.api.request.WalletRequest;
import br.com.github.infrastructure.adapters.input.api.response.WalletResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "/wallets", produces = MediaType.APPLICATION_JSON_VALUE)
public interface IWalletApi {

    @Operation(summary = "Create Wallet", description = "Creating a new wallet for a user.")
    @PostMapping
    ResponseEntity<WalletResponse> openWallet(@RequestBody WalletRequest walletRequest);

    @Operation(summary = "Find Wallet by CPF", description = "Find wallet for document number")
    @GetMapping(value = "/find/{cpf}")
    ResponseEntity<WalletResponse> findWalletByCpf(@PathVariable(name = "cpf") String cpf);
}
