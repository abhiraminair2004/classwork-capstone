package demo1;

class Test extends AccessDemo {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        Test t= new Test();
        System.out.println(t.age);       // ✅ default
        System.out.println(t.name);      // ✅ public
        // System.out.println(obj.percentage); ❌ private
        System.out.println(t.grade);     // ✅ protected
    }
}