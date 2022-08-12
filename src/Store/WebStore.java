package Store;

public class WebStore extends Store{
    public String internetAddr;
    public String programmingLanguage;
    public WebStore(String name){super(name);}
    public WebStore(String name, String internetAddr, String programmingLanguage){
        super(name);
        this.internetAddr = internetAddr;
        this.programmingLanguage = programmingLanguage;
    }
    public String getInternetAddr() {return internetAddr;}
    public void setInternetAddr(String internetAddr) {this.internetAddr = internetAddr;}
    public String getProgrammingLanguage() {return programmingLanguage;}
    public void setProgrammingLanguage(String programmingLanguage) {this.programmingLanguage = programmingLanguage;}
    @Override
    public String toString() {
        return "WebStore - Name = " + getName() +
                ", Internet Address ='" + internetAddr + '\'' +
                ", Programming Language ='" + programmingLanguage + '\'' +
                " " ;
    }
}
