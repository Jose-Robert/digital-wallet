package br.com.github.domain.model;

import br.com.github.domain.enums.StatusType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Wallet implements Serializable {

    private UUID id;
    private String name;
    private String email;
    private String cpf;
    private BigDecimal balance;
    private StatusType status;
}
