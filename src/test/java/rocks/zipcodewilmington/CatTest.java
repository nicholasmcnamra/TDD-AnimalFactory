package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        String expectedName = "Dolores";
        Cat cat = new Cat(Integer.valueOf(9045),expectedName);

        cat.setName(expectedName);

        String actualName = cat.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest() {
        Cat cat = new Cat(Integer.valueOf(8888), "lucy");
        String expected = "meow!";

        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest() {
        Date expectedBirthDate = new Date(2022, 11, 21);
        Cat cat = new Cat(Integer.valueOf(9052), expectedBirthDate);

        cat.setBirthDate(expectedBirthDate);

        Date actualBirthDate = cat.getBirthDate();
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

    @Test
    public void eatFoodTest() {
        Food fish = new Food();
        Cat cat = new Cat(Integer.valueOf(9022), "josh");

        Integer expectedNumberMeals = cat.getNumberOfMealsEaten() + 1;
        cat.eat(fish);
        Integer actualNumberOfMeals = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expectedNumberMeals, actualNumberOfMeals);
    }

    @Test
    public void getIdTest() {
        Integer expectedId = 9036;
        Cat cat = new Cat(expectedId,"bart");

        Integer actualId = cat.getId();
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void catInstanceofAnimalTest() {
        Cat cat = new Cat(Integer.valueOf(7021), "harry");
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void catInstanceOfMammalTest() {
        Cat cat = new Cat(Integer.valueOf(8522), "tilly");
        Assert.assertTrue(cat instanceof Mammal);
    }

}
