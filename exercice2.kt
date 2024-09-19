import kotlin.random.Random
fun lanceDes(nb_des:Int,faces_des:Int): Int {
    for (des in nb_des..faces_des){
    }
    return((nb_des..faces_des*nb_des).random())
}

fun main(){
    print(lanceDes(4,20))
}