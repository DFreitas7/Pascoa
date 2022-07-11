package pascoa;
public abstract class ProdutoNutricional {
    protected Integer porcao;    
    protected Integer valorEnergetico;
    protected Float carboidratos;
    protected Float proteinas;
    protected Float gorduras;

    @Override
    public String toString() {
        return 
        "----------Info Nutricional----------\n"+
        "porcao: " + porcao + "g\n"+
        "valorEnergetico: " + valorEnergetico + "kcal\n"+
        "carboidratos: "+ carboidratos + "g\n"+
        "proteinas: " + proteinas + "g\n"+
        "gorduras: " + gorduras + "g\n" +
        "-------------------------------------";
    }
}
