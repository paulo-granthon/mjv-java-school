package model;

import java.time.LocalDate;

public class Candidato {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private Sexo sexo;
    private String logradouro;
    private String numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private String estado;
    private String email;
    private long telefone;
    private long celular;
    private boolean celularWhats;
    private String profissao;
    private String empresa;
    private double salario;
    private boolean empregoAtual;
    private double pretencaoMinima;
    private double pretencaoMaxima;
    private String habilidades;

    public Candidato (
        String nome,
        String cpf,
        LocalDate dataNascimento,
        Sexo sexo,
        String logradouro,
        String numero,
        String bairro,
        String complemento,
        String cidade,
        String estado,
        String email,
        long telefone,
        long celular,
        boolean celularWhats,
        String profissao,
        String empresa,
        double salario,
        boolean empregoAtual,
        double pretencaoMinima,
        double pretencaoMaxima,
        String habilidades
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.celularWhats = celularWhats;
        this.profissao = profissao;
        this.empresa = empresa;
        this.salario = salario;
        this.empregoAtual = empregoAtual;
        this.pretencaoMinima = pretencaoMinima;
        this.pretencaoMaxima = pretencaoMaxima;
        this.habilidades = habilidades;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public LocalDate getDataNascimento() { return dataNascimento; }
    public Sexo getSexo() { return sexo; }
    public String getLogradouro() { return logradouro; }
    public String getNumero() { return numero; }
    public String getBairro() { return bairro; }
    public String getComplemento() { return complemento; }
    public String getCidade() { return cidade; }
    public String getEstado() { return estado; }
    public String getEmail() { return email; }
    public long getTelefone() { return telefone; }
    public long getCelular() { return celular; }
    public String getProfissao() { return profissao; }
    public String getEmpresa() { return empresa; }
    public double getSalario() { return salario; }
    public double getPretencaoMinima() { return pretencaoMinima; }
    public double getPretencaoMaxima() { return pretencaoMaxima; }
    public String getHabilidades() { return habilidades; }

    public boolean isCelularWhats() { return celularWhats; }
    public boolean hasEmpregoAtual() { return empregoAtual; }
}