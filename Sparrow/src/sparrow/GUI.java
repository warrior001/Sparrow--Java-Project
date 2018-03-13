
package sparrow;

import com.mysql.jdbc.StringUtils;
import java.awt.Image;
import java.awt.JobAttributes;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import java.awt.Toolkit;
import javax.swing.text.html.HTML;
// Link-java (Importent) http://www.kerenkalif.com/ProgrammingLectures/Advanced%20Java/
//https://www.youtube.com/watch?v=2i4t-SL1VsU
//http://zetcode.com/db/mysqljava/
public class GUI extends javax.swing.JFrame {
   
   
    //working
public String CharToHiragana(String tav) {
      
        int place =0;
        for (int i=0;i<alpha.length;i++)
            if (alpha[i].equals(tav))
                place = i;
        return hiragana[place];
     }

public String HiraganaToChar(String tav) {        
                                                  
        int place =0;                             
        for (int i=0;i<hiragana.length;i++)       
            if (hiragana[i].equals(tav))          
                place = i;                        
        return alpha[place];                      
     }                                            




//working
public String TextToHiragana(String str) {
        str = str.toLowerCase();
        String nihon="";
       
        /*
        for(int i = 0; i < str.length(); i++) 
             {
               if(str.charAt(i)==' ')
                   nihon+=CharToHiragana(Character.toString(str.charAt(i)));
               else
               {
                   nihon+=CharToHiragana(Character.toString(str.charAt(i)));
                   nihon+=" ";
                   
               }
            }
 */
        
        for(int i = 0; i < str.length(); i++) 
             {
               if(str.charAt(i)==' ')
               {
                   nihon+=' ';
               }
               
               else
               {
                   nihon+=CharToHiragana(Character.toString(str.charAt(i)));
                  
                   
               }
               
               
               
            }
             
        return nihon;
     }     
    
    

