package ru.moskpash.chainOfResponsibility.middleware;

abstract public class Middleware {
    private Middleware next = null;

    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.checkNext(email, password);
    }
}
