package session1;

public class code_snippet_4_9 {
    enum Cards{
        Spade,Heart,Diamond,CLub
    }

    public static void main(String[] args) {
        Cards card = Cards.Diamond;
        switch (card){
            case Spade:
                System.out.println("Spade");
                break;
            case Heart:
                System.out.println("Heart");
                break;
            case Diamond:
                System.out.println("Diamond");
                break;
            case CLub:
                System.out.println("Club");
                break;
        }
    }
}
