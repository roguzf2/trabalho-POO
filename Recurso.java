public abstract class Recurso {
    protected int ID;
    protected String url_recurso;
    protected static int prox_ID;

    public abstract boolean validaUrlRecurso(String url_recurso);
}
