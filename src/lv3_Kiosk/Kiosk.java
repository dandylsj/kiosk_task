package lv3_Kiosk;

import java.util.List;
import java.util.Scanner;

//설명: 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스입니다.
public class Kiosk {

    //1.속성

    List<MenuItem> menuItems;   // Main의 menuItem을 불러오기  //MenuItem을 관리하는 리스트가 필드로 존재합니다
    Scanner sc = new Scanner(System.in); // Scanner 선언


    //2.생성자
    Kiosk(List<MenuItem> menuItems) {  //List<MenuItem> menuItems 는 Kiosk 클래스 생성자를 통해 값을 할당합니다.
        this.menuItems = menuItems;
    }

    //3. 기능
    public void start() { //main 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수를 만들어 관리합니다.

        //MenuItem 클래스 인스턴스

        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {  //menuItems의 배열의 사이즈 만큼 최대값을 두고 출력한다.
                System.out.println(i + 1 + "." + menuItems.get(i).getName() + "\t | W" + menuItems.get(i).getPrice() + " | " + menuItems.get(i).getContent() + "|");
            }  //i + 1 은 0번 배열이 1번으로 출력이 되야하기 때문에 추가, get 이라는 함수는 i 값배열의 getname,getPrice,getContent 를 출력 하겠다.
            System.out.println("0 을 누르면 키오스크를 종료합니다.");
            System.out.println("원하는 메뉴의 번호를 선택하면 자세한 설명이 나옵니다.");
            int selectMenuNumber = sc.nextInt(); //메뉴 숫자를 받아 출력
            if (selectMenuNumber == 0) { //0을 입력하면 키오스크 종료
                System.out.println("키오스크를 종료합니다.");
                System.exit(0); //시스템 종료 선언
            } else { // 정수를 입력할 경우 해당 숫자의 메뉴 번호를 출력함
                System.out.print("현재 선택하신 메뉴: ");
                System.out.println((selectMenuNumber) + "." + menuItems.get(selectMenuNumber - 1).getName() + "\t | W" + menuItems.get(selectMenuNumber - 1).getPrice() + " | " + menuItems.get(selectMenuNumber - 1).getContent() + "|\n");
            }
        }
    }
}
