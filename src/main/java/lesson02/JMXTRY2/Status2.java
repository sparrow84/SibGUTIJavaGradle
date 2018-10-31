package lesson02.JMXTRY2;

public class Status2 implements StatusMXBean {
    private StatusEnum statusEnum = StatusEnum.UNSPECIFIED;

    public Status2() {}

    public StatusEnum getStatus()
    {
        return this.statusEnum;
    }

    public void setStatus(final StatusEnum status)
    {
        this.statusEnum = status;
    }
}
