package yycg.base.pojo;

public class Userrole extends UserroleKey {
    private String vchar1;

    public String getVchar1() {
        return vchar1;
    }

    public void setVchar1(String vchar1) {
        this.vchar1 = vchar1 == null ? null : vchar1.trim();
    }
}