package World;

import org.springframework.stereotype.Component;


@Component
public class Wizard implements Human{
    @Override
    public void getWork() {
        System.out.println("Башня мага");
    }

    @Override
    public void getStatus() {
        System.out.println("Женился на работе");
    }
}
