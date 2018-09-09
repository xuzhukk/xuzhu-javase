package xuzhu.args;
/*
 * Program arguments input --cc.aa=cc aa
 * VM arguments input -Dcc=aa
 */
public class ArgsTest1 {
	 public static void main(String[] args){//空格分隔
         System. out .println( "Program arguments" );
         for ( String str:args ){
             System. out .println( str );
         }

         //Java启动命令可选项(options)大致可分为标准(-D等)和非标准（-X、-XX）两种，
         //非标准的可选项不保证在所有平台上都实现，并且未来的版本中可能会被修改且不告知，
         //总之就是不稳定(Unstable)。不过有的非标准可选项还是非常有用的
         System. out .println( "VM arguments" );
         String syspro1 = "java.util.logging.config.file" ;
         System. out .println( System.getProperty (syspro1) );
         String syspro2 = "cc" ;
         System. out .println( System.getProperty (syspro2) );
         //JAVA 自身运行需要的一些必要参数
         System.out.println(System.getProperty("java.specification.version"));
         System.out.println(System.getProperty("file.encoding"));
         System.out.println(System.getProperty("java.library.path"));
      }
}
