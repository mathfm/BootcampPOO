package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }





    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public Curso(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * getCargaHoraria();
    }

    public Curso() {
    }

    @Override
    public String toString() {
        return "Curso { " +
                "Titulo: " + getTitulo() +
                ", Descrição: '" + getDescricao() + '\'' +
                ", Carga Horaria: '" + getCargaHoraria() + '}';
    }

}
