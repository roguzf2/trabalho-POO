public class Video extends Recurso {
    private int frame_rate;
    private int duracao;

    public Video(int new_frame_rate, int new_duracao) {
        this.frame_rate = new_frame_rate;
        this.duracao = new_duracao;
    }

    @Override
    public boolean validaUrlRecurso(String url_recurso) {
        // .mp4 .mov .wmv
        String finalStringUrl = url_recurso.substring(url_recurso.length() - 5);
        if (finalStringUrl == ".mp4" || finalStringUrl == ".mov" || finalStringUrl == ".wmv") {
            return true;
        } else {
            return false;
        }

    }
}
