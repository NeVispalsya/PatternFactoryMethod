package app;

public class Car implements Transport{
    @Override
    public void move() {
        System.out.println("Машина едет по дороге...");
    }
}
