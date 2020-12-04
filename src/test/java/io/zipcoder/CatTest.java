package io.zipcoder;
import io.zipcoder.Cat;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void SpeakTest(){
        //given
        Cat testCat = new Cat("");

        //when
        String expected = "Meow";

        //then
        String actual = testCat.speak();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getCatNameTest(){
        //given
        String catName = "david";
        Cat testCat = new Cat(catName);

        //when
        String expected = catName;

        //then
        String actual = testCat.getName();
        Assert.assertEquals(expected,actual);

     @Test
     public void setCatNameTest(){
         //given
        Cat cat = new Cat("");

        //when
            expected = "david";
            cat.setName(expected);

        //then
            actual = cat.getName();
        Assert.assertEquals(expected,actual);

        }



    }
}
