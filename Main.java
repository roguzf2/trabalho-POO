public class Main {
        public static void main(String[] args) throws InterruptedException {

                // Tentativa de criação de postagem com texto
                System.out.println("\nTentativa de criação de postagem com texto");
                Foto foto_valida2 = new Foto(1440, "foto_valida2.png");
                try {
                        PostFoto post_foto_invalida2 = (PostFoto) PostavelFactory.createPostavel("postagem",
                                        "São Paulo");
                        post_foto_invalida2.adicionaFoto(foto_valida2);
                        System.out.println(post_foto_invalida2);

                } catch (NullPointerException e) {
                        System.out.println("erro = " + e);
                }

                // Tentativa de postagem com um vídeo atribuido
                Video video = new Video(60, 20, "video_maneiro.mp4");
                PostVideo post_video = (PostVideo) PostavelFactory.createPostavel("postvideo", null);
                post_video.adicionaVideo(video);
                System.out.println("\nTentativa de postagem com um vídeo atribuido:");
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
                post_foto_5.comenta("foto muito bacana!", false);
                System.out.println(post_foto_5);

                // Testando atualizar data_postagem
                Thread.sleep(2000);
                System.out.println("\nTentativa de atualizar data_postagem");
                post_foto_5.posta();
                System.out.println(post_foto_5);

                // Tentativa de criação de comentário em uma postagem com vídeo
                System.out.println("\nTentativa de criação de comentário em uma postagem com vídeo");
                post_video.comenta("video muito doidão! Curti :) ", false);
                System.out.println(post_video);

                // Tentativa de criação de vídeo inválido
                System.out.println("\nTentativa de criação de vídeo inválido");
                Video video_invalido = new Video(60, 20, "video_invalido.mp5");
                PostVideo post_video_invalido = (PostVideo) PostavelFactory.createPostavel("postvideo", null);
                post_video_invalido.adicionaVideo(video_invalido);
                System.out.println(post_video_invalido);

                // Tentativa de criação de foto inválida
                System.out.println("\nTentativa de criação de foto inválida");
                Foto foto_invalida = new Foto(1440, "foto_invalida.npg");
                PostFoto post_foto_invalida = (PostFoto) PostavelFactory.createPostavel("postfoto", "Curitiba");
                post_foto_invalida.adicionaFoto(foto_invalida);
                System.out.println(post_foto_invalida);

                // Tentativa de criar um comentário fixado
                Video video_2 = new Video(60, 20, "video_maneiro.mp4");
                PostVideo post_video_2 = (PostVideo) PostavelFactory.createPostavel("postvideo", null);
                post_video_2.adicionaVideo(video_2);
                post_video_2.comenta("Comentário fixado", true);
                post_video_2.comenta("Comentário não fixado", false);
                post_video_2.comenta("Comentário fixado 2", true);
                System.out.println("\nTentativa de criar um comentário fixado:");
                System.out.println(post_video_2);

        }
}