      String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "0", " ", "@", ":", "." , "\n","$" };//41
    String[] hiragana = { "あ", "い", "う", "え", "お", "は", "ひ",
            "ふ", "へ", "ほ", "か", "き", "く", "け", "こ", "ま",
            "み", "む", "め", "も", "さ", "し", "す", "せ",
            "そ", "や", "ゆ", "よ", "た", "ち", "つ",
            "て", "と", "ら", "り", "る", " ", "☺", ";", "'", "#","$" }; //41
    //?
    public String HiraganaToText(String str) {
        str = str.toLowerCase();
        String nihon="";
       
        for(int i = 0; i < str.length(); i++) 
             {
               if(str.charAt(i)==' ')
                   nihon+=" ";
               
               
               else
               {
                   nihon+=HiraganaToChar(Character.toString(str.charAt(i)));
                  
                   
               }
            }
        //for(int i = 0; i < str.length(); i++) {
            
           // for(int j = 0; j < hiragana.length; j++) {
                
              //  if(Character.toString(str.charAt(i)).equals(hiragana[j])) {
                  //  nihon+=alpha[j];
               // }
                
           // }
            
       // }
      
        return nihon;
     }
    

    
    
    
   
    
    
     public char Bin_to_char(String sidra) 
            {
                int sum=0;
                int dig;
                for(int i=0;i<=15;i++)
                {
                    dig=sidra.charAt(i)-'0';
                    sum+=dig*(int)(Math.pow(2,15-i));
                    
                    
                }
                return (char)sum;
                
               
               
                
            }
     
                
     public String Sidra16 (char tav)
     {
         int n=(int)tav;
         String sidra="";
         while(n!=0)
         {
             sidra+=n%2;
             n/=2;
             
         }
          int zero=16-sidra.length();
         
         for(int i=1;i<=zero;i++)
             sidra+='0';
             
             
             
         String rev="";
         for(int i=sidra.length()-1;i>=0;i--)
             rev+=sidra.charAt(i);
        
             return rev;

     }
    
    public boolean isID(String id)
         {
     if(id.length()!=9)
         return false;
     for(int i=0;i<id.length();i++)
         if(id.charAt(i)<'0' || id.charAt(i)>'9')
             return false;
     return true;
         }
    
 /*
    public boolean isMail(String mail)
     {
         if(mail.indexOf('@')==-1)
             return false;
         if(mail.indexOf('@')!=mail.lastIndexOf('@'))
                      return true;
     return true;

     }
    */
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        //setIcon();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog2 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jtxtName = new javax.swing.JTextField();
        jtxtID = new javax.swing.JTextField();
        jtxtMail1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtjob = new javax.swing.JTextField();
        jtxtsalary = new javax.swing.JTextField();
        jrdbFemale = new javax.swing.JRadioButton();
        jrdbmale = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jtxtMail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtxtMail2 = new javax.swing.JTextField();
        jrdbPerHour = new javax.swing.JRadioButton();
        jrdbPerMonth = new javax.swing.JRadioButton();
        jDialog3 = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jDialog1 = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        JInfoList = new javax.swing.JList();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane5 = new javax.swing.JScrollPane();
        JWorkerList1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jMenuItem3 = new javax.swing.JMenuItem();
        jDialog4 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        jDialog2.setMinimumSize(new java.awt.Dimension(730, 450));
        jDialog2.setResizable(false);
        jDialog2.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jDialog2WindowActivated(evt);
            }
        });
        jDialog2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(367, 529));

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Enter First and Last Name:");

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Enter ID:");

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Enter Email:");

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jButton9.setText("Add Employee");
        jButton9.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jtxtMail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMail1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Choose gender");

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Enter Job:");

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Salary:");

        jrdbFemale.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrdbFemale);
        jrdbFemale.setText("Female");

        jrdbmale.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrdbmale);
        jrdbmale.setText("Male");
        jrdbmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdbmaleActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("@");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText(".");

        jrdbPerHour.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(jrdbPerHour);
        jrdbPerHour.setText("Per Hour");
        jrdbPerHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdbPerHourActionPerformed(evt);
            }
        });

        jrdbPerMonth.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup2.add(jrdbPerMonth);
        jrdbPerMonth.setText("Per Month");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(96, 96, 96)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrdbmale)
                                        .addGap(50, 50, 50)
                                        .addComponent(jrdbFemale))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtjob, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtxtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtxtMail1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtxtMail2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(74, 74, 74))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jtxtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jrdbPerHour)
                        .addGap(14, 14, 14)
                        .addComponent(jrdbPerMonth)))
                .addGap(132, 132, 132))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtMail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtMail)
                        .addComponent(jtxtMail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtjob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrdbPerHour)
                            .addComponent(jrdbPerMonth))
                        .addComponent(jtxtsalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrdbmale)
                    .addComponent(jLabel6)
                    .addComponent(jrdbFemale))
                .addGap(50, 50, 50)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        jDialog2.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 450));

        jDialog3.setMinimumSize(new java.awt.Dimension(780, 550));
        jDialog3.setResizable(false);
        jDialog3.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jDialog3WindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                jDialog3WindowDeactivated(evt);
            }
        });
        jDialog3.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel5.setMaximumSize(new java.awt.Dimension(602, 485));
        jPanel5.setMinimumSize(new java.awt.Dimension(780, 550));
        jPanel5.setPreferredSize(new java.awt.Dimension(671, 540));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel7.setText("Load Employee");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 32, -1, 42));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel8.setText("Enter file's name");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, -1, 42));

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 169, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jComboBox1.setName(""); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 159, 32));
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 260, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 179, 480, 360));

        jButton7.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jButton7.setText("Save");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 334, 250, -1));

        jButton10.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jButton10.setText("Load");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 382, 250, -1));

        jButton12.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jButton12.setText("Remove");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 430, 250, 33));

        jButton13.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jButton13.setText("Exit");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 474, 250, 33));

        jDialog3.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 550));

        jDialog1.setMinimumSize(new java.awt.Dimension(600, 600));
        jDialog1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jDialog1WindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                jDialog1WindowDeactivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jDialog1WindowOpened(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel19.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel19.setText("Worker List:");

        jScrollPane6.setViewportView(JInfoList);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel19))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JWorkerList1.setColumns(20);
        JWorkerList1.setRows(5);
        jScrollPane5.setViewportView(JWorkerList1);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("jMenuItem3");

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jTextField2.setEditable(false);
        jTextField2.setText(" www.flyadronegamestudio.weebly.com/contact.html");

        jLabel20.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel20.setText("Contact us at:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sparrow");
        setIconImages(getIconImages());
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setPreferredSize(getMinimumSize());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jButton1.setText("Add");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 220, 70));

        jButton3.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jButton3.setText("Load");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 220, 70));

        jButton6.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jButton6.setText("Exit");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 220, 70));

        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jToolBar1.setRollover(true);
        jToolBar1.setEnabled(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sparrow/LOGO-Sparrow.png"))); // NOI18N
        jToolBar1.add(jLabel2);

        jPanel2.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 790, 474));

        jButton17.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jButton17.setText("Contact");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton17MouseEntered(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 220, 70));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Beta 1.0");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel18.setText("© 2015 Alon Fingerman & Nir Grotel All Rights Reserved");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, -1));

        jLabel3.setText("*NOTE! This is a beta version");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, -1));

        jButton4.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jButton4.setText("Table");
        jButton4.setEnabled(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 220, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 1120, 680));

        jMenu1.setText("Options");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu1MouseEntered(evt);
            }
        });

        jMenuItem9.setText("contact us");
        jMenuItem9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem9MouseEntered(evt);
            }
        });
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem1.setText("Exit");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseEntered(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Languages");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu2MouseEntered(evt);
            }
        });

        jMenuItem7.setText("English");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem2.setText("עברית");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem4.setText("Русский Язык");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Українська Мова");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Pirate Speak");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem8.setText("日本語 (Japanese)");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

