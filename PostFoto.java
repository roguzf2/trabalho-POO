import java.time.LocalDateTime;

public  class PostFoto{
    private int qtde_fotos;
    private Foto fotos[];
    private String localizacao;
    private LocalDateTime data_postagem;
    private Comentario listaComentarios[];
    
    public void PostFoto(){

    }

    public boolean adicionaFoto(){
        return true;
    }

    public boolean removeFoto(){
        return false;
    }
    public boolean posta(){
        return true;
    }
    public boolean comenta(){
        return true;
    }
}
