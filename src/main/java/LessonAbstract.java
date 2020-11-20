public class LessonAbstract {
    public static void main(String[] args) {
        Tu64 a = new Tu64();
        a.fly();
    }
}


abstract class AbstractFly
{
    public void fly()
    {
        System.out.println("Я астрактный самолет я лечу.");
    }
}

class Tu64 extends AbstractFly
{
    @Override
    public void fly() {
        super.fly();
        System.out.println("Я Ту 64, я лечу.");
    }
}
