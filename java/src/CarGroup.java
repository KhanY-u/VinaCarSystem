public class CarGroup
{
    private String nameGroup;
    private String desciption;
    public CarGroup(String nameGroup, String description)
    {
        this.nameGroup = nameGroup;
        this.desciption = description;
    }
    public String getDesciption() {
        return desciption;
    }
    public String getNameGroup() {
        return nameGroup;
    }
    @Override
    public String toString() {
        return "Name Group: " + nameGroup + " and description " + desciption;
    }
}