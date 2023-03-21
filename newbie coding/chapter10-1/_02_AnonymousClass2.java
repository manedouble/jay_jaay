package chap_10;


public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("---------");

        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();
    }

    private static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집 군대리아");
                System.out.println("빵, 패티, 샐러드");

            }
        };
    }

    public static HomeMadeBurger getMomMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 수제 버거");
                System.out.println("재료 : 빵, 패티, 양상추, 피클");
            }
        };
    }
}

abstract class HomeMadeBurger {
    public abstract void cook();
}