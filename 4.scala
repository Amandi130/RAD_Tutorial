object scala_4{
    def main(args: Array[String])= {
      println("Enter the ticket price");
      val x=scala.io.StdIn.readInt();
     
      println("Profit="+(profit(x)));
    }

    def attend(x:Int):Int=120+(15-x)/5*20;
    def price(x:Int):Int=x*attend(x);
    def cost(x:Int):Int=500+3*attend(x);
    def profit(x:Int):Int=price(x)-cost(x);
}
