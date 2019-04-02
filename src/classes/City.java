package classes;

public class City {

    private Integer id;
    private String name;

    public City() {

    }

    public City(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "\n      Id: " + id + "\n      Name: " + name + "\n";
    }

    public static class CityBuilder {
        private Integer id;
        private String name;

        public CityBuilder() {

        }

        public CityBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public CityBuilder name(String name) {
            this.name = name;
            return this;
        }

        public City build() {
            City c = new City();
            c.id = this.id;
            c.name = this.name;
            return c;
        }
    }
}
