package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class UserTest {

    @Test
    public void getNamereturnsName() throws Exception {
        Users testUsers= setupusers();
        assertEquals("Otieno", testUsers.getName());
    }

    @Test
    public void setName() {
        Users testUsers= setupusers();
        testUsers.setName("Otieno");
        assertNotEquals("Okello", testUsers.getName());
    }

    @Test
    public void getRoleReturnsRole() {
        Users testUsers= setupusers();
        assertEquals("handle finance business", testUsers.getRole());
    }

    @Test
    public void setRole() {
        Users testUsers= setupusers();
        testUsers.setRole("handle finance business");
        assertNotEquals("handle accounting business", testUsers.getRole());
    }

    @Test
    public void getPositionReturnsPosition() {
        Users testUsers= setupusers();
        assertEquals("officer", testUsers.getPosition());
    }

    @Test
    public void setPosition() {
        Users testUsers= setupusers();
        testUsers.setPosition("officer");
        assertNotEquals("manager", testUsers.getPosition());
    }

    @Test
    public void getIdReturnsId() {

    }

    @Test
    public void setId() {
    }

    public  Users setupusers(){
        return new Users("Otieno","handle finance business","officer",1);
    }
}
