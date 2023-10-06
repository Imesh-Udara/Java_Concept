package Theory.OOP3;


class CPU{
    double price;

    class Processor{

        double cores;
        String manufacture;

        double getCache(){
            return 4.3;
        }
    }

    protected class RAM{
        double memory;
        String manufacture;

        double getClockSpeed(){
            return 5.5;
        }
    }
}
public class Inner_class {
    public static void main(String[] args) {
        CPU cpu = new CPU();

        CPU.Processor processor = cpu.new Processor();

        CPU.RAM ram = cpu.new RAM();

        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());
    }
}
