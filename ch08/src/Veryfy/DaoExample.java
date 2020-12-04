package Veryfy;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());

	}

}

class OracleDao implements DataAccessObject{
	private String name="Oracle DB";
	@Override
	public void select() {
		System.out.println(name+"���� �˻�");
	}
	@Override
	public void insert() {
		System.out.println(name+"���� ����");	
	}
	@Override
	public void update() {
		System.out.println(name+"���� ����");
	}
	@Override
	public void delete() {
		System.out.println(name+"���� ����");	
	}
}

class MySqlDao implements DataAccessObject{
	private String name="MySql DB";
	@Override
	public void select() {
		System.out.println(name+"���� �˻�");
	}
	@Override
	public void insert() {
		System.out.println(name+"���� ����");	
	}
	@Override
	public void update() {
		System.out.println(name+"���� ����");
	}
	@Override
	public void delete() {
		System.out.println(name+"���� ����");	
	}
}
