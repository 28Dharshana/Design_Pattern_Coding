public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command fanOn = new FanOnCommand(fan);
        Command fanOff = new FanOffCommand(fan);

        RemoteControl remote = new RemoteControl();

        System.out.println("Turning ON Light:");
        remote.setCommand(lightOn);
        remote.pressButton();

        System.out.println("Turning OFF Light:");
        remote.setCommand(lightOff);
        remote.pressButton();

        System.out.println("Turning ON Fan:");
        remote.setCommand(fanOn);
        remote.pressButton();

        System.out.println("Turning OFF Fan:");
        remote.setCommand(fanOff);
        remote.pressButton();
    }
}
