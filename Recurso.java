public abstract class Recurso {
    protected int ID;
    protected String url_recurso;
    protected static int prox_ID = 1;

    public abstract boolean validaUrlRecurso(String url_recurso);

    public String getUrl_recurso() {
        return url_recurso;
    }
}
