fun bouleDeFeu(caster:String,cible:String,scoreAttakCaster:Int,scoreDefCible:Int,hpCible:Int):Any{
    val nb_des = scoreAttakCaster/3
    val defTotal = scoreDefCible + hpCible // defense total + pv de la cible
    val pv = defTotal
    var degat = pv - nb_des
    return "$caster lance une boule de feu et inflige $degat points de dégâts à $cible."
}

fun main(){
    print(bouleDeFeu("Salameche","Bulbi",15,15,20))
}