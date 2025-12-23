package br.com.github.infrastructure.utils;

import br.com.github.domain.exception.InsufficientBalanceException;
import br.com.github.domain.exception.InvalidArgumentException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.regex.Pattern;

import static org.apache.commons.lang3.StringUtils.EMPTY;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Utils {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[^@]+@[^@]+\\.[^@]+$");

    public static String cleanCPF(String data) {
        if (data == null) {
            return EMPTY;
        }
        var numbers = data.replaceAll("\\D", "");
        if (numbers.length() != 11) {
            throw new InvalidArgumentException("Invalid CPF length");
        }
        return numbers;
    }

    public static String formatAndMaskCpf(String cpf) {
        if (cpf == null) {
            return EMPTY;
        }
        cpf = cpf.replaceAll("\\D", "");
        if (cpf.length() != 11) {
            throw new InvalidArgumentException("Invalid CPF length");
        }
        return cpf.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "***.$2.$3-**");
    }

    public static String isEmailValid(String data) {
        if (StringUtils.isBlank(data) || !EMAIL_PATTERN.matcher(data).matches()) {
            throw new InvalidArgumentException("Invalid email");
        }
        return data;
    }

    public static void validateInputAmount(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidArgumentException("Invalid amount value");
        }
    }

    public static void validCurrentBalance(BigDecimal balance) {
        if (balance.compareTo(BigDecimal.ZERO) < 0) {
            throw new InsufficientBalanceException("Insufficient balance for this operation");
        }
    }


}
