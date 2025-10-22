package lv2_Kiosk;

import java.util.Scanner;

/**
 * // List 선언 및 초기화
 * 		// add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
 * 		// (add 보다 더 좋은 방법이 있다면 그렇게 해도 됩니다!)
 * 		// Scanner 선언
 * 		// 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
 * 		// 숫자를 입력 받기
 * 		// 입력된 숫자에 따른 처리
 * 			// 프로그램을 종료
 * 			// 선택한 메뉴 : 이름, 가격, 설명
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//스캐너 인스턴스 생성
        MenuItem menuItem = new MenuItem(); //MenuItem 클래스 인스턴스

        //List<MenuItem> menuItems = new ArrayList<>();

        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거 ");
        System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("0. 종료");

        while(true) { //반복하여 메뉴를 추가할 수 있는 반복문
            System.out.println("주문하실 메뉴의 번호를 눌러주시면 장바구니에 담깁니다.");
            int selectMenuNumber = sc.nextInt(); //정수값 입력
            menuItem.menuSelect(selectMenuNumber); // MenuItem 클래스 에서 switch 구문으로 정수값을 넘긴다.
            System.out.println("-----저장된 리스트------ \n" + menuItem.resulstList()); //추가된 배열 메뉴표시
        }



    }
}

