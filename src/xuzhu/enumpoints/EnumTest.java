package xuzhu.enumpoints;


/**
 * Javaö���÷�����
 * <p>
 * Created by xuzhu on 2016/12/15
 */
public class EnumTest {
    public static void main(String[] args) {
        forEnum();
        useEnumInJava();
        System.out.println(TYPE.BALANCE);
    }
 
    /**
     * ѭ��ö��,���ordinal���ԣ���ö�����ڲ����ԣ���Ҳ�����(˵�ľ����Ҷ����TYPE���͵�ö�ٵ�typeName����)
     */
    private static void forEnum() {
        for (SimpleEnum simpleEnum : SimpleEnum.values()) {
            System.out.println(simpleEnum + "  ordinal  " + simpleEnum.ordinal());
        }
        System.out.println("------------------");
        for (TYPE type : TYPE.values()) {
            System.out.println("type = " + type + "    type.name = " + type.name() + "   typeName = " + type.getTypeName() + "   ordinal = " + type.ordinal());
        }
    }
 
    /**
     * ��Java����ʹ��ö��
     */
    private static void useEnumInJava() {
        String typeName = "f5";
        TYPE type = TYPE.fromTypeName(typeName);
        if (TYPE.BALANCE.equals(type)) {
            System.out.println("�����ַ�����õ�ö������ʵ����ö�ٳ���һ��");
        } else {
            System.out.println("��ʦ�ִ������");
        }
 
    }
 
    /**
     * ����ö��(����������ö�ٳ���)�������򵥵�ö��ʹ��ʵ��
     * Ordinal ���ԣ���Ӧ�ľ�������˳�򣬴�0��ʼ��
     */
    private enum SimpleEnum {
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER
    }
 
 
    /**
     * ��������(��������ö�ٳ��������ֻ�������ϲ�������ʵ��ʹ�û��Ǻܶ�ģ����������ʹ�þͲ�����������)
     */
    private enum TYPE {
        FIREWALL("firewall"),
        SECRET("secretMac"),
        BALANCE("f5");
 
        private String typeName;
 
        TYPE(String typeName) {
            this.typeName = typeName;
        }
 
        /**
         * �������͵����ƣ��������͵�ö��ʵ����
         *
         * @param typeName ��������
         */
        public static TYPE fromTypeName(String typeName) {
            for (TYPE type : TYPE.values()) {
                if (type.getTypeName().equals(typeName)) {
                    return type;
                }
            }
            return null;
        }
 
        public String getTypeName() {
            return this.typeName;
        }
    }
}
