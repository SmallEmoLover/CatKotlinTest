package pet

enum class Sex {
    MALE {
        override fun toString(): String = "Male"
    },
    FEMALE {
        override fun toString(): String = "Female"
    }
}