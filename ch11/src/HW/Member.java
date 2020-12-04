package HW;

public class Member{

	private String id;
	private String password;
	private String name;
	private double point;
	
	public Member(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.point = 1000.0;
	}

	public String getId() { return id; }
	
	public void setId(String id) { this.id = id; }

	public String getPassword() {  return password;  }
	public void setPassword(String password) {  this.password = password;  }
	
	public String getName() {  return name;  }
	public void setName(String name) {  this.name = name;  }
	
	public double getPoint() {  return point;  }
	public void setPoint(double point) {  this.point = point;  }
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", point=" + point + "]";
	}
}