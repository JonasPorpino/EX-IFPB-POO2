package visual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controle.Gerenciador;
import modelo.Produtos;


public class InterfaceMain extends JFrame implements ActionListener {
     /**
      * Instituto Federal de Educação, Ciência e Tecnológica da Paraíba
      * Licenciatura em Computação
      * Programação Orientada a Objetos II
      * Professor: Diego Ernesto Rosa Pessoa
      * Tutor: Danilo Rangel Arruda Leite
      * Aluno: Jonas Nunes Porpino
     */
    private Gerenciador gerenciarProdutos;

    private static final long serialVersionUID = 1L;
    private JButton botao;
    
    

    JLabel codigo = new JLabel("Código: ");
    JTextField Rcodigo = new JTextField();
    JLabel descricao = new JLabel("Descrição do Produto: ");
    JTextField Rdescricao = new JTextField();
    JLabel preco = new JLabel("Preço do Produto: ");
    JTextField Rpreco = new JTextField();
    JLabel validade = new JLabel("Validade do Produto, dia/mês/ano :");
    JTextField Rvalidade = new JTextField();

    

    public InterfaceMain() {


        setLayout(null);


        gerenciarProdutos = new Gerenciador();

        // botao
        botao = new JButton("Confirmar!");
        botao.addActionListener(this);
        getContentPane().add(botao);
        botao.setBounds(15, 200, 150, 30);
        // Texto código
        getContentPane().add(codigo);
        codigo.setBounds(15, 10, 100, 30);
        // JTextField código
        getContentPane().add(Rcodigo);
        Rcodigo.setBounds(265, 10, 200, 30);
        // Texto Descrição
        getContentPane().add(descricao);
        descricao.setBounds(15, 50, 180, 30);
        // JTextField descrição
        getContentPane().add(Rdescricao);
        Rdescricao.setBounds(265, 50, 300, 30);
        // Texto preço
        getContentPane().add(preco);
        preco.setBounds(15, 90, 180, 30);
        // JTextField preço
        getContentPane().add(Rpreco);
        Rpreco.setBounds(265, 90, 180, 30);
        // Texto Validade
        getContentPane().add(validade);
        validade.setBounds(15, 130, 250, 30);
        // JTextField Validade
        getContentPane().add(Rvalidade);
        Rvalidade.setBounds(265, 130, 180, 30);

        setTitle("Cadastro de Compras!");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new InterfaceMain();
    }

    public void actionPerformed(ActionEvent ev ){
        if(ev.getSource() == botao){
            String codigoProdutos = codigo.getText();
            String descricaoProdutos = descricao.getText();
            String precoProdutos = preco.getText();
            String validadeProdutos = validade.getText();
            Produtos produto = new Produtos();
            produto.setCodigo(codigoProdutos);
            produto.setCodigo(descricaoProdutos);
            produto.setCodigo(precoProdutos);
            produto.setCodigo(validadeProdutos);

            JOptionPane.showMessageDialog(null, "Cadastro Feito");
        }
    }

    
}