public class Foto extends Recurso {
    private int resolucao;

    public Foto(int new_resolucao, String new_url) {
        this.resolucao = new_resolucao;
        this.url_recurso = new_url;
    }

    @Override
    public boolean validaUrlRecurso(String url_recurso) {
        // .jpg .png .bmp
        String finalStringUrl = url_recurso.substring(url_recurso.length() - 4);
        System.out.println(finalStringUrl + " FINAL STRING");
        if (finalStringUrl.equals(".jpg") || finalStringUrl.equals(".png") || finalStringUrl.equals(".bmp")) {
            System.out.println("Válido!");
            return true;
        } else {
            System.out.println("Não é valido");
            return false;
        }
    }
}
