package testerClass;

public class jUnitMessage {
  private  String msg;

    public jUnitMessage() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public jUnitMessage(String msg) {
        this.msg = msg;
    }
    public String printMsg()
    {
        System.out.println(this.msg);
        return this.msg;
    }
    public String  printHiMgs()
    {
        System.out.println("hi"+ " "+ this.msg);
        return "hi "+ this.msg;
    }
    public static void iMessage()
    {
        System.out.println("hi iam static msg");
    }

}
