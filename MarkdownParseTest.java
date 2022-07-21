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
    
    public void testGetLinks1() throws IOException {

        Path fileName = Path.of("/Users/Aisha/Documents/GitHub/markdown-parser-1/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, links);
    }

    @Test
    public void testGetLinks3() throws IOException {

        Path fileName = Path.of("/Users/Aisha/Documents/GitHub/markdown-parser-1/test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("more text here");
        assertEquals(expected, links);
    }

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

   

    public static void main(String[] args) {
        return;
    }
}