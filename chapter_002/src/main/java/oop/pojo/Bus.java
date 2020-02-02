package oop.pojo;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Bus from A to Z");
    }

    @Override
    public void passengers(int count) {
        System.out.println("with" + count + "passengers");

    }

    @Override
    public int refill(int liters) {
        int x = liters * 30;
        return x;
    }
}
