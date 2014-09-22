/* Adir Kuhn 
 */
package pos.javaxi.lst2;

/*
 * @author adirkuhn
 */
public class Teste {

    public static void main(String[] args) {
        
        //Testes
        
        //1 - Novo Veiculo sem atributos
        Veiculo v1 = new Veiculo();
        System.out.println("v1");
        System.out.println(v1.toString());
        
        //2 - Novo Veiculo com atributos gerais e sem atributos de motor
        Veiculo v2 = new Veiculo("ASD-1010", "FIAT", "500c", (float) 180.1);
        System.out.println("v2");
        System.out.println(v2.toString());
        
        //3 - Novo Veiculo com atributos gerais e atributos de motor
        Veiculo v3 = new Veiculo("ASD-1010", "FIAT", "500c", (float) 180.1, 8, 1800);
        System.out.println("v3");
        System.out.println(v3.toString());
        
        //4 - Testa alteração de dados
        //Placa
        System.out.println("Alterando Placa");
        v3.setPlaca("HJY-0101");
        System.out.println(v3.toString());
        
        //Marca
        System.out.println("Alterando Marca");
        v3.setMarca("Hyundai");
        System.out.println(v3.toString());
        
        //Modelo
        System.out.println("Alterando Modelo");
        v3.setModelo("HB20");
        System.out.println(v3.toString());
        
        //Velocidade Máxima
        System.out.println("Alterando Velocidade Máxima");
        v3.setVelocMax(200);
        System.out.println(v3.toString());
        
        //Qtd de Pistao
        System.out.println("Alterando Quantidade de Pistão");
        v3.getMotor().setQtdPist(10);
        System.out.println(v3.toString());
        
        //Potencia
        System.out.println("Alterando Potencia");
        v3.getMotor().setPotencia(10191);
        System.out.println(v3.toString());
    }
    
}
