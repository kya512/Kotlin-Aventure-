fun attaque(hp:Int, degatArme:Int, defenseCible:Int, attaquant:String, cible:String): Any {
    val degat= degatArme - defenseCible
    val hp_restant = hp - degat
    val pointDeVie = hp - hp_restant
    if (hp_restant >= 0) pointDeVie else 0
    return "$attaquant attaque $cible pour $pointDeVie points de degats"
}

fun main(){
    print(attaque(15,4,3,"Jhin","Draven"))

}