package pet

data class Cat(val name: String, var age: Int, val sex: Sex, val kind: String, var owner: Owner? = null,
               var vaccinations: List<Vaccination>? = null) {

    enum class Sex {
        MALE, FEMALE
    }

    override fun toString(): String =
        "${sex.name.toLowerCase().capitalize()} cat $name, $age years old, $kind kind," +
            "\nOwner: ${owner ?: "no owner"}" +
            "\nList of vaccinations:\n${vaccinations?.fold("") {result, value -> result + value + "\n"} ?: "no vaccinations\n"}"
}