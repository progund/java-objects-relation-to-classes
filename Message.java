import javax.swing.JOptionPane;

public class Message {
  private String body;
  private String to;
  private String subject;

  public Message(String to, String subject, String body) {
    this.to = to;
    this.subject = subject;
    this.body = body;
  }

  private String formatContent() {
    return new StringBuilder("<html>")
      .append("<strong>To: </strong>")
      .append(to)
      .append("<br><strong>Subject: </strong>")
      .append(subject)
      .append("<br><br>")
      .append("<p>")
      .append(body)
      .append("</p></html>")
      .toString();
  }
  
  public void send() {
    JOptionPane
      .showMessageDialog(null,
                         formatContent());
  }

  public void cancel() {
    JOptionPane
      .showMessageDialog(null,
                         "Your message was cancelled.",
                         "Message cancelled",
                         JOptionPane.WARNING_MESSAGE);
  }
}
