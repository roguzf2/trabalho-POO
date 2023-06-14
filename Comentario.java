import java.time.LocalDateTime;

public class Comentario{
    private LocalDateTime data;
    private boolean fixado;
    private int tamanho;
    private String texto;
    public Object data_postagem; // adicionado automaticamente
    
    public Comentario(int tamanho, String texto) {
        this.data = data;
        this.fixado = fixado;
        this.tamanho = tamanho;
        this.texto = texto;
    }
    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }
    public boolean isFixado() {
        return fixado;
    }
    public void setFixado(boolean fixado) {
        this.fixado = fixado;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
}