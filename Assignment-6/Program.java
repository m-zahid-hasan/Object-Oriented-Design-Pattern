
public class Program {
    public static void main(String[] args) {
        WebPage myPage = new BasicWebPage("Sample HTML", "Sample Stylesheet", "Sample Script");
        myPage = new AuthorizedWebPage(myPage);
        myPage = new AuthenticatedWebPage(myPage);
        myPage.display();
    }
}
