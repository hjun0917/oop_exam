package oop;

public class Taxi extends Vehicle {
    String destination;
    int normalDistance = 1;
    int totalDistance;
    int normalPrice = 3000;
    int overPrice = 1000;
    int totalPrice;
    int stackPrice;
    String condition = "일반";

    Taxi() {
        maxPassenger = 4;
    }

    void run() {
        if (isCondition(gas)) {
            condition = "일반";
        } else {
            useGas(gas);
        }
    }

    void useGas(int gas) {
        this.gas -= gas;
        if (!isCondition(this.gas)) {
            condition = "운행불가";
            totalPrice = 0;
            nowPassenger = 0;
            totalDistance = 0;
            destination = null;
        }
    }

    void chargeGas(int gas) {
        this.gas += gas;
    }

    void takePassenger(int passenger, String destination, int totalDistance) {
        if (checkPassenger(passenger)) {
            condition = "운행중";
            nowPassenger = passenger;
            this.destination = destination;
            this.totalDistance = totalDistance;
            if (totalDistance > normalDistance) {
                int overCharge = checkOver(totalDistance, normalDistance);
                totalPrice = normalPrice + overCharge;
                stackPrice += totalPrice;
            }
        } else {
            System.out.println("최대 승객 수 초과");
        }
    }

    void dropPassenger() {
        condition = "일반";
        totalPrice = 0;
        nowPassenger = 0;
        totalDistance = 0;
        destination = null;
    }

    int checkOver(int totalDistance, int normalDistance) {
        int overDistance = totalDistance - normalDistance;
        int overCharge = this.overPrice * overDistance;
        return overCharge;
    }


}
