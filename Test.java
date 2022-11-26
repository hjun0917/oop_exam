package oop;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
//        test.moveBus();
        test.moveTaxi();
    }

    public void moveTaxi() {
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();
        System.out.println("택시1 번호 : " + taxi1.vehicleNum);
        System.out.println("택시1 번호 : " + taxi2.vehicleNum);
        System.out.println();

        taxi1.run();
        System.out.println(taxi1.condition);
        System.out.println(taxi1.gas);
        System.out.println();

        taxi1.takePassenger(2, "서울역", 2);
        System.out.println(taxi1.nowPassenger);
        System.out.println(taxi1.maxPassenger - taxi1.nowPassenger);
        System.out.println(taxi1.normalPrice);
        System.out.println(taxi1.destination);
        System.out.println(taxi1.totalDistance);
        System.out.println(taxi1.totalPrice);
        System.out.println(taxi1.condition);
        taxi1.dropPassenger();
        System.out.println();

        taxi1.useGas(80);
        System.out.println(taxi1.gas);
        System.out.println();

        taxi1.chargeGas(20);
        System.out.println(taxi1.gas);
        System.out.println();

        taxi1.takePassenger(5, "홍대", 3);
        System.out.println(taxi1.condition);
        System.out.println();

        taxi1.takePassenger(3, "구로디지털단지역", 12);
        System.out.println(taxi1.nowPassenger);
        System.out.println(taxi1.maxPassenger - taxi1.nowPassenger);
        System.out.println(taxi1.normalPrice);
        System.out.println(taxi1.destination);
        System.out.println(taxi1.totalDistance);
        System.out.println(taxi1.totalPrice);
        System.out.println(taxi1.condition);
        taxi1.dropPassenger();
        System.out.println();

        taxi1.useGas(20);
        System.out.println(taxi1.gas);
        System.out.println();

        taxi1.useGas(20);
        System.out.println(taxi1.condition);
        System.out.println(taxi1.stackPrice);
        System.out.println(taxi1.gas);
    }

    public void moveBus() {
        Bus bus1 = new Bus();
        System.out.println("버스1 번호 : " + bus1.vehicleNum);
        Bus bus2 = new Bus();
        System.out.println("버스2 번호 : " + bus2.vehicleNum);

        bus1.run(30);
        System.out.println("버스 속도 = " + bus1.speed);
        System.out.println();
        bus1.takePassenger(2);
        System.out.println("탑승객 = " + bus1.nowPassenger);
        System.out.println("빈자리 = " + (bus1.maxPassenger - bus1.nowPassenger));
        System.out.println("요금 확인 = " + bus1.money);
        System.out.println();
        bus1.useGas(50);
        System.out.println("가스 잔량 = " + bus1.gas);
        System.out.println();
        bus1.chargeGas(50);
        System.out.println("가스 잔량 = " + bus1.gas);
        System.out.println();
        bus1.useGas(100);
        System.out.println("상태 = " + bus1.condition);
        System.out.println();
        bus1.chargeGas(60);
        System.out.println("가스 잔량 = " + bus1.gas);
        System.out.println();
        bus1.run(30);
        System.out.println("상태 = " + bus1.condition);
        System.out.println("버스 속도 = " + bus1.speed);
        System.out.println();
        bus1.takePassenger(45);
        System.out.println();
        bus1.takePassenger(5);
        System.out.println("탑승 객 = " + bus1.nowPassenger);
        System.out.println("잔여 자리 = " + (bus1.maxPassenger - bus1.nowPassenger));
        System.out.println("받은 요금 = " + bus1.money);
        System.out.println();
        bus1.useGas(55);
        System.out.println("가스 잔량 = " + bus1.gas);
        System.out.println("버스 상태 = " +bus1.condition);
    }
}