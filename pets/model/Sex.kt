package pets.model

enum class Sex {
    MALE {
        override fun toString() = "Male"
    },
    FEMALE {
        override fun toString() = "Female"
    }
}