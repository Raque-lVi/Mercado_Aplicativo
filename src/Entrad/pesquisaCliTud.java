/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrad;

import Atualisas.AtuEstoque;
import Atualisas.AtulCli;
import TradutorDAO.EstoqueDAO;
import TradutorDAO.PesquiCli;
import classes.estoque;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import TradutorDAO.AcessoDAO;
import TradutorDAO.ClienteDAO;
import TradutorDAO.PessoaDAO;
import classes.Pessoa;
import classes.endereco;
import conexao.conexaoBanco;
import java.sql.Connection;
import java.util.ArrayList;


/**
 *
 * @author Vivian Raquel
 */
public class pesquisaCliTud extends javax.swing.JFrame {
    
    int enter = 0;
    ArrayList<Pessoa> Pessoa = new ArrayList<>();
    ArrayList<endereco> endereco = new ArrayList<>();
    private List <estoque> linhaEst;
    private String[] PesquiEst = new String[]{"Id","Nome do Produto","Valor","Estoque","ganho"};
    private String[] PesquiPess = new String[]{"nome","CPF"};
    private ClienteDAO cld;

    public pesquisaCliTud() {
        initComponents();
        
        this.cld = new ClienteDAO();
        float i = 0;
        DefaultTableModel modeloTab = (DefaultTableModel) tabPes.getModel();
        tabPes.setRowSorter(new TableRowSorter(modeloTab));

        readTabelaPess();
        
        PainelPesquisaPelo.setVisible(false);
        jpnDados.setVisible(false);
        jpnDadosProd.setVisible(false);
        
        PessoaDAO psd = new PessoaDAO();
        endereco end = new endereco();
         
    }
    public void tab (){
    
        DefaultTableModel mod = (DefaultTableModel) tabPes.getModel();

        mod.setRowCount(0);
        mod.setColumnCount(2);
        mod.setColumnIdentifiers(PesquiPess);

        PesquiCli pd = new PesquiCli();
        Pessoa ps = new Pessoa();


        for (Pessoa p: pd.listarPessoaNom()){

            mod.addRow (new Object[] {

                p.getNome(),      
                p.getCpf()
            });
        }}
    
    public void readTabelaPess(){
             
         
        DefaultTableModel mod = (DefaultTableModel) tabPes.getModel();
        PesquiCli pd = new PesquiCli();
        Pessoa ps = new Pessoa();

        mod.setRowCount(0);
        mod.setColumnCount(2);
        mod.setColumnIdentifiers(PesquiPess);

        for (Pessoa p: pd.listarTodpessoaS()){

            mod.addRow (new Object[] {

                p.getNome(),      
                p.getCpf()

        });

        }}
    
    public void TabPessCpf(){
             
         
        DefaultTableModel mod = (DefaultTableModel) tabPes.getModel();
        PesquiCli pd = new PesquiCli();
        Pessoa ps = new Pessoa();

        mod.setRowCount(0);
        mod.setColumnCount(2);
        mod.setColumnIdentifiers(PesquiPess);

        for (Pessoa p: pd.listarPessoaCpf()){

            mod.addRow (new Object[] {

                p.getNome(),      
                p.getCpf()
    
    });
    
    }
    }
    
    public void TabProdNom(){
              
        DefaultTableModel mod = (DefaultTableModel) tabPes.getModel();
        PesquiCli pd = new PesquiCli();
        estoque ps = new estoque();
       // tabPes. //adiciona as colunas

        mod.setRowCount(0);
        mod.setColumnCount(5);
        mod.setColumnIdentifiers(PesquiEst); //FOI NO PURO CHUTE!


        for (estoque est: pd.listarProdNom()){


            mod.addRow (new Object[] {

                est.getCodigo(),      
                est.getNOMEP(),
                est.getPreco(),
                est.getQtdp(),
                est.getGanho()

        });

        }}
    public void TabProdCod(){
                 
        DefaultTableModel mod = (DefaultTableModel) tabPes.getModel();
        PesquiCli pd = new PesquiCli();
        estoque ps = new estoque();

        mod.setRowCount(0);
        mod.setColumnCount(5);
        mod.setColumnIdentifiers(PesquiEst); //FOI NO PURO CHUTE!

        for (estoque est: pd.listarProdCod()){


            mod.addRow (new Object[] {

                est.getCodigo(),      
                est.getNOMEP(),
                est.getPreco(),
                est.getQtdp(),
                est.getGanho()

        });

        }}
      
