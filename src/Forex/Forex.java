package Forex;

public class Forex {
    public void forex(int amount, String CurType) {
        Double Cur = 0d;
        float Ans = 0f;
        switch (CurType){
            case "WON":
                Cur = 33.72d;
                break;
            case "USD":
                Cur = 0.028d;
                break;
            case "YEN":
                Cur = 3.4d;
                break;
            default:
                System.out.println("Currency type not recognized");
                return;
        }

        Ans = (float) (amount*Cur);
        System.out.println(Ans+" "+ CurType);
    }
}
