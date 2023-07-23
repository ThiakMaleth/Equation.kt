//1. Solve the equation x2+10x+25 = 0  -x = (-b+-Sqrt(b2-4ac))/2a
import kotlin.math.sqrt

fun main(){

    val a = 1.0
    val b = 10.0
    val c= 25.0

    val discriminant = b*b-4*a*c

    if(discriminant > 0){
        val root1 = (-b+sqrt(discriminant))/(2*a)
        val root2 =  (-b-sqrt(discriminant))/(2*a)

        println("Root 1: $root1")
        println("Root 2: $root2")
    }

    else if(discriminant == 0.0){
        val root = -b/(2*a)

        println("Root: $root")
    }

    else{
        println("No real roots exists.")
    }
}