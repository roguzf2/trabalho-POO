import java.time.LocalDateTime;

public class Comentario{
    private LocalDateTime data = LocalDateTime.now();
    private String texto;
    private boolean fixado;
    private int tamanho;

    public Comentario(String new_texto, boolean new_fixado) {
        this.fixado = new_fixado;
        this.texto = new_texto;
        this.tamanho = new_texto.length();
        this.data = LocalDateTime.now();
    }

    public LocalDateTime getData() {
        return data;
    }

    public boolean isFixado() {
        return fixado;
    }

    public int getTamanho() {
        return tamanho;
    }
    
    public String getTexto() {
        return texto;
    }

    public String toString() {
        String msg = this.texto;
        return msg;
    }
   
}