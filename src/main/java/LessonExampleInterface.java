public class LessonExampleInterface {
    public static void main(String[] args) {

    }
}


interface IFly
{
    public void fly();
}

interface ISail
{
    public void sail();
}

class AirPlane implements IFly
{
    @Override
    public void fly() {
        System.out.println("Я самолет, я лечу.");
    }
}

class Seaplane implements IFly, ISail
{
    @Override
    public void fly() {
        System.out.println("Я гидро самолет, я лечу.");
    }

    @Override
    public void sail() {
        System.out.println("Я гидро самолет, я пылыву.");
    }
}
