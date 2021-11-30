package World;

import org.springframework.stereotype.Component;

@Component
public class Dwarf implements Human{
    @Override
    public void getWork() {
        System.out.println("Кузнец");
    }

    @Override
    public void getStatus() {
        System.out.println("Холост");
    }
}
