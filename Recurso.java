public abstract class Recurso {
    protected int ID;
    protected String url_recurso;
    protected static int prox_ID;

    public boolean validaUrlRecurso(String url_recurso) {
        // .jpg .png .bmp .mp4 .mov .wmv
        String finalStringUrl = url_recurso.substring(url_recurso.length() - 5);
        if (finalStringUrl == ".jpg .png .bmp .mp4 .mov .wmv") {
            return true;
        } else {
            return false;
        }
    }
}
