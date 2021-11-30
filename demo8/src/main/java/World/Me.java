package World;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.awt.dnd.DragGestureEvent;

@Component("Ivan")
@Scope("prototype")
public class Me {

    //    @Autowired
//    @Qualifier("wizard")
    public Human human;


    @Autowired()
    public Me(@Qualifier("dwarf")Human human) {
        this.human = human;
    }


    @PostConstruct
    private void Init() {
        System.out.println("Wizard has started his way");
    }

    @PreDestroy
    public void Destroy() {
        System.out.println("Wizard has started end his way");

    }

    public void getHumanWork() {
        human.getWork();
    }

    public void getHumanStatus() {
        human.getStatus();
    }
}
