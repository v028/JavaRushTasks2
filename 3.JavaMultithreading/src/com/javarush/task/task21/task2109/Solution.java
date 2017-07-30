package com.javarush.task.task21.task2109;

/* 
Запретить клонирование
*/
public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        public A clone() throws CloneNotSupportedException {
            A a = new A(this.i, this.j);
            return a;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof A)) return false;

            A a = (A) o;

            if (getI() != a.getI()) return false;
            return getJ() == a.getJ();
        }

        @Override
        public int hashCode() {
            int result = getI();
            result = 31 * result + getJ();
            return result;
        }
    }

    public static class B extends A {
        private String name;

        public B clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class C extends B implements Cloneable{
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        public C clone() {
            C c = new C(super.getI(), super.getJ(), super.name);
            return c;
        }
    }

    public static void main(String[] args) {

    }
}
