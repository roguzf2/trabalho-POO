public class Video extends Recurso {
    private int frame_rate;
    private int duracao;

    public Video(int new_frame_rate, int new_duracao, String new_url) {
        if (validaUrlRecurso(new_url) ==  true) {
            this.frame_rate = new_frame_rate;
            this.duracao = new_duracao;
            this.url_recurso = new_url;
        } else {
            System.out.println("Video com url inválida");
        }
        
    }

    @Override
    public boolean validaUrlRecurso(String url_recurso) {
        // .mp4 .mov .wmv
        String finalStringUrl = url_recurso.substring(url_recurso.length() - 4);
        if (finalStringUrl.equals(".mp4") || finalStringUrl.equals(".mov") || finalStringUrl.equals(".wmv")) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String msg = this.url_recurso;
        return msg;
    }
}
