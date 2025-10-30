package lv5_KioskRefactoring;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //속성(Filed)
    private Scanner sc = new Scanner(System.in);  //스캐너 기능 추가
    private List<Menu> menuList; //Menu의 속성에 있는 List 배열을 menuList 라는 변수명으로 만듬
    private Menu selectedMenuList;  //Menu 자료형 MenuList 에서 선택한 값을 저장


    //생성자 (Constructor)
    public Kiosk(List<Menu> menuList) {
        this.menuList = menuList;
    }

    //기능(Method)
    public void start() {  //키오스크 기능 시작

        while (true) { //상위 메뉴 기능을 반복
            //1. 메뉴 출력
            System.out.println("[\tMAIN MENU\t]");
            for (int i = 0; i < menuList.size(); i++) {
                //메뉴 리스트 0번째 배열부터 메뉴리스트 최대 사이즈까지 순서대로 출력하는 기능
                System.out.println(i + 1 + "." + menuList.get(i).getCategory());
            }System.out.println("0.키오스크 종료");  //안내문자 추가
            System.out.println("선택하신 메뉴의 번호로 이동합니다.");

            try {  //예외 기능추가
                //2.사용자 입력값 받기
                int selectedMenuNumber = sc.nextInt();
                if (selectedMenuNumber == 0) {  //0을 누를경우 키오스크 기능을 종료하는 기능
                    System.out.println("키오스크를 종료합니다.");
                    return;
                }
                //3. 사용자가 선택한 메뉴
                selectedMenuList = menuList.get(selectedMenuNumber - 1);
                //
            }catch (NullPointerException e) { //Null 값을 가지고 있는  객체/변수를 호출할때 발생하는 예외처리
                System.out.println("잘못된 입력값입니다. 다시입력하세요");
                sc.nextLine();
            }catch (IndexOutOfBoundsException e) {  //리스트 범위 안에있는 숫자를 선택하지 않고 범위 밖의 숫자를 입력할경우 예외처리
                System.out.println("1 ~ 3 번 메뉴를 선택해 주세요.");
                sc.nextLine();
                continue;
            }catch (Exception e) { //최후의 보루로 남겨두는  마지막 예외처리 문장
                System.out.println("잘못된 입력값입니다. 다시입력하세요");
                sc.nextLine();
                continue;
            }
            //예상치못한 에러는 트래킹 가능한 오류들을 써야한다.


          while (true) {  //하위메뉴 반복문 추가
             //4. 사용자가 선택한 하위 메뉴 출력하기
             selectedMenuList.printMenuItems();
             System.out.println("번호를 누르면 메뉴가 선택됩니다.");
                 try { //예외처리 시작
                 //5. 사용자가 선택한 메뉴아이템 출력하기
                 int selectedMenuItemNumber = sc.nextInt();
                 //0을 입력할 경우 상위메뉴로 돌아가기
                 if (selectedMenuItemNumber == 0) {
                     break;
                 }
                 //사용자가 선택한 번호의 상위메뉴의 MenuItem에서 메서드를 불러와  MenuItem 자료형의 배열에 넣음
                 List<MenuItem> selectedMenuItems = selectedMenuList.getMenuItems();
                 //사용자가 선택한 메뉴의 -1 배열에 있는 메뉴 아이템을 출력하여 보여줌
                 System.out.println("선택하신 메뉴 :  " + selectedMenuItems.get(selectedMenuItemNumber - 1));
             }catch (NullPointerException e) {//Null 값을 가지고 있는  객체/변수를 호출할때 발생하는 예외처리
                 System.out.println("잘못된 입력값입니다. 다시입력하세요");
                 sc.nextLine();
             }catch (IndexOutOfBoundsException e) { //리스트 범위 안에있는 숫자를 선택하지 않고 범위 밖의 숫자를 입력할경우 예외처리
                 System.out.println("1 ~ 4 번 메뉴를 선택해 주세요.");
                 sc.nextLine();
             }catch (Exception e){ //최후의 보루로 남겨두는  마지막 예외처리 문장
                     System.out.println("잘못된 입력값입니다. 다시입력하세요");
                     sc.nextLine();


             }
          }



        }
    }
}

