public class Foto extends Recurso {
    private int resolucao;

    public Foto(int new_resolucao) {
        this.resolucao = new_resolucao;
    }

    @Override
    public boolean validaUrlRecurso(String url_recurso) {
        // .jpg .png .bmp
        String finalStringUrl = url_recurso.substring(url_recurso.length() - 5);
        if (finalStringUrl == ".jpg" || finalStringUrl == ".png" || finalStringUrl == ".bmp") {
            return true;
        } else {
            return false;
        }
    }
}
