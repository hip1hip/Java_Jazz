import java.util.Scanner;

import javax.security.auth.Subject;

//서브웨이 알피쥐 게임 
//22.10.12_개발자_홍인표_1차_

public class GameMain {
    public static void main(String[] args) {
        Character character = null;
        SubMenu sm = new SubMenu();
        // SubMenu서브메뉴 = 먹기 쉬기 이동하기 , 애너지 부족 캐릭터 사망 등등

        Scanner se = new Scanner(System.in);
        System.out.println("원하는 주인공을 고르세요.");
        System.out.print("1. 남자\t 2. 여자\t 3.제 3의 성");
        // 1. Men 2. Women 3. Third

        int c = Integer.parseInt(se.nextLine()); // nextLine()메소드는 Enter를 치기 전까지 쓴 문자열 모두 반환한다(공백포함)
        // next()메소드는 공백 전까지 반환
        // Integer는 int 의 래퍼 클래스, 매개변수로 객체를 필요로 할 때
        // 기본형 값이 아닌 객체로 저장해야할 때, 객체 간 비교가 필요할 때
        if (c == 1) {
            character = new Men();
            sm.playGame(character);
        } else if (c == 2) {
            character = new Women();
            sm.playGame(character);
        } else if (c == 3) {
            character = new Third();
            sm.playGame(character);
        } else {
            System.out.println("잘 못 입력하셨습니다.");
        }

        se.close();

    }// main()
}// class