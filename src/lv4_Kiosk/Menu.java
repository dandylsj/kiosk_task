package lv4_Kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    //1.속성 (Field)
    private String topMenu;
    private List<MenuItem> menuItems;// Main의 menuItem을 불러오기  //MenuItem을 관리하는 리스트가 필드로 존재합니다

    //2.생성자 (Constructor)
    //List<MenuItem> 은 Kiosk 클래스가 관리하기에 적절하지 않으므로 Menu 클래스가 관리하도록 변경합니다.
    Menu(String topMenu,List<MenuItem> menuItems) {
        this.topMenu = topMenu;
        this.menuItems = menuItems;
    }
    // List<필기구들>

    //3.기능 (Method)
    String getTopMenu() {
        return topMenu;
    }

   //메개변수를 활용하면 된다..
   //음료도 출력할수 있고  디저트도 출력할 수 있게 만들면..

    //하나에 음료 디저트를 넣을 수 있다고?
    void subMenuItems() {
        System.out.println("[ SHAKESHACK MENU ]");
        for (int j = 0; j < menuItems.size(); j++) {  //메뉴 출력 for 문
            System.out.println(j + 1 + "." + menuItems.get(j).getName() + "\t | W" + menuItems.get(j).getPrice() + " | " + menuItems.get(j).getContent() + "|");
        }
        System.out.println("0 을 누르면 키오스크를 종료합니다.");
        System.out.println("원하는 메뉴의 번호를 선택하면 자세한 설명이 나옵니다.");
    }

//int selectMenuNumber = sc.nextInt(); //메뉴 숫자를 받아 출력
//        if (selectMenuNumber == 0) {
//        System.out.println("키오스크를 종료합니다.");
//        System.exit(0); //시스템 종료 선언
//    } else { // 정수를 입력할 경우 해당 숫자의 메뉴 번호를 출력함
//        System.out.println((selectMenuNumber) + "." + menuItems.get(selectMenuNumber - 1).getName() + "\t | W" + menuItems.get(selectMenuNumber - 1).getPrice() + " | " + menuItems.get(selectMenuNumber - 1).getContent() + "|");

}
