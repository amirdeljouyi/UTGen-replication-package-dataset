/*
 * CriarTemplate.java
 *
 * Created on 19 de Janeiro de 2008, 11:24
 */
package jaw.gui.templates;

import java.awt.Color;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JMenuItem;
import javax.swing.text.BadLocationException;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import jaw.configuracoes.Mapeamento;
import jaw.template.ModeloDeAplicacao;
import jaw.template.TemplateJaw;

/**
 *
 * @author  flavio
 */
public class CriarTemplate extends javax.swing.JDialog {

    private TemplateJaw template = new TemplateJaw();
    private int posicaoDoMouse = 0;
    private ModeloDeAplicacao modelo = new ModeloDeAplicacao();

    public CriarTemplate(TemplateJaw template) {
        this.template = template;
        initComponents();
        nomeDoTemplate.setText(template.getNome());
        velocityTemplate.setText(template.getVelocityTemplate());
        destino.setText(template.getDestino());
        nomeDoArquivo.setText(template.getNomeDoArquivo());
        descricao.setText(template.getDescricao());
        if (template.getTipo() == TemplateJaw.INDIVIDUAL) {
            jRadioButton1.setSelected(true);
            jRadioButton2.setSelected(false);
        } else {
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(true);
        }
        carregarMenusPopup();
        buscarPalavrasReservadas();
    }

