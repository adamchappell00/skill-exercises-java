import interview.CompressionStrings;
import interview.DuplicateSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InterviewTests {


    // TARGET EXERCISE - DuplicateSolution
    @Test
    public void shouldRemoveDuplicates(){
        // Arrange - Input array and expected output array
            int[] nums = {1,1,2,2,3,3,3,4};
            int[] expectedNums = {1,2,3,4};
        // Act - Implemented Solution Call
        int k = DuplicateSolution.removeDuplicates(nums);
        // Assert - TEST ASSERTION that the resulting output matches the expected output
        Assertions.assertSame(k,expectedNums.length);
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
        System.out.println("Remove Duplicates Input: " + nums);
        System.out.println("Remove Duplicates Output: " + k);

    }

    // TARGET EXERCISE - CompressionStrings
    @Test
    public void shouldDecompressString(){
        // Arrange - Compressed Input Strings and Expected Decompressed Outputs
        String compressedInput1 = "5c";
        String compressedInput2 = "4a12k3h1g";
        String expectedOutputString1 = "ccccc";
        String expectedOutputString2 = "aaaakkkkkkkkkkkkhhhg";
        // Act - Perform the Decompression
        String actualOutput1 = CompressionStrings.decompressString(compressedInput1);
        String actualOutput2 = CompressionStrings.decompressString(compressedInput2);
        // Assert
        assertEquals(expectedOutputString1, actualOutput1);
        assertEquals(expectedOutputString2, actualOutput2);
        // Print to Show
        System.out.println("Input 1: "+compressedInput1);
        System.out.println("Actual Output1: "+actualOutput1);
        System.out.println("Input 2: " + compressedInput2);
        System.out.println("Actual Output2: "+actualOutput2);
    }

    @Test
    public void shouldCompressString(){
        // Arrange - Uncompressed Input Strings and Expected Compressed Outputs
        String uncompressedInput1 = "ppplllliin";
        String uncompressedInput2 = "HjjjjjmmmmmmmmmmmmWW";
        String expectedOutputString1 = "3p4l2i1n";
        String expectedOutputString2 = "1H5j12m2W";
        // Act - Perform the Compression
        String actualOutput1 = CompressionStrings.compressString(uncompressedInput1);
        String actualOutput2 = CompressionStrings.compressString(uncompressedInput2);
        // Assert
        assertEquals(expectedOutputString1, actualOutput1);
        assertEquals(expectedOutputString2, actualOutput2);
        System.out.println("Input 1: "+ uncompressedInput1);
        System.out.println("Actual Output1: "+actualOutput1);
        System.out.println("Input 2: " + uncompressedInput2);
        System.out.println("Actual Output2: "+actualOutput2);
    }
}
