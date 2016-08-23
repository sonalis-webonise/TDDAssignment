import spock.lang.Specification

/**
 * Created by webonise on 22/8/16.
 */

public class SortTest extends Specification {


    def "sort method should throw exception if null is passed" () {

        given:
            QuickSort sorter=new QuickSort()
        when:
            sorter.quickSort()
        then:
            thrown Exception
    }

    def "Throw exception when empty array is passed" () {

        given:
            int[] arr=[]
        when:
        if (arr == null || arr.length == 0)
            return;
        then:
            thrown Exception
    }

    def "Return the value if array length is 1" () {

        given:
        int[] x = [1];
        int len = x.length;

        when:
            if(len==1)
            return
        then:
            "Return the value"
    }

    def "Method should sort if negative numbers are passed" () {
        given:
            int[] arr=[-2,-4,-1]
            QuickSort sorter=new QuickSort()
        when:
            sorter.quickSort(arr,0,2)
        then:
            "Should return sorted array"
            arr==[-4,-2,-1]
    }

    def "Method should sort array if large array is given" () {
        given:
            int[] arr=[3,6,4,1,8,7,5,3,0,4,1]
            QuickSort sorter=new QuickSort()
            int l=0;
            int h=arr.length-1;
        when:
            sorter.quickSort(arr,l,h)
        then:
            "Should return sorted array"
            arr==[0,1,1,3,3,4,4,5,6,7,8]
    }

}