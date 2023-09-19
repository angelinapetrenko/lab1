import static org.junit.jupiter.api.Assertions.*;

class MyContainerTest {
    MyContainer<Integer> container;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        container = new MyContainer<Integer>();
        System.out.println("Start of one Test");

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        container = null;
        System.out.println("End of one Test");
    }

    @org.junit.jupiter.api.Test
    void addTest() {
        int tempNumberForAdd = 123;
        container.add(tempNumberForAdd);
        assertEquals(tempNumberForAdd, container.get(0));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        container.add(115);
        container.add(8);
        int tempNumberForRemove = 89;
        container.add(tempNumberForRemove);
        assertTrue(container.remove(tempNumberForRemove));
        assertFalse(container.remove(tempNumberForRemove));

    }

    @org.junit.jupiter.api.Test
    void removeAt() {
        container.add(5);
        container.add(8);
        int tempNumberForRemove = 89;
        container.add(tempNumberForRemove);
        assertEquals(8, container.removeAt(1));

    }
}