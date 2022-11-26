package oop;

public class Vehicle {
    int vehicleNum;
    int gas = 100;
    int speed;
    int maxPassenger;
    int nowPassenger;

    // 객체를 생성할 때, 차량 번호를 부여함.
    Vehicle() {
        vehicleNum = makeVehicleNum();
    }

    // 차량번호 만들기. 중복값을 최대한 없애기 위하여 4자리 수로 만들어 줌.
    int makeVehicleNum() {
        int[] nums = new int[4];
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            nums[i] = (int) (Math.random() * 10);
            if (nums[0] == 0) {
                i = 0;
                continue;
            }
            word.append(nums[i]);
        }
        this.vehicleNum = Integer.parseInt(word.toString());

        return this.vehicleNum;
    }

    // 상태 변경
    static boolean isCondition(int gas) {
        // 가스가 10 미만이면 운행 X
        if (gas > 10) {
            return true;
        }
        System.out.println("가스를 충전해주세요.");
        return false;
    }

    // 승객 탑승
    boolean checkPassenger(int inPassenger) {
        return this.maxPassenger >= inPassenger;
    }
}
