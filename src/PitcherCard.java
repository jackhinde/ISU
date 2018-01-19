
public class PitcherCard extends BaseballCard{
    //innings pitched, earned runs average, walks and hits per innings pitched
    private double ip, era, whip;
    //wins, strikeouts, saves
    private int w, k, sv;
    
    public PitcherCard(int v, int c, String img, String n, String t, String p, double inp, double earra, double wahiip, int wi, int so, int svs){
        super(v, c, img, n, t, p);
        ip = inp;
        era = earra;
        whip = wahiip;
        w = wi;
        k = so;
        sv = svs;
    }
    
    public String getPosition(){
        return position;
    }
    
    public String toString(){
        //call parent's toString and add pitcher properties
        String s = super.toString();
        s += "\nInnings Pitched: " + ip;
        s += "\nWins: " + w;
        s += "\nEarned Run Average: " + era;
        s += "\nWalks and Hits per Innings Pitched: " + whip;
        s += "\nStrikeouts: " + k;
        s += "\nSaves: " + sv;
        return s;
    }
    
    public double getInningsPitched(){
        return ip;
    }
    
    public double getEarnedRunAvg(){
        return era;
    }
    
    public double getWalksandHits(){
        return whip;
    }
    
    public int getWins(){
        return w;
    }
    
    public int getStrikeouts(){
        return k;
    }
    
    public int getSaves(){
        return sv;
    }
    
}
