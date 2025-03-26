
package InterfacesJava;


public enum Niveles {
    
    Bajo(1),Alto(3),Medio(2);
    
    int valor;
    
    Niveles(int valor){
        this.valor = valor;
    }
    
    public int getValor(){
        return valor;
    }
    
    
    
}
