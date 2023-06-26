import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Tentativa de postagem com um vídeo atribuido
        Video video = new Video(60, 20, "video_maneiro.mp4");
        PostVideo post_video = (PostVideo) PostavelFactory.createPostavel("postvideo", null);
        post_video.adicionaVideo(video);
        System.out.println("Tentativa de postagem com um vídeo atribuido:");
        System.out.println(post_video);

        // Tentativa de postagem sem vídeo
        PostVideo post_video_vazio = (PostVideo) PostavelFactory.createPostavel("postvideo", null);
        System.out.println("\nTentativa de postagem sem vídeo:");
        System.out.println(post_video_vazio);

        // Tentativa de postagem sem foto
        PostFoto post_foto_vazio = (PostFoto) PostavelFactory.createPostavel("postfoto", "Rio de Janeiro");
        System.out.println("\nTentativa de postagem sem foto");
        System.out.println(post_foto_vazio);

        // Tentativa de postagem com 5 fotos atribuídas
        System.out.println("\nTentativa de postagem com 5 fotos atribuidas");
        PostFoto post_foto_5 = (PostFoto) PostavelFactory.createPostavel("postfoto", "Rio de Janeiro");
        for (int i = 0; i < 5; i++) {
            Foto foto = new Foto(1440, "imagem_maneira.png");
            post_foto_5.adicionaFoto(foto);
        }
        System.out.println(post_foto_5);

        // Tentativa de postagem com 11 fotos atribuídas
        System.out.println("\nTentativa de postagem com 11 fotos atribuidas");
        PostFoto post_foto_11 = (PostFoto) PostavelFactory.createPostavel("postfoto", "Rio de Janeiro");
        for (int i = 0; i < 11; i++) {
            Foto foto = new Foto(1440, "imagem_maneira.png");
            post_foto_11.adicionaFoto(foto);
        }
        System.out.println(post_foto_11);

        // Tentativa de criação de comentário em uma postagem com foto
        System.out.println("\nTentativa de criação de comentário em uma postagem com foto");
        post_foto_5.comenta("foto muito bacana!");
        System.out.println(post_foto_5);

        // Tentativa de criação de comentário em uma postagem com vídeo
        System.out.println("\nTentativa de criação de comentário em uma postagem com vídeo");
        post_video.comenta("video muito doidão! Curti :) ");
        System.out.println(post_video);

        //Tentativa de criação de vídeo inválido
        System.out.println("\nTentativa de criação de vídeo inválido");
        Video video_invalido = new Video(60, 20, "video_invalido.mp5");
        PostVideo post_video_invalido = (PostVideo) PostavelFactory.createPostavel("postvideo", null);
        post_video_invalido.adicionaVideo(video_invalido);
        System.out.println(post_video_invalido);

        //Tentativa de criação de foto inválida
        System.out.println("\nTentativa de criação de foto inválida");
        Foto foto_invalida = new Foto(1440, "foto_invalida.npg");
        PostFoto post_foto_invalida = (PostFoto) PostavelFactory.createPostavel("postfoto", "Curitiba");
        post_foto_invalida.adicionaFoto(foto_invalida);
        System.out.println(post_foto_invalida);
        // Foto foto = new Foto(1360, "abacate.jpg");
        // Foto foto2 = new Foto(1360, "abacate_2.jpg");
        // System.out.println(foto.url_recurso);
        // System.out.println(foto.validaUrlRecurso("abacate.jpg"))
        // System.out.println(video);
        // Comentario comentario = new Comentario("salve cambada", true);
        // PostVideo post_video = new PostVideo();
        // post_video.comenta("video bem bacana");
        // post_video.adicionaVideo(video);
        // System.out.println(post_video);
        // PostFoto post_foto = new PostFoto("Rio de Janeiro");
        // post_foto.adicionaFoto(foto);
        // post_foto.adicionaFoto(foto2);
        // post_foto.comenta("maneiro esse abacate ai");
        // System.out.println(post_foto);
        // PostVideo obj = (PostVideo) PostavelFactory.createPostavel("postvideo", null);
        // obj.adicionaVideo(video);
        // System.out.println(obj);
        
    }
    // Testar data_postagem
    // Testar Fixado
}
