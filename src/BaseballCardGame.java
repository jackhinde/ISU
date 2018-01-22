
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import javax.swing.JOptionPane;

public class BaseballCardGame extends javax.swing.JFrame {

    HashMap<Integer, BaseballCard> m = new HashMap<Integer, BaseballCard>();
    ArrayList list;
    ListIterator it;
    int money = 15;
    int numcards = 0;
    int cur;
    BaseballCard bc;
    int r;
    
    public BaseballCardGame() {
        initComponents();
        //adding players to map of baseball card classes
        //key is the card number
        //                                 int v, int c, String img, String n, String t, String p, double avge, int atb, int ru, int hru, int rubi, int stb
        m.put(new Integer(1), new BatterCard(75, 1, "altuve.JPG", "Jose Altuve", "HOU", "2B", .346, 590, 112, 24, 81, 32));
        m.put(new Integer(2), new BatterCard(50, 2, "trout.jpg", "Mike Trout", "LAA", "OF", .306, 402, 92, 33, 72, 22));
        m.put(new Integer(3), new BatterCard(50, 3, "arenado.jpg", "Nolan Arenado", "COL", "3B", .309, 606, 100, 37, 130, 3));
        m.put(new Integer(4), new BatterCard(30, 4, "judge.JPG", "Aaron Judge", "NYY", "OF", .284, 542, 128, 54, 114, 9));
        m.put(new Integer(5), new BatterCard(25, 5, "donaldson.jpg", "Josh Donaldson", "TOR", "3B", .270, 415, 65, 33, 78, 2));
        m.put(new Integer(6), new BatterCard(25, 6, "stanton.jpg", "Giancarlo Stanton", "MIA", "OF", .281, 597, 123, 59, 132, 2));
        m.put(new Integer(7), new BatterCard(5, 7, "lindor.jpg", "Francisco Lindor", "CLE", "SS", .273, 651, 99, 33, 89, 15));
        m.put(new Integer(8), new BatterCard(1, 8, "posey.jpg", "Buster Posey", "SF", "C", .320, 494, 62, 12, 67, 6));
        m.put(new Integer(9), new BatterCard(1, 9, "goldschmidt.jpg", "Paul Goldschmidt", "ARI", "1B", .297, 558, 117, 36, 120, 18));
        m.put(new Integer(10), new BatterCard(1, 10, "votto.jpg", "Joey Votto", "CIN", "1B", .320, 559, 106, 36, 100, 5));
        m.put(new Integer(11), new PitcherCard(75, 11, "kershaw.jpg", "Clayton Kershaw", "LAD", "SP", 175.0, 2.31, .95, 18, 202, 0));
        m.put(new Integer(12), new PitcherCard(50, 12, "scherzer.jpg", "Max Scherzer", "WAS", "SP", 200.2, 2.51, .9, 16, 268, 0));
        m.put(new Integer(13), new PitcherCard(50, 13, "jansen.jpg", "Kenley Jansen", "LAD", "RP", 68.1, 1.32, .75, 5, 109, 41));
        m.put(new Integer(14), new PitcherCard(30, 14, "kluber.jpg", "Corey Kluber", "CLE", "SP", 203.2, 2.25, .87, 18, 265, 0));
        m.put(new Integer(15), new PitcherCard(25, 15, "kimbrel.jpg", "Craig Kimbrel", "BOS", "RP", 69.0, 1.43, .68, 5, 126, 35));
        m.put(new Integer(16), new PitcherCard(25, 16, "sale.jpg", "Chris Sale", "BOS", "SP", 214.1, 2.90, .97, 17, 308, 0));
        m.put(new Integer(17), new PitcherCard(5, 17, "keuchel.jpg", "Dallas Keuchel", "HOU", "SP", 145.2, 2.90, 1.12, 14, 125, 0));
        m.put(new Integer(18), new PitcherCard(1, 18, "verlander.jpg", "Justin Verlander", "HOU", "SP", 206.0, 3.36, 1.17, 15, 219, 0));
        m.put(new Integer(19), new PitcherCard(1, 19, "chapman.jpg", "Aroldis Chapman", "NYY", "RP", 50.1, 3.22, 1.13, 4, 69, 22));
        m.put(new Integer(20), new PitcherCard(1, 20, "strasburg.jpg", "Stephen Strasburg", "WAS", "SP", 175.1, 2.52, 1.02, 15, 204, 0));
        list = new ArrayList();
        it = list.listIterator();
        lblmoney.setText("" + money);
        lblnumcards.setText("" + numcards);
        cur = 0;
        //test
        add(6);
        show(bc);
        numcards = 1;
    }
    
