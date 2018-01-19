
public class BatterCard extends BaseballCard{
    //batting average
    private double avg;
    //at bats, runs scored, home runs, runs batted in, stolen bases
    private int ab, r, hr, rbi, sb;
    
    public BatterCard(int v, int c, String img, String n, String t, String p, double avge, int atb, int ru, int hru, int rubi, int stb){
        super(v, c, img, n, t, p);
        avg = avge;
        ab = atb;
        r = ru;
        hr = hru;
        rbi = rubi;
        sb = stb;
    }
    
    public String getPosition(){
        return position;
    }
    
    public String toString(){
        //call parent's toString and add individual properties
        String s = super.toString();
        s += "\nAt Bats: " + ab;
        s += "\nBatting Average: " + avg;
        s += "\nRuns: " + r;
        s += "\nHome Runs: " + hr;
        s += "\nRuns Batted In: " + rbi;
        s += "\nStolen Bases: " + sb;
        return s;
    }
    
    public double getAverage(){
        return avg;
    }
    
    public int getAtBats(){
        return ab;
    }
    
    public int getRuns(){
        return r;
    }
    
    public int getHomeRuns(){
        return hr;
    }
    
    public int getRunsBatIn(){
        return rbi;
    }
    
    public int getStolenBases(){
        return sb;
    }
    
}
