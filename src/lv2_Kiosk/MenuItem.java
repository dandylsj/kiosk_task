package lv2_Kiosk;

import java.awt.*;
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
    //1.속성
    private String name;  //메뉴 이름 문자 속성
    private double price; //메뉴 가격 double 속성
    private String content; //메뉴 내용 문자 속성

    //2.생성자
    MenuItem(String name, double price, String content) {
        this.name = name;
        this.price = price;
        this.content = content;
    }


    //3.기능
    String getName() { //public 이라는 것은 다른 lv의 키오스크 에서도 접근이 가능하기 때문에 안된다.

        return name;
    }
    double getPrice() {

        return price;
    }
    String getContent() {
        return content;
    }



}




