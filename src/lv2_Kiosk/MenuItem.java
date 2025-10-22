package lv2_Kiosk;

import java.util.ArrayList;

/**
 * - [ ]  객체 지향 개념을 학습하고, 데이터를 구조적으로 관리하며 프로그램을 설계하는 방법을 익힙니다.
 * - [ ]  햄버거 메뉴를 `MenuItem` 클래스와 `List`를 통해 관리합니다.
 * ---
 * - [ ]  **`MenuItem` 클래스 생성하기**
 *     - [ ]  설명 : 개별 음식 항목을 관리하는 클래스입니다. 현재는 햄버거만 관리합니다.
 *     - [ ]  클래스는 `이름`, `가격`, `설명` 필드를 갖습니다.
 * - [ ]  `main` 함수에서 `MenuItem` 클래스를 활용하여 햄버거 메뉴를 출력합니다.
 *     - [ ]  `MenuItem` 객체 생성을 통해 `이름`, `가격`, `설명`을 세팅합니다.
 *         - [ ]  키워드: `new`
 *     - [ ]  `List`를 선언하여 여러 `MenuItem`을 추가합니다.
 *         - [ ]  `List<MenuItem> menuItems = new ArrayList<>();`
 *     - [ ]  반복문을 활용해 `menuItems`를 탐색하면서 하나씩 접근합니다.
 */
public class MenuItem {
    ArrayList<String> resultsList = new ArrayList<>(); //리스트 인스턴스
    int SelectMenuNumber; //메뉴 번호 변수

    public ArrayList<String> resulstList(){ //배열에 메뉴 저장하기
        return resultsList;  //저장한값 반환
    }


//    public int getSelectMenuNumber(int SelectMenuNumber) {//선택한 메뉴의 숫자를 저장한다.
//        return resultList(SelectMenuNumber);
//    }

//    public String firstHamberger() {
//        System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
//        return firstHamberger();
//    }

    //위에서 입력한 정수 값에 맞는 메뉴를 출력해줌
    public void menuSelect(int selectMenuNumber) { //Main 에서 받은 정수값을 넣어준다.
        switch (selectMenuNumber) { //정수값을 스위치 문을 통해 비교한다.
            case (1):
                String firstHamberger = "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거 ";
                resultsList.add(firstHamberger); //배열에 햄버거 설명 저장
                break;
            case (2):
                String secondHamberger = "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거";
                resultsList.add(secondHamberger);
                break;
            case (3):
                String thirdHamberger = "3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거";
                resultsList.add(thirdHamberger);
                break;
            case (4):
                String fourthHamberger = "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거";
                resultsList.add(fourthHamberger);
                break;
            case (0):
                System.out.println("0.키오스크를 종료합니다.");
                System.exit(0); //시스템 종료 선언
                break;
            default:
                System.out.println("잘못된 입력값 입니다."); //다른값을 입력하면 다시 선택할 수 있게함
                break;
        }
    }

}




