package lv5_KioskRefactoring;

public class MenuItem {

    //속성(Filed)
    private String name; //메뉴의 이름을 표시하는 속성
    private double price; //메뉴의 가격을 표시하는 속성
    private String content; //메뉴의 내용을 표시하는 속성


    //생성자 (Constructor)
    MenuItem(String name,double price,String content){
        this.name = name;
        this.price = price;
        this.content = content;
    }

    //기능(Method)
    public String getName() {
        return name;
    } //메뉴의 이름을 반환
    public double getPrice() {
        return price;
    } //메뉴의 가격을 반환
    public String getContent() {
        return content;
    } //메뉴의 내용을 반환

    @Override
    public String toString() { // 배열 안에 있는 메뉴를 문자열로 바꿔주는 기능
        return  name + "\t |"  + price + "W" + " |"+ content ;
    }
}
