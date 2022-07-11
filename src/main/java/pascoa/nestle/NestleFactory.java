package pascoa.nestle;

import pascoa.ChocolateFactory;

import pascoa.OvoPascoa;

public class NestleFactory implements ChocolateFactory {
    @Override
    public OvoPascoa createOvoPascoa(Integer codigo) {
        switch(codigo) {
            case 1:
                return new Alpino();
            case 2:
                return new Classic();
            case 3:
                return new KitKat();
        }
        return null;
    }
}
