package Sample;

public class Ex15 {
    public static void main(String[] args) {
        
        Car car = new Car();

        car.run(40);

        try{
            car.run(200);
        } catch(IllegalAccessException e){
            System.out.println("例外発生" + e.getMessage());
            e.printStackTrace();
        }


        
        

    }

}
