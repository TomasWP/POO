package aula08;

public class Ex1 {
    public static void main(String[] args) {
        // criar uma empresa de aluguer de viaturas
        EmpresaViaturas empresa = new EmpresaViaturas("Empresa Vrum-Vrum", "4535-140", "empresavrum@ua.pt");
        // criar algumas viaturas
        Motociclo moto = new Motociclo("AA-11-BB", "Honda", "CBR", 125, "desportivo");
        AutomovelLigeiro carro = new AutomovelLigeiro("CC-22-DD", "Renault", "Clio", 90, "1234", 300);
        AutomovelLigeiroEletrico carro_eletrico = new AutomovelLigeiroEletrico("CY-23-D9", "Renault", "Clio", 90, "1234", 300);
        Taxi taxi = new Taxi("EE-33-FF", "Toyota", "Prius", 110, "VF5678", 500, 123);
        PesadoMercadorias camiao = new PesadoMercadorias("GG-44-HH", "Mercedes", "Actros", 500, "9012", 20000, 40000);
        PesadoPassageiros autocarro = new PesadoPassageiros("II-55-JJ", "Volvo", "9700", 450, "3456", 40000, 50);
        
        // adicionar as viaturas à empresa
        empresa.addVeiculo(moto);
        empresa.addVeiculo(carro);
        empresa.addVeiculo(carro_eletrico);
        empresa.addVeiculo(taxi);
        empresa.addVeiculo(camiao);
        empresa.addVeiculo(autocarro);
        
        // testar os métodos das viaturas
        moto.trajeto(100);
        carro.trajeto(200);
        taxi.trajeto(150);
        camiao.trajeto(500);
        autocarro.trajeto(300);
        
        System.out.println(moto);
        System.out.println(carro);
        System.out.println(carro_eletrico);
        carro_eletrico.carregar(27);
        System.out.println(carro_eletrico);
        System.out.println(taxi);
        System.out.println(camiao);
        System.out.println(autocarro);
        
        // testar os métodos da empresa de aluguer
        System.out.println(empresa);
        System.out.println("Número de viaturas: " + empresa.getNumeroViaturas());
        System.out.println("Total de quilómetros percorridos: " + empresa.getTotalQuilometrosPercorridos());
        System.out.println("Viatura com maior quilómetros percorridos: " + empresa.getViaturaMaiorQuilometragem());

        empresa.removeVeiculo(carro);
        empresa.removeVeiculo(taxi);
        System.out.println(empresa);
        System.out.println("Número de viaturas: " + empresa.getNumeroViaturas());
        System.out.println("Total de quilómetros percorridos: " + empresa.getTotalQuilometrosPercorridos());
        System.out.println("Viatura com maior quilómetros percorridos: " + empresa.getViaturaMaiorQuilometragem());
    }
}
