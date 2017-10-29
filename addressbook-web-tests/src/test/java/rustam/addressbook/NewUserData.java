package rustam.addressbook;

public class NewUserData {
    private final String name;
    private final String lastname;
    private final String nickname;
    private final String company;
    private final String address;
    private final String home_tel;
    private final String mobile_tel;
    private final String work_tel;
    private final String email;
    private final String bday;
    private final String bmonth;
    private final String byear;

    public NewUserData(String name, String lastname, String nickname, String company, String address, String home_tel, String mobile_tel, String work_tel, String email, String bday, String bmonth, String byear) {
        this.name = name;
        this.lastname = lastname;
        this.nickname = nickname;
        this.company = company;
        this.address = address;
        this.home_tel = home_tel;
        this.mobile_tel = mobile_tel;
        this.work_tel = work_tel;
        this.email = email;
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHome_tel() {
        return home_tel;
    }

    public String getMobile_tel() {
        return mobile_tel;
    }

    public String getWork_tel() {
        return work_tel;
    }

    public String getEmail() {
        return email;
    }

    public String getBday() {
        return bday;
    }

    public String getBmonth() {
        return bmonth;
    }

    public String getByear() {
        return byear;
    }
}
