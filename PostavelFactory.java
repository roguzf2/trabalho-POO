
public class PostavelFactory {
        public static Postavel createPostavel(String post, String localizacao) {
                Postavel posta = null;
                if (!post.toUpperCase().equals("POSTVIDEO") && !post.toUpperCase().equals("POSTFOTO")) {
                        System.out.println("Tipo de post inválido!");
                        throw new NullPointerException();
                }
                else if (post.toUpperCase().equals("POSTVIDEO")) {
                        PostVideo post_video = new PostVideo();
                        posta = post_video;
                }
                else if (post.toUpperCase().equals("POSTFOTO")) {
                        PostFoto post_foto = new PostFoto(localizacao);
                        posta = post_foto;
                }
                return posta;
        }
}