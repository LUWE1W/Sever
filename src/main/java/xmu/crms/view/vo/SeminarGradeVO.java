package xmu.crms.view.vo;

public class SeminarGradeVO {
    private String seminarName;
    private String groupName;
    private String leaderName;
    private int presentationGrade;
    private int reportGrade;
    private int grade;

    public SeminarGradeVO() {
    }

    public SeminarGradeVO(String seminarName, String groupName,
                        String leaderName, int presentationGrade, int reportGrade, int grade) {
        this.seminarName = seminarName;
        this.groupName = groupName;
        this.leaderName = leaderName;
        this.presentationGrade = presentationGrade;
        this.reportGrade = reportGrade;
        this.grade = grade;
    }

    public String getSeminarName() {
        return seminarName;
    }

    public void setSeminarName(String seminarName) {
        this.seminarName = seminarName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public int getPresentationGrade() {
        return presentationGrade;
    }

    public void setPresentationGrade(int presentationGrade) {
        this.presentationGrade = presentationGrade;
    }

    public int getReportGrade() {
        return reportGrade;
    }

    public void setReportGrade(int reportGrade) {
        this.reportGrade = reportGrade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
