import IC.Car_for_Me;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
//        car_for_me car_for_me = context.getBean(("myCar"),car_for_me.class);
//        car_for_me.getCar();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        Car_for_Me car_for_me  =context.getBean(("myCar"),Car_for_Me.class);
        car_for_me.getCar();
        car_for_me.getInfoMe();
        System.out.println(String.valueOf(car_for_me.getDate()));

        context.close();
        System.out.printf("<----------->");


    }




}
