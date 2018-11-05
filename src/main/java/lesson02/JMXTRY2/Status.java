package lesson02.JMXTRY2;

public class Status implements StatusMBean {
    private StatusEnum statusEnum = StatusEnum.UNSPECIFIED;

    public Status() {}

    @Override
    public void printString(String str) {
        System.out.println("The world is mine: " + str);
        System.out.println("getStatus = " + getStatus());
    }

    @Override
    public StatusEnum getStatus()
    {
        return this.statusEnum;
    }

    @Override
    public void setStatus(final StatusEnum status)
    {
        this.statusEnum = status;
    }
}
