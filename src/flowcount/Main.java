package flowcount;

public class Main {

    public static void main (String[] args) {

        // 1. 초기화
        int count = 1;

        // 2. 조건 판단
        while (count <= 10) {

            // 3. 출력 (처리)
            System.out.println(count);

            // 4. 상태 변경 (count = count + 1)
            count++;
        }
        // 5. 종료
        System.out.println("프로그램 종료");
    }
}