    public void readTabelaProd(){
              
        DefaultTableModel mod = (DefaultTableModel) tabPes.getModel();
        PesquiCli pd = new PesquiCli();
        estoque ps = new estoque();

        mod.setRowCount(0);
        mod.setColumnCount(5);
        mod.setColumnIdentifiers(PesquiEst); //FOI NO PURO CHUTE!

            for (estoque est: pd.listarProdCod()){


                mod.addRow (new Object[] {

                    est.getCodigo(),      
                    est.getNOMEP(),
                    est.getPreco(),
                    est.getQtdp(),
                    est.getGanho()

            });

        }}
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txNomePess = new javax.swing.JTextField();
        jcbxPesq = new javax.swing.JComboBox<>();
        jpnDadosProd = new javax.swing.JPanel();
        labFiNom1 = new javax.swing.JLabel();
        labFicpf1 = new javax.swing.JLabel();
        labFiDataNas1 = new javax.swing.JLabel();
        labFiCidad1 = new javax.swing.JLabel();
        labFiCep1 = new javax.swing.JLabel();
        labFiTel1 = new javax.swing.JLabel();
        labFiNum1 = new javax.swing.JLabel();
        labFiEnd1 = new javax.swing.JLabel();
        labPreCom = new javax.swing.JLabel();
        labCate = new javax.swing.JLabel();
        labVenci = new javax.swing.JLabel();
        labPreVend = new javax.swing.JLabel();
        labCod = new javax.swing.JLabel();
        labNomeP = new javax.swing.JLabel();
        labGanho = new javax.swing.JLabel();
        labQtdd = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPes = new javax.swing.JTable();
        jpnDados = new javax.swing.JPanel();
        labFiNom = new javax.swing.JLabel();
        labFicpf = new javax.swing.JLabel();
        labFiDataNas = new javax.swing.JLabel();
        labFiUr = new javax.swing.JLabel();
        labFiCidad = new javax.swing.JLabel();
        labFiCep = new javax.swing.JLabel();
        labFiTel = new javax.swing.JLabel();
        labFiNum = new javax.swing.JLabel();
        labFiEnd = new javax.swing.JLabel();
        labNas = new javax.swing.JLabel();
        labUR = new javax.swing.JLabel();
        labNresid = new javax.swing.JLabel();
        labCep = new javax.swing.JLabel();
        labCpf = new javax.swing.JLabel();
        labNome = new javax.swing.JLabel();
        labCidade = new javax.swing.JLabel();
        labTelef = new javax.swing.JLabel();
        labEnd = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btEx = new javax.swing.JButton();
        PainelPesquisaPelo = new javax.swing.JPanel();
        jcbxPeloq = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btEdit_Atualiza = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setLayout(null);