    public CriarTemplate(ModeloDeAplicacao modelo) {
        initComponents();
        destino.setText(jaw.Main.configuracao.getCaminhoDosGerados());
        carregarMenusPopup();
        buscarPalavrasReservadas();
        modelo.getTemplates().add(template);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        caminho = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        menuEditor = new javax.swing.JPopupMenu();
        entidades = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        atributos = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        repeticoes = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        condicao = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        includes = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        variavel = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        comentario = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        nomeDoTemplate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        destino = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nomeDoArquivo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        velocityTemplate = new javax.swing.JTextPane();
        jButton5 = new javax.swing.JButton();

        caminho.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        entidades.setText("Entidade");

        jMenuItem1.setText("${entidade.getPacote()}");
        entidades.add(jMenuItem1);

        jMenuItem5.setText("${entidade.getNome()}");
        entidades.add(jMenuItem5);

        jMenuItem2.setText("${entidade.getNomeAsClasse()}");
        entidades.add(jMenuItem2);

        jMenuItem11.setText("${entidade.getNomeAsTexto()}");
        entidades.add(jMenuItem11);

        jMenuItem3.setText("${entidade.getNomeAsTabela()}");
        entidades.add(jMenuItem3);

        jMenuItem4.setText("${entidade.getNomeAsAtributo()}");
        entidades.add(jMenuItem4);

        menuEditor.add(entidades);

        atributos.setText("Atributos");

        jMenuItem6.setText("${atributo.getNome()}");
        atributos.add(jMenuItem6);

        jMenuItem7.setText("${atributo.getNomeAsClasse()}");
        atributos.add(jMenuItem7);

        jMenuItem8.setText("${atributo.getNomeAsTabela()}");
        atributos.add(jMenuItem8);

        jMenuItem12.setText("${atributo.getNomeAsTexto()}");
        atributos.add(jMenuItem12);

        jMenuItem9.setText("${atributo.getNomeAsAtributo()}");
        atributos.add(jMenuItem9);
        atributos.add(jSeparator1);

        jMenuItem10.setText("${atributo.getTipo()}");
        atributos.add(jMenuItem10);
        atributos.add(jSeparator2);

        jMenuItem13.setText("${atributo.getTamanho()}");
        atributos.add(jMenuItem13);
        atributos.add(jSeparator3);

        menuEditor.add(atributos);

        repeticoes.setText("Repetições");

        jMenuItem16.setText("#foreach ($entidade in $entidades)");
        repeticoes.add(jMenuItem16);

        jMenuItem15.setText("#foreach ($atributo in $entidade.getAtributos())");
        repeticoes.add(jMenuItem15);

        jMenuItem14.setText("#{end}");
        repeticoes.add(jMenuItem14);

        menuEditor.add(repeticoes);

        condicao.setText("Condições");

        jMenuItem17.setText("#{if}(condicao)");
        condicao.add(jMenuItem17);

        jMenuItem18.setText("#{elseif}(condicao)");
        condicao.add(jMenuItem18);

        jMenuItem19.setText("#{else}");
        condicao.add(jMenuItem19);

        jMenuItem20.setText("#{end}");
        condicao.add(jMenuItem20);

        menuEditor.add(condicao);

        includes.setText("Includes");

        jMenuItem21.setText("#{include}(\"arquivo.txt\")");
        includes.add(jMenuItem21);

        jMenuItem22.setText("#{parse}(\"arquivo.vm\")");
        includes.add(jMenuItem22);

        menuEditor.add(includes);

        variavel.setText("Variável");

        jMenuItem23.setText("#{set}($variavel = valor)");
        variavel.add(jMenuItem23);

        menuEditor.add(variavel);

        comentario.setText("Comentário");

        jMenuItem24.setText("##");
        comentario.add(jMenuItem24);

        jMenuItem25.setText("#* (...) *#");
        comentario.add(jMenuItem25);

        menuEditor.add(comentario);

        setModal(true);

        jLabel1.setText("Nome");

        jLabel2.setText("Template Velocity");

        jLabel3.setText("Diretório destino");

        destino.setText("$Pacote$/$Entidade$");

        jLabel4.setText("Nome do arquivo a ser gerado");

        nomeDoArquivo.setText("$Entidade$");
        nomeDoArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeDoArquivoActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/general/Save24.gif"))); // NOI18N
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("selecione");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Descrição");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/general/Stop24.gif"))); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setText("Geração individual ou conjunta?");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("individual");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("conjunta");

        jScrollPane3.setAutoscrolls(true);

        velocityTemplate.setComponentPopupMenu(menuEditor);
        velocityTemplate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                velocityTemplateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                velocityTemplateFocusLost(evt);
            }
        });
        velocityTemplate.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                velocityTemplateInputMethodTextChanged(evt);
            }
        });
        velocityTemplate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                velocityTemplateKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                velocityTemplateKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(velocityTemplate);

        jButton5.setComponentPopupMenu(menuEditor);
        jButton5.setText("Inserir");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(8, 8, 8)
                                .addComponent(destino, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)
                                .addGap(231, 231, 231))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(11, 11, 11)
                                .addComponent(descricao, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeDoArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeDoTemplate, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeDoTemplate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nomeDoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton5))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Salvar
        template.setNome(nomeDoTemplate.getText());
        template.setVelocityTemplate(velocityTemplate.getText());
        template.setDestino(destino.getText());
        template.setNomeDoArquivo(nomeDoArquivo.getText());
        template.setDescricao(descricao.getText());
        if (jRadioButton1.isSelected()) {
            template.setTipo(TemplateJaw.INDIVIDUAL);
        } else {
            template.setTipo(TemplateJaw.CONJUNTA);
        }
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //destino
        caminho.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        caminho.setCurrentDirectory(new File(destino.getText()));
        caminho.showOpenDialog(this);
        if (caminho.getSelectedFile() != null) {
            destino.setText(caminho.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nomeDoArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeDoArquivoActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_nomeDoArquivoActionPerformed

    private void velocityTemplateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_velocityTemplateFocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_velocityTemplateFocusGained

    private void velocityTemplateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_velocityTemplateFocusLost
        posicaoDoMouse = velocityTemplate.getCaretPosition();
    // Guarda a posicao do mouse quando o menu pop-up eh ativado
}//GEN-LAST:event_velocityTemplateFocusLost

    private void velocityTemplateInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_velocityTemplateInputMethodTextChanged
        
}//GEN-LAST:event_velocityTemplateInputMethodTextChanged

    private void velocityTemplateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_velocityTemplateKeyPressed
    // TODO add your handling code here:
}//GEN-LAST:event_velocityTemplateKeyPressed

    private void buscarPalavrasReservadas() {
        /* \\Q + String + \\E
         *  Utilizado para buscar a String sem utiliza-la com regex.
         * Para expressoes regulares nao esquecer de escapar os
         * caracteres especiais
         */
        String[] lista = new String[]{
            "\\Q${entidade.getPacote()}\\E",
            "\\Q${entidade.getNomeAsClasse()}\\E",
            "\\Q${entidade.getNomeAsTexto()}\\E",
            "\\Q${entidade.getNomeAsTabela()}\\E",
            "\\Q${entidade.getNomeAsAtributo()}\\E",
            "\\Q${entidade.getNome()}\\E",
            "\\Q${atributo.getNomeAsClasse()}\\E",
            "\\Q${atributo.getNomeAsTabela()}\\E",
            "\\Q${atributo.getNomeAsAtributo()}\\E",
            "\\Q${atributo.getNome()}\\E",
            "\\Q${atributo.getTipo()}\\E",
            "\\$\\{atributo.getTipos\\(\\)\\.getProperty\\(\\W\\)\\}",
            "\\Q${atributo.getTamanho()}\\E",
            "\\Q#end\\E",
            "\\Q#{end}\\E",
            "\\Q#{else}\\E",
            "\\Q#else\\E",
            "#\\{elseif\\}\\(.*\\)",
            "#elseif\\(.*\\)",
            "#set\\(.*\\)",
            "#\\{set\\}\\(.*\\)",
            "#if\\(.*\\)",
            "#\\{if\\}(\\W)",
            "#foreach \\(*\\)",
            "#foreach\\(*\\)",
            "#\\{parse\\}\\(.*\\)",
            "#parse\\(.*\\)",
            "#\\{include\\}\\(.*\\)",
            "#include\\(.*\\)"
        };
        for (int i = 0; i < lista.length; i++) {
            String texto = velocityTemplate.getText();
            Pattern p = Pattern.compile(lista[i]);
            Matcher m = p.matcher(texto);
            while (m.find()) {
                try {
                    System.out.println(texto.substring(m.start(), m.end()));
                } catch (Exception e) {
                    jaw.Main.janelaPrincipal.log(e.toString());
                }
                editorHighlight(m.start(), m.end() - m.start());
            }
        }


    }

    private void resetStyle() {
        MutableAttributeSet keyWord = new SimpleAttributeSet();
        StyleConstants.setBold(keyWord, false);
        StyleConstants.setForeground(keyWord, Color.BLACK);
        StyledDocument doc = velocityTemplate.getStyledDocument();
        doc.setCharacterAttributes(0, velocityTemplate.getText().length(), keyWord, false);
    }

    private void editorHighlight(int inicio, int tamanho) {
        MutableAttributeSet keyWord = new SimpleAttributeSet();
        StyleConstants.setBold(keyWord, true);
        StyleConstants.setForeground(keyWord, Color.BLUE);
        StyledDocument doc = velocityTemplate.getStyledDocument();
        doc.setCharacterAttributes(inicio, tamanho, keyWord, false);
    }

    private void carregarMenusPopup() {
        // Carrega os tipos de mapeamento
        for (Mapeamento mapeamento : jaw.Main.configuracao.getMapeamentos()) {
            JMenuItem menu = new JMenuItem("${atributo.getTipos().getProperty(\"" + mapeamento.getNome() + "\")}");
            atributos.add(menu);
            adicionarEventoAMenu(menu);
        }

        JMenuItem[] lista = new JMenuItem[]{
            jMenuItem1,
            jMenuItem2,
            jMenuItem11,
            jMenuItem3,
            jMenuItem4,
            jMenuItem5,
            jMenuItem6,
            jMenuItem7,
            jMenuItem8,
            jMenuItem12,
            jMenuItem9,
            jMenuItem10,
            jMenuItem13,
            jMenuItem14,
            jMenuItem15,
            jMenuItem16,
            jMenuItem17,
            jMenuItem18,
            jMenuItem19,
            jMenuItem20,
            jMenuItem21,
            jMenuItem22,
            jMenuItem23,
            jMenuItem24,
            jMenuItem25
        };

        for (int i = 0; i < lista.length; i++) {
            adicionarEventoAMenu(lista[i]);
        }
    }

    private void adicionarEventoAMenu(JMenuItem menuItem) {
        menuItem.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acaoDeMenuPopup(evt);
            }
        });
    }

    private void acaoDeMenuPopup(java.awt.event.ActionEvent evt) {
        this.resetStyle();
        try {
            String texto = velocityTemplate.getText(0, this.posicaoDoMouse);
            texto += ((javax.swing.JMenuItem) evt.getSource()).getText();
            texto += velocityTemplate.getText(this.posicaoDoMouse, velocityTemplate.getText().length() - this.posicaoDoMouse);
            velocityTemplate.setText(texto);
        } catch (BadLocationException ex) {
            jaw.Main.janelaPrincipal.log(ex.toString());
        }
        buscarPalavrasReservadas();
    }

    private void velocityTemplateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_velocityTemplateKeyReleased
        buscarPalavrasReservadas();
}//GEN-LAST:event_velocityTemplateKeyReleased

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // ao clicar mostra o popup
        jButton5.getComponentPopupMenu().show(this, 0, 0);
    }//GEN-LAST:event_jButton5MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu atributos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFileChooser caminho;
    private javax.swing.JMenu comentario;
    private javax.swing.JMenu condicao;
    private javax.swing.JTextField descricao;
    private javax.swing.JTextField destino;
    private javax.swing.JMenu entidades;
    private javax.swing.JMenu includes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPopupMenu menuEditor;
    private javax.swing.JTextField nomeDoArquivo;
    private javax.swing.JTextField nomeDoTemplate;
    private javax.swing.JMenu repeticoes;
    private javax.swing.JMenu variavel;
    private javax.swing.JTextPane velocityTemplate;
    // End of variables declaration//GEN-END:variables
}
