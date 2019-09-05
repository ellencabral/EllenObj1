package br.edu.ifsul.model;

import java.util.Objects;

public class Participante implements Comparable{
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;

    public Participante() { // Construtor padrão
    }

    public Participante(int id, String nome) { // Construtor Parametrizado
        this.id = id;
        this.nome = nome;
    }

    public Participante(int id, String nome, String email, String senha, String telefone) { // Construtor Parametrizado
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participante that = (Participante) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Object o) {
        if(this.id > ((Participante)o).id) {
            return 1;
        }
        else if (this.id < ((Participante)o).id) {
            return -1;
        }
        return 0;
    }
}
