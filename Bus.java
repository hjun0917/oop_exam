package oop;

public class Bus extends Vehicle {
    int price = 1000;
    int money;
    String condition = "운행";

    Bus() { maxPassenger = 30; }

    void run(int speed) {
        if (isCondition(gas) && checkPassenger(nowPassenger)) {
            condition = "운행";
            plusSpeed(speed);
        }
    }

    void takePassenger(int newPassenger) {
        if (maxPassenger >= nowPassenger+newPassenger) {
            nowPassenger += newPassenger;
            money += newPassenger*price;
        } else {
            System.out.println("최대 승객 수 초과");
        }
    }

    void useGas(int gas) {
        this.gas -= gas;
        if(!isCondition(this.gas)) {
            money = 0;
            nowPassenger = 0;
            speed = 0;
            condition = "차고지로";
        };
    }

    void chargeGas(int gas) {
        this.gas += gas;
    }

    void plusSpeed(int speed) {
        this.speed = this.speed + speed;
    }

    int minusSpeed(int speed) {
        this.speed = this.speed - speed;
        if (this.speed <= 0) {
            Bus bus = new Bus();
            this.speed = 0;
            money = 0;
            nowPassenger = 0;
            condition = "차고지로";
        }
        return this.speed;
    }


}
