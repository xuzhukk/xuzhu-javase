package xuzhu.test;

public class OuterClass {  
    public void display(final String name,String age){  
        class InnerClass{  
            void display(){  
                System.out.println(name);  
            }  
        }  
    }  
}  


/**
 * 我们给匿名内部类传递参数的时候，若该形参在内部类中需要被使用，那么该形参必须要为final。也就是说：当所在的方法的形参需要被内部类里面使用时，该形参必须为final。
      为什么必须要为final呢？
      首先我们知道在内部类编译成功后，它会产生一个class文件，该class文件与外部类并不是同一class文件，仅仅只保留对外部类的引用。
      当外部类传入的参数需要被内部类调用时，从java程序的角度来看是直接被调用：
 * 
 * 从上面代码中看好像name参数应该是被内部类直接调用？其实不然，在java编译之后实际的操作如下：
[java] view plain copy
public class OuterClass$InnerClass {  
    public InnerClass(String name,String age){  
        this.InnerClass$name = name;  
        this.InnerClass$age = age;  
    }  
      
      
    public void display(){  
        System.out.println(this.InnerClass$name + "----" + this.InnerClass$age );  
    }  
}  
       所以从上面代码来看，内部类并不是直接调用方法传递的参数，而是利用自身的构造器对传入的参数进行备份，
       自己内部方法调用的实际上时自己的属性而不是外部方法传递进来的参数。
       直到这里还没有解释为什么是final？在内部类中的属性和外部方法的参数两者从外表上看是同一个东西，但实际上却不是，
       所以他们两者是可以任意变化的，也就是说在内部类中我对属性的改变并不会影响到外部的形参，
       而然这从程序员的角度来看这是不可行的，毕竟站在程序的角度来看这两个根本就是同一个，如果内部类该变了，
       而外部方法的形参却没有改变这是难以理解和不可接受的，所以为了保持参数的一致性，就规定使用final来避免形参的不改变。
      简单理解就是，拷贝引用，为了避免引用值发生改变，例如被外部类的方法修改等，而导致内部类得到的值不一致，于是用final来让该引用不可改变。
      故如果定义了一个匿名内部类，并且希望它使用一个其外部定义的参数，那么编译器会要求该参数引用是final的。
 * 
 */
