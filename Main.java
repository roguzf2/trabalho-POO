import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Foto foto = new Foto(1360, "abacate.jpg");
        //System.out.println(foto.url_recurso);
        //System.out.println(foto.validaUrlRecurso("abacate.jpg"))
        PostFoto post_foto = new PostFoto("Rio de Janeiro");
        System.out.println(post_foto.getFotos());
        post_foto.adicionaFoto(foto);
        System.out.println(post_foto.getFotos());
        //Video video = new Video(1440, 20, "video_bolado.mp4sd");
        //System.out.println(video);
        // Comentario comentario = new Comentario("salve cambada", true);
        // System.out.println(comentario);
        // System.out.println(comentario.getTexto());
        // System.out.println(comentario.getTamanho());
        // System.out.println(comentario.getData());
        // System.out.println(comentario.isFixado());
    }
}
