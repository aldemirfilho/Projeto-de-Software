package iface;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Iface 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
                 
        System.out.println();
    System.out.print("              Bem vindo ao Iface!!\n");
        System.out.println();
    System.out.print("-Caso seja um novo membro, crie sua conta!!!\n-Caso já possua uma conta, efetue o login, e aproveite os recursos!!!");
        System.out.println();
    System.out.print("1 . Criação de Conta\n");
    System.out.print("2 . Criação/Edição de Perfil\n");
    System.out.print("3 . Adição de Amigos\n");
    System.out.print("4 . Envio de Mensagens\n");
    System.out.print("5 . Criação de Comunidades\n");
    System.out.print("6 . Adição de membros\n");
    System.out.print("7 . Recuperar Informações sobre um determinado Usuário\n");
    System.out.print("8 . Remoção de Conta\n");
        System.out.println();
    
        int possui;
        int opcao = 0;
        int controle = 1;
        int cont = 0;
        int incorreto = 1;
        
        System.out.print("Já possui uma conta:\n SIM: Digite 1\n NÃO: Digite 0\n Resp: ");
        possui = input.nextInt();
        
        if(possui == 0)
        {
            System.out.println("Se deseja criar uma nova conta, digite 1");
            opcao = input.nextInt();
        }
       
        String lixo = new String();
        lixo = input.nextLine();
        
        java.util.ArrayList<Usuario> Usuarios = new java.util.ArrayList<Usuario>();
        
        String login_user = null;
        
        Usuario user = new Usuario();
        
        while(opcao != 10)
        {
            if(possui == 0)
            {
                if(opcao == 1)
                {
                    while(controle == 1)
                    {
                        cont++;

                        System.out.println("Digite um login para acessar a conta posteriormente: ");
                        
                        Usuario user_create = new Usuario();
                        
                        user_create.setLogin(input.nextLine());
                        System.out.println("Digite sua senha: ");
                        user_create.setSenha(input.nextLine());
                        System.out.println("Digite o nome como você será conhecido na rede");
                        user_create.setNome(input.nextLine());
                        user_create.setId(cont);
                        Usuarios.add(user_create);

                        System.out.println();
                        System.out.println("Deseja fazer login ou criar uma nova conta?\n Nova conta : Digite 1\n Login: Digite 2");
                        controle = input.nextInt();
                        System.out.println("controle " + controle);
                        lixo = input.nextLine();
                    }
                }
            }
            if(possui == 1 || controle == 2)
            {
                int s;
                
                String login, senha;
                
                while(incorreto == 1)
                {
                    System.out.println("Digite seu login de usuário: ");
                    login = input.nextLine();

                    System.out.println("Digite sua senha: ");
                    senha = input.nextLine();

                    for(s = 0; s < Usuarios.size(); s++)
                    {
                        user = Usuarios.get(s);
                        if(user.getLogin().equals(login) && user.getSenha().equals(senha))
                        {
                            login_user = user.getLogin();
                            
                            System.out.println("Login efetuado com sucesso\n");
                            System.out.println("Digite a opção que deseja escolher: ");
                            opcao = input.nextInt();
                            
                            lixo = input.nextLine();
                            
                            incorreto = 0;
                            break;
                        }
                        else if(s == Usuarios.size() - 1)
                        {
                            System.out.println("Usuário não existe ou login e senha estão incorrentos...\nTente novamente\n");
                        }
                    }
                }
                if(opcao == 2)
                {
                    int op;
                    String edit, create;
                    System.out.println("Digite a operação que deseja executar\n Criar: Digite 1\n Editar: Digite 2: ");
                    op = input.nextInt();
                    
                    lixo = input.nextLine();

                    if(op == 2)
                    {    
                        System.out.println("Digite qual atributo deseja editar: ");
                        edit = input.nextLine();

                        if(edit.equals("login"))
                        {
                            System.out.println("Digite o novo login: ");
                            user.setLogin(input.nextLine());
                        }
                        else if(edit.equals("nome"))
                        {
                            System.out.println("Digite o seu novo nome: ");
                            user.setNome(input.nextLine());
                        }
                        else if(edit.equals("senha"))
                        {
                            System.out.println("Digite sua nova senha: ");
                            user.setSenha(input.nextLine());
                        }
                        else if(edit.equals("profissao"))
                        {
                            System.out.println("Digite sua nova profissão: ");
                            user.setProfissao(input.nextLine());
                        }
                        else if(edit.equals("idade"))
                        {
                            System.out.println("Digite sua idade: ");
                            user.setIdade(input.nextInt());
                        }
                        else if(edit.equals("hobby"))
                        {
                            System.out.println("Digite seu hobby: ");
                            user.setHobby(input.nextLine());
                        }
                        else if(edit.equals("cidade"))
                        {
                            System.out.println("Digite sua cidade: ");
                            user.setCidade(input.nextLine());
                        }
                    }
                    else if(op == 1)
                    {
                        System.out.println("Digite o nome do atributo que deseja criar: \n(Profissao, idade, hobby, cidade)\n");
                        create = input.nextLine();

                        if(create.equals("profissao"))
                        {
                            System.out.println("Digite sua profissão: ");
                            user.setProfissao(input.nextLine());
                        }
                        else if(create.equals("idade"))
                        {
                            System.out.println("Digite sua idade: ");
                            user.setIdade(input.nextInt());
                        }
                        else if(create.equals("hobby"))
                        {
                            System.out.println("Digite seu hobby: ");
                            user.setHobby(input.nextLine());
                        }
                        else if(create.equals("cidade"))
                        {
                            System.out.println("Digite sua cidade: ");
                            user.setCidade(input.nextLine());
                        }
                    }
                }   
                if(opcao == 3)
                {
                    int j, k, z, acao, incorreto3 = 1;
                    String nome_amigo;
                    System.out.println("Você deseja mandar uma solicitação, ou checar as recebidas?\n Mandar: Digite 1\n Checar: Digite 2");
                    acao = input.nextInt();
                    
                    if(acao == 1)
                    {
                        lixo = input.nextLine();
                        
                        System.out.println("Digite o nome de login de quem você quer adicionar como amigo: ");
                        nome_amigo = input.nextLine();
                        
                        for(j = 0; j < user.getAmigos().size(); j++)
                        {
                            if(user.getAmigos().get(j).equals(nome_amigo))
                            {
                                incorreto3 = 0;
                                System.out.println("Vocês já são amigos");
                            }
                        }
                        
                        Usuario user3 = new Usuario();
                        
                        while(incorreto3 == 1)
                        {
                            for(j = 0; j < Usuarios.size(); j++)
                            {
                                user3 = Usuarios.get(j);
                                if(user3.getLogin().equals(nome_amigo))
                                {
                                   System.out.println("euuu " + login_user);
                                   user3.getPedidos_Amigos().add(login_user);
                                   System.out.println("Solicitação enviada!!");
                                   incorreto3 = 0;
                                   System.out.println("nomes na lista de pedidos de amigos " + user3.getPedidos_Amigos());
                                   break;
                                }
                                else if(j == (Usuarios.size() - 1))
                                {
                                    System.out.println("Usuário procurado não encontrado! Tente novamente");
                                }
                            }
                        }
                    }
                    if(acao == 2)
                    {
                        int resp;
                        
                        Usuario user3 = new Usuario();
                        
                        System.out.println("LOGIN" + user.getLogin());
                        if(user.getPedidos_Amigos().size() != 0)
                        {
                            for(j = 0; j < user.getPedidos_Amigos().size(); j++)
                            {
                                System.out.println("Você deseja aceitar " + user.getPedidos_Amigos().get(j) + "?\nSIM: Digite 1\nNAO: Digite 2");
                                {
                                    resp = input.nextInt();
                                    nome_amigo = user.getPedidos_Amigos().get(j);
                                    System.out.println("nome amigo " + nome_amigo);
                                    
                                    if(resp == 1)
                                    {
                                        user.getAmigos().add(nome_amigo);
                                        System.out.println("nome userrr " + user.getLogin());
                                        for(k = 0; k < Usuarios.size(); k++)
                                        {
                                            user3 = Usuarios.get(k);
                                            if(user3.getLogin().equals(nome_amigo))
                                            {
                                                user3.getAmigos().add(user.getLogin());
                                            }
                                        }
                                        user.getPedidos_Amigos().remove(j);
                                        j--;
                                    }
                                    else if(resp == 2)
                                    {
                                        user.getPedidos_Amigos().remove(j);
                                        j--;
                                    }
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Não a pedidos pendentes!");
                        }
                        System.out.println("nomes na lista de amigos " + user.getAmigos());
                    }
                }
                if(opcao == 4)
                {
                    int func;
                    String destinatario, remetente, mensagem;
                    int g, d;
                    System.out.println("Você deseja mandar um nova mensagem, ou checar as recebidas?\n Mandar: Digite 1\n Checar: Digite 2");
                    func = input.nextInt();
                    
                    lixo = input.nextLine();
                    
                    for(g = 0; g < Usuarios.size(); g++)
                    {
                        //user.getMensagens().get(g).set(0, Usuarios.get(g).getLogin());
                        if(!user.getMensagens().get(g).get(0).equals(Usuarios.get(g).getLogin()))
                        {
                            user.getMensagens().get(g).add(Usuarios.get(g).getLogin());
                        }
                    }
                    
                    Usuario user4 = new Usuario();
                            
                    if(func == 1)
                    {
                        System.out.println("Digite o nome de login para quem você deseja mandar mensasgem");
                        destinatario = input.nextLine();
                        System.out.println("Digite a mensagem que deseja enviar, siga este formato (SEU_LOGIN: Mensagem)");
                        mensagem = input.nextLine();
                        for(g = 0; g < Usuarios.size(); g++)
                        {
                            if(user.getMensagens().get(g).get(0).equals(destinatario))
                            {
                                user.getMensagens().get(g).add(mensagem);
                            }
                        }
                        for(d = 0; d < Usuarios.size(); d++)
                        {
                            user4 = Usuarios.get(d);
                            if(user4.getLogin().equals(destinatario))
                            {
                                for(g = 0; g < Usuarios.size(); g++)
                                {
                                    if(user4.getMensagens().get(g).get(0).equals(user.getLogin()))
                                    {
                                        user4.getMensagens().get(g).add(mensagem);
                                        user4.getNew_mensagens().add(user.getLogin());
                                    }
                                }
                            }
                        }
                    }
                    if(func == 2)
                    {
                        System.out.println("Você tem mensagens de: \n");
                        if(user.getNew_mensagens().size() != 0)
                        {
                            for(g = 0; g < user.getNew_mensagens().size(); g++)
                            {
                                System.out.println(user.getNew_mensagens().get(g));
                            }
                            System.out.println("Digite o nome de quem você deseja visualizar a mensagem: ");
                            remetente = input.nextLine(); 
                            for(d = 0; d < Usuarios.size(); d++)
                            {
                                if(user.getMensagens().get(d).get(0).equals(remetente))
                                {
                                    for(g = 0; g < user.getMensagens().get(d).size(); g++)
                                    {
                                        System.out.println(user.getMensagens().get(d).get(g));
                                    }
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Não há mensagens novas.");
                        }
                    }
                }
                //------------------------------------------------------------------------------------------------------
                System.out.println();
                System.out.println("-Caso deseje executar um nova operação com este mesmo usuario, digite 1.\n-Caso deseje utilizar outro usuário, digite 2.");
                int reinicio;
                reinicio = input.nextInt();
                if(reinicio == 1)
                {
                    System.out.println("Digite a nova opcao que deseja executar\n Opção: ");
                    opcao = input.nextInt();
                }
                if(reinicio == 2)
                {
                    System.out.print("Caso seja a priemeira vez deste usuario, você precisará criar um nova conta.\n Já possui uma conta:\n SIM: Digite 1\n NÃO: Digite 0\n Resp: ");
                    possui = input.nextInt();
                    if(possui == 0)
                    {
                        System.out.print("Se deseja criar uma nova conta, digite 1\n Resp: ");
                        opcao = input.nextInt();
                        
                        lixo = input.nextLine();
                        
                        controle = 1;
                        incorreto = 1;
                    }
                    else
                    {
                        System.out.println("Faça seu login");
                        
                        lixo = input.nextLine();
                        
                        incorreto = 1;
                    }
                }
            }
        }           
    }
}
