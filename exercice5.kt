fun boirePotion(cible:String, hpCible:Int, hpTotal:Int,heal:Int):Any{
    val exHp = 0 // hp initiale de la cible
    var ajout_power = heal + hpCible // ajout de vie
    if (ajout_power > hpTotal) ajout_power = hpTotal  // hp max
    val result_hp = ajout_power - hpCible

    return "$cible boit une potion et recupere $result_hp PV"
}

fun main(){
    print(boirePotion("Draven",18,20,6))
}