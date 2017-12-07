package xmu.crms.view.vo;

public class MemberVO {
    private int id;
    private String name;

    public MemberVO() {
    }

    public MemberVO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
