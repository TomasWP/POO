package aula04;
import java.util.ArrayList;
import java.util.Scanner;

import Util.UserInput;

public class Ex1 {
    public static void main(String[] args) {

        ArrayList<Circulo> circulos = new ArrayList<Circulo>();
		ArrayList<Retangulo> retangulos = new ArrayList<Retangulo>();
		ArrayList<Triangulo> triangulos = new ArrayList<Triangulo>();
        Scanner sc = new Scanner(System.in);
        int opcao, opcao_2;
        try{
            do{
                do{
                    System.out.println("");
                    System.out.println("1 - Criar nova figura");
                    System.out.println("2 - Mostrar uma figura");
                    System.out.println("3 - Mudar uma figura");
                    System.out.println("4 - Perimetro de uma figura");
                    System.out.println("5 - Area de uma figura");
                    System.out.println("6 - Comparar figuras");
                    System.out.println("0 - Sair");
                    opcao = sc.nextInt();
                }while(!UserInput.in_between(opcao, 0, 6));

                switch (opcao){
                    case 1:
                        do{
                            System.out.println("");
                            System.out.println("1 - Criar Circulo");
                            System.out.println("2 - Criar Retangulo");
                            System.out.println("3 - Criar Triangulo");
                            System.out.println("0 - Voltar ao Menu Anterior");
                            opcao_2 = sc.nextInt();
                        }while(!UserInput.in_between(opcao_2, 0, 3));
                        switch(opcao_2){
                            case 1:
                                System.out.println("");
                                System.out.println("Insira o raio!");
                                double raio = sc.nextDouble();
                                Circulo novo_circulo = new Circulo(raio);
                                circulos.add(novo_circulo);
                                System.out.println("");
                                System.out.println("Círculo criado: " + novo_circulo);
                                break;
                            case 2:
                                System.out.println("");
                                System.out.println("Insira o comprimento!");
                                double comprimento = sc.nextDouble();
                                System.out.println("Insira a altura!");
                                double altura = sc.nextDouble();
                                Retangulo novo_retangulo = new Retangulo(comprimento, altura);
                                retangulos.add(novo_retangulo);
                                System.out.println("");
                                System.out.println("Retangulo criado: "+novo_retangulo);
                                break;
                            case 3:
                                System.out.println("");
                                System.out.println("Insira o 1º lado!");
                                double lado_1 = sc.nextDouble();
                                System.out.println("Insira o 2º lado!");
                                double lado_2 = sc.nextDouble();
                                System.out.println("Insira o 3º lado!");
                                double lado_3 = sc.nextDouble();
                                Triangulo novo_triangulo = new Triangulo(lado_1, lado_2, lado_3);
                                triangulos.add(novo_triangulo);
                                System.out.println("");
                                System.out.println("Triangulo criado: "+novo_triangulo);
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                        do{
                            System.out.println("1 - Mostrar Circulo");
                            System.out.println("2 - Mostrar Retangulo");
                            System.out.println("3 - Mostrar Triangulo");
                            System.out.println("0 - Voltar ao Menu Anterior");
                            opcao_2 = sc.nextInt();
                        }while(!UserInput.in_between(opcao_2, 0, 3));
                        switch(opcao_2){
                            case 1:
                                if (circulos.size() <= 0) {
                                    System.out.println("Nenhum círculo foi criado!");
                                    break;
                                }
                                System.out.println("");
                                System.out.println("Círculo atual: \n" + circulos.get(circulos.size() - 1));
                                break;
                            case 2:
                                if (retangulos.size() <= 0) {
                                    System.out.println("Nenhum retangulo foi criado!");
                                    break;
                                }
                                System.out.println("");
                                System.out.println("Retangulo atual: \n" + retangulos.get(circulos.size() - 1));
                                break;
                            case 3:
                                if (triangulos.size() <= 0) {
                                    System.out.println("Nenhum triangulo foi criado!");
                                    break;
                                }
                                System.out.println("");
                                System.out.println("Triangulo atual: \n" + triangulos.get(circulos.size() - 1));
                                break;
                            default:
                                break;
                        }
                        break;
                    case 3:
                        do{
                            System.out.println("1 - Mudar Circulo");
                            System.out.println("2 - Mudar Retangulo");
                            System.out.println("3 - Mudar Triangulo");
                            System.out.println("0 - Voltar ao Menu Anterior");
                            opcao_2 = sc.nextInt();
                            }while(!UserInput.in_between(opcao_2, 0, 3));
                        switch(opcao_2){
                            case 1:
                                if (circulos.size() <= 0) {
                                    System.out.println("Nenhum círculo foi criado!");
                                    break;
                                }
                                System.out.println("Insira o raio!");
                                double raio = sc.nextDouble();
                                circulos.get(circulos.size() - 1).setRaio(raio);
                                System.out.println("");
                                System.out.println("Círculo atual: " + circulos.get(circulos.size() - 1));
                                break;
                            case 2:
                                if (retangulos.size() <= 0) {
                                    System.out.println("Nenhum retangulo foi criado!");
                                    break;
                                }
                                System.out.println("Insira o comprimento!");
                                double comprimento = sc.nextDouble();
                                System.out.println("Insira a altura!");
                                double altura = sc.nextDouble();
                                retangulos.get(retangulos.size() - 1).setComprimento(comprimento);
                                retangulos.get(retangulos.size() - 1).setAltura(altura);
                                System.out.println("");
                                System.out.println("Retangulo atual: " + retangulos.get(retangulos.size() - 1));
                                break;
                            case 3:
                                if (triangulos.size() <= 0) {
                                    System.out.println("Nenhum triangulo foi criado!");
                                    break;
                                }
                                System.out.println("Insira o 1º lado!");
                                double lado_1 = sc.nextDouble();
                                System.out.println("Insira o 2º lado!");
                                double lado_2 = sc.nextDouble();
                                System.out.println("Insira o 3º lado!");
                                double lado_3 = sc.nextDouble();
                                triangulos.get(triangulos.size() - 1).setLado(1, lado_1);
                                triangulos.get(triangulos.size() - 1).setLado(2, lado_2);
                                triangulos.get(triangulos.size() - 1).setLado(3, lado_3);
                                System.out.println("");
                                System.out.println("Triangulo atual: " + triangulos.get(triangulos.size() - 1));
                                break;
                            default:
                                break;
                        }
                        break;
                    case 4:
                        do{
                            System.out.println("1 - Perimetro do Circulo");
                            System.out.println("2 - Perimetro do Retangulo");
                            System.out.println("3 - Perimetro do Triangulo");
                            System.out.println("0 - Voltar ao Menu Anterior");
                            opcao_2 = sc.nextInt();
                        }while(!UserInput.in_between(opcao_2, 0, 3));
                        switch(opcao_2){
                            case 1:
                                if (circulos.size() <= 0) {
                                    System.out.println("Nenhum círculo foi criado!");
                                    break;
                                }
            
                                System.out.println("Perímetro do Círculo: " + circulos.get(circulos.size() - 1).getPerimetro());
                                break;
                            case 2:
                                if (retangulos.size() <= 0) {
                                    System.out.println("Nenhum retangulo foi criado!");
                                    break;
                                }
            
                                System.out.println("Perímetro do Retangulo: " + retangulos.get(retangulos.size() - 1).getPerimetro());
                                break;
                            case 3:
                                if (triangulos.size() <= 0) {
                                    System.out.println("Nenhum triangulo foi criado!");
                                    break;
                                }
            
                                System.out.println("Perímetro do Triangulo: " + triangulos.get(triangulos.size() - 1).getPerimetro());
                                break;
                            default:
                                break;
                        }
                        break;
                    case 5:
                        do{
                            System.out.println("1 - Area do Circulo");
                            System.out.println("2 - Area do Retangulo");
                            System.out.println("3 - Area do Triangulo");
                            System.out.println("0 - Voltar ao Menu Anterior");
                            opcao_2 = sc.nextInt();
                        }while(!UserInput.in_between(opcao_2, 0, 3));
                        switch(opcao_2){
                            case 1:
                                if (circulos.size() <= 0) {
                                    System.out.println("Nenhum círculo foi criado!");
                                    break;
                                }
            
                                System.out.println("Area do Círculo: " + circulos.get(circulos.size() - 1).getArea());
                                break;
                            case 2:
                                if (retangulos.size() <= 0) {
                                    System.out.println("Nenhum retangulo foi criado!");
                                    break;
                                }
            
                                System.out.println("Area do Retangulo: " + retangulos.get(retangulos.size() - 1).getArea());
                                break;
                            case 3:
                                if (triangulos.size() <= 0) {
                                    System.out.println("Nenhum triangulo foi criado!");
                                    break;
                                }
            
                                System.out.println("Area do Triangulo: " + triangulos.get(triangulos.size() - 1).getArea());
                                break;
                            default:
                                break;
                        }
                        break;
                    case 6:
                        do{
                            System.out.println("1 - Comparar todos os Circulos");
                            System.out.println("2 - Comparar todos os Retangulos");
                            System.out.println("3 - Comparar todos os Triangulos");
                            System.out.println("0 - Voltar ao Menu Anterior");
                            opcao_2 = sc.nextInt();
                        }while(!UserInput.in_between(opcao_2, 0, 3));
                        switch(opcao_2){
                            case 1:
                                if (circulos.size() <= 0) {
                                    System.out.println("Nenhum círculo foi criado!");
                                    break;
                                }
            
                                for (int i = 0; i < circulos.size() - 1; i++) {
                                    for (int j = i + 1; j < circulos.size(); j++) {
                                        if (circulos.get(i).equals(circulos.get(j))) {
                                            System.out.println("Os círculos \n" + circulos.get(i) + "\n"+" e "+"\n" + circulos.get(j) + "\n são iguais.");
                                        } else {
                                            System.out.println("Os círculos \n" + circulos.get(i) + "\n"+" e "+"\n" + circulos.get(j) + "\n são diferentes.");
                                        }
                                    }
                                }
            
                                break;
                            case 2:
                                if (retangulos.size() <= 0) {
                                    System.out.println("Nenhum retangulo foi criado!");
                                    break;
                                }
            
                                for (int i = 0; i < retangulos.size() - 1; i++) {
                                    for (int j = i + 1; j < retangulos.size(); j++) {
                                        if (retangulos.get(i).equals(retangulos.get(j))) {
                                            System.out.println("Os retangulos \n" + retangulos.get(i) + "\n"+" e "+"\n" + retangulos.get(j) + "\n são iguais.");
                                        } else {
                                            System.out.println("Os retangulos \n" + retangulos.get(i) + "\n"+" e "+"\n" + retangulos.get(j) + "\n são diferentes.");
                                        }
                                    }
                                }
        
                                break;
                            case 3:
                                if (triangulos.size() <= 0) {
                                    System.out.println("Nenhum triangulo foi criado!");
                                    break;
                                }
            
                                for (int i = 0; i < triangulos.size() - 1; i++) {
                                    for (int j = i + 1; j < triangulos.size(); j++) {
                                        if (triangulos.get(i).equals(triangulos.get(j))) {
                                            System.out.println("Os triangulos \n" + triangulos.get(i) + "\n"+" e "+"\n" + triangulos.get(j) + "\n são iguais.");
                                        } else {
                                            System.out.println("Os triangulos \n" + triangulos.get(i) + "\n"+" e "+"\n" + triangulos.get(j) + "\n são diferentes.");
                                        }
                                    }
                                }
            
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }

            }while(opcao != 0 );
            sc.close();
        }catch(Exception e){
            System.out.println("ERRO! Insira um número inteiro!");
        }
    }
}
