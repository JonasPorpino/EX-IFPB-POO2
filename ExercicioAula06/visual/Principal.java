package visual;
     /**
      * Instituto Federal de Educação, Ciência e Tecnológica da Paraíba
      * Licenciatura em Computação
      * Programação Orientada a Objetos II
      * Professor: Diego Ernesto Rosa Pessoa
      * Tutor: Danilo Rangel Arruda Leite
      * Aluno: Jonas Nunes Porpino
     */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controlar.Gerenciador;
import modelo.Pessoas;

public class Principal extends JFrame implements ActionListener{ // Acao na propria classe
    
    private Gerenciador gerenciarPessoas;

    private static final long serialVersionUID = 1L;
    
    private JButton botao; //Botão de cadastro 

    JLabel codigo = new JLabel("Código: ");
    JTextField RecebeCodigo = new JTextField();
    JLabel nome = new JLabel("Digite o Nome: ");
    JTextField RecebeNome = new JTextField();
    JLabel email = new JLabel("Digite o Email: ");
    JTextField RecebeEmail = new JTextField();

    JLabel BuscaCodigo = new JLabel("Buscar pelo Código: ");
    JTextField RecebeBusca = new JTextField();

    private JButton Buscar;
    
    
    public Principal() {
        setLayout(null);

        gerenciarPessoas = new Gerenciador();

        // botao
        botao = new JButton("Salvar!");
        botao.addActionListener(this);
        getContentPane().add(botao);
        botao.setBounds(150, 135, 130, 30);

        // Botão de busca
        Buscar = new JButton("Buscar");
        Buscar.addActionListener(this);
        getContentPane().add(Buscar);
        Buscar.setBounds(210, 200, 100, 30);

       


        // Texto código
        getContentPane().add(codigo);
        codigo.setBounds(15, 10, 100, 30);
        // JTextField código
        getContentPane().add(RecebeCodigo);
        RecebeCodigo.setBounds(150, 10, 40, 30);
        // Texto nome
        getContentPane().add(nome);
        nome.setBounds(15, 50, 180, 30);
        // JTextField email
        getContentPane().add(RecebeNome);
        RecebeNome.setBounds(150, 50, 300, 30);
        // Texto email
        getContentPane().add(email);
        email.setBounds(15, 90, 180, 30);
        // JTextField email
        getContentPane().add(RecebeEmail);
        RecebeEmail.setBounds(150, 90, 300, 30);

        
        
        // texto de busca
        getContentPane().add(BuscaCodigo);
        BuscaCodigo.setBounds(15, 200, 180, 30);
        // JTextField da busca
        getContentPane().add(RecebeBusca);
        RecebeBusca.setBounds(175, 200, 30, 30);

        setTitle("Cadastro de Pessoas!");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
 
    
    public static void main(String[] args) {
        new Principal().setVisible(true);
    }
    
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == botao){
            botaoActionPerformed(evento);
            // chama o primeiro evento
        } else if (evento.getSource() == Buscar){
                buscaActionPerformed(evento);}}
            // chama o segundo evento

    Pessoas pessoa = new Pessoas();
    private void botaoActionPerformed(ActionEvent evento) {  
        pessoa.setCodigo(RecebeCodigo.getText());
        pessoa.setNome(RecebeNome.getText());
        pessoa.setEmail(RecebeEmail.getText());
        gerenciarPessoas.criarPessoa(pessoa);
        
        JOptionPane.showMessageDialog(null, "Pessoa Cadastrada");
    }
    private void buscaActionPerformed(ActionEvent evento) {
        Pessoas pessoa = gerenciarPessoas.recuperarPessoas(RecebeBusca.getText());
        if (pessoa != null ){
            RecebeNome.setText(pessoa.getNome());
            RecebeEmail.setText(pessoa.getEmail());
            RecebeCodigo.setText(pessoa.getCodigo());
        } else {JOptionPane.showMessageDialog(null, "Cadastro Não encontrado");}
        
    }

    
}