import javax.swing.ImageIcon;

public abstract class BaseballCard {
    //value when reselling card
    protected int value;
    //number in collection
    protected int cardnum;
    //player picture
    protected ImageIcon image;
    //player name
    protected String name;
    //position
    protected String position;
    //team played for
    protected String team;
    
    public BaseballCard(int v, int c, String img, String n, String t, String p){
        //assign values in constructor
        name = n;
        team = t;
        value = v;
        cardnum = c;
        image = new ImageIcon(getClass().getResource(img));
        position = p;
    }
    
    public final String getName(){
        return name;
    }
    
    public final String getTeam(){
        return team;
    }
    
    //child classes will define this
    public abstract String getPosition();
    
    public final int getValue(){
        return value;
    }
    
    public final int getCardNumber(){
        return cardnum;
    }
    
    public final ImageIcon getImage(){
        return image;
    }
    
    public String toString(){
        //display shard properties
        //positional properties will be contained in children's toString
        String s = "Name: " + name + "\n";
        s += "\nPosition: " + position;
        s += "\nValue: " + value;
        s += "\nCard Number: " + cardnum;
        s += "\nTeam: " + team;
        return s;
    }
}
