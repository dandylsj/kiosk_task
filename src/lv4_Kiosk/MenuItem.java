package lv4_Kiosk;

public class MenuItem {
    //1.속성 Filed
    private String name;  //메뉴 이름 문자 속성
    private double price; //메뉴 가격 double 속성
    private String content; //메뉴 내용 문자 속성

    //2.생성자 Constructor
    MenuItem(String name,double price,String content){
        this.name = name;
        this.price = price;
        this.content = content;
    }
    //3.기능 Method
    String getName(){
        return name;
    }
    double getPrice(){
        return price;
    }
    String getContent(){
        return content;
    }
    @Override  // Kiosk 클래스 에서 하위메뉴를 문자로 출력하기위한 기능
    public String toString() {
        return name + "| W"+ price + " | " + content ;
    }
}




