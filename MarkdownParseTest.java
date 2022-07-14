import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.Test;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    // @Test 
    // public static void main(String[] args) throws IOException {
    //     Path fileName = Path.of("test-file.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> links = getLinks(content);
	//     System.out.println(links);
    //     //System.out.println("Nice this works!");
    // }

    @Test
    public void testGetLinks() throws IOException{
        //
        ArrayList<String> correct = new ArrayList<>();
        correct.add("https://something.com");
        correct.add("some-thing.html"); //expected)
        Path fileName = Path.of("/Users/Aisha/Documents/GitHub/markdown-parser-1/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content); //actual
        assertEquals(correct, links);
    }
    
    @Test

    public void testGetLinks1() throws IOException {

        Path fileName = Path.of("/Users/Aisha/Documents/GitHub/markdown-parser-1/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, links);

    }

/*
    @Test
    public void testGetLinks2() throws IOException {

        Path fileName = Path.of("/Users/Aisha/Documents/GitHub/markdown-parser-1/test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://google.com");
        expected.add("some-thing.html");
        assertEquals(expected, links);

    }
*/


    @Test
    public void testGetLinks3() throws IOException {

        Path fileName = Path.of("/Users/Aisha/Documents/GitHub/markdown-parser-1/test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("more text here");
        assertEquals(expected, links);

    }
/*
    @Test
    public void testGetLinks4() throws IOException {

        Path fileName = Path.of("/Users/Aisha/Documents/GitHub/markdown-parser-1/test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, links);

    }
*/

    @Test
    public void testGetLinks5() throws IOException {

        Path fileName = Path.of("/Users/Aisha/Documents/GitHub/markdown-parser-1/test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("page.com");
        assertEquals(expected, links);

    }

    @Test
    public void testGetLinks6() throws IOException {

        Path fileName = Path.of("/Users/Aisha/Documents/GitHub/markdown-parser-1/test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("page.com");
        assertEquals(expected, links);

    }

    /*
    @Test
    public void testGetLinks7() throws IOException {
        

        Path fileName = Path.of("/Users/Aisha/Documents/GitHub/markdown-parser-1/test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, links);

    }


    
    @Test
    public void testGetLinks8() throws IOException {

        Path fileName = Path.of("/Users/Aisha/Documents/GitHub/markdown-parser-1/test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("a link on the first line");
        assertEquals(expected, links);

    }
    */
    

    public static void main(String[] args) {
        return;
    }

}