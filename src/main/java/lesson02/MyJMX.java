package lesson02;

public class MyJMX implements JMXMBean {

    String myString = "It's my string from MyJMX";

    @Override
    public void printString() {
        System.out.println("The world is mine");
    }

    @Override
    public int sum2Int(int x, int y) {
        return x + y;
    }

    @Override
    public ExampleClassForJMX returnString() {
        return new ExampleClassForJMX();
    }

    @Override
    public String getMyString() {
        return myString;
    }

    @Override
    public void setMyString(String str) {
        myString = str;
    }
}
