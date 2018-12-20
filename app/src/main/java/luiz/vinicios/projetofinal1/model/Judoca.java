package luiz.vinicios.projetofinal1.model;

import android.widget.RadioGroup;

public class Judoca {
    private String nome;
    private String ultimoNome;
    private String graduacao;
    private RadioGroup sexo;
    private Double peso;
    private int celular;
    private int nascimento;

    public Judoca() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public RadioGroup getSexo() {
        return sexo;
    }

    public void setSexo(RadioGroup sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getNascimento() {
        return nascimento;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Judoca{" +
                "nome='" + nome + '\'' +
                ", ultimoNome='" + ultimoNome + '\'' +
                ", graduacao='" + graduacao + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", celular=" + celular +
                ", nascimento=" + nascimento +
                '}';
    }
}
