
public class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook();

    @Test
    void testAdd() {


        int result = phoneBook.add("Братан", "8-999-134-22-11");

        int expected = 1;

        assertEquals(expected, result);
    }