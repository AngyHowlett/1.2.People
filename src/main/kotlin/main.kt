import java.sql.DriverManager.println

fun main(){
    val likes = 15
    val wordForUsers = if (likes == 0) "никому" else if (likes % 10 == 1) "человеку" else if (likes % 10 == 2 || likes % 10 == 3 ) "людям" else "человекам"
    println("Понравилось $likes $wordForUsers")

}
