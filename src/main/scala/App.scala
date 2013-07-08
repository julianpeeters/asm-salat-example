import models._
import com.novus.salat._
import com.novus.salat.global._
import com.mongodb.casbah.Imports._

object Main extends App {


  object rec { 
    val model$ = DynamicClassLoader.loadClass("models.rec$", rec$Dump.dump())//Load the "anonymous" class
    val model  = DynamicClassLoader.loadClass("models.rec", recDump.dump())  //Then load the "real" class
    
    def apply(fieldValue: java.lang.Integer) = {
      val method_apply = model$.getMethod("apply", classOf[Int])//populate the instance with values,
      val classInstance = model$.getConstructor().newInstance()//getInstance(module)
      method_apply.invoke(classInstance, fieldValue)//roughly equivalent to using the statement `MyRecord(fieldValue)`
    }
    val typeTemplate = rec(1) //Rename def to MyRecord to preserve the look and feel of salat??
    type rec = typeTemplate.type
  }

 
  object MyRecord { 
    val model$ = DynamicClassLoader.loadClass("models.MyRecord$", MyRecord$Dump.dump())//Load the "anonymous" class
    val model  = DynamicClassLoader.loadClass("models.MyRecord", MyRecordDump.dump())  //Then load the "real" class

    def apply(fieldValue: Object) = {
      val method_apply = model$.getMethod("apply", rec.model)//populate the instance with values,
      val classInstance = model$.getConstructor().newInstance()//getInstance(module)
      method_apply.invoke(classInstance, fieldValue)//roughly equivalent to using the statement `MyRecord(fieldValue)`
    }
    val typeTemplate = MyRecord(rec(1))//typeTemplate) //Rename def to MyRecord to preserve the look and feel of salat??
    type MyRecord = typeTemplate.type
  }


  val dbo = grater[MyRecord.MyRecord].asDBObject(MyRecord.typeTemplate)

    println(dbo)

  val obj = grater[MyRecord.MyRecord].asObject(dbo)
    println(obj)
 
  //println(typeTemplate == obj)
   println(MyRecord.typeTemplate == obj)
}




