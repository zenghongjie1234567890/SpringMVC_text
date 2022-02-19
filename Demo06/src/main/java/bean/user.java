package bean;

/**
 * SpringMVC_text
 *
 * @author : 曾小杰
 * @date : 2022-02-07 17:36
 **/
public class user {
    private Integer id;
    private String name;
    private String gender;

    public user() {
    }

    public user(Integer id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