jDialog2.setVisible(true);
jDialog2.pack();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 jDialog3.setVisible(true);
      jDialog3.pack();
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      try{
            FileReader fr = new FileReader("names.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            while(br.ready()) {
                line = br.readLine();
                jComboBox1.addItem(line);
               // JWorkerList2.read(br, evt);
                
            }
                br.close();
        }
        catch (Exception e) {
            
        }
        
      
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jDialog2WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog2WindowActivated
     /*
        try{       
        FileReader fr1=new FileReader("Jobs.txt");
                BufferedReader br1=new BufferedReader(fr1);
                
                
                while(br1.ready())
                {
                   
                    //jtxtJobList.read(br1, evt);
                    
                    

                }

                br1.close();
        }
        catch (Exception e){
            
        }
        */
                }//GEN-LAST:event_jDialog2WindowActivated

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
//JOptionPane.showMessageDialog(this, "Concats us at: www.flyadronegamestudio.weebly.com/contact.html");   
       jDialog4.setVisible(true);
      jDialog4.pack();                                     
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

          if(jTextField5.getText().isEmpty())
            
        JOptionPane.showMessageDialog(this, "File's name missing");
        else
        {
            String filename=jTextField5.getText();

            filename=filename+".txt"; //+".txt"
            String msg=jTextArea1.getText();

String str="";


for(int i=0;i<msg.length();i++)
{
//    str+=Sidra16(msg.charAt(i));

        
        
        String realMsg = TextToHiragana(msg);
                
        
       
           
            str+=Sidra16(realMsg.charAt(i));
                           
                        

        
      
    
}
 
   try{
                FileWriter fw=new FileWriter(filename);
                BufferedWriter bw=new BufferedWriter(fw);
                String[]A=str.split("\n");
                for(int i=0;i<A.length;i++) {
                    bw.write(A[i]);
                    bw.newLine();
                }
                bw.close();

                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Error");
            }
   
   
      
String line1="";
String line2="";
/*
try{
             FileReader fr=new FileReader("info.txt");
                BufferedReader br=new BufferedReader(fr);
             
               
                while(br.ready())
                {
                    line2=br.readLine();
                   
                }
                      br.close();
                         

       }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Error");

            }
 
   
    try{
                FileWriter fw=new FileWriter("Info.txt");
                BufferedWriter bw=new BufferedWriter(fw);
                String[]B=line2.split("\n");
                
                for(int i=0;i<B.length;i++) {
                    bw.write(B[i]);
                    bw.newLine();
                }
                bw.close();

                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Error");
            }

 try{
                FileReader fr=new FileReader("Jobs.txt");
                BufferedReader br=new BufferedReader(fr);
             
               
                while(br.ready())
                {
                    line1=br.readLine();
                   
                }
                      br.close();
                         

       }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Error");

            }
 
   
   try{
                FileWriter fw=new FileWriter("Jobs.txt");
                BufferedWriter bw=new BufferedWriter(fw);
                line1=workerJob;
                    bw.write(line1);
                    bw.newLine();
                
                
                bw.close();

                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Error");
            }
            
       try{
                FileReader fr=new FileReader("Salary.txt");
                BufferedReader br=new BufferedReader(fr);
               
                while(br.ready())
                {
                    line2=br.readLine();
                    
                }
                      br.close();
                         

       }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Error");

            }
           try{
                FileWriter fw=new FileWriter("Salary.txt");
                BufferedWriter bw=new BufferedWriter(fw);
                line2=workerSalary;
                    bw.write(line2);
                    bw.newLine();
                
                bw.close();

                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Error");
            }
           
         */
            
            
            
          
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(jTextField5.getText().isEmpty())
        JOptionPane.showMessageDialog(this, "Missing");
        else
        {
            String filename=jTextField5.getText();
            filename=filename+".txt";//+".txt"
           
            jTextArea1.setText("");
            try{
                FileReader fr=new FileReader(filename);
                BufferedReader br=new BufferedReader(fr);
                String str="";
                String line;
              
                while(br.ready())
                {
                    line=br.readLine();
                    str+=line;
                }
                      br.close();
               
                
       
       
        
       
        
         
        String txt="";
         String txt1="";
         System.out.println(txt);
            for(int i=0;i<str.length();i+=16)
            {
                
                txt+=Bin_to_char(str.substring(i, i+16));
                                
               
                
                
            }
             txt1+=HiraganaToText(txt);
            
             
           jTextArea1.setText(txt1);


String[] lines = jTextArea1.getText().split("\n");

//then you can access your array
String workerName = lines[0];
String workerID = lines[1];
String workerMail = lines[2];
String workerGender= lines[3];
String workerJob = lines[4];
String workerSalary = lines[5];
                
                

          
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Error");

            }
           
          

        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String filename=jTextField5.getText();
      String line=jComboBox1.getSelectedItem().toString();
      String line1 = "";
      String line2=jTextField5.getText();
 
    
      
        if(jTextField5.getText().isEmpty() || jTextField5.getText()==" ")         
        JOptionPane.showMessageDialog(this, "File's name missing");
        else
        {
            File file = new File(filename+".txt"); 
                 try {
     
                       }
                 catch(Exception e)
        {
            
        }  
                 
         
        boolean status = file.delete();
        jTextArea1.setText(" ");
        jTextField5.setText(" ");
         GUI util = new GUI();
          jComboBox1.removeItem(line);
       
         
        util.removeLineFromFile("Names.txt", filename);
       /* try{
                FileReader fr=new FileReader("info.txt");
                BufferedReader br=new BufferedReader(fr);
                String str="";
                
              
                while(br.ready())
                {
                    line1=br.readLine();
                    str+=line1;
                 
                    if(!str.contains(line2))
                    {
                        
                    } 
                    else {                        
                        util.removeLineFromFile("info.txt",line1 );
                    }
                }
                      br.close();
                        }
      
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Error");

            }   
       
        */
          
      
       
        try {
            FileWriter fw3=new FileWriter(filename="");
                BufferedWriter bw3=new BufferedWriter(fw3);
        }
         catch(Exception e)
        {
            
        }
        
            
        if (status)
            JOptionPane.showMessageDialog(this, "Employee deleted successfully!");
        else
             JOptionPane.showMessageDialog(this, "Employee does not exists");
                    }
        
         

 
  


//System.out.println("successful");
    }//GEN-LAST:event_jButton12ActionPerformed
public void removeLineFromFile(String file, String lineToRemove) {

        try {

            File inFile = new File(file);

            if (!inFile.isFile()) {
                System.out.println("Parameter is not an existing file");
                return;
            }

            // Construct the new file that will later be renamed to the original
            // filename.
            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

            BufferedReader br = new BufferedReader(new FileReader(file));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

            String line = null;

            // Read from the original file and write to the new
            // unless content matches data to be removed.
            while ((line = br.readLine()) != null) {

                if (!line.trim().equals(lineToRemove)) {

                    pw.println(line);
                    pw.flush();
                }
            }
            pw.close();
            br.close();

            // Delete the original file
            if (!inFile.delete()) {
                System.out.println("Could not delete file");
                return;
            }

            // Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(inFile))
                System.out.println("Could not rename file");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
jTextArea1.setText("");
jTextField5.setText("");
        jDialog3.dispose();

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
jTextField5.setText(jComboBox1.getSelectedItem().toString());

    
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
jDialog1.pack();
jDialog1.setVisible(true);
   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jDialog3WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog3WindowActivated
 

    }//GEN-LAST:event_jDialog3WindowActivated

    private void jDialog3WindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog3WindowDeactivated
   {
            
        }
    }//GEN-LAST:event_jDialog3WindowDeactivated

    private void jrdbmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdbmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdbmaleActionPerformed

    private void jtxtMail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtMail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtMail1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
          String name,id,mail,mail1,mail2,gender,salary,job,timeofpayment;
        name=jtxtName.getText();
        id=jtxtID.getText();
        mail=jtxtMail.getText();
        mail1=jtxtMail1.getText();
        mail2=jtxtMail2.getText();
        salary = jtxtsalary.getText();
        job = jtxtjob.getText();

        if(jrdbmale.isSelected())
        gender="male";
        else
        gender="Female";
        if(jrdbPerHour.isSelected())
            timeofpayment=" Per hour";
        else
            timeofpayment=" Per Month";
        if(name.isEmpty())
        JOptionPane.showMessageDialog(this, "Name is missing");
        else if(id.isEmpty())
        JOptionPane.showMessageDialog(this, "ID is missing");
        else if(!isID(id))
        JOptionPane.showMessageDialog(this, "ID is incorrect");
        else if(mail.isEmpty() || mail1.isEmpty() || mail2.isEmpty())
        JOptionPane.showMessageDialog(this, "One of the fields in the mail are missing");
        else if (salary.isEmpty())
        JOptionPane.showMessageDialog(this, "Salary is missing");
        else if(!jrdbPerHour.isSelected() & !jrdbPerMonth.isSelected())
            JOptionPane.showMessageDialog(this, "Choose Per Month/Per Hour");
        else if (job.isEmpty())
        JOptionPane.showMessageDialog(this, "Enter Job");
        else if(!jrdbmale.isSelected() & !jrdbFemale.isSelected())
        JOptionPane.showMessageDialog(this, "Choose Gender");
        else
        {
            try{
                String temp = name;
                String filename=name+".txt";
              
       
        
                File file = new File(filename);
                boolean exists = file.exists();

                if (!exists) {
                    jComboBox1.addItem(temp);
                    FileWriter fw=new FileWriter(filename);
                    BufferedWriter bw=new BufferedWriter(fw);
                    
                            String msg="Full Name: "+name+"\n"+"ID: "+id+"\n"+"Mail: "+mail+"@"+mail1+"."+mail2+"\n"+"Gender: "+gender+"\n"+"Job: "+job+"\n"+"Salary: "+salary +""+timeofpayment;
                             
        String str="";
        
        //working
        String realMsg = TextToHiragana(msg);
        
                   // System.out.println(msg);
                    // System.out.println(realMsg);
              //working   
                    
        
        for(int i=0;i<realMsg.length();i++)//realMsg
       {
          //  String []A=realMsg.split("\n");
            str+=Sidra16(realMsg.charAt(i));//realMsg
                     
                           
                        

        
       }
        
                   
                   //bw.write(realMsg);
       
        
        
        
        
        bw.write(str);

                    bw.close();
         
                    jtxtID.setText("");
                    jtxtjob.setText("");
                    jtxtName.setText("");
                    jtxtMail.setText("");
                    jtxtMail1.setText("");
                    jtxtMail2.setText("");
                    jtxtsalary.setText("");
                    buttonGroup1.clearSelection();
                    buttonGroup2.clearSelection();
                    
            
                    

                    try{
                        FileWriter fw1 = new FileWriter("names.txt",true);
                        BufferedWriter bw1 = new BufferedWriter(fw1);
                              String str1="";
      
                        bw1.write(name);
                        bw1.newLine();
                        bw1.close();
                    }
                    catch (Exception e) {
                        
                    }
                    
                      try{
                        FileWriter fw1 = new FileWriter("info.txt",true);
                        BufferedWriter bw1 = new BufferedWriter(fw1);
                              String str1="";
      
                        bw1.write("Full name: "+name+"  |  "+"Job: "+job+"  |  "+"Salray: "+salary+timeofpayment);
                        bw1.newLine();
                        bw1.close();
                    }
                    catch (Exception e) {
                        
                    }
                   
                  /*
                    
                  try{
                         
              
                 FileWriter Salarywriter=new FileWriter("Salary.txt",true);
                    BufferedWriter Salarybuffer=new BufferedWriter(Salarywriter);
               Salarybuffer.write(salary+timeofpayment);
               Salarybuffer.newLine();
               Salarybuffer.close();
                    }
                    catch (Exception e){
                        
                    }
                    
                   
                    
                    try{
                        FileWriter fw2 = new FileWriter("Jobs.txt", true);
                        BufferedWriter bw2 = new BufferedWriter(fw2);

                        bw2.write(job);
                        bw2.newLine();
                        bw2.close();

                    }
                    
                    catch (Exception e) {

                    }
                   */

                    JOptionPane.showMessageDialog(this, "Data saved");

                }else{
                    if (JOptionPane.showConfirmDialog(null, "Name already in use, do you want to overwrite it?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                        {
                            FileWriter fw=new FileWriter(name+".txt");
                    BufferedWriter bw=new BufferedWriter(fw);
                                 String msg="Full Name: " + name+"\n"+"ID: "+id+"\n"+"Mail: "+mail+"@"+mail1+"."+mail2+"\n"+"Gender: "+gender+"\n"+"Job: "+job+"\n"+"Salary: "+salary +""+timeofpayment;
                            
        String str="";
         String realMsg = TextToHiragana(msg);
                   // System.out.println(msg);
                    // System.out.println(realMsg);
              //working   
                    
        
        for(int i=0;i<realMsg.length();i++)//realMsg
       {
           
            str+=Sidra16(realMsg.charAt(i));//realMsg
                     
                           
                        

        
       }
        
                   
                   //bw.write(realMsg);
                   bw.write(str);
                   
                    bw.close();
                    jtxtID.setText("");
                    jtxtjob.setText("");
                    jtxtName.setText("");
                    jtxtMail.setText("");
                    jtxtMail1.setText("");
                    jtxtMail2.setText("");
                    jtxtsalary.setText("");
                    buttonGroup1.clearSelection();
                    buttonGroup2.clearSelection();
                    
                        
                    try{
                        FileWriter fw1 = new FileWriter("names.txt",true);
                        BufferedWriter bw1 = new BufferedWriter(fw1);
                        bw1.write(name);
                        bw1.newLine();
                        bw1.close();
                    }
                    catch (Exception e) {
                        
                    }
                    
                    
                    
                  
                    
                  try{
                         
              
                 FileWriter Salarywriter=new FileWriter("Salary.txt",true);
                    BufferedWriter Salarybuffer=new BufferedWriter(Salarywriter);
               Salarybuffer.write(salary+timeofpayment);
               Salarybuffer.newLine();
               Salarybuffer.close();
                    }
                    catch (Exception e){
                        
                    }
                    
                   
                    
                    try{
                        FileWriter fw2 = new FileWriter("Jobs.txt", true);
                        BufferedWriter bw2 = new BufferedWriter(fw2);

                        bw2.write(job);
                        bw2.newLine();
                        bw2.close();

                    }
                    
                    catch (Exception e) {

                    }
                 
                    }
                   
                        JOptionPane.showMessageDialog(this, "Data saved");
                    } else {
                        JOptionPane.showMessageDialog(this, "Please Enter a different name or add a symbol to it");
                    }                                                        }

                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this, "Error");
                }
            }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jrdbPerHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdbPerHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdbPerHourActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
