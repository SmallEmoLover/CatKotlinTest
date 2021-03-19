package pets.model

import java.util.Date

data class Vaccination(val name: String, val date: Date, val clinic: String) {
    override fun toString(): String = "Vaccination $name at $clinic, $date"
}