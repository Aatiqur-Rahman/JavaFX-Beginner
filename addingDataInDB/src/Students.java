/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
public class Students {
    private String ID;
    private String Name;
    private String Mobile;
    private String Username;
    private String Password;

    public Students(String ID, String Name, String Mobile, String Username, String Password) {
        this.ID = ID;
        this.Name = Name;
        this.Mobile = Mobile;
        this.Username = Username;
        this.Password = Password;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Mobile
     */
    public String getMobile() {
        return Mobile;
    }

    /**
     * @param Mobile the Mobile to set
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * @return the Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
