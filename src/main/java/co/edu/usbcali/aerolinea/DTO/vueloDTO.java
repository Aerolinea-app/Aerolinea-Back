package co.edu.usbcali.aerolinea.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@Builder
@ToString
public class VueloDTO {
    private String origen;
    private String destino;
    private Integer precio;
    private Date fechaHoraSalida;
    private Date fechaHoraLlegada;
    private String id;
    private String idAvion;

}
