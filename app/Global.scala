import models.User
import play.api._

/**
 * Created with IntelliJ IDEA.
 * User: wyz
 * Date: 13-10-29
 * Time: 上午11:58
 * To change this template use File | Settings | File Templates.
 */
object Global extends GlobalSettings{

  override def onStart(app: Application){
    if(User.queryAll().isEmpty){
      Seq(
        User("admin","admin")
      ).foreach(User.save)
    }
  }
}
