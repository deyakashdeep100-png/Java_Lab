interface Mango {
    void taste();
}

class Winter implements Mango {
    public void taste() {
        System.out.println("Winter Mango: Sweet and less juicy");
    }
}

class Summer implements Mango {
    public void taste() {
        System.out.println("Summer Mango: Very sweet and juicy");
    }
}

class Interface5 {
    public static void main(String[] args) {
        Winter w = new Winter();
        Summer s = new Summer();

        w.taste();
        s.taste();
    }
}