package br.com.github.infrastructure.adapters.output.database.repository;

import br.com.github.infrastructure.adapters.output.database.entity.WalletEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface IWalletRepository extends JpaRepository<WalletEntity, UUID> {

    Optional<WalletEntity> findByCpf(String cpf);
}
