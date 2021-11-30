package World;

import org.springframework.stereotype.Component;

public class Spirit implements Human{
    @Override
    public void getWork() {
        System.out.println("Пугало");
    }

    @Override
    public void getStatus() {
        System.out.println("Вдовец");
    }
}