    public void show(BaseballCard c){
        //update card stats onto screen
        lblname.setText(c.getName());
        lblposition.setText(c.getPosition());
        lblteam.setText(c.getTeam());
        lblvalue.setText("" + c.getValue());
        lblcardnum.setText("" + c.getCardNumber());
        lblimage.setIcon(c.getImage());
        //still must do pitcher and batter stats
        /*if(c instanceof BatterCard){
            lblaverage.setText("" + c.getAverage());
            
        }
        if(c instanceof PitcherCard){
            
        }
        */
    }
    
    public void add(int r){
        if(numcards==0){
            cur++;
        }
        //get with key and assign to BaseballCard bc
        bc = m.get(r);
        //advance to end of list to add new card
        while(it.hasNext()){
            it.next();
        }
        it.add(bc);
        numcards++;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblname = new javax.swing.JLabel();
        lblvalue = new javax.swing.JLabel();
        lblcardnum = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblimage = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblposition = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblatbats = new javax.swing.JLabel();
        lblaverage = new javax.swing.JLabel();
        lblruns = new javax.swing.JLabel();
        lblhomeruns = new javax.swing.JLabel();
        lblrunsbattedin = new javax.swing.JLabel();
        lblstolenbases = new javax.swing.JLabel();
        lblinnings = new javax.swing.JLabel();
        lblwins = new javax.swing.JLabel();
        lblearnedruns = new javax.swing.JLabel();
        lblwalksandhits = new javax.swing.JLabel();
        lblstrikeouts = new javax.swing.JLabel();
        lblsaves = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblteam = new javax.swing.JLabel();
        btnprevious = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblmoney = new javax.swing.JLabel();
        btnbuy = new javax.swing.JButton();
        btnsell = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblnumcards = new javax.swing.JLabel();
        btnexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblvalue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblcardnum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Name:");

        jLabel5.setText("Value:");

        jLabel6.setText("Card Number:");

        lblimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("Position:");

        lblposition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setText("AB:");

        jLabel11.setText("AVG:");

        jLabel12.setText("R:");

        jLabel13.setText("HR:");

        jLabel14.setText("RBI:");

        jLabel15.setText("SB:");

        jLabel16.setText("IP:");

        jLabel17.setText("W:");

        jLabel18.setText("ERA:");

        jLabel19.setText("WHIP:");

        jLabel20.setText("K:");

        jLabel21.setText("SV:");

        jLabel3.setText("Team:");

        lblteam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblteam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblcardnum, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblposition, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblhomeruns, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel19))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 7, Short.MAX_VALUE)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblruns, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(56, 56, 56)
                                                .addComponent(jLabel18))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel14))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblstolenbases, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                            .addComponent(lblrunsbattedin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblatbats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblaverage, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                                        .addGap(66, 66, 66)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblinnings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblwins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblearnedruns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblwalksandhits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblstrikeouts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblsaves, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblposition, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblteam, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel3))
                    .addComponent(lblcardnum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel10)
                        .addComponent(lblinnings))
                    .addComponent(lblatbats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblaverage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel17)
                        .addComponent(lblwins)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel18)
                    .addComponent(lblruns)
                    .addComponent(lblearnedruns))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel19)
                    .addComponent(lblhomeruns)
                    .addComponent(lblwalksandhits))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel20)
                    .addComponent(lblrunsbattedin)
                    .addComponent(lblstrikeouts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel21)
                    .addComponent(lblstolenbases)
                    .addComponent(lblsaves))
                .addContainerGap())
        );

        btnprevious.setText("<");
        btnprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviousActionPerformed(evt);
            }
        });

        btnnext.setText(">");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Money:");

        lblmoney.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnbuy.setText("Buy pack for $15");
        btnbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuyActionPerformed(evt);
            }
        });

        btnsell.setText("Sell Card");
        btnsell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsellActionPerformed(evt);
            }
        });

        jLabel2.setText("Number of Cards:");

        lblnumcards.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsell, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnbuy))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblnumcards, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnumcards, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(lblmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsell)
                    .addComponent(btnbuy))
                .addGap(29, 29, 29))
        );

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnprevious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnnext))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(btnprevious))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(btnnext))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnexit)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        if(cur==numcards) return;
        cur++;
        it.next();
        it.next();
        bc = (BaseballCard) it.previous();
        show(bc);
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviousActionPerformed
        if(cur==1) return;
        cur--;
        bc = (BaseballCard) it.previous();
        show(bc);
    }//GEN-LAST:event_btnpreviousActionPerformed

    private void btnsellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsellActionPerformed
        //ensure that there are cards
        if(numcards==0) return;
        //collect baseball card
        bc = (BaseballCard)it.next();
        //add value of sold card to money
        money += bc.getValue();
        //remove card
        it.remove();
        //update money
        lblmoney.setText("" + money);
        //update number of cards
        numcards--;
        lblnumcards.setText("" + numcards);
        //exit if selling the last card
        if(numcards == 0){
            lblname.setText("");
            lblposition.setText("");
            lblteam.setText("");
            lblvalue.setText("");
            lblcardnum.setText("");
            lblimage.setIcon(null);
            //still must do pitcher and batter stats
            /*if(c instanceof BatterCard){
                lblaverage.setText("" + c.getAverage());
            
            }
            if(c instanceof PitcherCard){
            
            }
            */
            return;
        }
        //check to see if at front of card list
        else if(cur > 1){
            bc = (BaseballCard)it.previous();
            cur--;
        }
        else{
            it.next();
            bc = (BaseballCard)it.previous();
        }
        show(bc);
    }//GEN-LAST:event_btnsellActionPerformed

    private void btnbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuyActionPerformed
        BaseballCard bca, bcb, bcc, bcd, bce;
        money -=15;
        lblmoney.setText("$" + money);
        numcards+=5;
        lblnumcards.setText("" + numcards);
        r = (int)Math.random()*20 + 1;
        while(it.hasNext()){
            it.next();
        }
        add(r);
        it.next();
        bca = (BaseballCard)it.previous();
        //repeat for second card
        r = (int)Math.random()*20 + 1;
        while(it.hasNext()){
            it.next();
        }
        add(r);
        it.next();
        bcb = (BaseballCard)it.previous();
        //repeat for third card
        r = (int)Math.random()*20 + 1;
        while(it.hasNext()){
            it.next();
        }
        add(r);
        it.next();
        bcc = (BaseballCard)it.previous();
        //repeat for fourth card
        r = (int)Math.random()*20 + 1;
        while(it.hasNext()){
            it.next();
        }
        add(r);
        it.next();
        bcd = (BaseballCard)it.previous();
        //repeat for fifth card
        r = (int)Math.random()*20 + 1;
        while(it.hasNext()){
            it.next();
        }
        add(r);
        it.next();
        bce = (BaseballCard)it.previous();
        //show the new cards
    }//GEN-LAST:event_btnbuyActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaseballCardGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuy;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprevious;
    private javax.swing.JButton btnsell;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblatbats;
    private javax.swing.JLabel lblaverage;
    private javax.swing.JLabel lblcardnum;
    private javax.swing.JLabel lblearnedruns;
    private javax.swing.JLabel lblhomeruns;
    private javax.swing.JLabel lblimage;
    private javax.swing.JLabel lblinnings;
    private javax.swing.JLabel lblmoney;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblnumcards;
    private javax.swing.JLabel lblposition;
    private javax.swing.JLabel lblruns;
    private javax.swing.JLabel lblrunsbattedin;
    private javax.swing.JLabel lblsaves;
    private javax.swing.JLabel lblstolenbases;
    private javax.swing.JLabel lblstrikeouts;
    private javax.swing.JLabel lblteam;
    private javax.swing.JLabel lblvalue;
    private javax.swing.JLabel lblwalksandhits;
    private javax.swing.JLabel lblwins;
    // End of variables declaration//GEN-END:variables
}
