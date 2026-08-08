package OOPs;

public class InterfacesOOPs {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayes{
    void moves();
}

class Queen implements ChessPlayes{
    public void moves(){
        System.out.println("up , down , left , right, diagonal(in all 4 direction)");
    }
}

class Rook implements ChessPlayes{
    public void moves(){
        System.out.println("up , down , left , right");
    }
}

class King implements ChessPlayes{
    public void moves(){
        System.out.println("up , down , left , right, diagonal(by one steps)");
    }
}


