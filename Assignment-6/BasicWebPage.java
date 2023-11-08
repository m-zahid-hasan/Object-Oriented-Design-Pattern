
public class BasicWebPage implements WebPage {
    private String html;
    private String styleSheet;
    private String script;

    public BasicWebPage(String html, String styleSheet, String script) {
        this.html = html;
        this.styleSheet = styleSheet;
        this.script = script;
    }

    public void display() {
        System.out.println("Displaying basic web page with HTML: " + html + ", Stylesheet: " + styleSheet + ", Script: " + script);
    }
}
