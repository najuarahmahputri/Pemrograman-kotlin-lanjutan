fun main(args: Array<String>) {
    var x:Int
    println("Example of break and continue in For-loop")
    for (x in 1..10) {
        if (x == 7) break
        if (x == 3) continue
        print("$x")
    }
    print('\n')
}