fun missileMagique(caster:String,cible:String,scoreAttakCaster:Int,scoreDefCible:Int,hpCible:Int):Any{

    val missile = listOf(1..6)
    
    var defMissile = missile + scoreDefCible
    val nb_missileMagique = scoreAttakCaster/2
    return "$caster lance une missile magique et inflige $nb_missileMagique points de dégâts à $cible."

}

fun main(){
}