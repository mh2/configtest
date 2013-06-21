import com.typesafe.config.ConfigFactory

object ConfigTest extends App {
  println("half: " + ConfigFactory.load.getString("half"))
}