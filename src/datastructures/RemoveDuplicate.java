package datastructures;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.Assert.assertArrayEquals;

public class RemoveDuplicate {

    private Integer[] removeDuplicate(Integer[] array){
        Set<Integer> aSet = new LinkedHashSet<>(array.length);
        aSet.addAll(Arrays.asList(array));
        return aSet.toArray(new Integer[0]);
    }

    @Test
    public void testArrayWithDuplicates(){
        Integer[] duplicateArray = new Integer[]{1,2,3,3,4,5,3};
        Integer[] actual = removeDuplicate(duplicateArray);
        Integer[] expectedArray = new Integer[]{1,2,3,4,5};
        assertArrayEquals(actual,expectedArray);
    }
}
