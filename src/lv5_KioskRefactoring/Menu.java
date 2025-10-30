package lv5_KioskRefactoring;

import java.util.List;

public class Menu {
    //속성(Filed)
    private String category; //문자형 상위 메뉴 변수
    private List<MenuItem> menuItems; //MenuItem 자료형 리스트

    //생성자 (Constructor)
    Menu(String category,List<MenuItem> menuItems){
        this.category = category;
        this.menuItems = menuItems;
    }

    //기능(Method)
    public String getCategory(){  //상위메뉴를 불러오는 메서드
        return category;
    }

    public List<MenuItem> getMenuItems() { //하위메뉴를 불러오는 메서드
        return menuItems;
    }

    public void printMenuItems(){ //하위메뉴의 메뉴판이 출력되는 메서드
            System.out.printf("[ %s Menu ]\n",category);
            for(int i = 0; i <menuItems.size(); i++){
                //메뉴아이템 리스트 0번째 배열부터 메뉴리스트 최대 사이즈까지 순서대로 출력하는 기능
                System.out.println(i + 1 + "." + menuItems.get(i));
            }System.out.println("0 을 선택하면 종료합니다.");

//        향상된 for 문을 사용할 경우
//        for(MenuItem menuItem : menuItems){
//            System.out.println(menuItem.getName() + "\t"+ "|" + menuItem.getPrice() + "W \t|" + menuItem.getContent());
//        }
    }

}
