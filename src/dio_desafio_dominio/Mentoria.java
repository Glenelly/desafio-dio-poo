package dio_desafio_dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{ //classe filha

    private LocalDate data;

    
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria: titulo = "+ getTitulo() + ", descricao = "+ getDescricao() + ", data = " + data;
    }
    
}
