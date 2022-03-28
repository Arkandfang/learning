package basic;

/**
 * @author fangzhou
 * @date 2022-03-28 16:04
 */
public class ReferenceEmp {
    static class Emp {
        public int age;
    }

    public static void change(Emp emp) {
        emp.age = 50;
        System.out.println(emp.age);
        emp = new Emp();//再创建一个对象
        emp.age = 100;
        System.out.println(emp.age);
    }

    public static void main(String[] args) {
        Emp emp = new Emp();
        emp.age = 100;
        System.out.println(emp.age);
        change(emp);
        System.out.println(emp.age);
    }

}