jMenu1.setText("אפשרויות");
jMenu2.setText("שפות");
jMenuItem1.setText("יציאה");
jButton1.setText("הוספה");
jButton3.setText("טען");
jButton4.setText("טבלה");
jButton17.setText("צור קשר");
jButton6.setText("יציאה");
jLabel11.setText("הכנס שם פרטי ושם משפחה");
jLabel4.setText("הכנס מספר תעודת זהות");
jLabel5.setText("הכנס אימייל");
jLabel9.setText("הכנס עבודה");
jLabel10.setText("הכנס משכורת");
jLabel6.setText("בחר מין");
jrdbmale.setText("גבר");
jrdbFemale.setText("אישה");
jrdbPerHour.setText("לשעה");
jrdbPerMonth.setText("לחודש");
jButton9.setText("הוסף עובד");
jLabel7.setText("טען עובד");
jLabel8.setText("הכנס את שם הקובץ");
jButton7.setText("שמור");
jButton10.setText("טען");
jButton12.setText("מחק");
jButton13.setText("יציאה");
jLabel19.setText("רשימת עובדים");
jLabel20.setText("צור קשר");
jMenuItem9.setText("צור קשר");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
jMenu1.setText("Опции");
jMenu2.setText("Языки");
jButton1.setText("Добавить");
jButton3.setText("Загрузит");
jButton4.setText("Таблица");
jButton17.setText("Свяжитесь с нами");
jButton6.setText("Выход");
jMenuItem1.setText("Выход");
jLabel11.setText("Имя и фамилию:");
jLabel4.setText("Введите ИД:");
jLabel5.setText("E-Mail:");
jLabel9.setText("Работа:");
jLabel10.setText("Зарплата:");
jLabel6.setText("Пол");
jrdbmale.setText("Мужской");
jrdbFemale.setText("Женский");
jrdbPerHour.setText("В час");
jrdbPerMonth.setText("В месяц");
jButton9.setText("Добавить");
jLabel7.setText("Загрузиты");
jLabel8.setText("Введите имя файла");
jButton7.setText("Сохранить");
jButton10.setText("Загрузка");
jButton12.setText("Удалить");
jButton13.setText("Выход");
jLabel19.setText("Список рабочих:");
jLabel20.setText("Свяжитесь с нами");
jMenuItem9.setText("Свяжитесь с нами");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
jMenu1.setText("Options");
jMenu2.setText("Languages");
jButton1.setText("Add");
jButton3.setText("Load");
jButton4.setText("Table");
jButton17.setText("Contact");
jButton6.setText("Exit");
jMenuItem1.setText("Exit");
jLabel11.setText("Enter First and Last Name:");
jLabel4.setText("Enter ID:");
jLabel5.setText("Enter Email:");
jLabel9.setText("Enter Job:");
jLabel10.setText("Salary:");
jLabel6.setText("Choose gender");
jrdbmale.setText("Male");
jrdbFemale.setText("Female");
jrdbPerHour.setText("Per Hour");
jrdbPerMonth.setText("Per Month");
jButton9.setText("Add Employee");
jLabel7.setText("Load Employee");
jLabel8.setText("Enter file's name");
jButton7.setText("Save");
jButton10.setText("Load");
jButton12.setText("Remove");
jButton13.setText("Exit");
jLabel19.setText("Worker List:");
jLabel20.setText("Contact us at:");
jMenuItem9.setText("Contact");
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
jMenu1.setText("Methods..");
jMenu2.setText("Lingo");
jButton1.setText("Add jack tar");
jButton3.setText("Load t' six pounder");
jButton4.setText("Th' Table");
jButton17.setText("Contact th' cap'n");
jButton6.setText("Belay ye Adventure");
jMenuItem1.setText("Belay ye Adventure");
jLabel11.setText("Enter first 'n last name:");
jLabel4.setText("Enter yer Number o' Identification:");
jLabel5.setText("Enter yer Mail:");
jLabel9.setText("Enter wha' he'll do:");
jLabel10.setText("Coins:");
jLabel6.setText("Choose gender");
jrdbmale.setText("sailor");
jrdbFemale.setText("sailorrin");
jrdbPerHour.setText("Per Hour");
jrdbPerMonth.setText("Per Month");
jButton9.setText("Add jack tar");
jLabel7.setText("Load jack tar");
jLabel8.setText("Enter d' name");
jButton7.setText("Save");
jButton10.setText("Load");
jButton12.setText("Send 'em away");
jButton13.setText("Belay ye Adventure");
jLabel19.setText("Sailors:");
jLabel20.setText("Contact yer capn'");
jMenuItem9.setText("Contact yer capn'");
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
jMenu1.setText("オプション");
jMenu2.setText("言語");
jButton1.setText("追加");
jButton3.setText("ロード");
jButton4.setText("表");
jButton17.setText("コンタクト");
jButton6.setText("出口");
jMenuItem1.setText("出口");
jLabel11.setText("姓名を入力してください:");
jLabel4.setText("ID番号を入力してください:");
jLabel5.setText("メール:");
jLabel9.setText("ジョブ:");
jLabel10.setText("俸給:");
jLabel6.setText("性別を選択してください");
jrdbmale.setText("マレ");
jrdbFemale.setText("女性");
jrdbPerHour.setText("1時間");
jrdbPerMonth.setText("毎月");
jButton9.setText("従業員を追加します");
jLabel7.setText("ロード従業員");
jLabel8.setText("ファイル名を入力してください");
jButton7.setText("セーブ");
jButton10.setText("ロード");
jButton12.setText("削除");
jButton13.setText("出口");
jLabel19.setText("労働者のリスト:");
jLabel20.setText("コンタクト");
jMenuItem9.setText("コンタクト");
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
jMenu1.setText("Опції");
jMenu2.setText("Мови");
jButton1.setText("Додавати");
jButton3.setText("Навантаження");
jButton4.setText("таблиця");
jButton17.setText("Зв'яжіться з нами");
jButton6.setText("Вихід");
jMenuItem1.setText("Вихід");
jLabel11.setText("Введіть ім'я та прізвище:");
jLabel4.setText("Введіть ІД:");
jLabel5.setText("E-Mail:");
jLabel9.setText("Робота:");
jLabel10.setText("Зарплата:");
jLabel6.setText("Стать");
jrdbmale.setText("Чоловік");
jrdbFemale.setText("Жінка");
jrdbPerHour.setText("В годину");
jrdbPerMonth.setText("За місяць");
jButton9.setText("Додати");
jLabel7.setText("Навантаження");
jLabel8.setText("Введіть ім'я файлу");
jButton7.setText("Зберегти");
jButton10.setText("Навантаження");
jButton12.setText("Видалити");
jButton13.setText("Вихід");
jLabel19.setText("Список працівників:");
jLabel20.setText("Зв'яжіться з нами");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jDialog1WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog1WindowActivated
               
        try {
     
            // FileReader Salaryreader = new FileReader("Salary.txt");
             //BufferedReader SalaryBuffreader=new BufferedReader(Salaryreader);
            // FileReader Namesreader = new FileReader("Names.txt");
             //BufferedReader NamesBuffreader=new BufferedReader(Namesreader);
             //FileReader jobsreader = new FileReader("jobs.txt");
            // BufferedReader jobsBuffreader=new BufferedReader(jobsreader);
             FileReader Inforeader = new FileReader("info.txt");
             BufferedReader InfoBuffreader=new BufferedReader(Inforeader);
             DefaultListModel item=new DefaultListModel();
             //DefaultListModel item1=new DefaultListModel();
            // DefaultListModel item2=new DefaultListModel();
             //String Names=NamesBuffreader.readLine();
             
             while(InfoBuffreader.ready()){
                 item.addElement(InfoBuffreader.readLine());
                // item1.addElement(jobsBuffreader.readLine());
                  //item2.addElement(SalaryBuffreader.readLine());
             }
             //String Salary=SalaryBuffreader.readLine();
             //String Jobs=jobsBuffreader.readLine();
             
          
          JInfoList.setModel(item);
             //JnameList.setModel(item);
             //JworkList.setModel(item1);
             //JsalaryList.setModel(item2);
            
               
            //SalaryBuffreader.close();
             //NamesBuffreader.close();
             //jobsBuffreader.close();
             
         } catch (Exception e) {
            
         } 
 
                
    }//GEN-LAST:event_jDialog1WindowActivated

    private void jDialog1WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog1WindowOpened
          
                
    }//GEN-LAST:event_jDialog1WindowOpened

    private void jDialog1WindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog1WindowDeactivated
        // TODO add your handling code here:
    }//GEN-LAST:event_jDialog1WindowDeactivated

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
  jDialog4.setVisible(true);
      jDialog4.pack();
      
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
jButton4.setToolTipText("This feature will be open in the future ");
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
jButton1.setToolTipText("Add an employee ");
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
 jButton3.setToolTipText("Load employee or change employee's data ");
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseEntered
jButton17.setToolTipText("Contact us if you want to report a bug/give us some new ideas ");
    }//GEN-LAST:event_jButton17MouseEntered

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
jButton6.setToolTipText("Exit the program ");
    }//GEN-LAST:event_jButton6MouseEntered

    private void jMenu2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseEntered
