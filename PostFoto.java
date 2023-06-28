import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Date;

public class PostFoto implements Postavel {
    private int qtde_fotos, tamanho_antes;
    private ArrayList<Foto> fotos = new ArrayList<>();
    private String localizacao;
    private LocalDateTime data_postagem = LocalDateTime.now();
    private ArrayList<Comentario> lista_comentarios = new ArrayList<>();

    // Criar toString
    public PostFoto(String localizacao) {
        if (qtde_fotos > 10) {
            System.out.println("Erro! Limite maximo de fotos excedido.");
        } else {
            this.localizacao = localizacao;
        }
    }

    public boolean adicionaFoto(Foto foto) {
        if ((this.fotos.size()) >= 10) {
            System.out.println("Erro! Limite maximo de fotos excedido.");
            return false;
        } else {
            this.tamanho_antes = this.fotos.size();
            this.fotos.add(foto);
            if (foto.getUrl_recurso() == null) {
                this.qtde_fotos += 0;
                this.fotos.remove(foto);
            } else {
                this.qtde_fotos += 1;
            }
            if (this.tamanho_antes == this.fotos.size()) {
                return false;
            } else {
                return true;
            }
        }
    }

    public boolean removeFoto(Foto foto) {
        tamanho_antes = fotos.size();
        if (fotos.size() == 0) {
            System.out.println("Erro! Não há fotos a serem removidas.");
            return false;
        }
        if (tamanho_antes == fotos.size()) {
            fotos.remove(foto);
            if (tamanho_antes > fotos.size()) {
                return true;
            } else {
                System.out.println("Erro! Foto não foi removida.");
                return false;
            }
        } else {
            System.out.println("Houve um erro inesperado.");
            return false;
        }
    }

    // retornar em estado de erro
    @Override
    public boolean posta() {
        if (fotos.size() >= 1 && fotos.size() <= 10) {
            this.data_postagem = LocalDateTime.now();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean comenta(String new_texto, boolean new_fixado) {
        Comentario comentario = new Comentario(new_texto, new_fixado);
        lista_comentarios.add(comentario);
        if (lista_comentarios.contains(comentario)) {
            return true;
        } else {
            System.out.println("Erro! Seu comentário não foi adicionado");
            return false;
        }
    }

    public ArrayList<Foto> getFotos() {
        return fotos;
    }

    public ArrayList<Comentario> getlista_comentarios() {
        return lista_comentarios;
    }

    public LocalDateTime getData_postagem() {
        return data_postagem;
    }

    public String toString() {
        String msg = "localização: " + this.localizacao;
        msg += ("\ncom fotos: " + this.fotos);
        msg += ("\nquantidade de fotos: " + this.qtde_fotos);
        msg += ("\nPostada em: " + this.data_postagem);
        msg += ("\nComentários: " + this.lista_comentarios);
        return msg;
    }

}
