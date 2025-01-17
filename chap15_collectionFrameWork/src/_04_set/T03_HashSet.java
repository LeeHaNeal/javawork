package _04_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// equals()를 오버라이딩 했을 때 hashCode()를 반드시 오버라이딩 해야됨

class Member {
    String name;
    int age;

    public Member(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member m = (Member) obj;
            return m.name.equals(name) && m.age == age;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public String toString() {
        return "Member{name='" + name + "', age=" + age + "}";
    }
}

public class T03_HashSet {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("홍길동", 20));
        set.add(new Member("홍길동", 20));

        System.out.println("총 객체 수 : " + set.size());

        System.out.println(set);

        Iterator<Member> iter = set.iterator();
        iterPrint(iter);
    }

    static void iterPrint(Iterator<Member> i) {
        while (i.hasNext()) {
            Member m = i.next();
            System.out.print(m + " "); // Member 객체의 toString() 호출
        }
        System.out.println();
    }
}
