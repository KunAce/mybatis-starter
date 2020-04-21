package OrmBook;

public class Role {
    private Integer id;
    private String name;
    private String nameFull;

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + "\'" +
                ", nameFull='" + nameFull + "\'" +
                "}";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameFull() {
        return nameFull;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }
}
