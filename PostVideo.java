import java.time.LocalDateTime;
import java.util.ArrayList;

public class PostVideo implements Postavel {
    private int qtde_videos, tamanho_antes;
    private Video video;
    private LocalDateTime data_postagem = LocalDateTime.now();;
    private ArrayList<Comentario> lista_comentarios = new ArrayList<>();;

    private int qtde_fixados;

    // Criar toString
    public void PostVideo() {

    }

    // retornar em estado de erro
    public boolean adicionaVideo(Video new_video) {
        this.video = new_video;
        if (this.video != null) {
            return true;
        } else {
            System.out.println("Video não foi criado");
            return false;
        }
    }

    @Override
    public boolean posta() {
        if (this.video != null) {
            this.data_postagem = LocalDateTime.now();
            return true;
        } else {
            System.out.println("Nenhum vídeo associado");
            return false;
        }
    }

    @Override
    public boolean comenta(String new_texto, boolean new_fixado) {
        Comentario comentario = new Comentario(new_texto, new_fixado);
        if (comentario.isFixado()) {
            if (lista_comentarios.size() == 0) {
                lista_comentarios.add(comentario);
            } else {
                lista_comentarios.add(0 + this.qtde_fixados, comentario);
            }
            this.qtde_fixados += 1;
        } else {
            lista_comentarios.add(comentario);
        }
        if (lista_comentarios.contains(comentario)) {
            return true;
        } else {
            System.out.println("Erro! Seu comentário não foi adicionado");
            return false;
        }
    }

    public Video getVideo() {
        return video;
    }

    public ArrayList<Comentario> getLista_comentarios() {
        return lista_comentarios;
    }

    public String toString() {
        String msg = ("Video: " + this.video);
        msg += ("\nPostada em: " + this.data_postagem);
        msg += ("\nComentários: " + this.lista_comentarios);
        msg += ("\nQuantidade de comentários fixados: " + this.qtde_fixados);
        return msg;
    }
}