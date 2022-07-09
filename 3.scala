object scala_3 {
   def main(args: Array[String])= {
    val Salary:Int=normal(40)+OT(30)
    println( "Net Salary : " + (Salary-tax(Salary)) );
   }
   
   def normal( a:Int ) : Int =a*250;
   def OT(a:Int):Int=a*85;
   def tax(a:Int):Double=a*0.12;
}