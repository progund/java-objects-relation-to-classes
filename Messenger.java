public class Messenger {
  public static void main(String[] args) {
    String to = System.getProperty("user.name");
    Message messageToMyself =
      new Message(to,
                  "Hello, " + to,
                  "Here's a small message");
    messageToMyself.send();
  }
}
