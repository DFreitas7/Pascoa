package pascoa.lacta;

import pascoa.ChocolateFactory;
import pascoa.OvoPascoa;

public class LactaFactory implements ChocolateFactory {
    @Override
    public OvoPascoa createOvoPascoa(Integer codigo) {
        switch(codigo) {
            case 1:
                return new AoLeite();
            case 2:
                return new Oreo();
            case 3:
                return new SonhoDeValsa();
        }
        return null;
    }
}
