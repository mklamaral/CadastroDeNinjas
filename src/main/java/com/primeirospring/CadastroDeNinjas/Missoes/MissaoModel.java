package com.primeirospring.CadastroDeNinjas.Missoes;

import com.primeirospring.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String dificuldade;

    // @OneToMany - uma missão pode ter muitos ninjas
    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjas;


}
