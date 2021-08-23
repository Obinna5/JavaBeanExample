package mypackage;

// Use the Serializer library
public class employee implements java.io.Serializable {

private int id; 
private String name;

public employee() {}

public void setid(int id)
	{
	this.id = id;
	}
public int getid ()
	{
	return id;
	}


public void setName(String name)
	{
	this.name = name;
	}

public String getName ()
	{
	return name;
	}



} 
