package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Computer extends ComputerDevice {

    // 복수개의 ComputerDevice 객체를 가리킴
    private List<ComputerDevice> components = new ArrayList<ComputerDevice>();

    // Computer Device 객체를 Computer 클래스에 추가함
    public void addComponent(ComputerDevice component) {
        components.add(component);
    }

    // ComputerDevice 객체를 Computer 클래스에서 제거함
    public void removeComponet(ComputerDevice component) {
        components.remove(component);
    }


    //전체 가격을 포함하는 각 부품의 가격을 합산함
    @Override
    public int getPrice() {

        int price = 0;
        for(ComputerDevice componet : components){
            price += componet.getPrice();
        }

        return price;
    }

    @Override
    public int getPower() {
        int power = 0;
        for(ComputerDevice componet : components){
            power += componet.getPower();
        }

        return power;
    }
}



