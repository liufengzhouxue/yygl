package yycg.base.pojo;

public class Gysypml {
    private String id;

    private String ypxxid;

    private String usergysid;

    private String vchar1;

    private String vchar2;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getYpxxid() {
        return ypxxid;
    }

    public void setYpxxid(String ypxxid) {
        this.ypxxid = ypxxid == null ? null : ypxxid.trim();
    }

    public String getUsergysid() {
        return usergysid;
    }

    public void setUsergysid(String usergysid) {
        this.usergysid = usergysid == null ? null : usergysid.trim();
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
}