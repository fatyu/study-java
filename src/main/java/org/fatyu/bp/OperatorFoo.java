package org.fatyu.bp;

/**
 * ������
 * @author
 */
public class OperatorFoo {
    /**
     * Ĭ�Ϲ��췽��
     */
    public OperatorFoo() {
        super();
    }

    /**
     *������
     * @param args
     */
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        int i = 3;
        int j = 5;
        //+ - * / %
        System.out.println("i+j:" + (i + j));
        System.out.println("i-j:" + (i - j));
        System.out.println("i*j:" + (i * j));
        System.out.println("i/j:" + (i / j));
        System.out.println("i%j:" + (i % j));
        //-= += *= %= /=
        System.out.println("i+=j:" + (i += j));
        System.out.println("i-=j:" + (i -= j));
        System.out.println("i*=j:" + (i *= j));
        System.out.println("i/=j:" + (i /= j));
        System.out.println("i%=j:" + (i %= j));
        //-- ++
        System.out.println("i++:" + (i++));
        System.out.println("++i:" + (++i));
        System.out.println("i--:" + (i--));
        System.out.println("--i:" + (--i));
        System.out.println("--i:" + (--i));
        //< > <= >= == !=
        System.out.println(i > j);
        System.out.println("++i:" + (++i));
        System.out.println("i--:" + (i--));
        System.out.println("--i:" + (--i));
        System.out.println("--i:" + (--i));
        //&& || -->�ᵼ�¶�·
        System.out.println("true && false: " + (true && false));
        System.out.println("false && false: " + (false && false));
        System.out.println("true && true: " + (true && true));
        System.out.println("false && true: " + (false && true));
        System.out.println("true || false: " + (true || false));
        System.out.println("false || false: " + (false || false));
        System.out.println("true || true: " + (true || true));
        System.out.println("false || true: " + (false || true));
        //& | �߼��ж�-->���ᵼ�¶�· ����� �����
        System.out.println("true & false: " + (true & false));
        System.out.println("false & false: " + (false & false));
        System.out.println("true & true: " + (true & true));
        System.out.println("false & true: " + (false & true));
        System.out.println("true | false: " + (true | false));
        System.out.println("false | false: " + (false | false));
        System.out.println("true | true: " + (true | true));
        System.out.println("false | true: " + (false | true));
        System.out.println("i & j:" + (i & j));
        System.out.println("i | j:" + (i | j));
        //?:
        System.out.println(i < j ? "i<j" : "i>=j");
        //^ ` << >>
        System.out.println("~i:" + ~i);
        System.out.println("^i:" + (2 ^ i));
        System.out.println("i <<:" + (i << 2));
        System.out.println("i >>:" + (i >> 2));
        System.out.println("i >>>:" + (i >>> 2));
        //! ��
        System.out.println(!true);
        System.out.println(!false);

    }
}
