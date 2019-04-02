package classes;

public class Location {

    private Integer id;
    private String name;
    private City city;

    public Location() {

    }

    public Location(Integer id, String name, City city) {
        this.id = id;
        this.name = name;
        this.city = city;
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "\n    Id: " + id + "\n    Name: " + name + "\n    City: " + city;
    }

    public static class LocationBuilder {

        private Integer id;
        private String name;
        private City city;

        public LocationBuilder() {

        }

        public LocationBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public LocationBuilder name(String name) {
            this.name = name;
            return this;
        }

        public LocationBuilder city(City city) {
            this.city = city;
            return this;
        }

        public Location build() {
            Location l = new Location();
            l.id = this.id;
            l.name = this.name;
            l.city = this.city;
            return l;
        }
    }
}
