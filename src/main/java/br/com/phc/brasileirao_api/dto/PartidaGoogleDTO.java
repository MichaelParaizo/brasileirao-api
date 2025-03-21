package br.com.phc.brasileirao_api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PartidaGoogleDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String statusPartida;
    private String tempoPartida;

    //informações da equipe da casa
    private String nomeEquipeCasa;
    private String urlLogoEquipeCasa;
    private Integer placarEquipeCasa;
    private String golsEquipeCasa;
    private String placarEstendidoEquipeCasa;

    //informações da equipe visitante
    private String nomeEquipeVisitante;
    private String urlLogoEquipeVisitante;
    private Integer placarEquipeVisitante;
    private String golsEquipeVisitante;
    private String placarEstendidoEquipeVisitante;




}
