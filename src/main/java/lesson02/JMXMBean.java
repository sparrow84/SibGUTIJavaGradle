package lesson02;

public interface JMXMBean {
    void printString();
    int sum2Int(int x, int y);

    ExampleClassForJMX returnString();
    String getMyString();
    void setMyString(String str);
}
