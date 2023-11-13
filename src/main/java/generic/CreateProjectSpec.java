package generic;

public class CreateProjectSpec {
	
	String Createdy;
	String ProjectName;
	String status;
	int teamsize;
	public CreateProjectSpec(String Createdy, String ProjectName, String status, int teamsize) {
		this.Createdy = Createdy;
		this.ProjectName = ProjectName;
		this.status = status;
		this.teamsize = teamsize;
	}
	public String getName() {
		return Createdy;
	}
	public void setName(String Createdy) {
		this.Createdy = Createdy;
	}
	public String getOrg() {
		return ProjectName;
	}
	public void setOrg(String org) {
		this.ProjectName = ProjectName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	
	

}
