package model;

public class DatosRegistro {

    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private String postalCode;
    private String password;

    public DatosRegistro(String firstName, String lastName, String email, String city, String postalCode, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.postalCode = postalCode;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getPassword() {
        return password;
    }
}


