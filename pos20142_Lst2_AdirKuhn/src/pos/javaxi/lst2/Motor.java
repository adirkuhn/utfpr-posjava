/* Adir Kuhn
 */
package pos.javaxi.lst2;

/**
 *
 * @author adirkuhn
 */
public class Motor {
   
    private int qtdPist;
    private int potencia;

    public Motor() {
        this.qtdPist = 0;
        this.potencia = 0;
    }
    
    public Motor(int qtdPist, int potencia) {
        this.qtdPist = qtdPist;
        this.potencia = potencia;
    }
    
    /**
     * @return the qtdPist
     */
    public int getQtdPist() {
        return qtdPist;
    }

    /**
     * @param qtdPist the qtdPist to set
     */
    public void setQtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
}
