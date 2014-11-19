package mybatisTest;

public class Automobile {
	private int id;
    private String make;
    private String model;
    private int year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Automobile() {
        super();
    }

    public Automobile( int id, String make, String model,int year) {
        super();
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Automobile{" + "id=" + id + ",make=" + make + ",model=" + model + ",year=" + year + '}';
    }
}
