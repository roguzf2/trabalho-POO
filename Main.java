import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Foto foto = new Foto(1360, "abacate.jpg");
        // System.out.println(foto.url_recurso);
        // System.out.println(foto.validaUrlRecurso("abacate.jpg"))
        // Video video = new Video(1440, 20, "video_bolado.mp4sd");
        // System.out.println(video);
        // Comentario comentario = new Comentario("salve cambada", true);
        // System.out.println(comentario);
        // System.out.println(comentario.getTexto());
        // System.out.println(comentario.getTamanho());
        // System.out.println(comentario.getData());
        // System.out.println(comentario.isFixado());
        Video video = new Video(60, 20, "video_maneiro.mp4");
        PostVideo post_video = new PostVideo();
        post_video.comenta("video bem bacana");
        System.out.println(post_video.getLista_comentarios());
    }
}
