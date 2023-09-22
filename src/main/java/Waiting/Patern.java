package Waiting;

public class Patern {
    private int id;

    private static Patern pat;

    public static Patern getInstant(int id){
        if(pat == null){
            pat = new Patern(id);
        }
        return(pat);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Patern(int id) {
        this.id = id;
    }
}
