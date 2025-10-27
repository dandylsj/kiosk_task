package lv4_Kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//설명: 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스입니다.
public class Kiosk {

    //1.속성 (Field)
    List <Menu> topMenu; //카테고리 메뉴(상위 메뉴)의 배열을 불러옴
    Scanner sc = new Scanner(System.in); // Scanner 선언


    //2.생성자 (Constructor)
    Kiosk(List<Menu> topMenu) {  //List<MenuItem> menuItems 는 Kiosk 클래스 생성자를 통해 값을 할당합니다.

        this.topMenu = topMenu;
    }


    //3. 기능 (Method)
    public void start() { //main 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수를 만들어 관리합니다.

        Menu menu1 = topMenu.get(0);//카테고리 메뉴의 0번째 배열 불러오기

        //MenuItem 클래스 인스턴스

        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        while (true) {
            System.out.println("[ MAIN MENU ]"); //카테고리 메뉴(상위 메뉴) 출력  for문을 사용하여 List의 메뉴를 출력합니다.
            for (int i = 0; i < topMenu.size(); i++) {
                System.out.println(i + 1 + "." + topMenu.get(i).getTopMenu());
            }
            System.out.println("0 을 누르면 키오스크를 종료합니다.");
            int selectTopMenuNumber = sc.nextInt(); //스캐너에 넣은 정수값을 selectTopMenuNumber 에 넣는다.
            if (selectTopMenuNumber == 0) {  //0번 값을 입력하면  키오스크를 종료하도록 한다.
                System.out.println("키오스크를 종료합니다.");
                System.exit(0); //시스템 종료 선언
            } else if(selectTopMenuNumber == 1){ //1을 누를경우 1번의 버거 하위메뉴들이 출력된다.
                System.out.println("[" +  topMenu.get(0).getTopMenu() + "MENU" + "]");
                menu1.burgerMenuItems();
            } else if(selectTopMenuNumber == 2) { //2를 누를경우 2번의 음료 하위메뉴들이 출력된다.
                System.out.println("[" +  topMenu.get(1).getTopMenu() + "MENU" + "]");
                menu1.drinkMenuItems();
            } else if(selectTopMenuNumber == 3) { //3을 누를경우 3번의 디저트 하위메뉴들이 출력된다.
                System.out.println("[" +  topMenu.get(2).getTopMenu() + "MENU" + "]");
                menu1.dessertMenuItems();
            }

        }
    }
}
