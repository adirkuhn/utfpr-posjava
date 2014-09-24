/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.javaxi.lst3;

/**
 *
 * @author adirkuhn
 */
public class Computador {
    
    private String modelo;
    private String marca;
    private int ram;
    private int hd;
    private Boolean superdrive;

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
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * @return the hd
     */
    public int getHd() {
        return hd;
    }

    /**
     * @param hd the hd to set
     */
    public void setHd(int hd) {
        this.hd = hd;
    }

    /**
     * @return the superdrive
     */
    public Boolean getSuperdrive() {
        return superdrive;
    }

    /**
     * @param superdrive the superdrive to set
     */
    public void setSuperdrive(Boolean superdrive) {
        this.superdrive = superdrive;
    }
    
    
}
