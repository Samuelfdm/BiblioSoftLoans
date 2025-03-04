package edu.eci.cvds.BiblioSoftLoans.dto.Book;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
public class CopyUpdateDTO {

    @JsonProperty("id")
    private String id;

    @JsonProperty("state")
    private String state;

    @JsonProperty("disponibility")
    private CopyDTO.CopyDispo disponibility;

    // Constructor con parámetros
    public CopyUpdateDTO(String copyId, CopyDTO.CopyDispo copyDispo, String state) {
        this.id = copyId;
        this.disponibility = copyDispo;
        this.state = state;
    }
}
