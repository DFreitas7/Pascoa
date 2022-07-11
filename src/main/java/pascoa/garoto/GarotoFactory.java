package pascoa.garoto;

import pascoa.ChocolateFactory;
import pascoa.OvoPascoa;

public class GarotoFactory implements ChocolateFactory {
    @Override
    public OvoPascoa createOvoPascoa(Integer codigo) {
        switch(codigo) {
            case 1:
                return new Crocante();
            case 2:
                return new Talento();
            case 3:
                return new BatonAoLeite();
        }
        return null;
    }
}
