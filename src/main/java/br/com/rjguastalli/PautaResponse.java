package br.com.rjguastalli;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PautaResponse {

    public static final String ZONE_ID = "America/Sao_Paulo";

    private Long id;
    private String descricao;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = ZONE_ID)
    private LocalDateTime dataCadastroPauta;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = ZONE_ID)
    private LocalDateTime dataDesativacaoPauta;
    @Builder.Default
    private List<SessaoModel> sessoes = new ArrayList<>();
}
