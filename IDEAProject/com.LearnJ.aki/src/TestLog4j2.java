import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TestLog4j2 {
    String name;
    private static Logger logger = LogManager.getLogger(TestLog4j2.class.getName());

    public static void main(String[] args) {
        TestLog4j2 fairChild = new TestLog4j2();
        fairChild.name = "��ͯ";

        logger.debug("�޸�ǰ������Ϊ: " + fairChild.name);
        fairChild.name = "����";
        logger.trace("�޸ĺ������Ϊ��" + fairChild.name);
        logger.debug("�޸ĺ������Ϊ��" + fairChild.name);
        logger.info("�޸ĺ������Ϊ��" + fairChild.name);
        logger.warn("�޸ĺ������Ϊ��" + fairChild.name);
        logger.fatal("�޸ĺ������Ϊ��" + fairChild.name);
    }
}