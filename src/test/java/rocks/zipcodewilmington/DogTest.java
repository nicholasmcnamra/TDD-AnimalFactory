package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void newDogTest() {
        String givenName = "chump";
        Date givenBirthDate = new Date(2011, 11, 23);
        Integer givenId = Integer.valueOf(8783);

        Dog expectedDog = new Dog(givenName, givenBirthDate, givenId);

        String retrievedName = expectedDog.getName();
        Date retrievedBirthDate = expectedDog.getBirthDate();
        Integer retrievedId = expectedDog.getId();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest() {
        String expected = "bark!";
        Dog dog = new Dog(5438);
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest() {
        Date expectedBirthDate = new Date(2016, 12, 03);
        Dog dog = new Dog(Integer.valueOf(0), expectedBirthDate);

        dog.setBirthDate(expectedBirthDate);

        Date actualBirthdate = dog.getBirthDate();
        Assert.assertEquals(expectedBirthDate, actualBirthdate);
    }

    @Test
    public void eatFoodTest() {
        Food beefJerkey = new Food();
        Dog dog = new Dog(Integer.valueOf(0));

        Integer expectedNumberMeals = dog.getNumberOfMealsEaten() + 1;
        dog.eat(beefJerkey);
        Integer actualNumberMeals = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expectedNumberMeals, actualNumberMeals);
    }

    @Test
    public void setIdTest() {
        Integer expectedId = 7172;
        Dog dog = new Dog(expectedId);

        Integer actualId = dog.getId();
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void dogInstanceOfAnimalTest() {
        Date birthDate = new Date(2017, 12, 07);
        Dog dog = new Dog("hazel", birthDate, Integer.valueOf(2744));

        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void dogInstanceOfMammalTest() {
        Date birthDate = new Date(2018, 9, 19);
        Dog dog = new Dog("henry", birthDate, Integer.valueOf(7322));

        Assert.assertTrue(dog instanceof Mammal);
    }
}