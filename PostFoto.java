import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Date;

public class PostFoto{
    private int qtde_fotos, tamanho_antes;
    private ArrayList<Foto> fotos = new ArrayList<>();
    private String localizacao;
    private LocalDateTime data_postagem = LocalDateTime.now();
    private ArrayList<Comentario> listaComentarios = new ArrayList<>();
    
    public PostFoto(String localizacao) {
        if (qtde_fotos > 10) {
            System.out.println("Erro! Limite maximo de fotos excedido.");
        } else {
            this.localizacao = localizacao;
        }
    }

    public boolean adicionaFoto(Foto foto){
        this.tamanho_antes = this.fotos.size();
        this.fotos.add(foto);
        this.qtde_fotos += 1;
        if ((this.fotos.size()) > 10){
            System.out.println("Erro! Limite maximo de fotos excedido.");
            return false;
        }
        if (this.tamanho_antes == this.fotos.size()){
            return false;
        }
        else{
            return true;
        }
    }   

    public boolean removeFoto(Foto foto){
        tamanho_antes = fotos.size();
        fotos.remove(foto);
        if (fotos.size() == 0){
            System.out.println("Erro! Não há fotos a serem removidas.");
            return false;
        }
        if (tamanho_antes > fotos.size()){
            return true;
        }
        else{
            System.out.println("Erro! Foto não foi removida.");
            return false;
        }
    }
    public boolean posta(){
        if (fotos.size()> 1 && fotos.size() <=10)
        {
            this.data_postagem = LocalDateTime.now();
            return true;
        }
        else{
            return false;
        }
    }
    // public boolean comenta(int new_tamanho, String new_texto){
    //     Comentario comentario = new Comentario(new_tamanho, new_texto); 
    //     comentario.setData(data_postagem);
    //     listaComentarios.add(comentario);
    //     return true;    
    // }

    public ArrayList<Foto> getFotos() {
        return fotos;
    }
}
