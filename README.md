# zenvia-java
A simple implementation to send SMS messages through Zenvia Rest API using Jersey client.

# How to use:

```
public static void main(String[] args) {
  final String code = "user-code";
  final String password = "some-password";

  ZenviaRequest sms = new ZenviaRequest();
  sms.setFrom("Carlos Spohr Test");
  sms.setTo("5545000009999");
  sms.setMsg("Teste de envio de mensagens SMS");

  ZenviaService.getInstance().send(code, password, sms);
}
``` 
