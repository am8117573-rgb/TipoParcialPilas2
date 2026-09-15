public  class CambioTexto{
    private String textoAnterior;
    private String textoNuevo;
    private String fecha;
    private String usuario;

    public CambioTexto() {
    }

    public String getTextoAnterior() {
        return textoAnterior;
    }

    public void setTextoAnterior(String textoAnterior) {
        this.textoAnterior = textoAnterior;
    }

    public String getTextoNuevo() {
        return textoNuevo;
    }

    public void setTextoNuevo(String textoNuevo) {
        this.textoNuevo = textoNuevo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    @Override
        public String toString() {
            return
             "Usuario: " + usuario +
             "\nFecha: " + fecha +
             "\nTexto Anterior: " + textoAnterior +
             "\nTexto Nuevo: " + textoNuevo +
             "\n------------------------------";

        }
    
    

    
    
    
}
