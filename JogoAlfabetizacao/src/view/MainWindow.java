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
    private Map<Integer, List<String>> columnsName = new HashMap<>();
    private Map<String, String> urlImages = new HashMap<>();
    private List<String> auxListDatas = new ArrayList<>(10);
    private List<String> auxListColumns = new ArrayList<>(10);

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
        injectColumnsName();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.labelDate.setText(LocalDate.now().format(formatter));
        StartView startView = new StartView(this);
        startView.setVisible(true);
        desktop.add(startView);
        
        this.buttonHome.setEnabled(false);
        this.buttonMenu.setEnabled(false);
    }
    /**
     * ADICIONA TODOS OS NOMES DAS COLUNAS, REFERENTE AOS SEUS RESPECTIVOS NÍVEIS.
     */
    private void injectColumnsName(){
        auxListColumns.add("VOGAIS & P-V-R");
        auxListColumns.add("S-E & ACENTO AGUDO");
        auxListColumns.add("L");
        auxListColumns.add("D");
        auxListColumns.add("C");
        auxListColumns.add("M");
        this.columnsName.put(1, auxListColumns);
        auxListColumns = new ArrayList<>(10);
        
        auxListColumns.add("T");
        auxListColumns.add("B & ACENTO CIRCUNFLEXO");
        auxListColumns.add("F");
        auxListColumns.add("N");
        auxListColumns.add("J");
        auxListColumns.add("S COM SOM DE Z");
        this.columnsName.put(2, auxListColumns);
        auxListColumns = new ArrayList<>(10);    

        auxListColumns.add("CH");
        auxListColumns.add("Ç");
        auxListColumns.add("G");
        auxListColumns.add("R FRACO");
        auxListColumns.add("TR, PR, CR");
        auxListColumns.add("G COM E-I");
        this.columnsName.put(3, auxListColumns);
        auxListColumns = new ArrayList<>(10);       

        auxListColumns.add("-----");
        auxListColumns.add("AR, ER, OR");
        auxListColumns.add("CONSOANTE MAIS L");
        auxListColumns.add("ENCONTRO VOCÁLICO");
        auxListColumns.add("AS, ES, IS");
        auxListColumns.add("AN, EN, IN, ON");
        this.columnsName.put(4, auxListColumns);
        auxListColumns = new ArrayList<>(10);      

        auxListColumns.add("M ANTES DE P-B");
        auxListColumns.add("NH");
        auxListColumns.add("LH");
        auxListColumns.add("L-FINAL");
        auxListColumns.add("L-SEGUIDO DE CONSOANTE");
        auxListColumns.add("SS");
        this.columnsName.put(5, auxListColumns);
        auxListColumns = new ArrayList<>(10);  

        auxListColumns.add("RR");
        auxListColumns.add("R-FINAL");
        auxListColumns.add("QUE-QUI");
        auxListColumns.add("QUA");
        auxListColumns.add("-----");
        auxListColumns.add("-----");
        this.columnsName.put(6, auxListColumns);
        auxListColumns = new ArrayList<>(10);
        
        auxListColumns.add("-----");
        auxListColumns.add("-----");
        auxListColumns.add("-----");
        auxListColumns.add("-----");
        auxListColumns.add("Z-FINAL");
        auxListColumns.add("M-FINAL");
        this.columnsName.put(7, auxListColumns);
        auxListColumns = new ArrayList<>(10);   

        auxListColumns.add("X-COM SOM");
        auxListColumns.add("-----");
        auxListColumns.add("-----");
        auxListColumns.add("-----");
        auxListColumns.add("-----");
        auxListColumns.add("-----");
        this.columnsName.put(8, auxListColumns);         
    }
    
    /**
     * ADICIONA TODAS AS PALAVRAS EM SEUS RESPECTIVOS NÍVEIS
     */
    private void injectDatas(){        
        auxListDatas.add("REI");
        auxListDatas.add("UVA");
        auxListDatas.add("OVO");
        auxListDatas.add("RIO");
        auxListDatas.add("PAU");
        auxListDatas.add("PAI");
        auxListDatas.add("AVE");
        auxListDatas.add("PIA");
        auxListDatas.add("RUA");
        this.datas.put(1, auxListDatas);        
        auxListDatas = new ArrayList<>(10);
        
        auxListDatas.add("PÉ");
        auxListDatas.add("SAPO");
        auxListDatas.add("VOVÓ");
        auxListDatas.add("PÁ");
        auxListDatas.add("PÓ");
        auxListDatas.add("SAPÉ");
        auxListDatas.add("SOPÉ");
        auxListDatas.add("SAÚVA");
        auxListDatas.add("-----");
        this.datas.put(2, auxListDatas);
        auxListDatas = new ArrayList<>(10);
        
        auxListDatas.add("LUA");
        auxListDatas.add("LUVA");
        auxListDatas.add("VELA");
        auxListDatas.add("SELO");
        auxListDatas.add("SOLA");
        auxListDatas.add("RALO");
        auxListDatas.add("ROLO");
        auxListDatas.add("SALA");
        auxListDatas.add("PELE");
        datas.put(3, auxListDatas);
        auxListDatas = new ArrayList<>(10);
        
        auxListDatas.add("DADO");
        auxListDatas.add("RODA");
        auxListDatas.add("RÁDIO");
        auxListDatas.add("REDE");
        auxListDatas.add("DEDO");
        auxListDatas.add("RODO");
        auxListDatas.add("DÁLIA");
        auxListDatas.add("VEADO");
        auxListDatas.add("-----");
        datas.put(4, auxListDatas);
        auxListDatas = new ArrayList<>(10);
        
        auxListDatas.add("COPO");
        auxListDatas.add("VACA");
        auxListDatas.add("CAVALO");
        auxListDatas.add("CAPA");
        auxListDatas.add("CALO");
        auxListDatas.add("SACO");
        auxListDatas.add("PACA");
        auxListDatas.add("CÔCO");
        auxListDatas.add("COROA");
        datas.put(5, auxListDatas);
        auxListDatas = new ArrayList<>(10);
        
        auxListDatas.add("CAMA");
        auxListDatas.add("MALA");
        auxListDatas.add("MACACO");
        auxListDatas.add("MAPA");
        auxListDatas.add("MACA");
        auxListDatas.add("LIMA");
        auxListDatas.add("MÉDICO");
        auxListDatas.add("CAMELO");
        auxListDatas.add("REMO");
        datas.put(6, auxListDatas);
        auxListDatas = new ArrayList<>(10);
        
        auxListDatas.add("TOMATE");
        auxListDatas.add("SAPATO");
        auxListDatas.add("RATO");
        auxListDatas.add("TATU");
        auxListDatas.add("LATA");
        auxListDatas.add("TULIPA");
        auxListDatas.add("PATO");
        auxListDatas.add("MULETA");
        auxListDatas.add("TAPETE");
        datas.put(7, auxListDatas);
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("BOTA");
        auxListDatas.add("BOLA");
        auxListDatas.add("BOCA");
        auxListDatas.add("BULE");
        auxListDatas.add("BOLO");
        auxListDatas.add("BEBÊ");
        auxListDatas.add("BOI");
        auxListDatas.add("BODE");
        auxListDatas.add("BALA");
        datas.put(8, auxListDatas);
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("FACA");
        auxListDatas.add("FOCA");
        auxListDatas.add("FADA");
        auxListDatas.add("BIFE");
        auxListDatas.add("CAFÉ");
        auxListDatas.add("FITA");
        auxListDatas.add("FUBÁ");
        auxListDatas.add("FIVELA");
        auxListDatas.add("FUMO");
        datas.put(9, auxListDatas);
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("BANANA");
        auxListDatas.add("TELEFONE");
        auxListDatas.add("BONECA");
        auxListDatas.add("NOVE");
        auxListDatas.add("CABANA");
        auxListDatas.add("PENA");
        auxListDatas.add("CANECA");
        auxListDatas.add("SINO");
        auxListDatas.add("CANIVETE");
        datas.put(10, auxListDatas);
        auxListDatas = new ArrayList<>(10);
                
        auxListDatas.add("JACARÉ");
        auxListDatas.add("CAJÚ");
        auxListDatas.add("JANELA");
        auxListDatas.add("PIJAMA");
        auxListDatas.add("JACA");
        auxListDatas.add("JUBA");
        auxListDatas.add("TIJOLO");
        auxListDatas.add("JIPE");
        auxListDatas.add("JAVALI");
        datas.put(11, auxListDatas);
        auxListDatas = new ArrayList<>(10);
        
        auxListDatas.add("MESA");
        auxListDatas.add("CASA");
        auxListDatas.add("CAMISA");
        auxListDatas.add("VASO");
        auxListDatas.add("PESO");
        auxListDatas.add("ROSA");
        auxListDatas.add("FUSO");
        auxListDatas.add("RAPOSA");
        auxListDatas.add("CASACO");
        datas.put(12, auxListDatas);
        auxListDatas = new ArrayList<>(10);
        
        auxListDatas.add("CHINELO");
        auxListDatas.add("CHUPETA");
        auxListDatas.add("CHAVE");
        auxListDatas.add("CHUVA");
        auxListDatas.add("MOCHILA");
        auxListDatas.add("CHICOTE");
        auxListDatas.add("CHAPÉU");
        auxListDatas.add("CHAMINÉ");
        auxListDatas.add("MACHADO");
        datas.put(13, auxListDatas);
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("CABEÇA");
        auxListDatas.add("LAÇO");
        auxListDatas.add("FUMAÇA");
        auxListDatas.add("MOÇA");
        auxListDatas.add("POÇO");
        auxListDatas.add("CANIÇO");
        auxListDatas.add("TAÇA");
        auxListDatas.add("MAÇO");
        auxListDatas.add("MAÇANETA");
        datas.put(14, auxListDatas);
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("GALO");
        auxListDatas.add("FOGO");
        auxListDatas.add("GATO");
        auxListDatas.add("GADO");
        auxListDatas.add("FIGO");
        auxListDatas.add("LAGO");
        auxListDatas.add("GAVETA");
        auxListDatas.add("GORRO");
        auxListDatas.add("COGUMELO");
        datas.put(15, auxListDatas);
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("PÊRA");
        auxListDatas.add("CORUJA");
        auxListDatas.add("PARAFUSO");
        auxListDatas.add("ARADO");
        auxListDatas.add("MURO");
        auxListDatas.add("VARA");
        auxListDatas.add("PICARETA");
        auxListDatas.add("ABÓBORA");
        auxListDatas.add("CHARUTO");
        datas.put(16, auxListDatas);
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("TRIGO");
        auxListDatas.add("CRAVO");
        auxListDatas.add("PRATO");
        auxListDatas.add("LIVRO");
        auxListDatas.add("BRAÇO");
        auxListDatas.add("GRUTA");
        auxListDatas.add("GRAVATA");
        auxListDatas.add("GRAMA");
        auxListDatas.add("VIDRAÇA");
        datas.put(17, auxListDatas);
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("GIRAFA");
        auxListDatas.add("MÁGICO");
        auxListDatas.add("GELO");
        auxListDatas.add("JILO");
        auxListDatas.add("GILETE");
        auxListDatas.add("GEMA");
        auxListDatas.add("GELATINA");
        auxListDatas.add("GIRINO");
        auxListDatas.add("-----");
        datas.put(18, auxListDatas);
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        datas.put(19, auxListDatas);
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("BORBOLETA");
        auxListDatas.add("PORCO");
        auxListDatas.add("MARTELO");
        auxListDatas.add("ÁRVORE");
        auxListDatas.add("TARTARUGA");
        auxListDatas.add("FORMIGA");
        auxListDatas.add("PORTA");
        auxListDatas.add("ARCO");
        auxListDatas.add("MARGARIDA");
        datas.put(20, auxListDatas);
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("BICICLETA");
        auxListDatas.add("PLACA");
        auxListDatas.add("BLUSA");
        auxListDatas.add("GLOBO");
        auxListDatas.add("GLACÊ");
        auxListDatas.add("CLAVE");
        auxListDatas.add("ATLETA");
        auxListDatas.add("PLUMA");
        auxListDatas.add("FLÂMULA");
        datas.put(21, auxListDatas);   
        auxListDatas = new ArrayList<>(10);
        
        auxListDatas.add("CENOURA");
        auxListDatas.add("RELÓGIO");
        auxListDatas.add("TESOURA");
        auxListDatas.add("OITO");
        auxListDatas.add("BALEIA");
        auxListDatas.add("FLAUTA");
        auxListDatas.add("MOEDA");
        auxListDatas.add("CANÔA");
        auxListDatas.add("GAIOLA");
        datas.put(22, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("ESCADA");
        auxListDatas.add("CASTELO");
        auxListDatas.add("DOIS");
        auxListDatas.add("ESTRELA");
        auxListDatas.add("DISCO");
        auxListDatas.add("ESCOVA");
        auxListDatas.add("TRÊS");
        auxListDatas.add("PISTA");
        auxListDatas.add("SEIS");
        datas.put(23, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("MORANGO");
        auxListDatas.add("PENTE");
        auxListDatas.add("ONÇA");
        auxListDatas.add("CINCO");
        auxListDatas.add("BANDEIRA");
        auxListDatas.add("PINTO");
        auxListDatas.add("BANCO");
        auxListDatas.add("TENDA");
        auxListDatas.add("BENGALA");
        datas.put(24, auxListDatas);
        
        auxListDatas.add("CACHIMBO");
        auxListDatas.add("LÂMPADA");
        auxListDatas.add("POMBA");
        auxListDatas.add("CAMPO");
        auxListDatas.add("BUMBO");
        auxListDatas.add("TAMPA");
        auxListDatas.add("COMPORTA");
        auxListDatas.add("ROCAMBOLE");
        auxListDatas.add("-----");
        datas.put(25, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("PINHEIRO");
        auxListDatas.add("MINHOCA");
        auxListDatas.add("NINHO");
        auxListDatas.add("PUNHO");
        auxListDatas.add("MOINHO");
        auxListDatas.add("ESPINHO");
        auxListDatas.add("COLARINHO");
        auxListDatas.add("ANCINHO");
        auxListDatas.add("-----");
        datas.put(26, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("COELHO");
        auxListDatas.add("ESPELHO");
        auxListDatas.add("ABELHA");
        auxListDatas.add("ORELHA");
        auxListDatas.add("ILHA");
        auxListDatas.add("FOLHA");
        auxListDatas.add("TELHA");
        auxListDatas.add("BARALHO");
        auxListDatas.add("ESPANTALHO");
        datas.put(27, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("SOL");
        auxListDatas.add("JORNAL");
        auxListDatas.add("CARACOL");
        auxListDatas.add("DEDAL");
        auxListDatas.add("FUNIL");
        auxListDatas.add("OVAL");
        auxListDatas.add("AVENTAL");
        auxListDatas.add("FAROL");
        auxListDatas.add("VARAL");
        datas.put(28, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("ALFACE");
        auxListDatas.add("BOLSA");
        auxListDatas.add("CALÇA");
        auxListDatas.add("ALFINETE");
        auxListDatas.add("ELMO");
        auxListDatas.add("FRALDA");
        auxListDatas.add("COLCHETE");
        auxListDatas.add("BALDE");
        auxListDatas.add("PALMEIRA");
        datas.put(29, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("PASSARINHO");
        auxListDatas.add("OSSO");
        auxListDatas.add("VASSOURA");
        auxListDatas.add("PÊSSEGO");
        auxListDatas.add("PASSA");
        auxListDatas.add("MASSA");
        auxListDatas.add("ASSISTÊNCIA");
        auxListDatas.add("BÚSSOLA");
        auxListDatas.add("-----");
        datas.put(30, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("SERROTE");
        auxListDatas.add("GARRAFA");
        auxListDatas.add("FERRO");
        auxListDatas.add("JARRA");
        auxListDatas.add("TORRE");
        auxListDatas.add("CORRENTE");
        auxListDatas.add("BURRO");
        auxListDatas.add("CERRETEL");
        auxListDatas.add("-----");
        datas.put(31, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("APONTADOR");
        auxListDatas.add("MAR");
        auxListDatas.add("COLHER");
        auxListDatas.add("AVIADOR");
        auxListDatas.add("CARREGADOR");
        auxListDatas.add("PASTOR");
        auxListDatas.add("PESCADOR");
        auxListDatas.add("REGADOR");
        auxListDatas.add("PROFESSOR");
        datas.put(32, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("COQUEIRO");
        auxListDatas.add("ESQUILO");
        auxListDatas.add("QUEIJO");
        auxListDatas.add("RAQUETE");
        auxListDatas.add("LEQUE");
        auxListDatas.add("ESQUI");
        auxListDatas.add("MOLEQUE");
        auxListDatas.add("QUIABO");
        auxListDatas.add("MÁQUINA");
        datas.put(33, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("QUADRADO");
        auxListDatas.add("AQUÁRIO");
        auxListDatas.add("QUADRO");
        auxListDatas.add("QUARTO");
        auxListDatas.add("AQUARELA");
        auxListDatas.add("QUARENTA");
        auxListDatas.add("TAQUARA");
        auxListDatas.add("QUADRICULADO");
        auxListDatas.add("QUATRO");
        datas.put(34, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("HIPOPÓTAMO");
        auxListDatas.add("HARPA");
        auxListDatas.add("HÉLICE");
        auxListDatas.add("HERA");
        auxListDatas.add("HOTEL");
        auxListDatas.add("HOLANDÊS");
        auxListDatas.add("HARMÔNICA");
        auxListDatas.add("HALTERES");
        auxListDatas.add("HORTÊNCIA");
        datas.put(35, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("CORAÇÃO");
        auxListDatas.add("MAÇÃ");
        auxListDatas.add("LEÃO");
        auxListDatas.add("ANÃO");
        auxListDatas.add("CÃO");
        auxListDatas.add("VULCÃO");
        auxListDatas.add("LÃ");
        auxListDatas.add("RÃ");
        auxListDatas.add("BALÃO");
        datas.put(36, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("FOGUEIRA");
        auxListDatas.add("ÁGUIA");
        auxListDatas.add("GUITARRA");
        auxListDatas.add("CARANGUEJO");
        auxListDatas.add("MANGUEIRA");
        auxListDatas.add("GUERREIRO");
        auxListDatas.add("GUINCHO");
        auxListDatas.add("GUIDÃO");
        auxListDatas.add("GUILHOTINA");
        datas.put(37, auxListDatas);   
        auxListDatas = new ArrayList<>(10);  
        
        auxListDatas.add("RÉGUA");
        auxListDatas.add("GUARDANAPO");
        auxListDatas.add("ÉGUA");
        auxListDatas.add("GUARDA");
        auxListDatas.add("AGUARDENTE");
        auxListDatas.add("GUARITA");
        auxListDatas.add("GUACHE");
        auxListDatas.add("GUARANÁ");
        auxListDatas.add("-----");
        datas.put(38, auxListDatas);   
        auxListDatas = new ArrayList<>(10);
        
        auxListDatas.add("FAZENDA");
        auxListDatas.add("AZEITONA");
        auxListDatas.add("ZEBRA");
        auxListDatas.add("DUZENTOS");
        auxListDatas.add("ZERO");
        auxListDatas.add("ANZOL");
        auxListDatas.add("ZOOLÓGICO");
        auxListDatas.add("GUIZO");
        auxListDatas.add("-----");
        datas.put(39, auxListDatas);   
        auxListDatas = new ArrayList<>(10);        

        auxListDatas.add("PEIXE");
        auxListDatas.add("ABACAXI");
        auxListDatas.add("XÍCARA");
        auxListDatas.add("CAIXA");
        auxListDatas.add("LIXO");
        auxListDatas.add("XAROPE");
        auxListDatas.add("CAIXOTE");
        auxListDatas.add("AMEIXA");
        auxListDatas.add("-----");
        datas.put(40, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("NARIZ");
        auxListDatas.add("XADREZ");
        auxListDatas.add("ARROZ");
        auxListDatas.add("CRUZ");
        auxListDatas.add("AVESTRUZ");
        auxListDatas.add("CAPUZ");
        auxListDatas.add("PERDIZ");
        auxListDatas.add("NÓZ");
        auxListDatas.add("DEZ");
        datas.put(41, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("BOMBOM");
        auxListDatas.add("AMENDOIM");
        auxListDatas.add("TREM");
        auxListDatas.add("CAPIM");
        auxListDatas.add("JARDIM");
        auxListDatas.add("VÁGEM");
        auxListDatas.add("FUDIM");
        auxListDatas.add("UM");
        auxListDatas.add("FOLHAGEM");
        datas.put(42, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("TÁXI");
        auxListDatas.add("BOX");
        auxListDatas.add("TÓRAX");
        auxListDatas.add("BOXEADOR");
        auxListDatas.add("FIXADOR");
        auxListDatas.add("TAXÍMETRO");
        auxListDatas.add("AXILA");
        auxListDatas.add("CRUCIFIXO");
        auxListDatas.add("OXIGÊNIO");
        datas.put(43, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        datas.put(44, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        datas.put(45, auxListDatas);   
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        datas.put(46, auxListDatas); 
        auxListDatas = new ArrayList<>(10);
        
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        datas.put(47, auxListDatas); 
        auxListDatas = new ArrayList<>(10);

        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        auxListDatas.add("-----");
        datas.put(48, auxListDatas); 
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

    public Map<Integer, List<String>> getColumnsName() {
        return columnsName;
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
        labelDate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonExit = new javax.swing.JButton();
        buttonMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo de Alfabetização");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(6);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        desktop.setPreferredSize(new java.awt.Dimension(750, 600));

        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/home.png"))); // NOI18N
        buttonHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });

        labelDate.setFont(new java.awt.Font("Noto Sans", 3, 30)); // NOI18N
        labelDate.setText("10/12/2018");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(205, 58, 58));
        jLabel1.setText("ATIVIDADES");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/iconfinder_letter_ABC_1553073.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Noto Sans", 3, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(205, 58, 58));
        jLabel2.setText("DE");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 3, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(205, 58, 58));
        jLabel4.setText("ALFABETIZAÇÃO");

        buttonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/exit.png"))); // NOI18N
        buttonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        buttonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/menu.png"))); // NOI18N
        buttonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(buttonHome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonMenu)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonExit))
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(99, 99, 99)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel1)))))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38)
                        .addComponent(labelDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonExit)
                            .addComponent(buttonMenu)
                            .addComponent(buttonHome))))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1316, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        this.desktop.removeAll();
        StartView startView = new StartView(this);
        startView.setVisible(true);
        this.desktop.add(startView);
        this.buttonHome.setEnabled(false);
        this.buttonMenu.setEnabled(false);
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
        this.buttonMenu.setEnabled(false);
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
