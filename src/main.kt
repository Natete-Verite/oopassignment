fun main(){
    var huma = Human("Verite",24,70)
    huma.eat(5)
    println(huma.weight)
    huma.speak("I love French")
    huma.birthday()

    var Student = User("Natete","Verite", "nateteverite@gmail.com",789415454,"verite")
    println(Student.email)
    println(Student.passWord)
}
class Human(var name:String, var age:Int, var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight KGS of food")
            weight+=foodWeight
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age++
        println(age)
    }
}
data class User(var firstName:String, var lastName:String, var email:String, var phoneNumber:Int, var passWord:String)