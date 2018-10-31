package lesson02.JMXTRY2;

public interface StatusMBean {

    public void printString(String str);

    public StatusEnum getStatus();

    public void setStatus(final StatusEnum status);

    public enum StatusEnum {SUCCESSFUL, FAILURE, UNSPECIFIED}

}
