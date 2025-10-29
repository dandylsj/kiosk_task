package lv4_Kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//설명: 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스입니다.
public class Kiosk {

    //1.속성 (Field)
    private Menu selectedCategory; //메뉴카테고리 선택값을 위한 속성
    private List<Menu> category; //카테고리 메뉴(상위 메뉴)의 배열을 불러옴
    private Scanner sc = new Scanner(System.in); // Scanner 선언


    //2.생성자 (Constructor)
    Kiosk(List<Menu> category) {  //List<MenuItem> menuItems 는 Kiosk 클래스 생성자를 통해 값을 할당합니다.
        this.category = category;
    }

    //3. 기능 (Method)
    public void start() { //main 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수를 만들어 관리합니다.
      while (true) {  //키오스크 내부의 기능을 반복하기위한 반복문
          //1.메뉴 리스트 출력
          System.out.println("[ MAIN MENU ]"); //카테고리 메뉴(상위 메뉴) 출력  for문을 사용하여 List의 메뉴를 출력합니다.
          for (int i = 0; i < category.size(); i++) {
              System.out.println(i + 1 + "." + category.get(i).getCategory());
          }
          System.out.println("0 을 누르면 키오스크를 종료합니다.");

          //2. 사용자 입력값 받기
          int selectCategoryNumber = sc.nextInt(); //스캐너에 넣은 정수값을 selectTopMenuNumber 에 넣는다.

          if (selectCategoryNumber == 0) {  //0번 값을 입력하면  키오스크를 종료하도록 한다.
              System.out.println("키오스크를 종료합니다.");
              System.exit(0); //시스템 종료 선언
          } else {
              //3. 사용자 선택한 메뉴
              selectedCategory = category.get(selectCategoryNumber - 1);//카테고리 메뉴에서 선택한 값의 -1 배열에 있는 카테고리를 selectedCategory에 넣는다.
          }


          while (true) {  //하위 메뉴 출력을 반복하기위한 반복문
              //4. 하위메뉴 출력
              selectedCategory.printMenuItems();//2번에서 선택한 하위 메뉴가 출력된다.
              //5. 사용자 입력값받기
              int selectMenuItemNumber = sc.nextInt();
              if (selectMenuItemNumber == 0) { //0번 값을 입력하면 카테고리 로 넘어간다.
                  System.out.println("카테고리 메뉴로 넘어갑니다.");
                  break; //카테고리로 넘어갑니다.
              }
              //6.선택한 메뉴가 출력
              List<MenuItem> menuItems = selectedCategory.getMenuItems(); //선택한 카테고리의 메뉴아이템을 불러오는 기능
              MenuItem selectedMenuItem = menuItems.get(selectMenuItemNumber - 1); //5 에서 선택한 숫자를 -1 한 배열의 값을 불러오는 기능

              System.out.println("선택한 메뉴 아이템 : " + selectedMenuItem); //5번에서 선택한 정수의 배열을 문자로 불러온다.
          }
      }
    }
}

