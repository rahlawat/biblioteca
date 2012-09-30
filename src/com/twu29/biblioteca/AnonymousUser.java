package com.twu29.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: dell
 * Date: 9/30/12
 * Time: 1:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class AnonymousUser implements IUser {
    @Override
    public String toString() {
        return null;
    }

    @Override
    public boolean isLoggedIn() {
         return false;
    }
}
