public class Emp {
    // private 필드 선언
    private String id;
    private String name;
    private int baseSalry;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBaseSalry(int baseSalary) {
        this.baseSalry = baseSalary;
    }

    public int getBaseSalry() {
        return baseSalry;
    }

    public double getSalary(double bonus) {
        return baseSalry + baseSalry * bonus;
    }

    @Override
    public String toString() {
        return name + "(" + id + ") 사원의 기본급은 " + baseSalry + "원 입니다.";
    }
}
