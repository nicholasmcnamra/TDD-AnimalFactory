package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest() {
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat(Integer.valueOf(0), "name");

        Integer expectedNumberCats = catHouse.getNumberOfCats() + 1;
        catHouse.add(cat);
        Integer actualNumberCats = catHouse.getNumberOfCats();
        Assert.assertEquals(expectedNumberCats, actualNumberCats);
        CatHouse.clear();
    }

    @Test
    public void removeCatWithIdTest() {
        Cat cat = new Cat(Integer.valueOf(7825), "removeWithId");
        CatHouse catHouse = new CatHouse();

        Integer expectedNumberCats = catHouse.getNumberOfCats();
        catHouse.add(cat);
        catHouse.remove(7825);
        Integer actualNumberCats = catHouse.getNumberOfCats();

        Assert.assertEquals(expectedNumberCats, actualNumberCats);
        CatHouse.clear();
    }

    @Test
    public void removeCatObjectTest() {
        Cat cat = new Cat(Integer.valueOf(7023), "removeCat");
        CatHouse catHouse = new CatHouse();

        Integer expectedNumberCats = catHouse.getNumberOfCats();
        catHouse.add(cat);
        catHouse.remove(cat);
        Integer actualNumberCats = catHouse.getNumberOfCats();

        Assert.assertEquals(expectedNumberCats, actualNumberCats);
        CatHouse.clear();
    }

    @Test
    public void getCatWithIdTest() {
        Cat cat = new Cat(Integer.valueOf(7425), "getCatId");
        CatHouse catHouse = new CatHouse();

        catHouse.add(cat);
        Cat expectedCat = cat;
        Cat actualCat = catHouse.getCatById(7425);
        Assert.assertEquals(expectedCat, actualCat);
        CatHouse.clear();
    }

    @Test
    public void getNumberOfCatsTest() {
        Cat cat1 = new Cat(Integer.valueOf(8534), "leila");
        Cat cat2 = new Cat(Integer.valueOf(7283), "leo");

        CatHouse catHouse = new CatHouse();

        catHouse.add(cat1);
        catHouse.add(cat2);

        Integer expectedCats = 2;
        Integer actualCats = catHouse.getNumberOfCats();
        Assert.assertEquals(expectedCats, actualCats);
        CatHouse.clear();
    }

}
