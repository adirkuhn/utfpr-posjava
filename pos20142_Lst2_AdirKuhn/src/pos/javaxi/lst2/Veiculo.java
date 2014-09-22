/* Adir Kuhn
 */
package pos.javaxi.lst2;

/**
 *
 * @author adirkuhn
 */
public class Veiculo {
    
    private String placa;
    private String marca;
    private String modelo;
    private float velocMax;
    private Motor motor;
    
    public Veiculo() {
        
        this.placa = " ";
        this.marca = " ";
        this.modelo = " ";
        this.velocMax = 0;
        this.motor = new Motor();
    }
    
    public Veiculo(String placa, String marca, String modelo, float velocMax) {
        
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.velocMax = velocMax;
        this.motor = new Motor();
    }
    
    public Veiculo(String placa, String marca, String modelo, float velocMax, int qtdPist, int potencia) {
        
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.velocMax = velocMax;
        this.motor = new Motor(qtdPist, potencia);
    }  

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the velocMax
     */
    public float getVelocMax() {
        return velocMax;
    }

    /**
     * @param velocMax the velocMax to set
     */
    public void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }

    /**
     * @return the motor
     */
    public Motor getMotor() {
        return motor;
    }
    
    @Override
    public String toString() {
        String toString;
        
        toString = "Veiculo";
        toString += "\n";
        toString += "\tPlaca: " + this.getPlaca();
        toString += "\n";
        toString += "\tMarca: " + this.getMarca();
        toString += "\n";
        toString += "\tModelo: " + this.getModelo();
        toString += "\n";
        toString += "\tVelocidade Máxima: " + this.getVelocMax();
        
        toString += "\n";
        toString += "\tMotor";
        toString += "\n";
        toString += "\t\tQuantidade de Pistão: " + this.getMotor().getQtdPist();
        toString += "\n";
        toString += "\t\tPotência: " + this.getMotor().getPotencia();
        
        return toString;
    }
}
