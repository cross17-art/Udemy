package IC;

import java.util.Date;

public class FordMustang implements Vehicle {
    private int produceYear = 0;

    public void initFordMustang(){
        System.out.println("FordMustang -> init date "+ new Date());
    }

    public void destroyFordMustang(){
        System.out.println("FordMustang -> destroy date "+ new Date());
    }

    public int getProduceYear() {
        return produceYear;
    }

    public void setProduceYear(int produceYear) {
        this.produceYear = produceYear;
    }

    @Override
    public void getSpeed() {
        int year = produceYear != 0 ? produceYear : -1;

        System.out.println("125 mph it GT = > Ford Mustang");
        System.out.println("produce year = > Ford Mustang is  "+ year);
    }
}
