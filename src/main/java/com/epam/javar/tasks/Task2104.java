package com.epam.javar.tasks;

import java.util.HashSet;
    import java.util.Objects;
import java.util.Set;

public class Task2104 {
    private final String first, last;

    public Task2104(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null) return false;
        if (!(o instanceof Task2104)) return false;

        Task2104 n = (Task2104) o;
        return  Objects.equals(this.first, n.first) && Objects.equals(this.last, n.last);

    }

    @Override
    public int hashCode() {
        return 31  * Objects.hashCode(first)+ Objects.hashCode(last);
    }

    public static void main(String[] args) {
        Set<Task2104> s = new HashSet<>();
        s.add(new Task2104("Mickey", "Mouse"));
        System.out.println(s.contains(new Task2104("Mickey", "Mouse")));
    }
}
