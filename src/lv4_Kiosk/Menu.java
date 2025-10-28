package lv4_Kiosk;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    //1.속성 (Field)
    // 1)MenuItem클래스 에서
    private String category;
    private List<MenuItem> menuItems;

    //2.생성자 (Constructor)
    //List<MenuItem> 은 Kiosk 클래스가 관리하기에 적절하지 않으므로 Menu 클래스가 관리하도록 변경합니다.

    Menu(String category, List<MenuItem> menuItems) {
        this.category = category;
        this.menuItems = menuItems;
    }
    // List<필기구들>

    //3.기능 (Method)
    void printMenuItems() {  //향상된 for문은 숫자를 어떻게 표시해야하나
        System.out.printf("\n[%s MENU]\n",category);
        for (MenuItem menuItems : menuItems) {  //해당 리스트나 배열을 읽어들일때는 향상된 for문을 사용한다.
            System.out.println(menuItems.getName()+ "\t | W" + menuItems.getPrice() + " | " + menuItems.getContent()+ "|");
        }
        System.out.println("0. 뒤로가기");
        System.out.println("선택한 메뉴의 번호를 누르면 출력됩니다.");
    }
    public String getCategory() { //주소값이 아닌 문자가 나올 수 있도록 추가함

        return category;
    }
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }



}