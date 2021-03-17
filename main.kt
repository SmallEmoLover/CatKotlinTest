import pet.*
import java.util.Date

fun main(args: Array<String>) {
    val flueVaccine =
        Vaccination("Flue", Date(2012, 5, 5), "Saint George`s clinic")
    val rabiesVaccine =
        Vaccination("Rabies", Date(2020, 12, 1), "Municipal clinic of Texas")
    val plagueVaccine =
        Vaccination("Plague", Date(2000, 4, 11), "International cat clinic")

    val matthew = Owner("Matthew", "Gray", "Washington",
        Date(2000, 4, 17), "Third avenue, Seattle")
    val april = Owner("April", "Gray", "Elizabeth",
        Date(1998, 10, 21), "Third avenue, Seattle")
    val sarah = Owner("Sarah", "Adrian", "George",
        Date(1966, 0, 1), "Third avenue")
    val elizabeth = Owner("Elizabeth", "Smith", "Mike",
        Date(2008, 8, 25), "Third avenue")

    val fluffy = Cat("Fluffy", 15, Cat.Sex.FEMALE, "Gray", matthew, listOf(flueVaccine))
    val kitty = Cat("Kitty", 12, Cat.Sex.FEMALE, "Abyssinian", matthew, listOf(rabiesVaccine))
    val oliver = Cat("Oliver", 10, Cat.Sex.MALE, "Asian", april, listOf(flueVaccine, rabiesVaccine))
    val luna = Cat("Luna", 5, Cat.Sex.FEMALE, "Bengal", sarah, listOf(flueVaccine, plagueVaccine))
    val milo = Cat("Milo", 5, Cat.Sex.MALE, "Bengal", elizabeth, listOf(plagueVaccine, rabiesVaccine))
    val leo = Cat("Leo", 16, Cat.Sex.MALE, "Donskoy", matthew, listOf(flueVaccine, rabiesVaccine, plagueVaccine))
    val smokey = Cat("Smokey", 2, Cat.Sex.MALE, "Kanaani-katze", vaccinations = listOf(flueVaccine, rabiesVaccine))
    val lilly = Cat("Lilly", 0, Cat.Sex.FEMALE, "Manx")
    val daisy = Cat("Daisy", 3, Cat.Sex.FEMALE, "Manchkin", matthew)

    listOf(fluffy, kitty, oliver, luna, milo, leo, smokey, lilly, daisy).forEach() {println(it)}
}