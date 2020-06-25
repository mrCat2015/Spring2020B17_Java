package day48_Abstraction;
interface I1{ //1 abstract method
    void method1();
}
interface I2 extends I1{ //2 abstract method
    void method2();

}
abstract  class AC implements I2{//3 abstract method
    abstract  void method3();
}

public abstract class extends_implements  extends AC {
    @Override
    public void method2(){//override one, 2 abstract methods left

    }
  /*  @Override
    public void method3(){

    }
    @Override
    public void method1(){

    }*/

    class testRun extends extends_implements{
        @Override
        public void method3(){

        }
        @Override
        public void method1(){

        }
    }

}
