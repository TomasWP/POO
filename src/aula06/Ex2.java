package aula06;
import java.util.ArrayList;
import java.util.Scanner;
import Util.UserInput;
import aula05.DateYMD;

public class Ex2 {
    public static void main(String[] args) {

        ArrayList<Contacto> contactos = new ArrayList<Contacto>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        //try {
            do{
                do{
                    System.out.println("1. Inserir contacto");
                    System.out.println("2. Alterar contacto");
                    System.out.println("3. Apagar contacto");
                    System.out.println("4. Procurar contacto");
                    System.out.println("5. Listar contactos");
                    System.out.println("0. Sair");
                    System.out.print("Opção: ");
                    opcao = sc.nextInt();
                }while(!UserInput.in_between(opcao, 0, 5));
                switch(opcao){
                    case 1:
                        inserirContacto(sc, contactos);
                        break;
                    case 2:
                        alterarContacto(sc, contactos);
                        break;
                    case 3:
                        apagarContacto(sc, contactos);
                        break;
                    case 4:
                        procurarContacto(sc, contactos);
                        break;
                    case 5:
                        listarContactos(contactos);
                        break;
                    default:
                        System.out.println("Saindo...");
                        break;
                }
            }while(opcao != 0);
            sc.close();
        //} catch (Exception e) {
          //  System.out.println("ERRO! Insira um número inteiro!");
        //}
    }