jMenu2.setToolTipText("You can change the program's language ");
    }//GEN-LAST:event_jMenu2MouseEntered

    private void jMenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseEntered
jMenu1.setToolTipText("Shows you the options ");
    }//GEN-LAST:event_jMenu1MouseEntered

    private void jMenuItem9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem9MouseEntered
jMenuItem9.setToolTipText("Contact us if you want to report a bug/give us some new ideas ");
    }//GEN-LAST:event_jMenuItem9MouseEntered

    private void jMenuItem1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseEntered
jMenuItem1.setToolTipText("Exit the program ");
    }//GEN-LAST:event_jMenuItem1MouseEntered


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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList JInfoList;
    private javax.swing.JTextArea JWorkerList1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JRadioButton jrdbFemale;
    private javax.swing.JRadioButton jrdbPerHour;
    private javax.swing.JRadioButton jrdbPerMonth;
    private javax.swing.JRadioButton jrdbmale;
    private javax.swing.JTextField jtxtID;
    private javax.swing.JTextField jtxtMail;
    private javax.swing.JTextField jtxtMail1;
    private javax.swing.JTextField jtxtMail2;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JTextField jtxtjob;
    private javax.swing.JTextField jtxtsalary;
    // End of variables declaration//GEN-END:variables

    private URL getCodeBase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ICON-Sparrow.png")));
    }

   
    static class Visible {

        public Visible() {
        }
    }
}
