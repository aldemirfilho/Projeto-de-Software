package iface;

import java.util.ArrayList;

public class Usuario 
{
    private int id;
    private String login;
    private String senha;
    private String nome;
    private String profissao;
    private int idade;
    private String hobby;
    private String cidade;
    
    java.util.ArrayList<String> Amigos = new java.util.ArrayList<String>();
    
    java.util.ArrayList<String> Pedidos_Amigos = new java.util.ArrayList<String>();
    
    java.util.ArrayList<ArrayList<String>> mensagens = new  java.util.ArrayList<ArrayList<String>>();
    
    java.util.ArrayList<String> new_mensagens = new java.util.ArrayList<String>();

    public ArrayList<String> getNew_mensagens() {
        return new_mensagens;
    }

    public void setNew_mensagens(ArrayList<String> new_mensagens) {
        this.new_mensagens = new_mensagens;
    }

    public ArrayList<ArrayList<String>> getMensagens() {
        return mensagens;
    }

    public void setMensagens(ArrayList<ArrayList<String>> mensagens) {
        this.mensagens = mensagens;
    }

    public ArrayList<String> getPedidos_Amigos() {
        return Pedidos_Amigos;
    }

    public void setPedidos_Amigos(ArrayList<String> Pedidos_Amigos) {
        this.Pedidos_Amigos = Pedidos_Amigos;
    }

    public ArrayList<String> getAmigos() {
        return Amigos;
    }

    public void setAmigos(ArrayList<String> Amigos) {
        this.Amigos = Amigos;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
