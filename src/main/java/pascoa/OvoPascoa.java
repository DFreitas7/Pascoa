package pascoa;

public abstract class OvoPascoa extends ProdutoNutricional {
    protected String nome;
    protected Integer peso;

    @Override
    public String toString() {
        return "--------------OvoPascoa--------------\n"+
                "nome: " + nome + "\n"+
                "peso: " + peso + "g\n"+
                super.toString();
    }
}
