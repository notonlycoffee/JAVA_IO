
计算机并不区分二进制文件和文本文件.所有的文件都是以二进制形式进行存储的,因为从本质上来说,所有的文件都是二进制文件.



二进制IO

![二进制IO的继承管理](../img/figure1.jpg)

### 主要使用到的类
* InputStream
* OutputStream
* FileInputStream
* FileOutputStream

---

从外部文件中将数据输入到程序中,使用FileInputStream,必须保证外部文件已经存在

将程序中的数据输出到外部文件中,如果外部文件不存在就直接创建该文件,不用确保文件是否已经存在,
但是在某些逻辑中,会让你判断如果文件已经存在就停止向这个文件进行输出操作,防止旧文件内容被删除;

---

###FilterInputStream和FilterOutputStream

包含子类:*DataInputStream*和*DataOutputStream*

过滤器数据流,用来包装普通的IO流,通过包装的过滤器流进行整数值,双精度,字符串的读取和输入



---


###BufferInputStream和BufferOutputStream

BufferInputStream和BufferOutputStream可以通过减少读写次数来提高输入和输出的速度,它们为存储字节在流中添加一个缓冲区,以提高处理效率

如果没有设置缓存区的大小,默认的大小就是512个字节.缓冲区输入流会在每次调用中尽可能多地将数据读入缓冲区.相反地,只有当缓冲区已满或调用flush()
方法时,缓冲输出流才会调用写入方法.


---

###ObjectInputStream和ObjectOutputStream

实现对象的写入和读取,可以将对象写出到文件中(但是这里可以写出到文件中的对象必须是可序列化的对象),也可以将对象数据从文件中写入到内存中;

如果视图存储一个不是可序列化的对象,将会抛出异常(NotSerializableException异常)

*当存储一个可序列化对象时,会对该对象的类进行编码.编码包括类名,类的签名,对象实例变量的值以及从对象引用的任何其他对象的闭包,
但是不存储对象静态变量的值*

*非序列化的数据域*
    如果一个对象是Serializable的实例,但它包含的莪都是非序列化的数据域,那么这个对象是不可以序列化成功的,需要给这些非序列化的数据域
    加上关键字transient,才可以序列化这个对象如果没有加入该关键字,则抛异常(NotSerializableException);下面举个例子:
        public class Foo implements Serializable {
            private int v1;
            private static double v2;
            private transient A v3 = new A();//这里需要加上关键字transient进行说明,才能让类Foo可以序列化
        }

*复制对象*
    如果一个对象不止一次写入对象流,则不会存储多份对象副本,第一次写入一个对象时,就会为它创建一个序列号,java虚拟机将对象的所有内容和序列号一起写入对象流.
    以后每次存储时,如果写入相同的对象,就只存储序列号.读出这些对象时,它们的引用相同,因为内存中实际上存储的只有一个对象;


*序列化数组*
    只有数组中的元素都是可序列化的,这个数组才是可以序列化的;

---

###RandomAccessFile

RandomAccessFile可以同时对文件进行读取和写入,并且不会增加新的文件;
















---
---
---


文本IO





