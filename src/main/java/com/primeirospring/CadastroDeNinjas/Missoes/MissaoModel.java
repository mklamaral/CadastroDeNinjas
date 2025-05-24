package com.primeirospring.CadastroDeNinjas.Missoes;

import com.primeirospring.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
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