        txNomePess.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txNomePess.setForeground(new java.awt.Color(0, 0, 153));
        txNomePess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txNomePess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txNomePessMouseClicked(evt);
            }
        });
        txNomePess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNomePessActionPerformed(evt);
            }
        });
        txNomePess.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txNomePessKeyReleased(evt);
            }
        });
        jPanel1.add(txNomePess);
        txNomePess.setBounds(66, 63, 634, 60);

        jcbxPesq.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcbxPesq.setForeground(new java.awt.Color(0, 0, 153));
        jcbxPesq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O que pesquisar?", "Pessoa", "Produto" }));
        jcbxPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxPesqActionPerformed(evt);
            }
        });
        jPanel1.add(jcbxPesq);
        jcbxPesq.setBounds(129, 22, 135, 20);

        jpnDadosProd.setBackground(new java.awt.Color(255, 255, 255));
        jpnDadosProd.setLayout(null);

        labFiNom1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labFiNom1.setForeground(new java.awt.Color(0, 0, 204));
        labFiNom1.setText("Nome:");
        jpnDadosProd.add(labFiNom1);
        labFiNom1.setBounds(6, 6, 80, 14);

        labFicpf1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labFicpf1.setForeground(new java.awt.Color(0, 0, 204));
        labFicpf1.setText("Codigo");
        jpnDadosProd.add(labFicpf1);
        labFicpf1.setBounds(6, 47, 58, 14);

        labFiDataNas1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labFiDataNas1.setForeground(new java.awt.Color(0, 0, 204));
        labFiDataNas1.setText("Preço de compra:");
        jpnDadosProd.add(labFiDataNas1);
        labFiDataNas1.setBounds(6, 79, 101, 14);

        labFiCidad1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labFiCidad1.setForeground(new java.awt.Color(0, 0, 204));
        labFiCidad1.setText("Ganho:");
        jpnDadosProd.add(labFiCidad1);
        labFiCidad1.setBounds(6, 115, 39, 14);

        labFiCep1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labFiCep1.setForeground(new java.awt.Color(0, 0, 204));
        labFiCep1.setText("Preço de venda:");
        jpnDadosProd.add(labFiCep1);
        labFiCep1.setBounds(244, 75, 98, 23);

        labFiTel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labFiTel1.setForeground(new java.awt.Color(0, 0, 204));
        labFiTel1.setText("Quantidade no estoque:");
        jpnDadosProd.add(labFiTel1);
        labFiTel1.setBounds(244, 47, 144, 14);

        labFiNum1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labFiNum1.setForeground(new java.awt.Color(0, 0, 204));
        labFiNum1.setText("Vencimento:");
        jpnDadosProd.add(labFiNum1);
        labFiNum1.setBounds(216, 115, 71, 14);

        labFiEnd1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labFiEnd1.setForeground(new java.awt.Color(0, 0, 204));
        labFiEnd1.setText("Categoria:");
        jpnDadosProd.add(labFiEnd1);
        labFiEnd1.setBounds(6, 146, 67, 14);

        labPreCom.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labPreCom.setForeground(new java.awt.Color(0, 153, 153));
        labPreCom.setText("preCom");
        jpnDadosProd.add(labPreCom);
        labPreCom.setBounds(113, 79, 125, 14);

        labCate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labCate.setForeground(new java.awt.Color(0, 153, 153));
        labCate.setText("cate");
        jpnDadosProd.add(labCate);
        labCate.setBounds(70, 140, 128, 27);

        labVenci.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labVenci.setForeground(new java.awt.Color(0, 153, 153));
        labVenci.setText("dd/MM/yyyy");
        jpnDadosProd.add(labVenci);
        labVenci.setBounds(293, 111, 99, 23);

        labPreVend.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labPreVend.setForeground(new java.awt.Color(0, 153, 153));
        labPreVend.setText("PreVend");
        jpnDadosProd.add(labPreVend);
        labPreVend.setBounds(348, 73, 112, 27);

        labCod.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labCod.setForeground(new java.awt.Color(0, 153, 153));
        labCod.setText("cod");
        jpnDadosProd.add(labCod);
        labCod.setBounds(60, 40, 100, 25);

        labNomeP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labNomeP.setForeground(new java.awt.Color(0, 153, 153));
        labNomeP.setText("Nom");
        jpnDadosProd.add(labNomeP);
        labNomeP.setBounds(50, 0, 543, 26);

        labGanho.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labGanho.setForeground(new java.awt.Color(0, 153, 153));
        labGanho.setText("ganho");
        jpnDadosProd.add(labGanho);
        labGanho.setBounds(51, 112, 125, 21);

        labQtdd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labQtdd.setForeground(new java.awt.Color(0, 153, 153));
        labQtdd.setText("Qtdd");
        jpnDadosProd.add(labQtdd);
        labQtdd.setBounds(390, 33, 87, 40);

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jpnDadosProd.add(jPanel2);
        jPanel2.setBounds(500, 30, 211, 130);

        jPanel1.add(jpnDadosProd);
        jpnDadosProd.setBounds(30, 350, 720, 180);

        tabPes.setBackground(new java.awt.Color(0, 0, 153));
        tabPes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tabPes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tabPes.setForeground(new java.awt.Color(255, 255, 255));
        tabPes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Preço", "Estoque", "Ganho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabPes.setGridColor(new java.awt.Color(255, 255, 255));
        tabPes.setInheritsPopupMenu(true);
        tabPes.setRowHeight(25);
        tabPes.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabPes.setSelectionForeground(new java.awt.Color(0, 0, 153));
        tabPes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabPes);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(28, 135, 717, 203);

        jpnDados.setBackground(new java.awt.Color(255, 255, 255));
        jpnDados.setLayout(null);

        labFiNom.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labFiNom.setForeground(new java.awt.Color(0, 0, 204));
        labFiNom.setText("Nome:");
        jpnDados.add(labFiNom);
        labFiNom.setBounds(6, 6, 80, 14);

        labFicpf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labFicpf.setForeground(new java.awt.Color(0, 0, 204));
        labFicpf.setText("CPF:");
        jpnDados.add(labFicpf);
        labFicpf.setBounds(6, 46, 33, 14);

        labFiDataNas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labFiDataNas.setForeground(new java.awt.Color(0, 0, 204));
        labFiDataNas.setText("Data de Nascimento:");
        jpnDados.add(labFiDataNas);
        labFiDataNas.setBounds(6, 76, 138, 14);

        labFiUr.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labFiUr.setForeground(new java.awt.Color(0, 0, 204));
        labFiUr.setText("UR:");
        jpnDados.add(labFiUr);
        labFiUr.setBounds(581, 76, 31, 14);

        labFiCidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labFiCidad.setForeground(new java.awt.Color(0, 0, 204));
        labFiCidad.setText("Cidade:");
        jpnDados.add(labFiCidad);
        labFiCidad.setBounds(6, 112, 42, 14);

        labFiCep.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labFiCep.setForeground(new java.awt.Color(0, 0, 204));
        labFiCep.setText("CEP:");
        jpnDados.add(labFiCep);
        labFiCep.setBounds(259, 110, 43, 23);

        labFiTel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labFiTel.setForeground(new java.awt.Color(0, 0, 204));
        labFiTel.setText("Telefone:");
        jpnDados.add(labFiTel);
        labFiTel.setBounds(426, 19, 71, 14);

        labFiNum.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labFiNum.setForeground(new java.awt.Color(0, 0, 204));
        labFiNum.setText("Numero residencial:");
        jpnDados.add(labFiNum);
        labFiNum.setBounds(387, 76, 125, 14);

        labFiEnd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labFiEnd.setForeground(new java.awt.Color(0, 0, 204));
        labFiEnd.setText("Endereço:");
        jpnDados.add(labFiEnd);
        labFiEnd.setBounds(6, 145, 67, 14);

        labNas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labNas.setForeground(new java.awt.Color(0, 153, 153));
        labNas.setText("nasc");
        jpnDados.add(labNas);
        labNas.setBounds(150, 76, 125, 14);

        labUR.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labUR.setForeground(new java.awt.Color(0, 153, 153));
        labUR.setText("ur");
        jpnDados.add(labUR);
        labUR.setBounds(618, 72, 28, 23);

        labNresid.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labNresid.setForeground(new java.awt.Color(0, 153, 153));
        labNresid.setText("N°");
        jpnDados.add(labNresid);
        labNresid.setBounds(524, 72, 39, 23);

        labCep.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labCep.setForeground(new java.awt.Color(0, 153, 153));
        labCep.setText("cep");
        jpnDados.add(labCep);
        labCep.setBounds(308, 106, 112, 27);

        labCpf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labCpf.setForeground(new java.awt.Color(0, 153, 153));
        labCpf.setText("CPF");
        jpnDados.add(labCpf);
        labCpf.setBounds(57, 41, 125, 25);

        labNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labNome.setForeground(new java.awt.Color(0, 153, 153));
        labNome.setText("Nom");
        jpnDados.add(labNome);
        labNome.setBounds(92, 0, 328, 26);

        labCidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labCidade.setForeground(new java.awt.Color(0, 153, 153));
        labCidade.setText("CD");
        jpnDados.add(labCidade);
        labCidade.setBounds(54, 111, 125, 21);

        labTelef.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labTelef.setForeground(new java.awt.Color(0, 153, 153));
        labTelef.setText("Tl");
        jpnDados.add(labTelef);
        labTelef.setBounds(503, 15, 125, 23);

        labEnd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labEnd.setForeground(new java.awt.Color(0, 153, 153));
        labEnd.setText("end");
        jpnDados.add(labEnd);
        labEnd.setBounds(70, 140, 570, 27);

        jPanel1.add(jpnDados);
        jpnDados.setBounds(28, 350, 717, 178);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 153));
        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(70, 560, 72, 21);

        btEx.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btEx.setForeground(new java.awt.Color(0, 0, 153));
        btEx.setText("Excluir");
        btEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExActionPerformed(evt);
            }
        });
        jPanel1.add(btEx);
        btEx.setBounds(690, 560, 72, 21);

        PainelPesquisaPelo.setBackground(new java.awt.Color(0, 0, 153));

        jcbxPeloq.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcbxPeloq.setForeground(new java.awt.Color(0, 0, 153));
        jcbxPeloq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbxPeloqMouseClicked(evt);
            }
        });
        jcbxPeloq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxPeloqActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 153));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pelo que?");

        javax.swing.GroupLayout PainelPesquisaPeloLayout = new javax.swing.GroupLayout(PainelPesquisaPelo);
        PainelPesquisaPelo.setLayout(PainelPesquisaPeloLayout);
        PainelPesquisaPeloLayout.setHorizontalGroup(
            PainelPesquisaPeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPesquisaPeloLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(jcbxPeloq, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PainelPesquisaPeloLayout.setVerticalGroup(
            PainelPesquisaPeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPesquisaPeloLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2))
            .addGroup(PainelPesquisaPeloLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jcbxPeloq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(PainelPesquisaPelo);
        PainelPesquisaPelo.setBounds(360, 20, 220, 30);

        btEdit_Atualiza.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btEdit_Atualiza.setForeground(new java.awt.Color(0, 0, 153));
        btEdit_Atualiza.setText("Editar os dados");
        btEdit_Atualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEdit_AtualizaActionPerformed(evt);
            }
        });
        jPanel1.add(btEdit_Atualiza);
        btEdit_Atualiza.setBounds(490, 560, 120, 21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    
    private void txNomePessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txNomePessMouseClicked

    }//GEN-LAST:event_txNomePessMouseClicked

    private void txNomePessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNomePessActionPerformed

    }//GEN-LAST:event_txNomePessActionPerformed

    private void txNomePessKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNomePessKeyReleased
        // FAZER AS PESQUISAS AO SELECIONAR O JCOMBOBOX
        
        int vi = jcbxPeloq.getSelectedIndex();
        int v = jcbxPesq.getSelectedIndex();
        if(v == 1 && vi == 0){// pesquisa pessoa pelo nome
            tab();
           }
        if(v == 1 && vi == 1){// pesquisa pessoa pelo cpf
            TabPessCpf();
        }
        if(v == 2 && vi == 0){// pesquisa produto pelo nome
            TabProdNom();
        }
        if(v == 2 && vi == 1){// pesquisa produto pelo codigo
            TabProdCod();
        }
            
            


    }//GEN-LAST:event_txNomePessKeyReleased

    private void jcbxPeloqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbxPeloqMouseClicked
  
    }//GEN-LAST:event_jcbxPeloqMouseClicked

    private void jcbxPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxPesqActionPerformed
        
        

        int v = jcbxPesq.getSelectedIndex();
        
        if(v==0){
            PainelPesquisaPelo.setVisible(false);
        }
        if(v==1){ //pesquisa pela pessoa
            System.out.print(""+v);
            PainelPesquisaPelo.setVisible(true);
            readTabelaPess();
            jcbxPeloq.removeAllItems();
            jcbxPeloq.addItem("Nome\n");
            jcbxPeloq.addItem("CPF");
            
            btEx.setVisible(true);
            
        }
        if(v==2){// Pesquisa pelo produto
            PainelPesquisaPelo.setVisible(true);
            readTabelaProd();
            jcbxPeloq.removeAllItems();
            jcbxPeloq.addItem("Nome do produto\n");
            jcbxPeloq.addItem("Codigo");
            System.out.print(""+v);
            
            btEx.setVisible(false);
        }
   
    }//GEN-LAST:event_jcbxPesqActionPerformed

    private void jcbxPeloqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxPeloqActionPerformed

        
    }//GEN-LAST:event_jcbxPeloqActionPerformed

    private void tabPesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPesMouseClicked
        Connection con = conexaoBanco.AbrirConexao();
        AcessoDAO ac = new AcessoDAO (con);
        PessoaDAO pdao =new PessoaDAO();
        
        Pessoa p  = new Pessoa();
        endereco end = new endereco();
        EstoqueDAO esdao = new EstoqueDAO ();
        
        
        
        int v = jcbxPesq.getSelectedIndex();

        String id ;
        int linhaClic, colum;
        
        linhaClic = (tabPes.getSelectedRow()); 
        colum = tabPes.getSelectedColumn();
        
        
        if(v == 1 ){ //pesquisa pessoa
            jpnDadosProd.setVisible(false);
            jpnDados.setVisible(true);
            
            labCep.setText("");
            labCidade.setText("");
            labCpf.setText("");
            labEnd.setText("");
            labNas.setText("");
            labNome.setText("");
            labNresid.setText("");
            labTelef.setText("");
            labUR.setText("");
            
            id = tabPes.getValueAt(linhaClic, 1) +"";
            pdao.controle=1;
            pdao.buscarPessoa(id);
            pdao.controle=1;
            pdao.buscarEnderecoPes(id);  
           
            
        }
        if(v == 2 ){ // pesquisa produto
            
            jpnDadosProd.setVisible(true);
            jpnDados.setVisible(false);
            
            labCate.setText("");
            labCod.setText("");
            labGanho.setText("");
            labNomeP.setText("");
            labPreCom.setText("");
            labPreVend.setText("");
            labQtdd.setText("");
            labVenci.setText("");
            
            id = tabPes.getValueAt(linhaClic, 0) +"";

            esdao.controle=1;
            esdao.buscarEstoque(id);
            int fkcategoria = esdao.controle;
            esdao.controle=1; 
            esdao.buscarCategoriaiD(fkcategoria);
              
            
        }
      
    }//GEN-LAST:event_tabPesMouseClicked

    private void btExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExActionPerformed
        
        Connection con = conexaoBanco.AbrirConexao();
        AcessoDAO ac = new AcessoDAO (con);

        ClienteDAO cld = new ClienteDAO();
        EstoqueDAO estd = new EstoqueDAO();
        
        int linhaClic = (tabPes.getSelectedRow()); 
        String cpf = tabPes.getValueAt(linhaClic, 1) +"";
        int id =  Integer.parseInt(tabPes.getValueAt(linhaClic, 0)+"");
        
        int v = jcbxPesq.getSelectedIndex();
        
        if(cld.ExcluirPessoa(cpf) && v == 1){

            
            labCep.setText("");
            labCidade.setText("");
            labCpf.setText("");
            labEnd.setText("");
            labNas.setText("");
            labNome.setText("");
            labNresid.setText("");
            labTelef.setText("");
            labUR.setText("");  
            
            readTabelaPess();
        
        }
        if(v==2){
            
            // SO ESTA APAGANDO OS PRUDUTOS QUE NUNCA FORAM COMPRADOS PARA MUDAR ISSO EU PODERIA CRIAR MAIS UMA COLUNA EM COMPRASPEQ CHAMADA DE "NOMEPROD" 
            // ASSIM QUANDO UM PRODUTO QUE TIVER SIDO COMPRADO ALGUMA VEZ FOR APAGADO APARECERAR UMA MENSAGEM FALANDO "Esse produto ja foi comprado algumas
// vezes caso apague o produto sera perdido permanentemente algumas informaçoes a cerca dele desseja apagar o produto?" CASO O FUNCIONARIO CLIC EM SIM O
// APLICATIVO FARA UMA PESQUISA PELA FK NA TABELA COMPRAPEQ E ONDE TIVER A FORENG KEY ELA SERA ANULADA E A COLUNA NOMEPROD RECEBERA O NOME DO PRODUTO
// TUDO SERA FEITO EM APENAS UM METODO EM CONJUNTO
            
            estd.DropEst(id);
            
            labCate.setText("");
            labCod.setText("");
            labGanho.setText("");
            labNomeP.setText("");
            labPreCom.setText("");
            labPreVend.setText("");
            labQtdd.setText("");
            labVenci.setText("");
            
            readTabelaProd();
            
        } 
    }//GEN-LAST:event_btExActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        menuprincipal mp = new menuprincipal();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btEdit_AtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEdit_AtualizaActionPerformed
        
        
        if(jcbxPesq.getSelectedIndex() == 1){
        // PESSOA
            AtulCli atu = new AtulCli();
            atu.setVisible(true);
            atu.txcpf.setText(labCpf.getText());
            atu.btPesquisar.doClick();
        }
        
         if(jcbxPesq.getSelectedIndex() == 2){
        //PRODUTO
            AtuEstoque aest = new AtuEstoque();
            aest.setVisible(true);
            aest.txCodigo.setText(labCod.getText());
            aest.btPesquisa.doClick();
        }   
            
        

            
        
    }//GEN-LAST:event_btEdit_AtualizaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pesquisaCliTud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pesquisaCliTud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pesquisaCliTud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pesquisaCliTud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pesquisaCliTud().setVisible(true);
            }
        });
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPesquisaPelo;
    private javax.swing.JButton btEdit_Atualiza;
    private javax.swing.JButton btEx;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbxPeloq;
    private javax.swing.JComboBox<String> jcbxPesq;
    private javax.swing.JPanel jpnDados;
    private javax.swing.JPanel jpnDadosProd;
    public static javax.swing.JLabel labCate;
    public static javax.swing.JLabel labCep;
    public static javax.swing.JLabel labCidade;
    public static javax.swing.JLabel labCod;
    public static javax.swing.JLabel labCpf;
    public static javax.swing.JLabel labEnd;
    public static javax.swing.JLabel labFiCep;
    public static javax.swing.JLabel labFiCep1;
    public static javax.swing.JLabel labFiCidad;
    public static javax.swing.JLabel labFiCidad1;
    public static javax.swing.JLabel labFiDataNas;
    public static javax.swing.JLabel labFiDataNas1;
    public static javax.swing.JLabel labFiEnd;
    public static javax.swing.JLabel labFiEnd1;
    public static javax.swing.JLabel labFiNom;
    public static javax.swing.JLabel labFiNom1;
    public static javax.swing.JLabel labFiNum;
    public static javax.swing.JLabel labFiNum1;
    public static javax.swing.JLabel labFiTel;
    public static javax.swing.JLabel labFiTel1;
    public static javax.swing.JLabel labFiUr;
    public static javax.swing.JLabel labFicpf;
    public static javax.swing.JLabel labFicpf1;
    public static javax.swing.JLabel labGanho;
    public static javax.swing.JLabel labNas;
    public static javax.swing.JLabel labNome;
    public static javax.swing.JLabel labNomeP;
    public static javax.swing.JLabel labNresid;
    public static javax.swing.JLabel labPreCom;
    public static javax.swing.JLabel labPreVend;
    public static javax.swing.JLabel labQtdd;
    public static javax.swing.JLabel labTelef;
    public static javax.swing.JLabel labUR;
    public static javax.swing.JLabel labVenci;
    public static javax.swing.JTable tabPes;
    public static javax.swing.JTextField txNomePess;
    // End of variables declaration//GEN-END:variables


    public void tamanhoColuna (){
        
        tabPes.getColumnModel().getColumn(0).setMinWidth(100);
        tabPes.getColumnModel().getColumn(1).setMaxWidth(250);
}
}