    private static void inserirContacto(Scanner sc, ArrayList<Contacto> contactos){

        String frase = "", nome, numero, email;
        String[] input = {};
        Contacto contactoExistente = null;
        int cc;
        
        do{
            System.out.print("Insira o nome! ");
            nome = sc.next();
        }while(!Contacto.validName(nome));
        do{
            System.out.print("Insira o CC! ");
            cc = sc.nextInt();
        }while(!Contacto.validCC(cc));
        do{
            System.out.print("Insira a data de nascimento no formato DD-MM-AAAA! ");
            frase = sc.next();
            input = frase.split("-");
            if(input[1].length()!=2){
                System.out.println("ERRO!Insira a data no formato pretendido MM!");
            }else if(input[2].length()!=4){
                System.out.println("ERRO!Insira a data no formato pretendido AAAA!");
            }
        }while(frase == "" || input[1].length()!=2 || input[2].length()!=4 || !DateYMD.valid(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2])));
        DateYMD new_date = new DateYMD(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2]));
        do{
            System.out.print("Insira o número de telemóvel! ");
            numero = sc.next();
        }while(!Contacto.valid_telemovel(numero));
        do{
            System.out.print("Insira o email! ");
            email = sc.next();
        }while(!Contacto.valid_email(email));

        for (Contacto contacto : contactos) {
            if (contacto.getNome().equals(nome) || contacto.getTelemovel() == numero) {
                contactoExistente = contacto;
                break;
            }
        }

        if (contactoExistente == null) {
            Contacto new_contacto = new Contacto(nome, cc, new_date, numero, email);
            contactos.add(new_contacto);
            System.out.println("Contacto adicionado com sucesso!");
        } else {
            System.out.println("Contacto já existente! Deseja continuar como novo contacto? (S)");
            String opcao = sc.next();
            if (opcao.equalsIgnoreCase("S")) {
                Contacto new_contacto = new Contacto(nome, cc, new_date, numero, email);
                contactos.add(new_contacto);
                System.out.println("Contacto adicionado com sucesso!");
            } else {
                System.out.println("Operação cancelada!");
            }
        }
    }

    private static void alterarContacto(Scanner sc, ArrayList<Contacto> contactos){

        String frase = "", nome, numero, email;
        String[] input = {};
        int cc;

        System.out.print("Insira o nome ou número do contacto: ");
        String nome_numero = sc.next();
        ArrayList<Contacto> resultados = new ArrayList<>();

        for (Contacto contacto : contactos) {
            if (contacto.getNome().equals(nome_numero) || contacto.getTelemovel().equals(nome_numero)) {
                resultados.add(contacto);
            }
        }

        if (resultados.isEmpty()) {
            System.out.println("Não foi encontrado nenhum contacto!");
        } else if (resultados.size() == 1) {
            Contacto contacto = resultados.get(0);
            System.out.print("Contacto encontrado: ");
            System.out.println(contacto);
            do{
                System.out.print("Insira o nome! ");
                nome = sc.next();
                if(nome.isEmpty()){
                    break;
                }
            }while(!Contacto.validName(nome));
            if (!nome.isEmpty()){
                contacto.setNome(nome);
            }
            do{
                System.out.print("Insira o CC! ");
                cc = sc.nextInt();
            }while(!Contacto.validCC(cc));
            if (!Integer.toString(cc).isEmpty()){
                contacto.setCc(cc);
            }
            do{
                System.out.print("Insira a data de nascimento no formato DD-MM-AAAA! ");
                frase = sc.next();
                if(frase.isEmpty()){
                    break;
                }
                input = frase.split("-");
                if(input[1].length()!=2){
                    System.out.println("ERRO!Insira a data no formato pretendido MM!");
                }else if(input[2].length()!=4){
                    System.out.println("ERRO!Insira a data no formato pretendido AAAA!");
                }
            }while(frase == "" || input[1].length()!=2 || input[2].length()!=4 || !DateYMD.valid(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2])));
            if(!frase.isEmpty()){
                DateYMD new_date = new DateYMD(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2]));
                contacto.setDataNasc(new_date);
            }
            do{
                System.out.print("Insira o número de telemóvel! ");
                numero = sc.next();
                if(numero.isEmpty()){
                    break;
                }
            }while(!Contacto.valid_telemovel(numero));
            if (!numero.isEmpty()){
                contacto.setTelemovel(numero);
            }
            do{
                System.out.println("Insira o email! ");
                email = sc.next();
                if(email.isEmpty()){
                    break;
                }
            }while(!Contacto.valid_email(email));
            if (!email.isEmpty()){
                contacto.setEmail(email);
            }

        } else {
            System.out.println("Foram encontrados vários contactos:");
            for (Contacto contacto : resultados) {
                System.out.println(contacto.getNumero_sequencial() + ": " + contacto.getNome() + " (" + contacto.getTelemovel() + ")");
            }
            System.out.print("Escolha o ID do contacto a alterar: ");
            int id = sc.nextInt();
            boolean encontrado = false;
            for (Contacto contacto : resultados) {
                if (contacto.getNumero_sequencial() == id) {
                    encontrado = true;
                    System.out.print("Contacto encontrado: ");
                    System.out.println(contacto);
                    do{
                        System.out.print("Insira o nome! ");
                        nome = sc.next();
                    }while(!Contacto.validName(nome));
                    contacto.setNome(nome);
                    do{
                        System.out.print("Insira o CC! ");
                        cc = sc.nextInt();
                    }while(!Contacto.validCC(cc));
                    contacto.setCc(cc);
                    do{
                        System.out.print("Insira a data de nascimento no formato DD-MM-AAAA! ");
                        frase = sc.next();
                        input = frase.split("-");
                        if(input[1].length()!=2){
                            System.out.println("ERRO!Insira a data no formato pretendido MM!");
                        }else if(input[2].length()!=4){
                            System.out.println("ERRO!Insira a data no formato pretendido AAAA!");
                        }
                    }while(frase == "" || input[1].length()!=2 || input[2].length()!=4 || !DateYMD.valid(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2])));
                    DateYMD new_date = new DateYMD(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2]));
                    contacto.setDataNasc(new_date);
                    do{
                        System.out.print("Insira o número de telemóvel! ");
                        numero = sc.next();
                    }while(!Contacto.valid_telemovel(numero));
                    contacto.setTelemovel(numero);
                    do{
                        System.out.println("Insira o email! ");
                        email = sc.next();
                    }while(!Contacto.valid_email(email));
                    contacto.setEmail(email);
                }
            }
            if(!encontrado){
                System.out.println("ID inválido!");
            }
        }
    }

    private static void apagarContacto(Scanner sc, ArrayList<Contacto> contactos){
        System.out.print("Insira o nome ou número do contacto a apagar: ");
        String nome_numero = sc.next();
        ArrayList<Contacto> resultados = new ArrayList<>();
        for (Contacto contacto : contactos) {
            if (contacto.getNome().equals(nome_numero) || contacto.getTelemovel().equals(nome_numero)) {
                resultados.add(contacto);
            }
        }

        if (resultados.isEmpty()) {
            System.out.println("Não foi encontrado nenhum contacto!");
        } else if (resultados.size() == 1) {
            Contacto contacto = resultados.get(0);
            contactos.remove(contacto);
            System.out.println("Contacto apagado!");
        } else {
            System.out.println("Foram encontrados vários contactos:");
            for (Contacto contacto : resultados) {
                System.out.println(contacto.getNumero_sequencial() + ": " + contacto.getNome() + " (" + contacto.getTelemovel() + ")");
            }
            System.out.print("Escolha o ID do contacto a alterar: ");
            int id = sc.nextInt();
            boolean encontrado = false;
            for (Contacto contacto : resultados) {
                if (contacto.getNumero_sequencial() == id) {
                    encontrado = true;
                    contactos.remove(contacto);
                    System.out.println("Contacto apagado!");
                    break; 
                }
            }
            if(!encontrado){
                System.out.println("ID inválido!");
            }
        }
    }

    private static void procurarContacto(Scanner sc, ArrayList<Contacto> contactos){
        System.out.print("Insira o nome ou número do contacto: ");
        String nome_numero = sc.next();
        ArrayList<Contacto> resultados = new ArrayList<>();
        for (Contacto contacto : contactos) {
            if (contacto.getNome().equals(nome_numero) || contacto.getTelemovel().equals(nome_numero)) {
                resultados.add(contacto);
            }
        }

        if (resultados.isEmpty()) {
            System.out.println("Não foi encontrado nenhum contacto!");
        } else if (resultados.size() == 1) {
            Contacto contacto = resultados.get(0);
            System.out.println("Contacto encontrado: "+contacto);
        } else {
            System.out.println("Foram encontrados vários contactos:");
            for (Contacto contacto : resultados) {
                System.out.println(contacto.getNumero_sequencial() + ": " + contacto.getNome() + " (" + contacto.getTelemovel() + ")");
            }
            System.out.print("Escolha o ID do contacto a alterar: ");
            int id = sc.nextInt();
            boolean encontrado = false;
            for (Contacto contacto : resultados) {
                if (contacto.getNumero_sequencial() == id) {
                    encontrado = true;
                    System.out.println("Contacto encontrado: "+contacto);
                    break; 
                }
            }
            if(!encontrado){
                System.out.println("ID inválido!");
            }
        }
    }

    private static void listarContactos(ArrayList<Contacto> contactos){
        if (contactos.isEmpty()) {
            System.out.println("Nenhum contacto existente!");
            return;
        }

        System.out.println("Lista de contactos:");
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }
}
