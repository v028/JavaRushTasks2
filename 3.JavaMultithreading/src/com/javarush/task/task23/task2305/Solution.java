package com.javarush.task.task23.task2305;

/* 
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution sol1 = new Solution();
        Solution sol2 = new Solution();
        Solution[] solut = new Solution[2];
        solut[0] = sol1;
        solut[1] = sol2;

        for (Solution element : solut) {
            element.innerClasses[0] = element.new InnerClass();
            element.innerClasses[1] = element.new InnerClass();
        }
        return solut;
    }

    public static void main(String[] args) {

    }
}
