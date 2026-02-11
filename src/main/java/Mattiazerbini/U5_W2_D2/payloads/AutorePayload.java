package Mattiazerbini.U5_W2_D2.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@ToString
@NoArgsConstructor
public class AutorePayload {
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataDiNascita;
}
