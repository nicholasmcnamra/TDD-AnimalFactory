package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
        DogHouse.clear();
    }

    @Test
    public void addDogTest() {
        DogHouse dogHouse = new DogHouse();

        dogHouse.add(new Dog(7258));

        Integer expectedDogsInDogHouse = 1;
        Integer actualDogsInDogHouse = dogHouse.getNumberOfDogs();
        Assert.assertEquals(expectedDogsInDogHouse, actualDogsInDogHouse);
        DogHouse.clear();
    }

    @Test
    public void removeDogWithIdTest() {
        DogHouse dogHouse = new DogHouse();

        dogHouse.add(new Dog(8523));
        dogHouse.add(new Dog(7253));

        Integer expectedDogsInDogHouse = 1;
        dogHouse.remove(8523);
        Integer actualDogsInDogHouse = dogHouse.getNumberOfDogs();
        Assert.assertEquals(expectedDogsInDogHouse, actualDogsInDogHouse);
        DogHouse.clear();
    }

    @Test
    public void removeDogWithDogTest() {
        DogHouse dogHouse = new DogHouse();
        Dog dog1 = new Dog(7238, "homeDog");
        Dog dog2 = new Dog(8253, "yardDog");

        dogHouse.add(dog1);
        dogHouse.add(dog2);
        Integer expectedDogsInDogHouse = 1;
        dogHouse.remove(dog2);
        Integer actualDogsInDogHouse = dogHouse.getNumberOfDogs();
        Assert.assertEquals(expectedDogsInDogHouse, actualDogsInDogHouse);
        DogHouse.clear();
    }

    @Test
    public void getDogWithIdTest() {
        DogHouse dogHouse = new DogHouse();
        Dog dog1 = new Dog(8237);

        dogHouse.add(dog1);
        Dog expectedDog = dog1;
        Dog actualDog = dogHouse.getDogById(8237);
        Assert.assertEquals(expectedDog, actualDog);
        DogHouse.clear();
    }

    @Test
    public void getNumberofDogsTest() {
        DogHouse dogHouse = new DogHouse();

        dogHouse.add(new Dog(8345));
        dogHouse.add(new Dog(7243));
        Integer expectedDogs = 2;
        Integer actualDogs = dogHouse.getNumberOfDogs();
        Assert.assertEquals(expectedDogs, actualDogs);
        DogHouse.clear();
    }
}
