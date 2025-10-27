package lv4_Kiosk;


import java.util.List;
import java.util.Scanner;

public class Menu {

    //1.속성 (Field)
    Scanner sc = new Scanner(System.in);
    private String topMenu;
    private List<MenuItem> menuItems;
    private List<MenuItem> menuItems1;
    private List<MenuItem> menuItems2;// Main의 menuItem을 불러오기  //MenuItem을 관리하는 리스트가 필드로 존재합니다

    //2.생성자 (Constructor)
    //List<MenuItem> 은 Kiosk 클래스가 관리하기에 적절하지 않으므로 Menu 클래스가 관리하도록 변경합니다.
    Menu(String topMenu, List<MenuItem> menuItems,List<MenuItem> menuItems1,List<MenuItem> menuItems2) { //top 메뉴와 menuItem 리스트를 불러오기
        this.topMenu = topMenu;
        this.menuItems = menuItems;
        this.menuItems1 = menuItems1;
        this.menuItems2 = menuItems2;
    }
    // List<필기구들>

    //3.기능 (Method)
    String getTopMenu() {
        return topMenu;
    }

    //메개변수를 활용하면 된다..
    //음료도 출력할수 있고  디저트도 출력할 수 있게 만들면..
    //하나에 음료 디저트를 넣을 수 있다고?
    //변수이름은 못바꾼다.. //그래서 배열로
    void burgerMenuItems() { //버거 메뉴의 리스트를 불러오는 메서드
        while (true) {  //mvc 패턴
            for (int j = 0; j < menuItems.size(); j++) {  //menuItems의 배열의 사이즈 만큼 최대값을 두고 출력한다.
                System.out.println(j + 1 + "." + menuItems.get(j).getName() + "\t | W" + menuItems.get(j).getPrice() + " | " + menuItems.get(j).getContent() + "|");
            }
            System.out.println("0 을 누르면 상위메뉴로 돌아갑니다.");
            System.out.println("원하는 메뉴의 번호를 선택하면 자세한 설명이 나옵니다.");
            int selectMenuNumber = sc.nextInt(); //스캐너에 넣은 정수값을 selectTopMenuNumber 에 넣는다.
            if (selectMenuNumber == 0) {  //0번 값을 입력하면  키오스크를 종료하도록 한다.
                System.out.println("상위메뉴로 돌아갑니다.");
                return; //상위 메뉴로 돌아가기
            } else
                System.out.print("현재 선택하신 메뉴: ");
            //0 이외의 번호를 누를경우 해당 번호에 맞는 리스트 불러오기
            System.out.println(selectMenuNumber + "." + menuItems.get(selectMenuNumber - 1).getName() + "\t | W" + menuItems.get(selectMenuNumber - 1).getPrice() + " | " + menuItems.get(selectMenuNumber - 1).getContent() + "| \n");
        }
    }
    void drinkMenuItems() { //드링크 메뉴를 불러오는 메서드
        while (true) {
            for (int j = 0; j < menuItems1.size(); j++) {  //menuItems의 배열의 사이즈 만큼 최대값을 두고 출력한다.
                System.out.println(j + 1 + "." + menuItems1.get(j).getName() + "\t | W" + menuItems1.get(j).getPrice() + " | " + menuItems1.get(j).getContent() + "|");
            }
            System.out.println("0 을 누르면 상위메뉴로 돌아갑니다.");
            System.out.println("원하는 메뉴의 번호를 선택하면 자세한 설명이 나옵니다.");
            int selectMenuNumber = sc.nextInt(); //스캐너에 넣은 정수값을 selectTopMenuNumber 에 넣는다.
            if (selectMenuNumber == 0) {  //0번 값을 입력하면  키오스크를 종료하도록 한다.
                System.out.println("상위메뉴로 돌아갑니다.");
                return; //상위 메뉴로 돌아가기
            } else
                System.out.print("현재 선택하신 메뉴: ");
            //0 이외의 번호를 누를경우 해당 번호에 맞는 리스트 불러오기
            System.out.println(selectMenuNumber + "." + menuItems1.get(selectMenuNumber - 1).getName() + "\t | W" + menuItems1.get(selectMenuNumber - 1).getPrice() + " | " + menuItems1.get(selectMenuNumber - 1).getContent() + "| \n");
        }
    }void dessertMenuItems() { //디저트 메뉴를 불러오는 메서드
        while (true) {
            for (int j = 0; j < menuItems2.size(); j++) {  //menuItems의 배열의 사이즈 만큼 최대값을 두고 출력한다.
                System.out.println(j + 1 + "." + menuItems2.get(j).getName() + "\t | W" + menuItems2.get(j).getPrice() + " | " + menuItems2.get(j).getContent() + "|");
            }
            System.out.println("0 을 누르면 상위메뉴로 돌아갑니다.");
            System.out.println("원하는 메뉴의 번호를 선택하면 자세한 설명이 나옵니다.");
            int selectMenuNumber = sc.nextInt(); //스캐너에 넣은 정수값을 selectTopMenuNumber 에 넣는다.
            if (selectMenuNumber == 0) {  //0번 값을 입력하면  키오스크를 종료하도록 한다.
                System.out.println("상위메뉴로 돌아갑니다.");
                return; //상위 메뉴로 돌아가기
            } else //0 이외의 번호를 누를경우 해당 번호에 맞는 리스트 불러오기
                System.out.print("현재 선택하신 메뉴: ");
            //0 이외의 번호를 누를경우 해당 번호에 맞는 리스트 불러오기
            System.out.println(selectMenuNumber + "." + menuItems2.get(selectMenuNumber - 1).getName() + "\t | W" + menuItems2.get(selectMenuNumber - 1).getPrice() + " | " + menuItems2.get(selectMenuNumber - 1).getContent() + "| \n");
        }
    }
}