fun calculDegatArme(nb_des:Int, faces_des:Int, qualite:Int, ccA:Int, ccM:Int): Int {
    val score = if (lanceDes(nb_des, faces_des) >= ccA) ccM*lanceDes(nb_des, faces_des)+qualite else 0
    return score
}

fun main(){
    print(calculDegatArme(2,4,2,10,2))
}