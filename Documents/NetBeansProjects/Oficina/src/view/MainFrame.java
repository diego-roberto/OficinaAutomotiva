package view;

import dao.FuncionarioDAO;
import dao.UsuarioDAO;
import entity.Funcionario;
import entity.Usuario;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class MainFrame extends javax.swing.JFrame {

    Funcionario funcionario;
    FuncionarioDAO funcionarioDao;
    Usuario usuario;
    UsuarioDAO usuarioDao;

    //ENCAPSULAMENTO
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public MainFrame() {
        initComponents();
        funcionario = new Funcionario();
        funcionarioDao = new FuncionarioDAO();
        usuario = new Usuario();
        usuarioDao = new UsuarioDAO();
        System.out.println(((12 + 3 - 18) * (130 / 3) + (306 - 102) / 2) + 37);
    }

    public String StatusIP() {
        String ip;
        try {
            return ip = Inet4Address.getLocalHost().getHostAddress();
        } catch (UnknownHostException ex) {
        }
        return null;
    }

    //CONSTRUTOR MAIN    
    public MainFrame(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        setUserResource(usuario);
        LogonFrame login = new LogonFrame();
        login.setLocationRelativeTo(null);
        login.setResizable(false);
        login.setVisible(true);
        txtStatusUsuario.setText(usuario.getNomeUsuario());
        txtStatusIp.setText(StatusIP());
        txtStatusVersao.setText("Oficina-beta-30-06");
        
    }

    //FILTRO DE ACESSOS
    public void setAccessZero() {
        mnArquivo.setEnabled(false);
        btnAbrirOs.setEnabled(false);
        btnAdministracao.setEnabled(false);
        btnConsultarOs.setEnabled(false);
        btnPdv.setEnabled(false);
        btnOficina.setEnabled(false);
        btnOutros.setEnabled(false);
    }

    public void setAccessOne() {
        mnArquivo.setEnabled(false);
        btnAbrirOs.setEnabled(true);
        btnAdministracao.setEnabled(false);
        btnConsultarOs.setEnabled(true);
        btnPdv.setEnabled(false);
        btnOficina.setEnabled(true);
        btnOutros.setEnabled(false);
    }

    public void setAccessTwo() {
        mnArquivo.setEnabled(false);
        btnAbrirOs.setEnabled(true);
        btnAdministracao.setEnabled(false);
        btnConsultarOs.setEnabled(true);
        btnPdv.setEnabled(true);
        btnOficina.setEnabled(false);
        btnOutros.setEnabled(false);
    }

    public void setAccessThree() {
        mnArquivo.setEnabled(false);
        btnAbrirOs.setEnabled(true);
        btnAdministracao.setEnabled(false);
        btnConsultarOs.setEnabled(true);
        btnPdv.setEnabled(true);
        btnOficina.setEnabled(true);
        btnOutros.setEnabled(false);
    }

    public void setAccessFour() {
        mnArquivo.setEnabled(true);
        btnAbrirOs.setEnabled(true);
        btnAdministracao.setEnabled(true);
        btnConsultarOs.setEnabled(true);
        btnPdv.setEnabled(true);
        btnOficina.setEnabled(true);
        btnOutros.setEnabled(true);
    }

    public void setAccessFive() {
        mnArquivo.setEnabled(true);
        btnAbrirOs.setEnabled(true);
        btnAdministracao.setEnabled(true);
        btnConsultarOs.setEnabled(true);
        btnPdv.setEnabled(true);
        btnOficina.setEnabled(true);
        btnOutros.setEnabled(true);
    }

    public void setUserResource(Usuario usuario) {
        int acesso = usuario.getNivelUsuario();
        switch (acesso) {
            case 0:
                setAccessZero();
                break;
            case 1:
                setAccessOne();
                break;
            case 2:
                setAccessTwo();
                break;
            case 3:
                setAccessThree();
                break;
            case 4:
                setAccessFour();
                break;
            case 5:
                setAccessFive();
                break;
            default:
                break;
        }
    }

            //////    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnNorth = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnWest = new javax.swing.JPanel();
        btnAdministracao = new javax.swing.JButton();
        btnAbrirOs = new javax.swing.JButton();
        btnConsultarOs = new javax.swing.JButton();
        btnPdv = new javax.swing.JButton();
        btnOficina = new javax.swing.JButton();
        btnOutros = new javax.swing.JButton();
        pnWestSouth = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtStatusUsuario = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblIp = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtStatusIp = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lblVersao = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtStatusVersao = new javax.swing.JTextField();
        pnEast = new javax.swing.JPanel();
        pnEastNorth = new javax.swing.JPanel();
        pnEastWest = new javax.swing.JPanel();
        pnEastSouth = new javax.swing.JPanel();
        pnEastEast = new javax.swing.JPanel();
        pnEastCenter = new javax.swing.JPanel();
        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        brMainBar = new javax.swing.JMenuBar();
        mnArquivo = new javax.swing.JMenu();
        mnNovo = new javax.swing.JMenu();
        mnNovoCliente = new javax.swing.JMenuItem();
        mnNovaCompra = new javax.swing.JMenuItem();
        mnNovoFornecedor = new javax.swing.JMenuItem();
        mnNovoFuncionario = new javax.swing.JMenuItem();
        mnUsuario = new javax.swing.JMenuItem();
        mnEstoque = new javax.swing.JMenuItem();
        mnServico = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnLogon = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OFICINA ");
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);

        pnNorth.setBackground(new java.awt.Color(255, 255, 255));
        pnNorth.setMaximumSize(new java.awt.Dimension(1596, 60));
        pnNorth.setMinimumSize(new java.awt.Dimension(1596, 60));
        pnNorth.setPreferredSize(new java.awt.Dimension(1596, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/!logo.PNG"))); // NOI18N

        javax.swing.GroupLayout pnNorthLayout = new javax.swing.GroupLayout(pnNorth);
        pnNorth.setLayout(pnNorthLayout);
        pnNorthLayout.setHorizontalGroup(
            pnNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNorthLayout.createSequentialGroup()
                .addGap(0, 2570, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );
        pnNorthLayout.setVerticalGroup(
            pnNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNorthLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(pnNorth, java.awt.BorderLayout.PAGE_START);

        pnWest.setPreferredSize(new java.awt.Dimension(200, 740));
        pnWest.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 45));

        btnAdministracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chart_48px.png"))); // NOI18N
        btnAdministracao.setText("ADMINISTRAÇÃO");
        btnAdministracao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdministracao.setIconTextGap(0);
        btnAdministracao.setPreferredSize(new java.awt.Dimension(170, 70));
        btnAdministracao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdministracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministracaoActionPerformed(evt);
            }
        });
        pnWest.add(btnAdministracao);

        btnAbrirOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_property_48px.png"))); // NOI18N
        btnAbrirOs.setText("ABRIR O.S.");
        btnAbrirOs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrirOs.setIconTextGap(0);
        btnAbrirOs.setPreferredSize(new java.awt.Dimension(170, 70));
        btnAbrirOs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrirOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirOsActionPerformed(evt);
            }
        });
        pnWest.add(btnAbrirOs);

        btnConsultarOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_os_48px.png"))); // NOI18N
        btnConsultarOs.setText("CONSULTAR O.S.");
        btnConsultarOs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultarOs.setIconTextGap(0);
        btnConsultarOs.setPreferredSize(new java.awt.Dimension(170, 70));
        btnConsultarOs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultarOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarOsActionPerformed(evt);
            }
        });
        pnWest.add(btnConsultarOs);

        btnPdv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pos_terminal_48px.png"))); // NOI18N
        btnPdv.setText("PDV");
        btnPdv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPdv.setIconTextGap(0);
        btnPdv.setPreferredSize(new java.awt.Dimension(170, 70));
        btnPdv.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdvActionPerformed(evt);
            }
        });
        pnWest.add(btnPdv);

        btnOficina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mechanic_48px.png"))); // NOI18N
        btnOficina.setText("OFICINA");
        btnOficina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOficina.setIconTextGap(0);
        btnOficina.setPreferredSize(new java.awt.Dimension(170, 70));
        btnOficina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnWest.add(btnOficina);

        btnOutros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/squared_menu_48px.png"))); // NOI18N
        btnOutros.setText("OUTROS");
        btnOutros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOutros.setIconTextGap(0);
        btnOutros.setPreferredSize(new java.awt.Dimension(170, 70));
        btnOutros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnWest.add(btnOutros);

        pnWestSouth.setMaximumSize(new java.awt.Dimension(170, 220));
        pnWestSouth.setMinimumSize(new java.awt.Dimension(170, 220));
        pnWestSouth.setPreferredSize(new java.awt.Dimension(170, 220));
        pnWestSouth.setLayout(new java.awt.GridLayout(6, 1));

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUsuario.setText("Usuário:");
        jPanel1.add(lblUsuario);

        pnWestSouth.add(jPanel1);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        txtStatusUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtStatusUsuario.setEnabled(false);
        txtStatusUsuario.setMaximumSize(new java.awt.Dimension(150, 20));
        txtStatusUsuario.setMinimumSize(new java.awt.Dimension(150, 20));
        txtStatusUsuario.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel2.add(txtStatusUsuario);

        pnWestSouth.add(jPanel2);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblIp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblIp.setText("IP:");
        jPanel3.add(lblIp);

        pnWestSouth.add(jPanel3);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        txtStatusIp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtStatusIp.setEnabled(false);
        txtStatusIp.setMaximumSize(new java.awt.Dimension(150, 20));
        txtStatusIp.setMinimumSize(new java.awt.Dimension(150, 20));
        txtStatusIp.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel4.add(txtStatusIp);

        pnWestSouth.add(jPanel4);

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblVersao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblVersao.setText("Versão:");
        jPanel5.add(lblVersao);

        pnWestSouth.add(jPanel5);

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        txtStatusVersao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtStatusVersao.setEnabled(false);
        txtStatusVersao.setMaximumSize(new java.awt.Dimension(150, 20));
        txtStatusVersao.setMinimumSize(new java.awt.Dimension(150, 20));
        txtStatusVersao.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel6.add(txtStatusVersao);

        pnWestSouth.add(jPanel6);

        pnWest.add(pnWestSouth);

        getContentPane().add(pnWest, java.awt.BorderLayout.LINE_START);

        pnEast.setLayout(new java.awt.BorderLayout());

        pnEastNorth.setPreferredSize(new java.awt.Dimension(1396, 10));

        javax.swing.GroupLayout pnEastNorthLayout = new javax.swing.GroupLayout(pnEastNorth);
        pnEastNorth.setLayout(pnEastNorthLayout);
        pnEastNorthLayout.setHorizontalGroup(
            pnEastNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2699, Short.MAX_VALUE)
        );
        pnEastNorthLayout.setVerticalGroup(
            pnEastNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        pnEast.add(pnEastNorth, java.awt.BorderLayout.PAGE_START);

        pnEastWest.setPreferredSize(new java.awt.Dimension(20, 540));

        javax.swing.GroupLayout pnEastWestLayout = new javax.swing.GroupLayout(pnEastWest);
        pnEastWest.setLayout(pnEastWestLayout);
        pnEastWestLayout.setHorizontalGroup(
            pnEastWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pnEastWestLayout.setVerticalGroup(
            pnEastWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 981, Short.MAX_VALUE)
        );

        pnEast.add(pnEastWest, java.awt.BorderLayout.LINE_START);

        pnEastSouth.setPreferredSize(new java.awt.Dimension(1396, 10));

        javax.swing.GroupLayout pnEastSouthLayout = new javax.swing.GroupLayout(pnEastSouth);
        pnEastSouth.setLayout(pnEastSouthLayout);
        pnEastSouthLayout.setHorizontalGroup(
            pnEastSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2699, Short.MAX_VALUE)
        );
        pnEastSouthLayout.setVerticalGroup(
            pnEastSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        pnEast.add(pnEastSouth, java.awt.BorderLayout.PAGE_END);

        pnEastEast.setPreferredSize(new java.awt.Dimension(10, 540));

        javax.swing.GroupLayout pnEastEastLayout = new javax.swing.GroupLayout(pnEastEast);
        pnEastEast.setLayout(pnEastEastLayout);
        pnEastEastLayout.setHorizontalGroup(
            pnEastEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pnEastEastLayout.setVerticalGroup(
            pnEastEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 981, Short.MAX_VALUE)
        );

        pnEast.add(pnEastEast, java.awt.BorderLayout.LINE_END);

        pnEastCenter.setPreferredSize(new java.awt.Dimension(1350, 700));
        pnEastCenter.setLayout(new java.awt.BorderLayout());

        desktop.setBackground(new java.awt.Color(51, 51, 51));
        desktop.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        desktop.setMaximumSize(new java.awt.Dimension(1750, 979));
        desktop.setMinimumSize(new java.awt.Dimension(1750, 979));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/!desktop3.png"))); // NOI18N

        desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2665, Short.MAX_VALUE)
            .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(desktopLayout.createSequentialGroup()
                    .addGap(0, 1035, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 1035, Short.MAX_VALUE)))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 977, Short.MAX_VALUE)
            .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(desktopLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnEastCenter.add(desktop, java.awt.BorderLayout.CENTER);

        pnEast.add(pnEastCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnEast, java.awt.BorderLayout.CENTER);

        mnArquivo.setText("Arquivo");
        mnArquivo.setToolTipText("");

        mnNovo.setText("Novo");

        mnNovoCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        mnNovoCliente.setText("Cliente");
        mnNovoCliente.setToolTipText("<html><u>C</u>ustomer");
        mnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNovoClienteActionPerformed(evt);
            }
        });
        mnNovo.add(mnNovoCliente);

        mnNovaCompra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        mnNovaCompra.setText("Compra");
        mnNovaCompra.setToolTipText("<html><u>B</u>uy");
        mnNovaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNovaCompraActionPerformed(evt);
            }
        });
        mnNovo.add(mnNovaCompra);

        mnNovoFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        mnNovoFornecedor.setText("Fornecedor");
        mnNovoFornecedor.setToolTipText("<html><u>S</u>upplier");
        mnNovoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNovoFornecedorActionPerformed(evt);
            }
        });
        mnNovo.add(mnNovoFornecedor);

        mnNovoFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        mnNovoFuncionario.setText("Funcionário");
        mnNovoFuncionario.setToolTipText("<html><u>E</u>mployee");
        mnNovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNovoFuncionarioActionPerformed(evt);
            }
        });
        mnNovo.add(mnNovoFuncionario);

        mnUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        mnUsuario.setText("Usuário");
        mnUsuario.setToolTipText("<html><u>U</u>ser");
        mnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnUsuarioActionPerformed(evt);
            }
        });
        mnNovo.add(mnUsuario);

        mnArquivo.add(mnNovo);

        mnEstoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK));
        mnEstoque.setText("Estoque");
        mnEstoque.setToolTipText("<html> <u>W</u>arehouse");
        mnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEstoqueActionPerformed(evt);
            }
        });
        mnArquivo.add(mnEstoque);

        mnServico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        mnServico.setText("Serviço");
        mnServico.setToolTipText("<html><u>M</u>aintenance");
        mnServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnServicoActionPerformed(evt);
            }
        });
        mnArquivo.add(mnServico);

        brMainBar.add(mnArquivo);

        jMenu1.setText("Programa");

        mnLogon.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        mnLogon.setText("Novo Login");
        mnLogon.setToolTipText("<html><u>L</u>ogon");
        mnLogon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLogonActionPerformed(evt);
            }
        });
        jMenu1.add(mnLogon);

        mnSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        mnSair.setText("Sair");
        mnSair.setToolTipText("<html><u>Q</u>uit");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        jMenu1.add(mnSair);

        brMainBar.add(jMenu1);

        setJMenuBar(brMainBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTOES
    //ADMINISTRACAO
    private void btnAdministracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministracaoActionPerformed
        AdministracaoIFrame administracaoFrame = new AdministracaoIFrame(desktop);
        boolean windowExists = false;

        for (JInternalFrame esseFrame : desktop.getAllFrames()) {
            if (esseFrame.getClass().toString().equalsIgnoreCase(administracaoFrame.getClass().toString())) {
                esseFrame.moveToFront();
                windowExists = true;
            }
        }
        if (!windowExists) {
            desktop.add(administracaoFrame);
            administracaoFrame.setVisible(true);
            administracaoFrame.setClosable(true);
            administracaoFrame.setIconifiable(true);
            administracaoFrame.setLocation();

        }
    }//GEN-LAST:event_btnAdministracaoActionPerformed

    //NOVA ORDEM DE SERVICO
    private void btnAbrirOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirOsActionPerformed
        AbrirOsIFrame abrirOsFrame = new AbrirOsIFrame(desktop);
        boolean windowExists = false;

        for (JInternalFrame esseFrame : desktop.getAllFrames()) {
            if (esseFrame.getClass().toString().equalsIgnoreCase(abrirOsFrame.getClass().toString())) {
                esseFrame.moveToFront();
                windowExists = true;
            }
        }

        if (!windowExists) {
            desktop.add(abrirOsFrame);
            abrirOsFrame.setVisible(true);
            abrirOsFrame.setLocation();
        }

    }//GEN-LAST:event_btnAbrirOsActionPerformed

    //CONSULTAR/LISTAR ORDEM DE SERVICO
    private void btnConsultarOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarOsActionPerformed
        ConsultarOsIFrame consultarOsFrame = new ConsultarOsIFrame(desktop);

        boolean windowExists = false;
        for (JInternalFrame esseFrame : desktop.getAllFrames()) {
            if (esseFrame.getClass().toString().equalsIgnoreCase(consultarOsFrame.getClass().toString())) {
                esseFrame.moveToFront();
                windowExists = true;
            }
        }

        if (!windowExists) {
            desktop.add(consultarOsFrame);
            consultarOsFrame.setVisible(true);
            consultarOsFrame.setIconifiable(true);
            consultarOsFrame.setClosable(true);
            consultarOsFrame.setLocation();

        }
    }//GEN-LAST:event_btnConsultarOsActionPerformed

    //PONTO DE VENDA
    private void btnPdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdvActionPerformed
        PdvIFrame pdvFrame = new PdvIFrame(desktop);

        boolean windowExists = false;
        for (JInternalFrame esseFrame : desktop.getAllFrames()) {
            if (esseFrame.getClass().toString().equalsIgnoreCase(pdvFrame.getClass().toString())) {
                esseFrame.moveToFront();
                windowExists = true;
            }
        }

        if (!windowExists) {
            desktop.add(pdvFrame);
            pdvFrame.setVisible(true);
            pdvFrame.setIconifiable(true);
            pdvFrame.setClosable(true);
            pdvFrame.setLocation();

        }
    }//GEN-LAST:event_btnPdvActionPerformed

    //MENUS
    //NOVO - CLIENTE
    private void mnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNovoClienteActionPerformed
        ClienteIFrame clienteFrame = new ClienteIFrame(desktop);

        boolean windowsExists = false;

        for (JInternalFrame esseFrame : desktop.getAllFrames()) {
            if (esseFrame.getClass().toString().equalsIgnoreCase(clienteFrame.getClass().toString())) {
                esseFrame.moveToFront();
                windowsExists = true;
            }
        }
        if (!windowsExists) {
            desktop.add(clienteFrame);

            clienteFrame.setClosable(true);
            clienteFrame.setIconifiable(true);
            clienteFrame.setVisible(true);
            clienteFrame.setLocation();
        }
    }//GEN-LAST:event_mnNovoClienteActionPerformed
    //NOVO FORNECEDOR
    private void mnNovoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNovoFornecedorActionPerformed
        FornecedorIFrame fornecedorFrame = new FornecedorIFrame(desktop);

        boolean windowExists = false;

        for (JInternalFrame esseFrame : desktop.getAllFrames()) {
            if (esseFrame.getClass().toString().equalsIgnoreCase(fornecedorFrame.getClass().toString())) {
                esseFrame.moveToFront();
                windowExists = true;
            }
        }
        if (!windowExists) {
            desktop.add(fornecedorFrame);

            fornecedorFrame.setClosable(true);
            fornecedorFrame.setIconifiable(true);
            fornecedorFrame.setResizable(false);
            fornecedorFrame.setVisible(true);
            fornecedorFrame.setLocation();
        }
    }//GEN-LAST:event_mnNovoFornecedorActionPerformed
    //NOVO FUNCIONARIO
    private void mnNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNovoFuncionarioActionPerformed
        FuncionarioIFrame funcionarioFrame = new FuncionarioIFrame(desktop);

        boolean windowExists = false;

        for (JInternalFrame esseFrame : desktop.getAllFrames()) {
            if (esseFrame.getClass().toString().equalsIgnoreCase(funcionarioFrame.getClass().toString())) {
                esseFrame.moveToFront();
                windowExists = true;
            }
        }
        if (!windowExists) {
            desktop.add(funcionarioFrame);

            funcionarioFrame.setClosable(true);
            funcionarioFrame.setIconifiable(true);
            funcionarioFrame.setResizable(false);
            funcionarioFrame.setVisible(true);
            funcionarioFrame.setLocation();
        }
    }//GEN-LAST:event_mnNovoFuncionarioActionPerformed
    //ESTOQUE
    private void mnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEstoqueActionPerformed
        PecaIFrame estoqueFrame = new PecaIFrame(desktop);

        boolean windowExists = false;

        for (JInternalFrame esseFrame : desktop.getAllFrames()) {
            if (esseFrame.getClass().toString().equalsIgnoreCase(estoqueFrame.getClass().toString())) {
                esseFrame.moveToFront();
                windowExists = true;
            }
        }
        if (!windowExists) {
            desktop.add(estoqueFrame);

            estoqueFrame.setClosable(true);
            estoqueFrame.setIconifiable(true);
            estoqueFrame.setResizable(false);
            estoqueFrame.setVisible(true);
            estoqueFrame.setLocation();
        }
    }//GEN-LAST:event_mnEstoqueActionPerformed
    //SERVICO
    private void mnServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnServicoActionPerformed
        ServicoIFrame servicoFrame = new ServicoIFrame(desktop);

        boolean windowExists = false;

        for (JInternalFrame esseFrame : desktop.getAllFrames()) {
            if (esseFrame.getClass().toString().equalsIgnoreCase(servicoFrame.getClass().toString())) {
                esseFrame.moveToFront();
                windowExists = true;
            }
        }
        if (!windowExists) {
            desktop.add(servicoFrame);

            servicoFrame.setClosable(true);
            servicoFrame.setIconifiable(true);
            servicoFrame.setResizable(false);
            servicoFrame.setVisible(true);
            servicoFrame.setLocation();
        }
    }//GEN-LAST:event_mnServicoActionPerformed

    //LOGON
    private void mnLogonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLogonActionPerformed
        LogonFrame logonFrame = new LogonFrame();
        logonFrame.setLocationRelativeTo(null);
        logonFrame.setResizable(false);
        logonFrame.setVisible(true);
        this.repaint();
    }//GEN-LAST:event_mnLogonActionPerformed
    //USUARIO
    private void mnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnUsuarioActionPerformed
        UsuarioIFrame usuarioFrame = new UsuarioIFrame();
        boolean windowExists = false;

        for (JInternalFrame esseFrame : desktop.getAllFrames()) {
            if (esseFrame.getClass().toString().equalsIgnoreCase(usuarioFrame.getClass().toString())) {
                esseFrame.moveToFront();
                windowExists = true;
            }
        }
        if (!windowExists) {
            desktop.add(usuarioFrame);

            usuarioFrame.setClosable(true);
            usuarioFrame.setIconifiable(true);
            usuarioFrame.setResizable(false);
            usuarioFrame.setVisible(true);
            usuarioFrame.setLocation();
        }
    }//GEN-LAST:event_mnUsuarioActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        System.exit(1);
    }//GEN-LAST:event_mnSairActionPerformed
    //MENU COMPRA
    private void mnNovaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNovaCompraActionPerformed
        EntradaIFrame compraFrame = new EntradaIFrame(desktop, usuario);
        boolean windowExists = false;

        for (JInternalFrame esseFrame : desktop.getAllFrames()) {
            if (esseFrame.getClass().toString().equalsIgnoreCase(compraFrame.getClass().toString())) {
                esseFrame.moveToFront();
                windowExists = true;
            }
        }
        if (!windowExists) {
            desktop.add(compraFrame);

            compraFrame.setClosable(true);
            compraFrame.setIconifiable(true);
            compraFrame.setResizable(false);
            compraFrame.setVisible(true);
            compraFrame.setLocation();
        }
    }//GEN-LAST:event_mnNovaCompraActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame mainFrame = new MainFrame();
                mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                mainFrame.setVisible(true);
                mainFrame.setLocationRelativeTo(null);
            }
        });
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JMenuBar brMainBar;
    protected javax.swing.JButton btnAbrirOs;
    protected javax.swing.JButton btnAdministracao;
    protected javax.swing.JButton btnConsultarOs;
    protected javax.swing.JButton btnOficina;
    protected javax.swing.JButton btnOutros;
    protected javax.swing.JButton btnPdv;
    protected javax.swing.JDesktopPane desktop;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JMenu jMenu1;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JPanel jPanel2;
    protected javax.swing.JPanel jPanel3;
    protected javax.swing.JPanel jPanel4;
    protected javax.swing.JPanel jPanel5;
    protected javax.swing.JPanel jPanel6;
    protected javax.swing.JLabel lblIp;
    protected javax.swing.JLabel lblUsuario;
    protected javax.swing.JLabel lblVersao;
    protected javax.swing.JMenu mnArquivo;
    protected javax.swing.JMenuItem mnEstoque;
    protected javax.swing.JMenuItem mnLogon;
    protected javax.swing.JMenuItem mnNovaCompra;
    protected javax.swing.JMenu mnNovo;
    protected javax.swing.JMenuItem mnNovoCliente;
    protected javax.swing.JMenuItem mnNovoFornecedor;
    protected javax.swing.JMenuItem mnNovoFuncionario;
    protected javax.swing.JMenuItem mnSair;
    protected javax.swing.JMenuItem mnServico;
    protected javax.swing.JMenuItem mnUsuario;
    protected javax.swing.JPanel pnEast;
    protected javax.swing.JPanel pnEastCenter;
    protected javax.swing.JPanel pnEastEast;
    protected javax.swing.JPanel pnEastNorth;
    protected javax.swing.JPanel pnEastSouth;
    protected javax.swing.JPanel pnEastWest;
    protected javax.swing.JPanel pnNorth;
    protected javax.swing.JPanel pnWest;
    protected javax.swing.JPanel pnWestSouth;
    protected javax.swing.JTextField txtStatusIp;
    protected javax.swing.JTextField txtStatusUsuario;
    protected javax.swing.JTextField txtStatusVersao;
    // End of variables declaration//GEN-END:variables

   
}
