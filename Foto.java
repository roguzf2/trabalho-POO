public class Foto extends Recurso {
    private int resolucao;

    public Foto(int new_resolucao, String new_url) {
        if (validaUrlRecurso(new_url) == true) {
            this.resolucao = new_resolucao;
            this.url_recurso = new_url;
        } else {
            System.out.println("Foto com url inválida");
        }
    }

    @Override
    public boolean validaUrlRecurso(String url_recurso) {
        // .jpg .png .bmp
        String finalStringUrl = url_recurso.substring(url_recurso.length() - 4);
        if (finalStringUrl.equals(".jpg") || finalStringUrl.equals(".png") || finalStringUrl.equals(".bmp")) {
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
