package Sample;

public class Car {

    // private int speed;
    // public void run() throws Exception{ //下がRunTimeExceptionだったら、throwsは不要
    //     speed += 10;

    //     if(speed >= 120){ //120以上になったら例外を発生させる
    //         throw new OverSpeedException("スピードの出し過ぎです"); 
    //     }
    // }

    private int speed;
    

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public void run(int speed) throws Exception{
    


        if(this.speed<0 || this.speed>180){
            throw new IllegalAccessException("スピードの出しすぎです");
            

        } else{

            System.out.println("スピードが" + this.speed + "km/hになりました");
        }


    }
}
