fun main(args: Array<String>) {
    // a estrutura de lista aumenta ou encolhe conforme adicionamos e removemos itens
    val names = listOf<String>("Hermeson", "Bastos")
    println(names[0])
    println(names);

    // uma lista mutável nos permite adicionar e remover itens
    val namesMutable = mutableListOf("Hermeson", "Bastos")

    // adicionando um elemento
    namesMutable.add("Maia")

    // removendo elemento espescífico
    namesMutable.remove("Hermeson")
    // removento elemento por índice
    namesMutable.removeAt(1)

    // percorrendo uma lista elemento por elemento
    namesMutable.forEach { println(it) }

    // um set não permite elementos duplicados na mesma lista
    // não é possível adicionar ou remover elementos
    val namesSet = setOf("Hermeson", "Bastos", "Hermeson");
    namesSet.forEach{ println(it) }
}