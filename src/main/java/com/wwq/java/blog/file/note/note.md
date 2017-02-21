
## 文件类描述:

数据存储在内容中不是永久的,为了能够永久保存相应的数据,需要将它们存储到磁盘或光盘的文件中,这些文件可以修改,传送,复制等;


在文件系统中,每个文件都存放在一个目录下,文件的名字可以分为:*绝对文件名*和*相对文件名*;

    * 绝对文件名 :是由文件名和它的完整路径以及驱动器字母组成;绝对文件名是依赖操作系统的,window系统下和linux下的绝对文件名不一样;
    * 相对文件名 :

---

File类提供了不依赖机器的方式来处理很多文件和路径名依赖机器的复杂问题.能够处理文件属性的修改和文件的删除添加,但是不能处理文件内容;

---

File对象封装了对文件或路径的属性,但是不包括创建文件,向文件读写数据的方法;

*实践内容*
    利用某个新的字符串,替换文本文件中所有出现某个旧的字符串的文本;
    **思路**
    使用两个文件读取,从源文件读取内容,替换读取的内容的文本,将替换好之后的文本输出到新的目标文件中;