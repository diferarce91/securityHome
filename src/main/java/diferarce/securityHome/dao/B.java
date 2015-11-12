package diferarce.securityHome.dao;

public class B {
	
	private Integer id;
	private String name;
	private String description;
	
	

	public B() {
		
	}

	public B(Integer id) {
		super();
		this.id = id;
	}
	
	

	public B(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

	public B(Integer id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Integer getid() {
		return id;
	}

	public void setid(Integer id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
	
	
}
