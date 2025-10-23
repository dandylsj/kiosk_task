package lv2_Kiosk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * // List 선언 및 초기화
 * // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
 * // (add 보다 더 좋은 방법이 있다면 그렇게 해도 됩니다!)
 * // Scanner 선언
 * // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
 * // 숫자를 입력 받기
 * // 입력된 숫자에 따른 처리
 * // 프로그램을 종료
 * // 선택한 메뉴 : 이름, 가격, 설명
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// Scanner 선언
        List<MenuItem> menuItems = new ArrayList<>();    // List 선언 및 초기화

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        // (add 보다 더 좋은 방법이 있다면 그렇게 해도 됩니다!)
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 6.9, "비프패티를 기반으로 야채가 들어간 기본버거"));


        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) { // 배열에 들어있는 배열의 순서대로 출력
                System.out.println(i + 1 + "." + menuItems.get(i).getName() + "\t | W" + menuItems.get(i).getPrice() + " | " + menuItems.get(i).getContent() + "|");
            }
            System.out.println("0 을 누르면 키오스크를 종료합니다.");
            System.out.println("원하는 메뉴의 번호를 선택하면 자세한 설명이 나옵니다.");
            int selectMenuNumber = sc.nextInt(); //메뉴 숫자를 받아 출력
            if(selectMenuNumber == 0) { //0을 입력 받으면  시스템을 종료
                System.out.println("키오스크를 종료합니다.");
                System.exit(0); //시스템 종료 선언
            }else { //0 이외의 값을 받으면 해당 숫자에 맞는 배열의 메뉴를 출력해줌
                System.out.println((selectMenuNumber) + "." + menuItems.get(selectMenuNumber -1).getName() + "\t | W" + menuItems.get(selectMenuNumber -1).getPrice() + " | " + menuItems.get(selectMenuNumber -1).getContent() + "|");
            }
        }
    }
}

