package yycg.base.pojo;

public class ErrorTaskBackup {
    private String taskid;

    private String wsurl;

    private String wsmethod;

    private String wsnamespace;

    private String vchar1;

    private String vchar2;

    private String vchar3;

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid == null ? null : taskid.trim();
    }

    public String getWsurl() {
        return wsurl;
    }

    public void setWsurl(String wsurl) {
        this.wsurl = wsurl == null ? null : wsurl.trim();
    }

    public String getWsmethod() {
        return wsmethod;
    }

    public void setWsmethod(String wsmethod) {
        this.wsmethod = wsmethod == null ? null : wsmethod.trim();
    }

    public String getWsnamespace() {
        return wsnamespace;
    }

    public void setWsnamespace(String wsnamespace) {
        this.wsnamespace = wsnamespace == null ? null : wsnamespace.trim();
    }

    public String getVchar1() {
        return vchar1;
    }

    public void setVchar1(String vchar1) {
        this.vchar1 = vchar1 == null ? null : vchar1.trim();
    }

    public String getVchar2() {
        return vchar2;
    }

    public void setVchar2(String vchar2) {
        this.vchar2 = vchar2 == null ? null : vchar2.trim();
    }

    public String getVchar3() {
        return vchar3;
    }

    public void setVchar3(String vchar3) {
        this.vchar3 = vchar3 == null ? null : vchar3.trim();
    }
}