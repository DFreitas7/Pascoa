package pascoa;

import java.util.Scanner;
import pascoa.garoto.GarotoFactory;
import pascoa.lacta.LactaFactory;
import pascoa.nestle.NestleFactory;

public class Pascoa {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            Integer fabrica;
            NestleFactory nestleFactory = new NestleFactory();
            GarotoFactory garotoFactory = new GarotoFactory();
            LactaFactory lactaFactory = new LactaFactory();
            
            do {
                System.out.println("Escolha a fabrica para visualizar os produtos: ");
                System.out.println("1 - Nestle\t2 - Garoto\t3 - Lacta\t -1 para sair");
                fabrica = scanner.nextInt();
                
                System.out.println("Digite o codigo do produto para visualizar: 1-3");
                Integer codigoProduto = scanner.nextInt();
                
                switch (fabrica) {
                    case 1:
                        System.out.println(nestleFactory.createOvoPascoa(codigoProduto));
                        break;
                    case 2:
                        System.out.println(garotoFactory.createOvoPascoa(codigoProduto));
                        break;
                    case 3:
                        System.out.println(lactaFactory.createOvoPascoa(codigoProduto));
                        break;
                }
                
            } while (fabrica != -1);
        }
    }
}
