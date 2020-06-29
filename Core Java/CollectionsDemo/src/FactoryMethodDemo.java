public class FactoryMethodDemo {
    public static void main(String[] args) {

        // Execution without the use of factory method.
        /*
        facebook fb = new facebook("Facebook","www.facebook.com","Connecting people together","Human-Interaction");
        fb.url();
        fb.purpose();
        fb.types();
        System.out.println("\n=================================================================================\n");
        OracleUniversity ou = new OracleUniversity("Oracle University","www.education.oracle.com","Online Education","Providing Java and SQL classes.");
        ou.url();
        ou.purpose();
        ou.topic();

         */
    getSites gs = new getSites();
    SocialMedia site = gs.getSocialMedia("Twitter");
    site.url();
    site.purpose();
    site.types();
    System.out.println("\n==============================================================================\n");
    Education edu = getSites.getEducation("Oracle");
    edu.url();
    edu.purpose();
    edu.topic();

    }
}

interface Sites
{
    abstract void url();
    abstract void purpose();
}

abstract class SocialMedia implements Sites
{
    abstract void types();
}
abstract class Education implements Sites
{
    abstract void topic();
}

class facebook extends SocialMedia
{
    private String url;
    private String name;
    private String Purpose;
    private String type;

    public facebook(String name, String url, String purpose, String type) {
        this.url = url;
        this.name = name;
        this.Purpose = purpose;
        this.type = type;
    }

    @Override
    public void url()
    {
        System.out.println(this.name + " site url is " + this.url);
    }



    @Override
    public void purpose() {
        System.out.println(this.name + " site purpose is " + this.Purpose);
    }

    @Override
    void types() {
        System.out.println(this.name + " site type is " + this.type);
    }
}

class Twitter extends SocialMedia
{
    private String url;
    private String name;
    private String Purpose;
    private String type;

    public Twitter(String name, String url, String purpose, String type) {
        this.url = url;
        this.name = name;
        this.Purpose = purpose;
        this.type = type;
    }

    @Override
    public void url()
    {
        System.out.println(this.name + " site url is " + this.url);
    }

    @Override
    public void purpose() {
        System.out.println(this.name + " site purpose is " + this.Purpose);
    }

    @Override
    void types() {
        System.out.println(this.name + " site type is " + this.type);
    }
}

class OracleUniversity extends Education
{
    private String name;
    private String url;
    private String Purpose;
    private String Topic;

    public OracleUniversity(String name, String url, String purpose, String topic) {
        this.name = name;
        this.url = url;
        this.Purpose = purpose;
        this.Topic = topic;
    }

    @Override
    public void url() {
        System.out.println(this.name + " site url is " + this.url);

    }

    @Override
    public void purpose() {
        System.out.println(this.name + " site purpose is " + this.Purpose);
    }

    @Override
    void topic() {
        System.out.println(this.name + " site topic is " + this.Topic);
    }
}


class Udemy extends Education
{
    private String name;
    private String url;
    private String Purpose;
    private String Topic;

    public Udemy(String name, String url, String purpose, String topic) {
        this.name = name;
        this.url = url;
        this.Purpose = purpose;
        this.Topic = topic;
    }

    @Override
    public void url() {
        System.out.println(this.name + " site url is " + this.url);

    }

    @Override
    public void purpose() {
        System.out.println(this.name + " site purpose is " + this.Purpose);
    }

    @Override
    void topic() {
        System.out.println(this.name + " site topic is " + this.Topic);
    }
}

class getSites
{

    // Creating Instance Factory Method
    public SocialMedia getSocialMedia(String siteName)
    {

        if (siteName.equalsIgnoreCase("FACEBOOK"))
            return new facebook("Facebook","www.facebook.com","Connecting people together","Human-Interaction");
        else if (siteName.equalsIgnoreCase("TWITTER"))
            return new Twitter("Twitter","www.twitter.com","Tweet Thoughts","Human-Interaction");
        else
            return null;
    }

    // Creating Static Factory Method
    public static Education getEducation(String siteName)
    {
        if (siteName.equalsIgnoreCase("Oracle"))
            return new OracleUniversity("Oracle University","www.education.oracle.com","Online Education","Providing Java and SQL classes.");
        else if (siteName.equalsIgnoreCase("Udemy"))
            return new Udemy("Udemy","www.Udemy.com","Online Classes", "Providing classes on almost every educational department");
        else
            return null;
    }
}
