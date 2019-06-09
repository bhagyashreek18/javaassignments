public class InvalidOperatorException extends Exception {
   String id;

   public InvalidOperatorException(String x) {
      id = x;
   }

   public String toString() {
      return "InvalidOperatorException[" + id + "]";
   }
}