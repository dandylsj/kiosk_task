package lv5_KioskRefactoring;

import java.util.ArrayList;
import java.util.List;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        List <MenuItem> burgerItems = new ArrayList<>(); //버거하위메뉴 리스트
        burgerItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("Hamburger", 6.9, "비프패티를 기반으로 야채가 들어간 기본버거"));
        List <MenuItem> drinkItems = new ArrayList<>();//음료하위메뉴 리스트
        drinkItems.add(new MenuItem("아메리카노",4.0,"초콜릿 견과류 느낌이 나는 커피"));
        drinkItems.add(new MenuItem("카페라떼",5.5,"초콜릿 커피향과 우유가 어우러진 고소한 라떼"));
        drinkItems.add(new MenuItem("자몽에이드",6.4,"직접만든 자몽청이 들어간 깔끔한 에이드"));
        drinkItems.add(new MenuItem("자바칩프라푸치노",7.0,"벨기에 초콜렛이 들어간 고급스러운 프라푸치노"));
        List <MenuItem> dessertItem = new ArrayList<>();// 디저트하위 리스트
        dessertItem.add(new MenuItem("바스크치즈케이크",7.4,"오븐에 구워 풍미있는 치즈케이크"));
        dessertItem.add(new MenuItem("초코케이크",6.4,"벨기에 초콜렛이 함유된 쫀득한 초코케이크"));
        dessertItem.add(new MenuItem("크로아상",4.2,"프랑스 버터를 블렌딩하여 바삭하고 풍미있는 크로아상"));
        dessertItem.add(new MenuItem("샌드위치",8.4,"시그니처 소스가 들어간 샌드위치"));

        List <Menu> menuList = new ArrayList<>(); //메뉴 리스트 (상위메뉴)
        menuList.add(new Menu("Burger",burgerItems));
        menuList.add(new Menu("Drink",drinkItems));
        menuList.add(new Menu("Dessert",dessertItem));

        Kiosk kiosk = new Kiosk(menuList); //키오스크 인스턴스를  menuList를 주입하여 생성

        kiosk.start(); //키오스크 기능 시작


    }





}