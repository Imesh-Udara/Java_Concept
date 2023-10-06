package Theory.OOP3;

class Car{
    String carName;
    String carType;

    public Car(String name,String Type){
        this.carName = name;
        this.carType = Type;
    }

    private String getCarName(){
        return this.carName;
    }

    //inner class
    class Engine{
        String engineType;
        void setEngine() {

            if(Car.this.carType.equals("4WD")){

                if(Car.this.getCarName().equals("Crysler")){
                    this.engineType = "smaller";
                }else {
                    this.engineType = "Bigger";
                }
            }else {
                this.engineType = "Bigger";
            }

        }
        String getEngineType(){
            return this.engineType;
        }
    }
}
public class Inner_from_Outer {

}
