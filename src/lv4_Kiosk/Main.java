package lv4_Kiosk;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 6.9, "비프패티를 기반으로 야채가 들어간 기본버거"));

//            MenuItem menuItem = new MenuItem("lee",6.5,"아무거나");
//            menuItems.add(menuItem);

        Kiosk kiosk = new Kiosk(menuItems); //Kiosk 객체를 생성하고 사용하는 main 함수에서 객체를 생성할 때 값을 넘겨줍니다.

        kiosk.start();
    }
}


