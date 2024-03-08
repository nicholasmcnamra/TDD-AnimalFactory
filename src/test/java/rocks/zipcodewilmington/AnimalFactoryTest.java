package rocks.zipcodewilmington;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest() {
        AnimalFactory animalFactory = new AnimalFactory();
        Date birthDate = new Date(2014-11-9);

        Dog dog1 = animalFactory.createDog("George", birthDate);
        DogHouse.add(dog1);

        Integer expectedNumberOfDogs = 1;
        Integer actualNumberOfDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expectedNumberOfDogs, actualNumberOfDogs);
        DogHouse.clear();
    }

    @Test
    public void createCatTest() {
        AnimalFactory animalFactory = new AnimalFactory();
        Date birthDate = new Date(2016-12-8);

        Cat cat1 = animalFactory.createCat("whiskey", birthDate);
        CatHouse.add(cat1);

        Integer expectedNumberOfCats = 1;
        Integer actualNumberOfCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);
        CatHouse.clear();
    }
}
