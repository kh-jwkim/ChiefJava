package org.chief.miniproject.FarmingMudGame;

public class LabeledContinueExample {
    public static void main(String[] args) {
        outerLoop: // 레이블 정의
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break outerLoop; // outerLoop 레이블이 붙은 루프의 다음 반복으로 건너뜀
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
