package lv3_Kiosk;

public class MenuItem {
    //1.속성
    private String name;  //메뉴 이름 문자 속성
    private double price; //메뉴 가격 double 속성
    private String content; //메뉴 내용 문자 속성

    //2.생성자
    MenuItem(String name,double price,String content){
        this.name = name;
        this.price = price;
        this.content = content;
    }

    //3.기능
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getContent(){
        return content;
    }



}




