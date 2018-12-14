/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author gabrielstahlberg
 */
public class MainWindow extends javax.swing.JFrame {
    private Map<Integer, List<String>> datas = new HashMap<>();
    private List<String> auxList = new ArrayList<>(10);

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        try {
            // Set cross-platform Java L&F (also called "Metal")
            UIManager.setLookAndFeel(NimbusLookAndFeel.class.getName());
        }
        catch(UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
           // handle exception
           e.printStackTrace();
        }
        injectDatas();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.labelDate.setText(LocalDate.now().format(formatter));
        StartView startView = new StartView(this);
        startView.setVisible(true);
        desktop.add(startView);
        
        this.buttonHome.setEnabled(false);
        this.buttonMenu.setEnabled(false);
    }
    
    private void injectDatas(){        
        auxList.add("REI");
        auxList.add("UVA");
        auxList.add("OVO");
        auxList.add("RIO");
        auxList.add("PAU");
        auxList.add("PAI");
        auxList.add("AVE");
        auxList.add("PIA");
        auxList.add("RUA");
        this.datas.put(1, auxList);        
        auxList = new ArrayList<>(10);
        
        auxList.add("PÉ");
        auxList.add("SAPO");
        auxList.add("VOVÓ");
        auxList.add("PÁ");
        auxList.add("PÓ");
        auxList.add("SAPÉ");
        auxList.add("SOPÉ");
        auxList.add("SAÚVA");
        auxList.add("-----");
        this.datas.put(2, auxList);
        auxList = new ArrayList<>(10);
        
        auxList.add("LUA");
        auxList.add("LUVA");
        auxList.add("VELA");
        auxList.add("SELO");
        auxList.add("SOLA");
        auxList.add("RALO");
        auxList.add("ROLO");
        auxList.add("SALA");
        auxList.add("PELE");
        datas.put(3, auxList);
        auxList = new ArrayList<>(10);
        
        auxList.add("DADO");
        auxList.add("RODA");
        auxList.add("RÁDIO");
        auxList.add("REDE");
        auxList.add("DEDO");
        auxList.add("RODO");
        auxList.add("DÁLIA");
        auxList.add("VEADO");
        auxList.add("-----");
        datas.put(4, auxList);
        auxList = new ArrayList<>(10);
        
        auxList.add("COPO");
        auxList.add("VACA");
        auxList.add("CAVALO");
        auxList.add("CAPA");
        auxList.add("CALO");
        auxList.add("SACO");
        auxList.add("PACA");
        auxList.add("CÔCO");
        auxList.add("COROA");
        datas.put(5, auxList);
        auxList = new ArrayList<>(10);
        
        auxList.add("CAMA");
        auxList.add("MALA");
        auxList.add("MACACO");
        auxList.add("MAPA");
        auxList.add("MACA");
        auxList.add("LIMA");
        auxList.add("MÉDICO");
        auxList.add("CAMELO");
        auxList.add("REMO");
        datas.put(6, auxList);
        auxList = new ArrayList<>(10);
        
        auxList.add("TOMATE");
        auxList.add("SAPATO");
        auxList.add("RATO");
        auxList.add("TATU");
        auxList.add("LATA");
        auxList.add("TULIPA");
        auxList.add("PATO");
        auxList.add("MULETA");
        auxList.add("TAPETE");
        datas.put(7, auxList);
        auxList = new ArrayList<>(10);

        auxList.add("BOTA");
        auxList.add("BOLA");
        auxList.add("BOCA");
        auxList.add("BULE");
        auxList.add("BOLO");
        auxList.add("BEBÊ");
        auxList.add("BOI");
        auxList.add("BODE");
        auxList.add("BALA");
        datas.put(8, auxList);
        auxList = new ArrayList<>(10);

        auxList.add("FACA");
        auxList.add("FOCA");
        auxList.add("FADA");
        auxList.add("BIFE");
        auxList.add("CAFÉ");
        auxList.add("FITA");
        auxList.add("FUBÁ");
        auxList.add("FIVELA");
        auxList.add("FUMO");
        datas.put(9, auxList);
        auxList = new ArrayList<>(10);

        auxList.add("BANANA");
        auxList.add("TELEFONE");
        auxList.add("BONECA");
        auxList.add("NOVE");
        auxList.add("CABANA");
        auxList.add("PENA");
        auxList.add("CANECA");
        auxList.add("SINO");
        auxList.add("CANIVETE");
        datas.put(10, auxList);
        auxList = new ArrayList<>(10);
                
        auxList.add("JACARÉ");
        auxList.add("CAJÚ");
        auxList.add("JANELA");
        auxList.add("PIJAMA");
        auxList.add("JACA");
        auxList.add("JUBA");
        auxList.add("TIJOLO");
        auxList.add("JIPE");
        auxList.add("JAVALI");
        datas.put(11, auxList);
        auxList = new ArrayList<>(10);
        
        auxList.add("MESA");
        auxList.add("CASA");
        auxList.add("CAMISA");
        auxList.add("VASO");
        auxList.add("PESO");
        auxList.add("ROSA");
        auxList.add("FUSO");
        auxList.add("RAPOSA");
        auxList.add("CASACO");
        datas.put(12, auxList);
        auxList = new ArrayList<>(10);
        
        auxList.add("CHINELO");
        auxList.add("CHUPETA");
        auxList.add("CHAVE");
        auxList.add("CHUVA");
        auxList.add("MOCHILA");
        auxList.add("CHICOTE");
        auxList.add("CHAPÉU");
        auxList.add("CHAMINÉ");
        auxList.add("MACHADO");
        datas.put(13, auxList);
        auxList = new ArrayList<>(10);

        auxList.add("CABEÇA");
        auxList.add("LAÇO");
        auxList.add("FUMAÇA");
        auxList.add("MOÇA");
        auxList.add("POÇO");
        auxList.add("CANIÇO");
        auxList.add("TAÇA");
        auxList.add("MAÇO");
        auxList.add("MAÇANETA");
        datas.put(14, auxList);
        auxList = new ArrayList<>(10);

        auxList.add("GALO");
        auxList.add("FOGO");
        auxList.add("GATO");
        auxList.add("GADO");
        auxList.add("FIGO");
        auxList.add("LAGO");
        auxList.add("GAVETA");
        auxList.add("GORRO");
        auxList.add("COGUMELO");
        datas.put(15, auxList);
        auxList = new ArrayList<>(10);

        auxList.add("PÊRA");
        auxList.add("CORUJA");
        auxList.add("PARAFUSO");
        auxList.add("ARADO");
        auxList.add("MURO");
        auxList.add("VARA");
        auxList.add("PICARETA");
        auxList.add("ABÓBORA");
        auxList.add("CHARUTO");
        datas.put(16, auxList);
        auxList = new ArrayList<>(10);

        auxList.add("TRIGO");
        auxList.add("CRAVO");
        auxList.add("PRATO");
        auxList.add("LIVRO");
        auxList.add("BRAÇO");
        auxList.add("GRUTA");
        auxList.add("GRAVATA");
        auxList.add("GRAMA");
        auxList.add("VIDRAÇA");
        datas.put(17, auxList);
        auxList = new ArrayList<>(10);

        auxList.add("GIRAFA");
        auxList.add("MÁGICO");
        auxList.add("GELO");
        auxList.add("JILO");
        auxList.add("GILETE");
        auxList.add("GEMA");
        auxList.add("GELATINA");
        auxList.add("GIRINO");
        auxList.add("-----");
        datas.put(18, auxList);
        auxList = new ArrayList<>(10);

        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        datas.put(19, auxList);
        auxList = new ArrayList<>(10);

        auxList.add("BORBOLETA");
        auxList.add("PORCO");
        auxList.add("MARTELO");
        auxList.add("ÁRVORE");
        auxList.add("TARTARUGA");
        auxList.add("FORMIGA");
        auxList.add("PORTA");
        auxList.add("ARCO");
        auxList.add("MARGARIDA");
        datas.put(20, auxList);
        auxList = new ArrayList<>(10);

        auxList.add("BICICLETA");
        auxList.add("PLACA");
        auxList.add("BLUSA");
        auxList.add("GLOBO");
        auxList.add("GLACÊ");
        auxList.add("CLAVE");
        auxList.add("ATLETA");
        auxList.add("PLUMA");
        auxList.add("FLÂMULA");
        datas.put(21, auxList);   
        auxList = new ArrayList<>(10);
        
        auxList.add("CENOURA");
        auxList.add("RELÓGIO");
        auxList.add("TESOURA");
        auxList.add("OITO");
        auxList.add("BALEIA");
        auxList.add("FLAUTA");
        auxList.add("MOEDA");
        auxList.add("CANÔA");
        auxList.add("GAIOLA");
        datas.put(22, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("ESCADA");
        auxList.add("CASTELO");
        auxList.add("DOIS");
        auxList.add("ESTRELA");
        auxList.add("DISCO");
        auxList.add("ESCOVA");
        auxList.add("TRÊS");
        auxList.add("PISTA");
        auxList.add("SEIS");
        datas.put(23, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("MORANGO");
        auxList.add("PENTE");
        auxList.add("ONÇA");
        auxList.add("CINCO");
        auxList.add("BANDEIRA");
        auxList.add("PINTO");
        auxList.add("BANCO");
        auxList.add("TENDA");
        auxList.add("BENGALA");
        datas.put(24, auxList);
        
        auxList.add("CACHIMBO");
        auxList.add("LÂMPADA");
        auxList.add("POMBA");
        auxList.add("CAMPO");
        auxList.add("BUMBO");
        auxList.add("TAMPA");
        auxList.add("COMPORTA");
        auxList.add("ROCAMBOLE");
        auxList.add("-----");
        datas.put(25, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("PINHEIRO");
        auxList.add("MINHOCA");
        auxList.add("NINHO");
        auxList.add("PUNHO");
        auxList.add("MOINHO");
        auxList.add("ESPINHO");
        auxList.add("COLARINHO");
        auxList.add("ANCINHO");
        auxList.add("-----");
        datas.put(26, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("COELHO");
        auxList.add("ESPELHO");
        auxList.add("ABELHA");
        auxList.add("ORELHA");
        auxList.add("ILHA");
        auxList.add("FOLHA");
        auxList.add("TELHA");
        auxList.add("BARALHO");
        auxList.add("ESPANTALHO");
        datas.put(27, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("SOL");
        auxList.add("JORNAL");
        auxList.add("CARACOL");
        auxList.add("DEDAL");
        auxList.add("FUNIL");
        auxList.add("OVAL");
        auxList.add("AVENTAL");
        auxList.add("FAROL");
        auxList.add("VARAL");
        datas.put(28, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("ALFACE");
        auxList.add("BOLSA");
        auxList.add("CALÇA");
        auxList.add("ALFINETE");
        auxList.add("ELMO");
        auxList.add("FRALDA");
        auxList.add("COLCHETE");
        auxList.add("BALDE");
        auxList.add("PALMEIRA");
        datas.put(29, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("PASSARINHO");
        auxList.add("OSSO");
        auxList.add("VASSOURA");
        auxList.add("PÊSSEGO");
        auxList.add("PASSA");
        auxList.add("MASSA");
        auxList.add("ASSISTÊNCIA");
        auxList.add("BÚSSOLA");
        auxList.add("-----");
        datas.put(30, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("SERROTE");
        auxList.add("GARRAFA");
        auxList.add("FERRO");
        auxList.add("JARRA");
        auxList.add("TORRE");
        auxList.add("CORRENTE");
        auxList.add("BURRO");
        auxList.add("CERRETEL");
        auxList.add("-----");
        datas.put(31, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("APONTADOR");
        auxList.add("MAR");
        auxList.add("COLHER");
        auxList.add("AVIADOR");
        auxList.add("CARREGADOR");
        auxList.add("PASTOR");
        auxList.add("PESCADOR");
        auxList.add("REGADOR");
        auxList.add("PROFESSOR");
        datas.put(32, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("COQUEIRO");
        auxList.add("ESQUILO");
        auxList.add("QUEIJO");
        auxList.add("RAQUETE");
        auxList.add("LEQUE");
        auxList.add("ESQUI");
        auxList.add("MOLEQUE");
        auxList.add("QUIABO");
        auxList.add("MÁQUINA");
        datas.put(33, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("QUADRADO");
        auxList.add("AQUÁRIO");
        auxList.add("QUADRO");
        auxList.add("QUARTO");
        auxList.add("AQUARELA");
        auxList.add("QUARENTA");
        auxList.add("TAQUARA");
        auxList.add("QUADRICULADO");
        auxList.add("QUATRO");
        datas.put(34, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("HIPOPÓTAMO");
        auxList.add("HARPA");
        auxList.add("HÉLICE");
        auxList.add("HERA");
        auxList.add("HOTEL");
        auxList.add("HOLANDÊS");
        auxList.add("HARMÔNICA");
        auxList.add("HALTERES");
        auxList.add("HORTÊNCIA");
        datas.put(35, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("CORAÇÃO");
        auxList.add("MAÇÃ");
        auxList.add("LEÃO");
        auxList.add("ANÃO");
        auxList.add("CÃO");
        auxList.add("VULCÃO");
        auxList.add("LÃ");
        auxList.add("RÃ");
        auxList.add("BALÃO");
        datas.put(36, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("FOGUEIRA");
        auxList.add("ÁGUIA");
        auxList.add("GUITARRA");
        auxList.add("CARANGUEJO");
        auxList.add("MANGUEIRA");
        auxList.add("GUERREIRO");
        auxList.add("GUINCHO");
        auxList.add("GUIDÃO");
        auxList.add("GUILHOTINA");
        datas.put(37, auxList);   
        auxList = new ArrayList<>(10);  
        
        auxList.add("RÉGUA");
        auxList.add("GUARDANAPO");
        auxList.add("ÉGUA");
        auxList.add("GUARDA");
        auxList.add("AGUARDENTE");
        auxList.add("GUARITA");
        auxList.add("GUACHE");
        auxList.add("GUARANÁ");
        auxList.add("-----");
        datas.put(38, auxList);   
        auxList = new ArrayList<>(10);
        
        auxList.add("FAZENDA");
        auxList.add("AZEITONA");
        auxList.add("ZEBRA");
        auxList.add("DUZENTOS");
        auxList.add("ZERO");
        auxList.add("ANZOL");
        auxList.add("ZOOLÓGICO");
        auxList.add("GUIZO");
        auxList.add("-----");
        datas.put(39, auxList);   
        auxList = new ArrayList<>(10);        

        auxList.add("PEIXE");
        auxList.add("ABACAXI");
        auxList.add("XÍCARA");
        auxList.add("CAIXA");
        auxList.add("LIXO");
        auxList.add("XAROPE");
        auxList.add("CAIXOTE");
        auxList.add("AMEIXA");
        auxList.add("-----");
        datas.put(40, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("NARIZ");
        auxList.add("XADREZ");
        auxList.add("ARROZ");
        auxList.add("CRUZ");
        auxList.add("AVESTRUZ");
        auxList.add("CAPUZ");
        auxList.add("PERDIZ");
        auxList.add("NÓZ");
        auxList.add("DEZ");
        datas.put(41, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("BOMBOM");
        auxList.add("AMENDOIM");
        auxList.add("TREM");
        auxList.add("CAPIM");
        auxList.add("JARDIM");
        auxList.add("VÁGEM");
        auxList.add("FUDIM");
        auxList.add("UM");
        auxList.add("FOLHAGEM");
        datas.put(42, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("TÁXI");
        auxList.add("BOX");
        auxList.add("TÓRAX");
        auxList.add("BOXEADOR");
        auxList.add("FIXADOR");
        auxList.add("TAXÍMETRO");
        auxList.add("AXILA");
        auxList.add("CRUCIFIXO");
        auxList.add("OXIGÊNIO");
        datas.put(43, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        datas.put(44, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        datas.put(45, auxList);   
        auxList = new ArrayList<>(10);

        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        datas.put(46, auxList); 
        auxList = new ArrayList<>(10);
        
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        datas.put(47, auxList); 
        auxList = new ArrayList<>(10);

        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        auxList.add("-----");
        datas.put(48, auxList); 
    }

    public JButton getButtonExit() {
        return buttonExit;
    }

    public void setButtonExit(JButton buttonExit) {
        this.buttonExit = buttonExit;
    }

    public JButton getButtonHome() {
        return buttonHome;
    }

    public void setButtonHome(JButton buttonHome) {
        this.buttonHome = buttonHome;
    }

    public JButton getButtonMenu() {
        return buttonMenu;
    }

    public void setButtonMenu(JButton buttonMenu) {
        this.buttonMenu = buttonMenu;
    }

    public JDesktopPane getDesktop() {
        return desktop;
    }

    public void setDesktop(JDesktopPane desktop) {
        this.desktop = desktop;
    }

    public List<String> getDatas(int level) {
        return datas.get(level);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        buttonHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonExit = new javax.swing.JButton();
        buttonMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo de Alfabetização");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        desktop.setPreferredSize(new java.awt.Dimension(750, 600));

        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/home.png"))); // NOI18N
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noto Sans", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(205, 58, 58));
        jLabel1.setText("ATIVIDADES");

        labelDate.setFont(new java.awt.Font("Noto Sans", 3, 30)); // NOI18N
        labelDate.setText("10/12/2018");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/iconfinder_letter_ABC_1553073.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Noto Sans", 3, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(205, 58, 58));
        jLabel2.setText("DE");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 3, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(205, 58, 58));
        jLabel4.setText("ALFABETIZAÇÃO");

        buttonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/exit.png"))); // NOI18N
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        buttonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/menu.png"))); // NOI18N
        buttonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(buttonHome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonExit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelDate)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelDate)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonExit)
                    .addComponent(buttonMenu)
                    .addComponent(buttonHome))
                .addGap(18, 18, 18))
        );

        setSize(new java.awt.Dimension(1040, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        this.desktop.removeAll();
        StartView startView = new StartView(this);
        startView.setVisible(true);
        this.desktop.add(startView);
        this.buttonHome.setEnabled(false);
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuActionPerformed
        this.desktop.removeAll();
        MenuView mv = new MenuView(this);
        mv.setVisible(true);
        this.desktop.add(mv);
    }//GEN-LAST:event_buttonMenuActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelDate;
    // End of variables declaration//GEN-END:variables
}
