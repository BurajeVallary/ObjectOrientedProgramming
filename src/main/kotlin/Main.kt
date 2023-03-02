fun main() {
    var buraje=Human("Mike",29,60)
    buraje.eat(50)
    println(buraje.weight)
    buraje.speak("I am progressing well")
    buraje.birthday()
    println(buraje.age)

    var hope=User("Joy","Jane","joyjane@gmail.com", "075879480","joy@janne21")
    println(hope.password)
    println(hope.email)

}
class Human (var name:String, var age:Int,var weight:Int){


    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        weight += foodWeight

    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age+=1
    }

}
data class User(var firstname:String, var lastname:String, var email:String , var phonenumber:String, var password:String)
