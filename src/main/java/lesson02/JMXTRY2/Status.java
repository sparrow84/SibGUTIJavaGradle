package lesson02.JMXTRY2;

public class Status implements StatusMBean {
    private StatusEnum statusEnum = StatusEnum.UNSPECIFIED;

    public Status() {}

    public StatusEnum getStatus()
    {
        return this.statusEnum;
    }

    public void setStatus(final StatusEnum status)
    {
        this.statusEnum = status;
    }
}
